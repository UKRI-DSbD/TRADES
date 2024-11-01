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
package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.TRADES.Characteristic;

public class CharacteristicItemProviderCustomImpl extends CharacteristicItemProvider {
	
	public CharacteristicItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Characteristic characteristic = (Characteristic) object;
		String label = characteristic.getLabel();
		String name = characteristic.getName();
		String value = characteristic.getValue();
		if (label == null || label.length() == 0) { 
			return getString("_UI_Characteristic_type");
		}
		if (name == null || name.length() == 0) { 
			return getString("_UI_Characteristic_type");
		}
		if (value == null || value.length() == 0) { 
			value = "<null>";
		}
		return label + " (" + name + "): " + value;
	}
}
