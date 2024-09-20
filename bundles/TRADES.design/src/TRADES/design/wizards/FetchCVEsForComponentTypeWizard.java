/**
 * Copyright University of Oxford, Eclipse contributors and others 2021. All rights reserved.
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

package TRADES.design.wizards;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
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

import dsm.TRADES.ComponentType;
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
public class FetchCVEsForComponentTypeWizard extends Wizard implements IImportWizard {

    private String apiKey;
    private Hashtable<String, ComponentType> cpeToComponentTypeDictionary = new Hashtable<String, ComponentType>();
    private CVECatalogSelectionPage catalogSelectionPage;
    private String cpe;

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setNeedsProgressMonitor(true);
    }
 
    @Override
    public void addPages() {
        super.addPages();
        this.catalogSelectionPage = new CVECatalogSelectionPage(cpe, apiKey, cpeToComponentTypeDictionary);
        addPage(catalogSelectionPage);
    }
 
    @Override
    public boolean performFinish() {
    	List<IProject> modelingProjects = Stream.of(ResourcesPlugin.getWorkspace().getRoot().getProjects())
				.filter(p -> ModelingProject.asModelingProject(p).some()).collect(toList());
    	IProject selectedProject0 = modelingProjects.get(0);
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
        return catalogSelectionPage.getChosenCVEs() != null;
    }
 
    private void transformCVEs(Resource existingResource, List<String> chosenCVEs) {
		for (String cveName : chosenCVEs) {
			Hashtable<String, List<String>> cveToCWEDictionary = catalogSelectionPage.getCVEToCWEDictionary();
			List<String> weaknesses = cveToCWEDictionary.get(cveName);
			CVECatalogFactory cveCatalogFactory = CVECatalogFactory.eINSTANCE;
			dsm.cve.model.CVECatalog.Vulnerability cve = cveCatalogFactory.createVulnerability();			
			cve.setName(cveName);
            cve.setVulnerabilityType(VulnerabilityTypeENUM.CVE);
			
            Hashtable<String, ComponentType> cpeToComponentTypeDictionary = catalogSelectionPage.getCPEToComponentTypeDictionary();
			Hashtable<String, List<String>> cveToCPEDictionary = catalogSelectionPage.getCVEToCPEDictionary();
			List<String> cpeList = cveToCPEDictionary.get(cveName);
			for (String cpeName : cpeList) {
				ComponentType cpe = cpeToComponentTypeDictionary.get(cpeName);
				if (cpe !=  null) {
					cve.getAffects().add(cpe);
				}
			}

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
		boolean foundCVE = false;

		for (EObject item : existingResource.getContents()) {
			dsm.cve.model.CVECatalog.Vulnerability vulnerability = (dsm.cve.model.CVECatalog.Vulnerability) item;
			if (vulnerability.getName().equals(cve.getName())) {
				foundCVE = true;
				for (ComponentType newComponentType : cve.getAffects()) {
					boolean matchExists = false;
                    for (ComponentType existingComponentType : vulnerability.getAffects()) {
                        if (existingComponentType.getName().equals(newComponentType.getName())) {
                            matchExists = true;
                            break;
                        }
                    }
                    if (!matchExists) {
                        vulnerability.getAffects().add(newComponentType);
                    }
				}
                for (dsm.TRADES.Vulnerability newVulnerability : cve.getManifests()) {
					boolean matchExists = false;
                    for (dsm.TRADES.Vulnerability existingVulnerability : vulnerability.getManifests()) {
                        if (existingVulnerability.getName().equals(newVulnerability.getName())) {
                            matchExists = true;
                            break;
                        }
                    }
                    if (!matchExists) {
                        vulnerability.getManifests().add(newVulnerability);
                    }
				}
			}
		}
		
		//adding new (because it doesn't exist)
		if(!foundCVE) {
			existingResource.getContents().add(cve);
		}
	}
	
	public void setCPE(String cpe) {
		this.cpe = cpe;
	}

    public void setAPIKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setCPEToComponentTypeDictionary(Hashtable<String, ComponentType> cpeToComponentTypeDictionary) {
        this.cpeToComponentTypeDictionary = cpeToComponentTypeDictionary;
    }
}
 