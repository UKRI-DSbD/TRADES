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

 package TRADES.design.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Event;

import TRADES.design.Activator;
import TRADES.design.wizards.FetchCVEsForComponentTypeWizard;
import dsm.TRADES.Analysis;
import dsm.TRADES.ComponentType;
import dsm.TRADES.ComponentTypeOwner;
 
 /**
  * Action that fetches CVEs from remote repository and adds them to the catalog
  */
public class ActionFetchCVEs extends Action {

    private ComponentType componentType;

    public ActionFetchCVEs(ComponentType componentType) {
        super("Fetch CVEs", Activator.getDefault().getImageDescriptor("Images/Vulnerability.png"));
        this.componentType = componentType;
    }

    @Override
    public void runWithEvent(Event event) {
        if (componentType != null) {
		    FetchCVEsForComponentTypeWizard wizard = new FetchCVEsForComponentTypeWizard();
            wizard.setCPE(componentType.getName());
            Analysis analysis = (Analysis) componentType.eContainer().eContainer();
            String apiKey = analysis.getNVDAPIKey();
            List<String> cpeList = new ArrayList<String>();
            ComponentTypeOwner componentTypeOwner = analysis.getComponentTypeOwner();
            for (ComponentType componentType : componentTypeOwner.getComponentTypes()) {
            	cpeList.add(componentType.getName());
            }
            wizard.setAPIKey(apiKey);
            wizard.setCPEList(cpeList);
			WizardDialog dialog = new WizardDialog(event.display.getActiveShell(), wizard);
			dialog.open();
		}
    }
}
 