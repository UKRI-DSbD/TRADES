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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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

import dsm.TRADES.Analysis;
import dsm.TRADES.ComponentType;
import dsm.TRADES.Vulnerability;
import dsm.TRADES.VulnerabilityTypeENUM;
import dsm.cve.design.wizards.CVECatalogSelectionPage;
import dsm.cve.model.CVECatalog.CVECatalogFactory;
import dsm.cwe.model.CWECatalog.Weakness;
import dsm.cwe.model.CWECatalog.WeaknessCatalog;
import dsm.trades.rcp.TRADESRCPActivator;
import dsm.trades.rcp.utils.CatalogUtils;

/**
 * Wizard used to import MITRE CVE catalog
 */
public abstract class ImportCVECatalogWizardBase extends Wizard implements IImportWizard {

	protected CVECatalogSelectionPage catalogSelectionPage;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setNeedsProgressMonitor(true);
	}

	public boolean performFinishForProject(IProject project) {
		ModelingProject modelingProject = ModelingProject.asModelingProject(project).get();
		if (modelingProject != null) {
			Option<URI> mainRepURI = modelingProject.getMainRepresentationsFileURI(new NullProgressMonitor());
			if (mainRepURI.some()) {
				URI repUri = mainRepURI.get();

				Session[] session = new Session[1];
				try {
					getContainer().run(false, false, monitor -> {

						session[0] = SessionManager.INSTANCE.getSession(repUri, monitor);
						if (!session[0].isOpen()) {
							session[0].open(monitor);
						}
						CatalogUtils.createCatalogFolder(project, monitor);
					});

				} catch (InvocationTargetException | InterruptedException e) {
					TRADESRCPActivator.logError("Error occured while loading the session : " + e.getMessage(), e);
				}

				return importCatalog(repUri, session[0]);
			}
		}

		return false;
	}

	private boolean importCatalog(URI repUri, Session session) {
		List<String> chosenCVEs = catalogSelectionPage.getChosenCVEs();
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
						Resource cveCatalogResource = resourceSet.getResource(cveLibURI, false);
						if (cveCatalogResource == null) {
							cveCatalogResource = resourceSet.createResource(cveLibURI);
						}
						Analysis analysis = getAnalysisFromResourceSet(resourceSet);
						
						monitor.setTaskName("Converting to EMF Model");
						transformCVEs(cveCatalogResource, analysis, chosenCVEs);

						session.addSemanticResource(cveLibURI, new NullProgressMonitor());
						monitor.worked(1);
                        monitor.setTaskName("Saving the resource");
                        
                        for (Resource resource : resourceSet.getResources()) {
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

	private void transformCVEs(Resource cveCatalogResource, Analysis analysis, List<String> chosenCVEs) {
		for (String cveName : chosenCVEs) {
			
			System.out.println("CVE import - Processing CVE " + cveName);
					
			//Get or create CVE
			Vulnerability cve = getExistingCve(cveCatalogResource, cveName);
			if(cve == null) {
				System.out.println("CVE import - No existing CVE match found " + cveName);
				CVECatalogFactory cveCatalogFactory = CVECatalogFactory.eINSTANCE;
				cve = cveCatalogFactory.createVulnerability();			
				cve.setName(cveName);
				cve.setVulnerabilityType(VulnerabilityTypeENUM.CVE);
				cveCatalogResource.getContents().add(cve);
			}
            
			//Link to CPEs
			Hashtable<String, ComponentType> cpeToComponentTypeDictionary = catalogSelectionPage.getCPEToComponentTypeDictionary();
			Hashtable<String, List<String>> cveToCPEDictionary = catalogSelectionPage.getCVEToCPEDictionary();
			List<String> cpeList = cveToCPEDictionary.get(cveName);
			for (String cpeName : cpeList) {
				ComponentType cpe = cpeToComponentTypeDictionary.get(cpeName);
				
				System.out.println("CVE import - Processing CVE <--> CPE link for CPE " + cpeName);
				
				if (cpe !=  null) {
					System.out.println("CVE import - Adding CVE <--> CPE link for CPE " + cpe.getName());
					for(ComponentType componentType : analysis.getComponentTypeOwner().getComponentTypes())
					{
						if(componentType == cpe)
						{
							System.out.println("CVE import - Found CPE with memory address match" + cpeName);
							break;
						}
						if(componentType.getId().equals(cpe.getId()))
						{
							System.out.println("CVE import - Found CPE with ID match " + cpeName);
							cpe = componentType;
							break;
						}
					}
					cve.getAffects().add(cpe);
				}
			}

			//Link to CWEs
			Hashtable<String, List<String>> cveToCWEDictionary = catalogSelectionPage.getCVEToCWEDictionary();
			List<String> weaknesses = cveToCWEDictionary.get(cveName);
            for (String weakness : weaknesses) {
            	//assume CWEs already loaded
				try {
					dsm.TRADES.Vulnerability cwe = getCWEByID(weakness, cveCatalogResource);
					if (cwe != null) {
						cve.getManifests().add(cwe);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
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

	private Vulnerability getExistingCve(Resource existingResource, String cveName) {	
		for (EObject item : existingResource.getContents()) {
			Vulnerability vulnerability = (Vulnerability) item;
			if (vulnerability.getName().equals(cveName)) {
				return vulnerability;
			}
		}
		
		return null;
	}
	
	protected static Analysis getAnalysisFromResourceSet(ResourceSet resourceSet) {
		for(Resource resource : resourceSet.getResources()) {
			String fileExtension = resource.getURI().fileExtension();
			if(fileExtension != null && fileExtension.endsWith("trades")) {
				EList<EObject> contents = resource.getContents();
				if(contents.isEmpty())
					continue;
				
				return (Analysis)contents.get(0);
			}
		}		
		
		return null;
	}
}
