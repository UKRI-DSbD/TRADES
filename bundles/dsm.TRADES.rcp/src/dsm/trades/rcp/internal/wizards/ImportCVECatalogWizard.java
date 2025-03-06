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

import java.util.Hashtable;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.ui.IWorkbench;

import dsm.TRADES.Analysis;
import dsm.TRADES.ComponentType;
import dsm.TRADES.ComponentTypeOwner;
import dsm.cve.design.wizards.CVECatalogSelectionPage;

/**
 * Wizard used to import MITRE CVE catalog
 */
public class ImportCVECatalogWizard extends ImportCVECatalogWizardBase {

	private IStructuredSelection selection;
	private ProjectSelectionPage projectSelectionPage;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		super.init(workbench, selection);
	}

	@Override
	public void addPages() {
		super.addPages();
		List<IProject> modelingProjects = Stream.of(ResourcesPlugin.getWorkspace().getRoot().getProjects())
				.filter(p -> ModelingProject.asModelingProject(p).some()).collect(toList());
		
		Consumer<IProject> onSelection = (IProject project) -> {
			//Get resource
			IResource resource = null;
			try {
				for (IResource member : project.members()) {
					String resourceExtension = member.getFileExtension();
					if (resourceExtension != null && resourceExtension.endsWith("trades"))
						resource = member;
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
			
			if(resource == null)
				return;
			
			//Get analysis
			String platformPath = '/' + project.getName() + '/' + resource.getName().toLowerCase();
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource tradesResource = resourceSet
					.getResource(URI.createPlatformResourceURI(platformPath), true);
			Analysis analysis = (Analysis) tradesResource.getContents().get(0);
			
			//Get CPEs
			ComponentTypeOwner componentTypeOwner = analysis.getComponentTypeOwner();
			Hashtable<String, ComponentType> cpeToComponentTypeDictionary = new Hashtable<String, ComponentType>();
	        for (ComponentType componentType : componentTypeOwner.getComponentTypes()) {
	        	if (componentType.getName() != null) {
	        		cpeToComponentTypeDictionary.put(componentType.getName(), componentType);
	    		}
	    	}
			
			catalogSelectionPage.initialise(analysis.getNVDAPIKey(), cpeToComponentTypeDictionary);
		};
		projectSelectionPage = new ProjectSelectionPage(modelingProjects, getSelectedProject(selection), onSelection);
		addPage(projectSelectionPage);
		
		catalogSelectionPage = new CVECatalogSelectionPage();
		addPage(catalogSelectionPage);
	}

	@Override
	public boolean performFinish() {
		IProject project = projectSelectionPage.getSelectedProject();
		if (project != null) {
			return performFinishForProject(project);
		}

		return false;

	}

	@Override
	public boolean canFinish() {
		return projectSelectionPage.getSelectedProject() != null && catalogSelectionPage.getChosenCVEs() != null;
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
