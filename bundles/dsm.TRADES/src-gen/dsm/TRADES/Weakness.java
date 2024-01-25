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
 * A representation of the model object '<em><b>Weakness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Weakness#getID <em>ID</em>}</li>
 *   <li>{@link dsm.TRADES.Weakness#getValue <em>Value</em>}</li>
 *   <li>{@link dsm.TRADES.Weakness#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link dsm.TRADES.Weakness#getStructure <em>Structure</em>}</li>
 *   <li>{@link dsm.TRADES.Weakness#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getWeakness()
 * @model
 * @generated
 */
public interface Weakness extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see dsm.TRADES.TRADESPackage#getWeakness_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Weakness#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dsm.TRADES.TRADESPackage#getWeakness_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Weakness#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstraction</em>' attribute.
	 * @see #setAbstraction(String)
	 * @see dsm.TRADES.TRADESPackage#getWeakness_Abstraction()
	 * @model
	 * @generated
	 */
	String getAbstraction();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Weakness#getAbstraction <em>Abstraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction</em>' attribute.
	 * @see #getAbstraction()
	 * @generated
	 */
	void setAbstraction(String value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' attribute.
	 * @see #setStructure(String)
	 * @see dsm.TRADES.TRADESPackage#getWeakness_Structure()
	 * @model
	 * @generated
	 */
	String getStructure();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Weakness#getStructure <em>Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' attribute.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see dsm.TRADES.TRADESPackage#getWeakness_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Weakness#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // Weakness
