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
package dsm.oscal.model.CWECatalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.CWECatalog.ExternalReference#getReferenceID <em>Reference ID</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.CWECatalog.CWECatalogPackage#getExternalReference()
 * @model
 * @generated
 */
public interface ExternalReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference ID</em>' attribute.
	 * @see #setReferenceID(String)
	 * @see dsm.oscal.model.CWECatalog.CWECatalogPackage#getExternalReference_ReferenceID()
	 * @model
	 * @generated
	 */
	String getReferenceID();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.CWECatalog.ExternalReference#getReferenceID <em>Reference ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference ID</em>' attribute.
	 * @see #getReferenceID()
	 * @generated
	 */
	void setReferenceID(String value);

} // ExternalReference
