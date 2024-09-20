/**
 * University of Oxford, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     University of Oxford - initial API and implementation
 * 
 */

package dsm.trades.rcp.internal.wizards;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
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

import dsm.TRADES.VulnerabilityTypeENUM;
import dsm.cve.design.wizards.CVEParameterSearchPage;

import dsm.cve.model.CVECatalog.CVECatalogFactory;
import dsm.cwe.model.CWECatalog.Weakness;
import dsm.cwe.model.CWECatalog.WeaknessCatalog;
import dsm.trades.rcp.TRADESRCPActivator;
import dsm.trades.rcp.utils.CatalogUtils;

public class ImportCVEViaParametersWizard extends Wizard implements IImportWizard {

	private IStructuredSelection selection;
	private ProjectSelectionPage projectSelectionPage;
	private CVEParameterSearchPage parameterSearchPage;

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
		this.projectSelectionPage = new ProjectSelectionPage(modelingProjects, getSelectedProject(selection));
		addPage(projectSelectionPage);
		this.parameterSearchPage = new CVEParameterSearchPage(getProject(modelingProjects));
		addPage(parameterSearchPage);
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

					return importCatalog(repUri, session[0]);
				}
			}
		}

		return false;

	}

	private boolean importCatalog(URI repUri, Session session) {
		List<String> chosenCVEs = parameterSearchPage.getChosenCVEs();
		if (chosenCVEs.size() > 0) {
			return importCVECatalog(repUri, session, chosenCVEs);
		} else {
			return false;
		}
	}

	private boolean importCVECatalog(URI repUri, Session session, List<String> chosenCVEs) {

		URI cveLibURI = CatalogUtils.getCatalogFolderURI(repUri)
				.appendSegment(URI.encodeSegment("Relevant CVEs", false));
		TransactionalEditingDomain transactionalEditingDomain = session.getTransactionalEditingDomain();

		try {
			getContainer().run(false, false, monitor -> {

				monitor.beginTask("Importing Relevant CVEs", 3);

				RecordingCommand cmd = new RecordingCommand(transactionalEditingDomain, "Import CVEs") {

					@Override
					protected void doExecute() {
						ResourceSet resourceSet = transactionalEditingDomain.getResourceSet();
						Resource existingResource = resourceSet.getResource(cveLibURI, false);
						if (existingResource == null) {
							existingResource = resourceSet.createResource(cveLibURI);
						}
						monitor.setTaskName("Converting to EMF Model");
						transformCVEs(existingResource, chosenCVEs);

						session.addSemanticResource(cveLibURI, new NullProgressMonitor());
						monitor.worked(1);
                        monitor.setTaskName("Saving the resource");
                        for (Resource resource : existingResource.getResourceSet().getResources()) {
                        	if (resource.getURI().isFile() || resource.getURI().isPlatformResource()) {
                        		try {
                                    resource.save(Collections.emptyMap());
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    System.err.println(e.getMessage());
                                }                                
							}
                            monitor.worked(1);
                        }
                    }
                };
				transactionalEditingDomain.getCommandStack().execute(cmd);

				monitor.done();
			});
		} catch (InvocationTargetException | InterruptedException e) {
			TRADESRCPActivator.logError("Problem while importing catalog" + e.getMessage(), e);
			return false;
		}
		return true;
	}

	@Override
	public boolean canFinish() {
		return projectSelectionPage.getSelectedProject() != null && parameterSearchPage.getChosenCVEs() != null;
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
	
	private IProject getProject(List<IProject> projects) {
		IResource projectFile = (IResource) selection.getFirstElement();
		for (IProject project : projects) {
			if (project.getFullPath().segments()[0].equals(projectFile.getFullPath().segments()[0])) {
				return project;
			}
		}
		return null;
	}

	private void transformCVEs(Resource existingResource, List<String> chosenCVEs) {
		for (String cveId : chosenCVEs) {
			Hashtable<String, List<String>> cveToCWEDictionary = parameterSearchPage.getCVEToCWEDictionary();
			List<String> weaknesses = cveToCWEDictionary.get(cveId);
			CVECatalogFactory cveCatalogFactory = CVECatalogFactory.eINSTANCE;
			dsm.cve.model.CVECatalog.Vulnerability cve = cveCatalogFactory.createVulnerability();			
			cve.setName(cveId);
            cve.setVulnerabilityType(VulnerabilityTypeENUM.CVE);
            
            //placeholder for linking with cpe component types
            //NVDAPIUtils.queryCVEEndpoint(e, searchText, apiKey, resultsText, cveViewer, cveToCWEDictionary);
            
			for (String weakness : weaknesses) {
				//assume CWEs already loaded
				try {
					dsm.TRADES.Vulnerability cwe = getCWEByID(weakness, existingResource);
					if (cwe != null) {
						cve.getManifests().add(cwe);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

			addCVE(existingResource, cve);
		}
	}

	private dsm.TRADES.Vulnerability getCWEByID(String cweId, Resource existingCVEResource) {
		for (Resource resource : existingCVEResource.getResourceSet().getResources()) {
			URI uri = resource.getURI();
			if (uri.segments().length >= 4) {
				if (uri.segments()[3].endsWith("cwe")) {
					WeaknessCatalog weaknessCatalog = (WeaknessCatalog) resource.getContents().get(0);
					for (Weakness weakness : weaknessCatalog.getWeaknesses().getWeaknesses()) {
						if (weakness.getID().equals(cweId)) {
							return (dsm.TRADES.Vulnerability) weakness;
						}
					}
				}
			}
		}
		return null;
	}

	private void addCVE(Resource existingResource, dsm.cve.model.CVECatalog.Vulnerability cve) {
		List<String> existingIds = new ArrayList<String>();

		for (EObject item : existingResource.getContents()) {
			dsm.cve.model.CVECatalog.Vulnerability vulnerability = (dsm.cve.model.CVECatalog.Vulnerability) item;
			existingIds.add(vulnerability.getId());
		}
		if(!existingIds.contains(cve.getId())) {
			existingResource.getContents().add(cve);
		}
	}
}
