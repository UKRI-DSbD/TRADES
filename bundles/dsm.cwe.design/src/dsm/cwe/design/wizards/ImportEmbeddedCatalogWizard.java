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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
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

import dsm.cwe.design.Activator;
import dsm.cwe.design.EmbeddedCatalogRegistry;
import dsm.cwe.design.actions.CWEUtils;
import dsm.cwe.model.CWECatalog.Catalog;
import dsm.cwe.model.transform.CWETransformer;
import dsm.trades.rcp.internal.wizards.ProjectSelectionPage;
import dsm.trades.rcp.utils.CatalogUtils;

/**
 * Wizard use to import an CWE catalog
 * 
 * @author Arthur Daussy
 *
 */
public class ImportEmbeddedCatalogWizard extends Wizard implements IImportWizard {

	private IStructuredSelection selection;
	private ProjectSelectionPage projectSelectionPage;
	private CatalogSelectionPage catalogSelectionPage;

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
		this.projectSelectionPage = new ProjectSelectionPage(modelingProjects,
				CWEUtils.getSelectedProject(selection));
		addPage(projectSelectionPage);
		this.catalogSelectionPage = new CatalogSelectionPage();
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
						Activator.logError("Error occured while loading the session : " + e.getMessage(), e);
					}

					return importCatalog(repUri, session[0]);

				}
			}
		}

		return false;

	}

	private boolean importCatalog(URI repUri, Session session) {
		String catalog = catalogSelectionPage.getCatalog();
		Path catalogPath = null;
		String cweLibName = null;
		if (catalog != null) {
			if (catalogSelectionPage.isEmbedded()) {
				try {
					InputStream stream = EmbeddedCatalogRegistry.getInstance().getCatalog(catalog);
					if (stream != null) {
						File tmpFile = File.createTempFile(catalog, ".xml");
						tmpFile.deleteOnExit();
						catalogPath = tmpFile.toPath();
						cweLibName = catalog;
						Files.copy(stream, catalogPath, StandardCopyOption.REPLACE_EXISTING);
					}

				} catch (IOException e) {
					Activator.logError("Unable to read embedded catalog " + e.getMessage(), e);
				}
			} else {
				catalogPath = Path.of(catalog);
				String fileName = catalogPath.toFile().getName();
				cweLibName = fileName.replaceAll("\\.xml", "");
			}
		}
		if (catalogPath != null) {

			return importCWECatalog(repUri, session, cweLibName, catalogPath);
		}
		return false;
	}

	private boolean importCWECatalog(URI repUri, Session session, String cweLibName, Path libPath) {

		URI cweLibURI = CatalogUtils.getCatalogFolderURI(repUri)
				.appendSegment(URI.encodeSegment(cweLibName, false) + ".cwe");
		TransactionalEditingDomain transactionalEditingDomain = session.getTransactionalEditingDomain();

		try {
			getContainer().run(false, false, monitor -> {

				monitor.beginTask("Importing " + cweLibName, 3);

				RecordingCommand cmd = new RecordingCommand(transactionalEditingDomain, "Import CWE catalog") {

					@Override
					protected void doExecute() {
						ResourceSet resourceSet = transactionalEditingDomain.getResourceSet();
						Resource existingResource = resourceSet.getResource(cweLibURI, false);
						if (existingResource == null) {
							existingResource = resourceSet.createResource(cweLibURI);
						} else {
							// At the time of implementation there is no link between the other mother to
							// this model neither any Sirius representation.
							// This simple implementation works but need to be improved if:
							// * Some proxy are used to reference element in that model
							// * Some representation are displaying item in this model
							existingResource.getContents().clear();
							// At the time of this implementation the link between ExternalControl and
							// CWEControl are made using simple EString see CatalogElementURI. In those
							// URI the id used a semantic so they should not change
						}
						monitor.setTaskName("Converting to EMF Model");
						Catalog migratedCatalog = new CWETransformer().importCatalog(libPath);
						existingResource.getContents().add(migratedCatalog);

						session.addSemanticResource(cweLibURI, new NullProgressMonitor());
						monitor.worked(1);
						try {
							monitor.setTaskName("Saving the resource");
							existingResource.save(Collections.emptyMap());
							monitor.worked(1);
						} catch (IOException e) {
							Activator.logError("Problem while saving catalog " + e.getMessage(), e);
						}

					}
				};
				transactionalEditingDomain.getCommandStack().execute(cmd);

				CWEUtils.activateCWEViewpointIfMissing(session, monitor);
				monitor.done();
			});
			return true;
		} catch (InvocationTargetException | InterruptedException e) {
			Activator.logError("Problem while importing catalog" + e.getMessage(), e);
		}
		return false;
	}


	@Override
	public boolean canFinish() {
		return projectSelectionPage.getSelectedProject() != null && catalogSelectionPage.getCatalog() != null;
	}



}
