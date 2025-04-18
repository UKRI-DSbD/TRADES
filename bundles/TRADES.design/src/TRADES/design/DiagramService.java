/******************************************************************************************************
* Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
* This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
* 
* SPDX-License-Identifier: EPL-2.0
* 
* Contributors:
*     ELTA Ltd - initial API and implementation
* 
*******************************************************************************************************/
package TRADES.design;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.api.helper.graphicalfilters.HideFilterHelper;
import org.eclipse.sirius.ui.tools.api.views.modelexplorerview.IModelExplorerView;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.navigator.CommonNavigator;

import dsm.TRADES.AbstractComponentOwner;
import dsm.TRADES.AffectRelation;
import dsm.TRADES.Analysis;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.Catalog;
import dsm.TRADES.Component;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.Data;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.ThreatMitigationRelation;
import dsm.TRADES.util.EcoreUtils;

public class DiagramService {

	/**
	 * Check is the given {@link EObject} is stored in a {@link Catalog}
	 * 
	 * @param o the object to test
	 * @return <code>true</code> is store inside a {@link Catalog},
	 *         <code>false</code> otherwise
	 */
	public boolean isFromCatalog(EObject o) {
		EObject current = o;
		while (current != null) {
			if (current instanceof Catalog) {
				return true;
			} else if (current instanceof Analysis) {
				return false;
			}
			current = current.eContainer();
		}
		return false;
	}

	/**
	 * Retrieve the containing {@link DSemanticDiagram} from any node in it
	 * 
	 * @param node a node
	 * @return a {@link DSemanticDiagram} or <code>null</code>
	 */
	public static DSemanticDiagram getContainingDiagram(DSemanticDecorator node) {
		return EcoreUtils.getAncestor(node, DSemanticDiagram.class);
	}

	public String getAttackChainLabel(AttackChainStep step) {
		String label = step.getStepNum();
		ThreatAllocationRelation allocation = step.getThreatAllocationRelation();
		label += " : " + getAllocLabel(allocation);
		return label;
	}

	public List<Control> getRelatedControls(DDiagram diagram) {
		return getDisplayed(diagram, Threat.class) //
				.flatMap(th -> getLinkedControl(th).stream()).collect(toList());
	}

	public List<Control> getRelatedControls(DSemanticDecorator view) {
		return getDisplayed(view, Threat.class) //
				.flatMap(th -> getLinkedControl(th).stream()).collect(toList());
	}

	private <T extends EObject> Stream<T> getDisplayed(EObject diagram, Class<T> type) {
		return EcoreUtils.allContainedObjectOfType(diagram, DSemanticDecorator.class)//
				.map(sd -> sd.getTarget())//
				.filter(t -> type.isInstance(t))//
				.map(t -> type.cast(t));
	}

	public boolean canImportLinkedControlOn(List<EObject> selection) {
		return selection != null && selection.stream()//
				.allMatch(e -> e instanceof DDiagram // The diagram is selected => Import all control for all displayed
														// threats
						|| isRepresentation(e, Threat.class)); // Only threat selected
	}

	private <T extends EObject> boolean isRepresentation(EObject o, Class<T> type) {
		if (o instanceof DSemanticDecorator) {
			DSemanticDecorator decorator = (DSemanticDecorator) o;
			EObject target = decorator.getTarget();
			return target != null && type.isInstance(target);
		}
		return false;
	}

	/**
	 * Gets all the control connected to the given threat
	 * 
	 * @param th                 a {@link Threat}
	 * @param displayMitigations
	 * @return a list of {@link Control}
	 */
	private List<Control> getLinkedControl(Threat th) {

		List<Control> result = new ArrayList<>();

		ECrossReferenceAdapter semanticCrossReferencer = Session.of(th).get().getSemanticCrossReferencer();

		// Mitigated through threat allocation relation
		List<Control> indirectControls = getLinkedThreatAllocationRelations(th, semanticCrossReferencer)
				.flatMap(tar -> getLinkedThreatMitigations(tar, semanticCrossReferencer))
				.map(ThreatMitigationRelation::getControl)//
				.filter(c -> c != null)//
				.collect(toList());
		result.addAll(indirectControls);

		// Direct mitigation
		List<Control> directControls = getLinkedThreatMitigationRelation(th, semanticCrossReferencer)//
				.map(tm -> tm.getControl())//
				.collect(toList());
		result.addAll(directControls);

		return result;
	}

	/**
	 * Gets all {@link ThreatMitigationRelation}s linked to the given {@link Threat}
	 * by {@link TRADESPackage#getThreatMitigationRelation_Threat()}
	 * 
	 * @param th                      a Threat
	 * @param semanticCrossReferencer a cross referencer
	 * @return a stream
	 */
	private Stream<ThreatMitigationRelation> getLinkedThreatMitigationRelation(Threat th,
			ECrossReferenceAdapter semanticCrossReferencer) {
		return semanticCrossReferencer
				.getInverseReferences(th, TRADESPackage.eINSTANCE.getThreatMitigationRelation_Threat(), true).stream()
				.map(s -> (ThreatMitigationRelation) s.getEObject());
	}

	/**
	 * Gets all {@link ThreatMitigationRelation}s linked to the given
	 * {@link ThreatAllocationRelation} by
	 * {@link TRADESPackage#getThreatMitigationRelation_MitigatedAllocation()}
	 * 
	 * @param tar                     a {@link ThreatAllocationRelation}
	 * @param semanticCrossReferencer a cross referencer
	 * @return a stream
	 */
	private Stream<ThreatMitigationRelation> getLinkedThreatMitigations(ThreatAllocationRelation tar,
			ECrossReferenceAdapter semanticCrossReferencer) {
		return semanticCrossReferencer
				.getInverseReferences(tar, TRADESPackage.eINSTANCE.getThreatMitigationRelation_MitigatedAllocation(),
						true)
				.stream().filter(tmr -> tmr.getEObject() instanceof ThreatMitigationRelation)
				.map(tmr -> ((ThreatMitigationRelation) tmr.getEObject()));
	}

	/**
	 * Gets all {@link ThreatAllocationRelation}s linked to the given Threat
	 * 
	 * @param th
	 * @param semanticCrossReferencer
	 * @return
	 */
	private Stream<ThreatAllocationRelation> getLinkedThreatAllocationRelations(Threat th,
			ECrossReferenceAdapter semanticCrossReferencer) {
		return semanticCrossReferencer
				.getInverseReferences(th, TRADESPackage.eINSTANCE.getThreatAllocationRelation_Threat(), true).stream()
				.filter(s -> s.getEObject() instanceof ThreatAllocationRelation)
				.map(s -> (ThreatAllocationRelation) s.getEObject());
	}

	/**
	 * Gets all threats that are linked to the semantic element behind the given
	 * node or one of its descendant
	 * 
	 * @param node a node
	 * @return a list of {@link Threat}
	 */
	public List<Threat> getRelatedThreats(DSemanticDecorator node) {
		EObject semanticTarget = node.getTarget();

		Set<Threat> alsreadyDisplayed = getDisplayedThreats(node);
		Set<Threat> collector = new HashSet<>();
		getLinkedThreat(semanticTarget, collector);
		return collector.stream().filter(e -> !alsreadyDisplayed.contains(e)).collect(toList());
	}

	private Set<Threat> getDisplayedThreats(DSemanticDecorator node) {
		DSemanticDiagram diagram = EcoreUtils.getAncestor(node, DSemanticDiagram.class);

		if (diagram != null) {
			return EcoreUtils.allContainedObjectOfType(diagram, DSemanticDecorator.class)
					.filter(n -> n.getTarget() instanceof Threat).map(n -> (Threat) n.getTarget()).collect(toSet());
		} else {
			return Collections.emptySet();
		}
	}

	private void getLinkedThreat(EObject o, Set<Threat> collector) {
		if (o instanceof Component) {
			Component cmp = (Component) o;
			cmp.getThreatAllocations().stream().map(rel -> rel.getThreat()).forEach(collector::add);
		}

		if (o instanceof AbstractComponentOwner) {
			for (Component c : ((AbstractComponentOwner) o).getComponents()) {
				getLinkedThreat(c, collector);
			}
		}
	}

	private String getAllocLabel(ThreatAllocationRelation alloc) {
		if (alloc == null) {
			return "No allocation";
		}

		String threatLabel = alloc.getThreat() != null ? alloc.getThreat().getName() : "No Threat";
		String componentLabel = alloc.getComponent() != null ? alloc.getComponent().getName() : "No component";

		return threatLabel + "->" + componentLabel;
	}

	public Set<AttackChainStep> getAllPrevious(AttackChainStep step) {
		Set<AttackChainStep> result = new HashSet<>();
		getAllPrevious(step, result, 0);
		return result;
	}

	public void getAllPrevious(AttackChainStep step, Set<AttackChainStep> collector, int stepNb) {
		if (stepNb > 10000) {
			return;
		}
		for (AttackChainStep previous : step.getPrevious()) {
			if (!collector.contains(previous)) {
				collector.add(previous);
				getAllPrevious(previous, collector, stepNb++);
			}
		}
	}

	public boolean containedInComponent(EObject o) {
		EObject eContainer = o.eContainer();
		if (eContainer instanceof Component) {
			return true;
		} else if (eContainer instanceof ControlOwner) {
			return containedInComponent(eContainer);
		}
		return false;
	}

	public Set<AttackChainStep> getAllNext(AttackChainStep step) {
		Set<AttackChainStep> result = new HashSet<>();
		getAllNext(step, result, 0);
		return result;
	}

	/**
	 * Gets all threats not already displayed in the diagram
	 * 
	 * @param semanticElement a semantic element (should be contained in a
	 *                        {@link Analysis})
	 * @param node            an element of the diagram)
	 * @return
	 */
	public List<Threat> getAllNonDisplayedThreats(EObject semanticElement, DSemanticDecorator node) {
		Set<Threat> displayedThreat = getDisplayedThreats(node);
		return EcoreUtils
				.allContainedObjectOfType(EcoreUtils.getAncestor(semanticElement, Analysis.class).getThreatOwner(),
						Threat.class)
				.filter(t -> !displayedThreat.contains(t)).collect(toList());
	}

	public void getAllNext(AttackChainStep step, Set<AttackChainStep> collector, int stepNb) {
		if (stepNb > 10000) {
			return;
		}
		for (AttackChainStep next : step.getNext()) {
			if (!collector.contains(next)) {
				collector.add(next);
				getAllPrevious(next, collector, stepNb++);
			}
		}
	}

	public DSemanticDecorator getAnalysisView(DRepresentationElement view, EObject containerSmeantic) {
		if (containerSmeantic instanceof Analysis) {
			return view;
		} else if (containerSmeantic instanceof Component) {
			EObject viewContainer = view.eContainer();
			while (viewContainer instanceof DSemanticDecorator) {
				DSemanticDecorator parentView = (DSemanticDecorator) viewContainer;
				if (parentView.getTarget() instanceof Analysis) {
					return parentView;
				}
			}
		}
		return null;
	}

	public List<Data> availableData(AffectRelation affect) {

		Component source = affect.getSourceComponent();
		if (source == null) {
			return Collections.emptyList();
		}

		List<Data> availableData = new ArrayList<>(source.getAllDatas());
		availableData.removeAll(affect.getData());
		return availableData;

	}

	public String dataLabelOnAffect(AffectRelation affect) {

		String label = "";

		for (Data data : affect.getData()) {
			label = label + data.getName() + " ,";
		}

		if (label != "") {
			label = label.substring(0, label.length() - 2);
		}

		return label;
	}

	public void editAffectLabel(AffectRelation affect, String newLabel) {

		Component source = affect.getSourceComponent();
		if (source == null) {
			return;
		}

		Map<String, List<Data>> datas = source.getAllDatas().stream().filter(d -> d.getName() != null)//
				.collect(Collectors.groupingBy(d -> d.getName().trim()));

		EList<Data> data = affect.getData();
		data.clear();

		String[] labels = newLabel.split(",");
		for (String dataName : labels) {
			String dName = dataName.trim();
			List<Data> existingData = datas.get(dName);

			if (existingData != null && !existingData.isEmpty()) {

				if (existingData.size() > 1) {
					Activator.logInfo("More than one data has the following name " + dName);
				}
				data.add(existingData.get(0));
			}
		}
	}

	/**
	 * Function that hides the detail of a component in a diagram
	 * 
	 * @param component                the component to hide details from
	 * @param anyRepresentationElement any element that belong a diagram (or the
	 *                                 diagram itself)
	 */
	public void encapsulateElements(Component component, EObject anyRepresentationElement) {

		if (!(anyRepresentationElement instanceof DSemanticDecorator)) {
			return;
		}
		DSemanticDiagram diagram = getContainingDiagram((DSemanticDecorator) anyRepresentationElement);
		if (diagram != null) {
			new EObjectQuery(component)
					.getInverseReferences(ViewpointPackage.Literals.DREPRESENTATION_ELEMENT__SEMANTIC_ELEMENTS).stream()//
					.filter(e -> e instanceof DNodeContainer)//
					.map(e -> (DNodeContainer) e)//
					.filter(e -> e.getParentDiagram() == diagram)//
					.forEach(diagramElement -> HideFilterHelper.INSTANCE.hide(diagramElement));
		}

	}

	/**
	 * A function to show (cancel hiding) elements from diagram
	 * 
	 * @param component                the component to hide details from
	 * @param anyRepresentationElement any element that belong a diagram (or the
	 *                                 diagram itself)
	 */
	public void decapsulateElements(Component component, EObject anyElement) {
		if (!(anyElement instanceof DSemanticDecorator)) {
			return;
		}
		DSemanticDiagram diagram = getContainingDiagram((DSemanticDecorator) anyElement);
		if (diagram != null) {
			new EObjectQuery(component)
					.getInverseReferences(ViewpointPackage.Literals.DREPRESENTATION_ELEMENT__SEMANTIC_ELEMENTS).stream()//
					.filter(e -> e instanceof DNodeContainer)//
					.map(e -> (DNodeContainer) e)//
					.filter(e -> e.getParentDiagram() == diagram)//
					.forEach(diagramElement -> HideFilterHelper.INSTANCE.reveal(diagramElement));
		}
	}

	/**
	 * Open the given URL in the default browser
	 * 
	 * @param link a valid URL
	 */
	public void openInBrowser(String link) {
		try {
			Desktop.getDesktop().browse(URI.create(link));
		} catch (IOException e) {
			Activator.logError("Problem while open link " + link, e);
		}
	}

	/**
	 * Reveal the given targets in the model explorer view
	 * 
	 * @param targets list of targets
	 */
	public static void revealInModelExplorer(List<? extends EObject> targets) {

		if (targets != null && !targets.isEmpty()) {
			IViewPart modelExplorerPart = EclipseUIUtil.getView(IModelExplorerView.ID);
			if (modelExplorerPart instanceof CommonNavigator) {
				((CommonNavigator) modelExplorerPart).selectReveal(new StructuredSelection(targets));
			}
		}
	}

	/**
	 * Reveal the given {@link EObject} in the Model explorer view
	 * 
	 * @param target a non null {@link EObject}
	 */
	public static void revealInModelExplorer(EObject target) {
		revealInModelExplorer(Collections.singletonList(target));
	}
}
