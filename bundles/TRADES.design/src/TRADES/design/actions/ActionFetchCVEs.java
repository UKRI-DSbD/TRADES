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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Event;

import dsm.TRADES.ComponentType;
import TRADES.design.Activator;
import TRADES.design.wizards.FetchCVEsForComponentTypeWizard;
 
 /**
  * Action that deletes the selected catalog from the project (and it matching
  * file)
  * 
  * @author Arthur Daussy
  *
  */
public class ActionFetchCVEs extends Action {

    private ComponentType componentType;

    public ActionFetchCVEs(ComponentType componentType) {
        super("Fetch CVEs", Activator.getDefault().getImageDescriptor("icons/Vulnerability.gif"));
        this.componentType = componentType;
    }

    @Override
    public void runWithEvent(Event event) {
        if (componentType != null) {
		    FetchCVEsForComponentTypeWizard wizard = new FetchCVEsForComponentTypeWizard(componentType);
			WizardDialog dialog = new WizardDialog(event.display.getActiveShell(), wizard);
			dialog.open();
		}
    }
}
 