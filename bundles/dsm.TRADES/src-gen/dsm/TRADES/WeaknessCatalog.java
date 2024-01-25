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
 * A representation of the model object '<em><b>Weakness Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.WeaknessCatalog#getVersion <em>Version</em>}</li>
 *   <li>{@link dsm.TRADES.WeaknessCatalog#getWeaknesses <em>Weaknesses</em>}</li>
 *   <li>{@link dsm.TRADES.WeaknessCatalog#getCategories <em>Categories</em>}</li>
 *   <li>{@link dsm.TRADES.WeaknessCatalog#getViews <em>Views</em>}</li>
 *   <li>{@link dsm.TRADES.WeaknessCatalog#getExternalReferences <em>External References</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getWeaknessCatalog()
 * @model
 * @generated
 */
public interface WeaknessCatalog extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see dsm.TRADES.TRADESPackage#getWeaknessCatalog_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link dsm.TRADES.WeaknessCatalog#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Weaknesses</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Weakness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weaknesses</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getWeaknessCatalog_Weaknesses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Weakness> getWeaknesses();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getWeaknessCatalog_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getWeaknessCatalog_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>External References</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ExternalReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External References</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getWeaknessCatalog_ExternalReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalReference> getExternalReferences();

} // WeaknessCatalog
