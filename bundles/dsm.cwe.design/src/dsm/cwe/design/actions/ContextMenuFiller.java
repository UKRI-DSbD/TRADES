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

package dsm.cwe.design.actions;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuListener2;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * Provide some trades action
 * 
 * @author Arthur Daussy
 *
 */
public class ContextMenuFiller implements IMenuListener, IMenuListener2 {

	private IStructuredSelection selection;

	@Override
	public void menuAboutToHide(IMenuManager manager) {
		selection = null;
	}

	@Override
	public void menuAboutToShow(IMenuManager manager) {
		//not needed for CWE
	}

	public void fillContextMenu(IMenuManager menu, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		}
		menu.addMenuListener(this);

	}

	public void dispose() {
		selection = null;
	}

}
