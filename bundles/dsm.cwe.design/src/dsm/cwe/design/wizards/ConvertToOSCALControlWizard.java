/**
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
 */

package dsm.cwe.design.wizards;

import static java.util.stream.Collectors.toList;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.session.Session;

import TRADES.design.DiagramService;
import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.Analysis;
import dsm.TRADES.Control;
import dsm.TRADES.ExternalControl;
import dsm.cwe.design.Activator;
import dsm.cwe.design.service.CWEDesignService;
import dsm.cwe.design.utils.EObjectReplacer;
import dsm.cwe.model.CWEResource;
import dsm.cwe.model.CWECatalog.Catalog;
import dsm.cwe.model.CWECatalog.CWECatalogFactory;
import dsm.cwe.model.CWECatalogCommon.CWECatalogCommonFactory;
import dsm.cwe.model.CWECatalogCommon.Part;
import dsm.cwe.model.CWEMetadata.ControlOwner;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

public class ConvertToCWEControlWizard extends Wizard {

	private final List<Control> initialSelection;

	private final Session session;

	private ComposedAdapterFactory adapterFactory;

	private ControlOwnerSelectionPage containerSelectionPage;

	private ControlSelectionPage controlSelectionPage;

	public ConvertToCWEControlWizard(List<Control> initialSelection, Session session) {
		super();
		this.initialSelection = initialSelection;
		this.session = session;
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		this.adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);


		this.controlSelectionPage = new ControlSelectionPage(adapterFactory, collectAllControls(), initialSelection);
		addPage(controlSelectionPage);


		this.containerSelectionPage = new ControlOwnerSelectionPage(adapterFactory, collectAvailableCatalogs());
		addPage(containerSelectionPage);
		super.addPages();
	}

	private List<Catalog> collectAvailableCatalogs() {
		return session.getSemanticResources().stream()//
				.filter(r -> r instanceof CWEResource && r.getURI().isPlatformResource())//
				.flatMap(r -> r.getContents().stream())//
				.filter(r -> r instanceof Catalog).map(r -> ((Catalog) r)).collect(toList());
	}

	private List<Control> collectAllControls() {
		List<Control> controls = new ArrayList<>();
		for (Resource r : session.getSemanticResources()) {
			for (EObject root : r.getContents()) {
				if (root instanceof Analysis) {
					TreeIterator<EObject> ite = root.eAllContents();
					while (ite.hasNext()) {
						EObject eObject = (EObject) ite.next();
						if (eObject instanceof Control && !(eObject instanceof ExternalControl)) {
							controls.add((Control) eObject);
						}
					}
				}
			}
		}
		return controls;

	}


	@Override
	public boolean performFinish() {
		try {
			ControlOwner targetContainer = this.containerSelectionPage.getSelectedOwner();
			if (!this.controlSelectionPage.getSelection().isEmpty()
					&& targetContainer != null) {
				List<ExternalControl> resultingControls = new ArrayList<>();
				getContainer().run(false, false, monitor -> {

					RecordingCommand cmd = new RecordingCommand(session.getTransactionalEditingDomain()) {

						@Override
						protected void doExecute() {
							EObjectReplacer replacer = new EObjectReplacer(session.getSemanticCrossReferencer());
							for (Control control : controlSelectionPage.getSelection()) {

								// Create CWE control
								dsm.cwe.model.CWECatalog.Control cweControl = CWECatalogFactory.eINSTANCE
										.createControl();
								cweControl.setId(control.getId());
								cweControl.setTitle(
										control.getName() != null ? MarkupLine.fromMarkdown(control.getName()) : null);
								
								Part descriptionPart = CWECatalogCommonFactory.eINSTANCE.createPart();
								descriptionPart.setName("overview");
								descriptionPart.setTitle(MarkupLine.fromMarkdown("Description"));
								descriptionPart.setProse(control.getDescription() != null
										? MarkupMultiline.fromMarkdown(control.getDescription())
										: null);
								
								cweControl.getParts().add(descriptionPart);

								targetContainer.getControls().add(cweControl);

								// Create external control

								AbstractControlOwner controlContainer = (AbstractControlOwner) control.eContainer()
										/* ControlOwner */.eContainer();
								ExternalControl externalControl = CWEDesignService.createControl(cweControl,
										controlContainer);

								// Redirect all links from old control to new control
								replacer.replaceAll(control, externalControl);
								resultingControls.add(externalControl);
							}
						}
					};
					session.getTransactionalEditingDomain().getCommandStack().execute(cmd);
					DiagramService.revealInModelExplorer(resultingControls);
				});
				return true;
			}
		} catch (InvocationTargetException | InterruptedException e) {
			Activator.logError("Error while exporting to CWE Catalog", e);
		}
		return false;
	}

}
