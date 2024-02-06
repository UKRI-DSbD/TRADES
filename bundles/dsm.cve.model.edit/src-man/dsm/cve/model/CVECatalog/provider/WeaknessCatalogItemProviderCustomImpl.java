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
package dsm.cve.model.CVECatalog.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import dsm.cve.model.CVECatalog.WeaknessCatalog;

public class WeaknessCatalogItemProviderCustomImpl extends WeaknessCatalogItemProvider {

	public WeaknessCatalogItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WeaknessCatalog.png"));
	}

	@Override
	public String getText(Object object) {
		String label = ((WeaknessCatalog)object).getVersion();
		return label == null || label.length() == 0 ?
			getString("_UI_WeaknessCatalog_type") :
			"MITRE CVE: version " + label;
	}
}
