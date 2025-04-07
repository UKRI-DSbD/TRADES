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

package dsm.trades.rcp.internal.wizards;

import static java.util.stream.Collectors.toList;

import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import dsm.TRADES.AbstractComponentTypeOwner;
import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.AbstractRuleOwner;
import dsm.TRADES.AbstractThreatOwner;
import dsm.TRADES.AbstractVulnerabilityOwner;
import dsm.TRADES.Analysis;
import dsm.TRADES.Catalog;
import dsm.TRADES.ComponentType;
import dsm.TRADES.ComponentTypeOwner;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.ElementWithId;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.IControlDefinition;
import dsm.TRADES.IThreatDefinition;
import dsm.TRADES.NamedElement;
import dsm.TRADES.Rule;
import dsm.TRADES.RuleOwner;
import dsm.TRADES.SemanticUtil;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatsOwner;
import dsm.TRADES.Vulnerability;
import dsm.TRADES.VulnerabilityOwner;
import dsm.TRADES.util.EcoreUtils;
import dsm.trades.rcp.TRADESRCPActivator;
import dsm.trades.rcp.utils.CatalogUtils;
import dsm.trades.rcp.utils.ComponentTypeCopier;
import dsm.trades.rcp.utils.ControlCopier;
import dsm.trades.rcp.utils.RuleCopier;
import dsm.trades.rcp.utils.ThreatCopier;
import dsm.trades.rcp.utils.VulnerabilityCopier;

/**
 * Wizard use to import an OSCAL catalog
 * 
 * @author Arthur Daussy
 *
 */
public class ImportTradesModelWizard extends Wizard implements IImportWizard {

	private IStructuredSelection selection;
	private ProjectSelectionPage projectSelectionPage;
	private TradesLoadingPage fileSelectionPage;
	private EObjectSelectionPage<ComponentType> componentTypeSelectionPage;
	private EObjectSelectionPage<Vulnerability> vulnerabilitySelectionPage;
	private EObjectSelectionPage<Threat> threatSelectionPage;
	private EObjectSelectionPage<dsm.TRADES.Control> controlSelectionPage;
	private EObjectSelectionPage<Rule> ruleSelectionPage;

	private List<ComponentType> selectedComponentTypes = Collections.emptyList();
	private List<Vulnerability> selectedVulnerabilities = Collections.emptyList();
	private List<Threat> selectedThreats = Collections.emptyList();
	private List<Control> selectedControls = Collections.emptyList();
	private List<Rule> selectedRules = Collections.emptyList();
	private String importedRootName;
	private String importedRootId;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		super.addPages();
		List<IProject> modelingProjects = Stream.of(ResourcesPlugin.getWorkspace().getRoot().getProjects())
				.filter(p -> ModelingProject.asModelingProject(p).some()).collect(toList());
		this.projectSelectionPage = new ProjectSelectionPage(modelingProjects, getSelectedProject(selection), null);
		addPage(projectSelectionPage);
		this.fileSelectionPage = new TradesLoadingPage("*.trades", this::loadModel);
		addPage(fileSelectionPage);

		this.componentTypeSelectionPage = new EObjectSelectionPage<ComponentType>(this::setSelectedComponentTypes,
				"Select the component types to import (only component types with unique id can be imported)");
		addPage(componentTypeSelectionPage);

		this.vulnerabilitySelectionPage = new EObjectSelectionPage<Vulnerability>(this::setSelectedVulnerabilities,
				"Select the vulnerabilities to import (only vulnerabilities with unique id can be imported)");
		addPage(vulnerabilitySelectionPage);

		this.threatSelectionPage = new EObjectSelectionPage<Threat>(this::setSelectedThreats,
				"Select the threats to import (only threats with unique id can be imported)");
		addPage(threatSelectionPage);

		this.controlSelectionPage = new EObjectSelectionPage<dsm.TRADES.Control>(this::setSelectedControls,
				"Select the controls to import (only controls with unique id can be imported)");
		addPage(controlSelectionPage);

		this.ruleSelectionPage = new EObjectSelectionPage<Rule>(this::setSelectedRules,
				"Select the rules to import (only rules with unique id can be imported)");
		addPage(ruleSelectionPage);
	}

	private void setSelectedComponentTypes(List<ComponentType> selectedComponentTypes) {
		this.selectedComponentTypes = selectedComponentTypes;
	}

	private void setSelectedVulnerabilities(List<Vulnerability> selectedVulnerabilities) {
		this.selectedVulnerabilities = selectedVulnerabilities;
	}

	private void setSelectedThreats(List<Threat> selectedThreats) {
		this.selectedThreats = selectedThreats;
	}

	private void setSelectedControls(List<Control> selectedControls) {
		this.selectedControls = selectedControls;
	}

	private void setSelectedRules(List<Rule> selectedRules) {
		this.selectedRules = selectedRules;
	}

	@Override
	public boolean performFinish() {
		IProject selectedProject0 = projectSelectionPage.getSelectedProject();
		if (selectedProject0 != null) {
			ModelingProject selectedProject = ModelingProject.asModelingProject(selectedProject0).get();
			if (selectedProject != null) {
				Option<URI> mainRepURI = selectedProject.getMainRepresentationsFileURI(new NullProgressMonitor());
				if (mainRepURI.some()) {
					URI repUri = mainRepURI.get();

					Session[] session = new Session[1];
					try {
						getContainer().run(false, false, monitor -> {

							session[0] = SessionManager.INSTANCE.getSession(repUri, monitor);
							if (!session[0].isOpen()) {
								session[0].open(monitor);
							}
							CatalogUtils.createCatalogFolder(selectedProject0, monitor);
						});

					} catch (InvocationTargetException | InterruptedException e) {
						TRADESRCPActivator.logError("Error occured while loading the session : " + e.getMessage(), e);
					}

					return importTradesCatalog(repUri, session[0]);

				}
			}
		}

		return false;

	}

	boolean loadModel(Path p) {

		try {
			getContainer().run(false, false, monitor -> {
				ResourceSet rs = new ResourceSetImpl();
				Resource tradesResource = rs
						.getResource(URI.createFileURI(fileSelectionPage.getPath().toUri().getPath()), true);
				if (tradesResource == null || tradesResource.getContents().isEmpty() || isCatalog(tradesResource)) {
					fileSelectionPage.setMessage("Invalid model");
					throw new RuntimeException("Invalid model");
				}

				EObject root = tradesResource.getContents().get(0);
				if (root instanceof NamedElement) {
					importedRootName = ((NamedElement) root).getName();
				} else {
					importedRootName = "Catalog";
				}

				if (root instanceof ElementWithId) {
					importedRootId = ((ElementWithId) root).getId();
				}
				
				//TODO Prevent importing if the id is null...

				if (root instanceof AbstractThreatOwner) {
					Set<String> threatIds = new HashSet<>();
					List<Threat> threats = new ArrayList<>();
					AbstractThreatOwner aThreatOwner = (AbstractThreatOwner) root;
					ThreatsOwner threatOwner = aThreatOwner.getThreatOwner();
					if (threatOwner != null) {
						Stream.concat(threatOwner.getInternals().stream(), threatOwner.getExternals().stream())
								.filter(t -> t.getId() != null && !t.getId().isBlank()).forEach(t -> {
									String id = t.getId();
									if (!threatIds.contains(id)) {
										threatIds.add(id);
										threats.add(t);
									}
								});
					}
					threatSelectionPage.setInput(threats);
				} else {
					threatSelectionPage.setInput(Collections.emptyList());
				}

				if (root instanceof AbstractComponentTypeOwner) {
					Set<String> componentTypeIds = new HashSet<>();
					List<ComponentType> componentTypes = new ArrayList<>();
					AbstractComponentTypeOwner abstractOwner = (AbstractComponentTypeOwner) root;
					ComponentTypeOwner owner = abstractOwner.getComponentTypeOwner();
					if (owner != null) {
						owner.getComponentTypes().stream()
								.filter(t -> t.getId() != null && !t.getId().isBlank()).forEach(t -> {
									String id = t.getId();
									if (!componentTypeIds.contains(id)) {
										componentTypeIds.add(id);
										componentTypes.add(t);
									}
								});
					}
					componentTypeSelectionPage.setInput(componentTypes);
				} else {
					componentTypeSelectionPage.setInput(Collections.emptyList());
				}

				if (root instanceof AbstractVulnerabilityOwner) {
					Set<String> vulnerabilityIds = new HashSet<>();
					List<Vulnerability> vulnerabilities = new ArrayList<>();
					AbstractVulnerabilityOwner abstractOwner = (AbstractVulnerabilityOwner) root;
					VulnerabilityOwner owner = abstractOwner.getVulnerabilityOwner();
					if (owner != null) {
						owner.getVulnerabilities().stream()
								.filter(t -> t.getId() != null && !t.getId().isBlank()).forEach(t -> {
									String id = t.getId();
									if (!vulnerabilityIds.contains(id)) {
										vulnerabilityIds.add(id);
										vulnerabilities.add(t);
									}
								});
					}
					vulnerabilitySelectionPage.setInput(vulnerabilities);
				} else {
					vulnerabilitySelectionPage.setInput(Collections.emptyList());
				}

				if (root instanceof AbstractRuleOwner) {
					Set<String> ruleIds = new HashSet<>();
					List<Rule> rules = new ArrayList<>();
					AbstractRuleOwner abstractOwner = (AbstractRuleOwner) root;
					RuleOwner owner = abstractOwner.getRuleOwner();
					if (owner != null) {
						owner.getRules().stream()
								.filter(t -> t.getId() != null && !t.getId().isBlank()).forEach(t -> {
									String id = t.getId();
									if (!ruleIds.contains(id)) {
										ruleIds.add(id);
										rules.add(t);
									}
								});
					}
					ruleSelectionPage.setInput(rules);
				} else {
					ruleSelectionPage.setInput(Collections.emptyList());
				}

				List<dsm.TRADES.Control> controls = new ArrayList<>();
				Set<String> controlIds = new HashSet<>();
				EcoreUtils.eAllContentSteamWithSelf(root).filter(e -> e instanceof AbstractControlOwner)
						.forEach(acontrolOwner -> {
							((AbstractControlOwner) acontrolOwner).getAllControls().stream()
									.filter(c -> c.getId() != null && !c.getId().isBlank()).forEach(c -> {
										if (!controlIds.contains(c.getId())) {
											controlIds.add(c.getId());
											controls.add(c);
										}
									});
						});
				controlSelectionPage.setInput(controls);

			});
		} catch (InvocationTargetException | InterruptedException e) {
			TRADESRCPActivator.logError("Error while loading model " + e.getMessage(), e);
			return false;
		}

		return true;
	}

	public boolean isCatalog(Resource tradesResource) {
		return !(tradesResource.getContents().get(0) instanceof Analysis)
				&& !(tradesResource.getContents().get(0) instanceof Catalog);
	}

	private boolean importTradesCatalog(URI repUri, Session session) {
		controlSelectionPage.setErrorMessage(null);
		try {
			getContainer().run(false, false, monitor -> {
				TransactionalEditingDomain editingDomain = session.getTransactionalEditingDomain();
				RecordingCommand cmd = new RecordingCommand(editingDomain) {

					@Override
					protected void doExecute() {
						// Avoid forbidden file name
						String resourceName = importedRootName.replaceAll("[^\\w.-]", "_");
						
						URI tradesLibURI = CatalogUtils.getCatalogFolderURI(repUri)
								.appendSegment(URI.encodeSegment(resourceName, true) + ".trades");
						TransactionalEditingDomain transactionalEditingDomain = session.getTransactionalEditingDomain();
						ResourceSet resourceSet = transactionalEditingDomain.getResourceSet();
						Resource existingResource = resourceSet.getResource(tradesLibURI, false);

						ComponentTypeOwner componentTypeOwner = null;
						VulnerabilityOwner vulnerabilityOwner = null;
						ThreatsOwner threatOwner = null;
						ControlOwner controlOwner = null;
						RuleOwner ruleOwner = null;
						Catalog catalog = null;
						if (existingResource == null) {

							existingResource = resourceSet.createResource(tradesLibURI);
							// Create a analysis with the same name
							catalog = SemanticUtil.createInitialCatalog(importedRootName);
							catalog.setId(importedRootId);
							existingResource.getContents().add(catalog);

							componentTypeOwner = catalog.getComponentTypeOwner();
							vulnerabilityOwner = catalog.getVulnerabilityOwner();
							threatOwner = catalog.getThreatOwner();
							controlOwner = catalog.getControlOwner();
							ruleOwner = catalog.getRuleOwner();

							session.addSemanticResource(tradesLibURI, new NullProgressMonitor());
							session.save(new NullProgressMonitor());
						} else if (!existingResource.getContents().isEmpty()) {
							EObject root = existingResource.getContents().get(0);
							if (root instanceof Catalog) {
								catalog = (Catalog) root;
								componentTypeOwner = catalog.getComponentTypeOwner();
								vulnerabilityOwner = catalog.getVulnerabilityOwner();
								threatOwner = catalog.getThreatOwner();
								controlOwner = catalog.getControlOwner();
								ruleOwner = catalog.getRuleOwner();
							}
						}

						if (catalog != null) {
							ComponentTypeCopier componentTypeCopier = new ComponentTypeCopier();
							VulnerabilityCopier vulnerabilityCopier = new VulnerabilityCopier();
							ThreatCopier threatCopier = new ThreatCopier();
							ControlCopier controlCopier = new ControlCopier(threatCopier.getOldToNewThreats());
							RuleCopier ruleCopier = new RuleCopier();
							if (componentTypeOwner != null) {
								// For each selected component type create a component type
								for (ComponentType componentType : selectedComponentTypes) {
									ComponentType existingComponentType = catalog.getComponentTypeById(componentType.getId());
									if (existingComponentType == null) {
										ComponentType copy = componentTypeCopier.copy(componentType);
										componentTypeOwner.getComponentTypes().add(copy);
									} else {
										componentTypeCopier.update(componentType, existingComponentType);
									}
								}
							}

							if (vulnerabilityOwner != null) {
								// For each selected vulnerability create a vulnerability
								for (Vulnerability vulnerability : selectedVulnerabilities) {
									Vulnerability existingVulnerability = catalog.getVulnerabilityById(vulnerability.getId());
									if (existingVulnerability == null) {
										Vulnerability copy = vulnerabilityCopier.copy(vulnerability);
										vulnerabilityOwner.getVulnerabilities().add(copy);
									} else {
										vulnerabilityCopier.update(vulnerability, existingVulnerability);
									}
								}
							}

							if (threatOwner != null) {
								// For each selected threat create an external threat
								for (Threat t : selectedThreats) {
									IThreatDefinition existingThreat = catalog.getThreatById(t.getId());
									if (existingThreat == null) {
										ExternalThreat copy = threatCopier.copy(t);
										threatOwner.getExternals().add(copy);
									} else if (existingThreat instanceof ExternalThreat) {
										threatCopier.update(t, (ExternalThreat) existingThreat);
									}
								}
							}

							if (controlOwner != null) {
								// For each selected control create an external control + a threat mitigation
								controlCopier = new ControlCopier(threatCopier.getOldToNewThreats());
								for (Control c : selectedControls) {
									IControlDefinition existingControl = catalog.getControlById(c.getId());
									if (existingControl == null) {
										ExternalControl copiedControl = controlCopier.copy(c);
										controlOwner.getExternals().add(copiedControl);
									} else if (existingControl instanceof ExternalControl) {
										controlCopier.update(c, (ExternalControl) existingControl);
									}
								}
							}

							if (ruleOwner != null) {
								// For each selected rule create a rule
								for (Rule rule : selectedRules) {
									Rule existingRule = catalog.getRuleById(rule.getId());
									if (existingRule == null) {
										Rule copy = ruleCopier.copy(rule);
										ruleOwner.getRules().add(copy);
									} else {
										ruleCopier.update(rule, existingRule);
									}
								}
							}

							componentTypeCopier.updateManifests(componentTypeOwner.getComponentTypes());
							componentTypeCopier.updateThreats(componentTypeOwner.getComponentTypes(), threatOwner.getExternals());
							componentTypeCopier.updateVulnerabilities(componentTypeOwner.getComponentTypes(), vulnerabilityOwner.getVulnerabilities());
							vulnerabilityCopier.updateManifests(vulnerabilityOwner.getVulnerabilities());
							vulnerabilityCopier.updateAffects(vulnerabilityOwner.getVulnerabilities(), componentTypeOwner.getComponentTypes());
							ruleCopier.updateVulnerabilities(ruleOwner.getRules(), vulnerabilityOwner.getVulnerabilities());
							ruleCopier.updateComponentTypes(ruleOwner.getRules(), componentTypeOwner.getComponentTypes());
							ruleCopier.updateControls(ruleOwner.getRules(), controlOwner.getExternals());
						} else {
							TRADESRCPActivator.logError("Invalid catalog model");
						}
					}
				};

				editingDomain.getCommandStack().execute(cmd);
			});
		} catch (InvocationTargetException | InterruptedException e) {
			TRADESRCPActivator.logError("Error while importing model " + e.getMessage(), e);
			return false;
		}
		return true;
	}

	@Override
	public boolean canFinish() {
		return projectSelectionPage.getSelectedProject() != null && fileSelectionPage.getPath() != null
				&& importedRootName != null && !importedRootName.isBlank()
				&& fileSelectionPage.getPath().toFile().exists()
				&& (!selectedComponentTypes.isEmpty() || 
					!selectedVulnerabilities.isEmpty() || 
					!selectedThreats.isEmpty() || 
					!selectedControls.isEmpty() || 
					!selectedRules.isEmpty());
	}

	private IProject getSelectedProject(IStructuredSelection selection) {
		for (Object o : selection.toArray()) {
			if (o instanceof IProject) {
				Option<ModelingProject> opt = ModelingProject.asModelingProject((IProject) o);
				if (opt.some()) {
					return (IProject) o;
				}

			}
		}

		return null;
	}

}
