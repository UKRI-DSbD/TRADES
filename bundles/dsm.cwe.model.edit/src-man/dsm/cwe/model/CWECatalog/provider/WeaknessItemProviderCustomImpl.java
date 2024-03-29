/******************************************************************************************************
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
*******************************************************************************************************/
package dsm.cwe.model.CWECatalog.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.cwe.model.CWECatalog.Weakness;

public class WeaknessItemProviderCustomImpl extends WeaknessItemProvider {

	public WeaknessItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		String id = ((Weakness)object).getID();
		String name = ((Weakness)object).getName();
		return id == null || id.length() == 0 ?
			getString("_UI_Weakness_type") :
			"CWE-" + id + ": " + name;
	}
}
