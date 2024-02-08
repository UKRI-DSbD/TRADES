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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
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
		this.catalogSelectionPage = new CVECatalogSelectionPage();
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
		List<String> chosenCWEs = catalogSelectionPage.getChosenCWEs();
		if (chosenCWEs.size() > 0) {
			return importCVECatalog(repUri, session, chosenCWEs);
		}
		return false;
	}

	private boolean importCVECatalog(URI repUri, Session session, List<String> chosenCWEs) {

		URI cveLibURI = CatalogUtils.getCatalogFolderURI(repUri)
				.appendSegment("Relevant CVEs");
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
						transformCVEs(existingResource, chosenCWEs);

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
		return projectSelectionPage.getSelectedProject() != null && catalogSelectionPage.getChosenCWEs() != null;
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

	private void transformCVEs(Resource existingResource, List<String> chosenCWEs) {
		//make API call
		//run a for loop 
		//transform to EMF class
		//existingResource.getContents().add(migratedCatalog);
	}
}
