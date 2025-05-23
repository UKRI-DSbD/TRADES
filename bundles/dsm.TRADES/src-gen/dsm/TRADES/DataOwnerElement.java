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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Owner Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.DataOwnerElement#getDataOwner <em>Data Owner</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getDataOwnerElement()
 * @model abstract="true"
 * @generated
 */
public interface DataOwnerElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Owner</em>' containment reference.
	 * @see #setDataOwner(DataOwner)
	 * @see dsm.TRADES.TRADESPackage#getDataOwnerElement_DataOwner()
	 * @model containment="true"
	 * @generated
	 */
	DataOwner getDataOwner();

	/**
	 * Sets the value of the '{@link dsm.TRADES.DataOwnerElement#getDataOwner <em>Data Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Owner</em>' containment reference.
	 * @see #getDataOwner()
	 * @generated
	 */
	void setDataOwner(DataOwner value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Data> getDatas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Data> getInheritedDatas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Data> getAllDatas();

} // DataOwnerElement
