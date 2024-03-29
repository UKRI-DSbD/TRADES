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
package dsm.oscal.ext;

import com.google.common.base.CaseFormat;

import gov.nist.secauto.metaschema.datatypes.DataTypes;
import gov.nist.secauto.metaschema.model.Metaschema;
import gov.nist.secauto.metaschema.model.common.instance.IAssemblyInstance;
import gov.nist.secauto.metaschema.model.common.instance.IFieldInstance;

/**
 * Helper class used to provide correct name for the migration
 * 
 * @author Arthur Daussy
 *
 */
public class NameHelper {

	public static String getProperEClassName(String name) {
		return CaseFormat.LOWER_HYPHEN.to(CaseFormat.UPPER_CAMEL, name);
	}

	public static String getProperEPackageName(Metaschema schema) {
		return CaseFormat.LOWER_HYPHEN.to(CaseFormat.UPPER_CAMEL, schema.getShortName());
	}

	public static String getProperEDataTypeName(DataTypes type) {
		return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, type.name()) + "Type";
	}

	public static String getProperEStructuralFeatureName(String featureName) {
		String result = CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, featureName);

		if (result.equals("href")) { // Forbidden key work in EMF
			result = "eHref";
		}
		if (result.equals("class")) { // to match metaschema behavior
			result = "clazz";
		}
		return result;
	}

	public static String getFieldName(IAssemblyInstance assInstance) {
		String fieldName;
		String groupName = assInstance.getGroupAsName();
		if (groupName != null) {
			fieldName = groupName;
		} else {
			fieldName = assInstance.getUseName();
		}
		return fieldName;
	}

	public static String getFieldName(IFieldInstance fieldInstance) {
		String fieldName;
		String groupName = fieldInstance.getGroupAsName();
		if (groupName != null) {
			fieldName = groupName;
		} else {
			fieldName = fieldInstance.getUseName();
		}
		return fieldName;
	}
}
