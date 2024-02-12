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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Dictionary;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
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

import dsm.cve.design.wizards.CVECatalogSelectionPage;
import dsm.trades.rcp.TRADESRCPActivator;
import dsm.trades.rcp.utils.CatalogUtils;
import dsm.cve.model.CVECatalog.Vulnerability;
import dsm.cve.model.CVECatalog.CVECatalogFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

/**
 * Wizard used to import MITRE CVE catalog
 */
public class ImportCVECatalogWizard extends Wizard implements IImportWizard {

	private IStructuredSelection selection;
	private ProjectSelectionPage projectSelectionPage;
	private CVECatalogSelectionPage catalogSelectionPage;

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
		URI sessionResourceURI = URI.createPlatformResourceURI(getSelectedProject(selection).getFullPath() + "/representations.aird", true);
		Session existingSession = SessionManager.INSTANCE.getExistingSession(sessionResourceURI);
		this.catalogSelectionPage = new CVECatalogSelectionPage(existingSession);
		addPage(catalogSelectionPage);
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
		List<String> chosenCVEs = catalogSelectionPage.getchosenCVEs();
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
						} else {
							existingResource.getContents().clear();
						}
						monitor.setTaskName("Converting to EMF Model");
						transformCVEs(existingResource, chosenCVEs);

						session.addSemanticResource(cveLibURI, new NullProgressMonitor());
						monitor.worked(1);
						try {
							monitor.setTaskName("Saving the resource");
							existingResource.save(Collections.emptyMap());
							monitor.worked(1);
						} catch (IOException e) {
							TRADESRCPActivator.logError("Problem while saving catalog " + e.getMessage(), e);
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
		return projectSelectionPage.getSelectedProject() != null && catalogSelectionPage.getchosenCVEs() != null;
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

	private void transformCVEs(Resource existingResource, List<String> chosenCVEs) {
		for (String cveId : chosenCVEs) {
			Dictionary<String, List<String>> vulnerabilityDictionary = catalogSelectionPage.getVulnerabilityDictionary();
			List<String> weaknesses = vulnerabilityDictionary.get(cveId);
			CVECatalogFactory catalogFactory = CVECatalogFactory.eINSTANCE;
			Vulnerability cve = catalogFactory.createVulnerability();
			cve.setId(cveId);
			if (weaknesses.size() > 0) {
				for (int i = 0; i < weaknesses.size(); i++) {
					//Vulnerability cwe = catalogFactory.createVulnerability();
					//cwe.setName(weaknesses.get(i));
					//cve.getRefines().add(cwe);
				}
			}
			existingResource.getContents().add(cve);
		}
	}
}
