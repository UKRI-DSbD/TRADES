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

package TRADES.design.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
 
/**
 * Page used to select an CVE catalog to import
 */
public class NVDAPIKeyInputPage extends WizardPage {

    private Text keyText;

	public NVDAPIKeyInputPage() {
        super("API key page");
        setMessage("If you have an API key for the NVD database, Please enter it below :");
    }
 
    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.None);
        composite.setLayout(new GridLayout(1, true));
 
        this.keyText = new Text(composite, SWT.COLOR_WHITE);
        keyText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        setControl(composite);
    }

    public String getAPIKey() {
        if (this.keyText.getText() != null) {
            return this.keyText.getText();
        } else {
            return "";
        }
    }
}