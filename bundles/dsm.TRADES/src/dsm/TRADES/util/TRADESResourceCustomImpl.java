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
package dsm.TRADES.util;

import org.eclipse.emf.common.util.URI;

public class TRADESResourceCustomImpl extends TRADESResourceImpl {

	public TRADESResourceCustomImpl(URI uri) {
		super(uri);
	}

	//Use UUIDs at Resource level
	@Override
	protected boolean useUUIDs() {
		return true;
	}

}
