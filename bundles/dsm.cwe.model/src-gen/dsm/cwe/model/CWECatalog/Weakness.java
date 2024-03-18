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
package dsm.cwe.model.CWECatalog;

import dsm.TRADES.Vulnerability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weakness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.cwe.model.CWECatalog.Weakness#getID <em>ID</em>}</li>
 *   <li>{@link dsm.cwe.model.CWECatalog.Weakness#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link dsm.cwe.model.CWECatalog.Weakness#getStructure <em>Structure</em>}</li>
 *   <li>{@link dsm.cwe.model.CWECatalog.Weakness#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see dsm.cwe.model.CWECatalog.CWECatalogPackage#getWeakness()
 * @model
 * @generated
 */
public interface Weakness extends Vulnerability {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see dsm.cwe.model.CWECatalog.CWECatalogPackage#getWeakness_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link dsm.cwe.model.CWECatalog.Weakness#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstraction</em>' attribute.
	 * @see #setAbstraction(String)
	 * @see dsm.cwe.model.CWECatalog.CWECatalogPackage#getWeakness_Abstraction()
	 * @model
	 * @generated
	 */
	String getAbstraction();

	/**
	 * Sets the value of the '{@link dsm.cwe.model.CWECatalog.Weakness#getAbstraction <em>Abstraction</em>}' attribute.
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
	 * @see dsm.cwe.model.CWECatalog.CWECatalogPackage#getWeakness_Structure()
	 * @model
	 * @generated
	 */
	String getStructure();

	/**
	 * Sets the value of the '{@link dsm.cwe.model.CWECatalog.Weakness#getStructure <em>Structure</em>}' attribute.
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
	 * @see dsm.cwe.model.CWECatalog.CWECatalogPackage#getWeakness_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link dsm.cwe.model.CWECatalog.Weakness#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // Weakness
