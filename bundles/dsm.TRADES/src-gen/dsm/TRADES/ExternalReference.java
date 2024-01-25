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
package dsm.TRADES;

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
 *   <li>{@link dsm.TRADES.ExternalReference#getReference_ID <em>Reference ID</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getExternalReference()
 * @model
 * @generated
 */
public interface ExternalReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference ID</em>' attribute.
	 * @see #setReference_ID(String)
	 * @see dsm.TRADES.TRADESPackage#getExternalReference_Reference_ID()
	 * @model
	 * @generated
	 */
	String getReference_ID();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ExternalReference#getReference_ID <em>Reference ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference ID</em>' attribute.
	 * @see #getReference_ID()
	 * @generated
	 */
	void setReference_ID(String value);

} // ExternalReference
