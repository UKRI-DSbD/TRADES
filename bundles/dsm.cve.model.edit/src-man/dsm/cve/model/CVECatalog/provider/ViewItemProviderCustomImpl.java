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
import dsm.cve.model.CVECatalog.View;

public class ViewItemProviderCustomImpl extends ViewItemProvider {

	public ViewItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		String id = ((View)object).getID();
		String name = ((View)object).getName();
		return id == null || id.length() == 0 ?
			getString("_UI_View_type") :
			id + ": " + name;
	}
}
