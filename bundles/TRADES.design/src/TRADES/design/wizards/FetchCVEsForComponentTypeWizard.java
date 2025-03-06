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

import java.util.Hashtable;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import dsm.TRADES.ComponentType;
import dsm.cve.design.wizards.CVECatalogSelectionPage;
import dsm.trades.rcp.internal.wizards.ImportCVECatalogWizardBase;
 
/**
 * Wizard used to import MITRE CVE catalog
 */
public class FetchCVEsForComponentTypeWizard extends ImportCVECatalogWizardBase {

    private String apiKey;
    private Hashtable<String, ComponentType> cpeToComponentTypeDictionary = new Hashtable<String, ComponentType>();
    private ComponentType cpe;

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setNeedsProgressMonitor(true);
    }
 
    @Override
    public void addPages() {
        super.addPages();
        this.catalogSelectionPage = new CVECatalogSelectionPage(cpe.getName(), apiKey, cpeToComponentTypeDictionary);
        addPage(catalogSelectionPage);
    }
 
    @Override
    public boolean performFinish() {
    	URI resourceUri = cpe.eResource().getURI();
    	String projectPath = resourceUri.trimSegments(1).toPlatformString(true);
    	IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectPath);
        return performFinishForProject(project);
    }

    @Override
    public boolean canFinish() {
        return catalogSelectionPage.getChosenCVEs() != null;
    }

	public void setCPE(ComponentType cpe) {
		this.cpe = cpe;
	}

    public void setAPIKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setCPEToComponentTypeDictionary(Hashtable<String, ComponentType> cpeToComponentTypeDictionary) {
        this.cpeToComponentTypeDictionary = cpeToComponentTypeDictionary;
    }
}
 