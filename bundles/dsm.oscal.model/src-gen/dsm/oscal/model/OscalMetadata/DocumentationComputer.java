/**
 * 
 *  Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *      ELTA Ltd - initial API and implementation
 *  
 * 
 */
package dsm.oscal.model.OscalMetadata;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import dsm.oscal.model.OscalCatalogCommon.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation Computer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getDocumentationComputer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DocumentationComputer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String computeDocumentation(boolean resolveParameters);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Parameter> collectParametersInUse();

} // DocumentationComputer
