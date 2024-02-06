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
package dsm.cve.model.CVECatalog;

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
 *   <li>{@link dsm.cve.model.CVECatalog.WeaknessCatalog#getVersion <em>Version</em>}</li>
 *   <li>{@link dsm.cve.model.CVECatalog.WeaknessCatalog#getWeaknesses <em>Weaknesses</em>}</li>
 *   <li>{@link dsm.cve.model.CVECatalog.WeaknessCatalog#getCategories <em>Categories</em>}</li>
 *   <li>{@link dsm.cve.model.CVECatalog.WeaknessCatalog#getViews <em>Views</em>}</li>
 *   <li>{@link dsm.cve.model.CVECatalog.WeaknessCatalog#getExternalReferences <em>External References</em>}</li>
 * </ul>
 *
 * @see dsm.cve.model.CVECatalog.CVECatalogPackage#getWeaknessCatalog()
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
	 * @see dsm.cve.model.CVECatalog.CVECatalogPackage#getWeaknessCatalog_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link dsm.cve.model.CVECatalog.WeaknessCatalog#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Weaknesses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weaknesses</em>' containment reference.
	 * @see #setWeaknesses(Weaknesses)
	 * @see dsm.cve.model.CVECatalog.CVECatalogPackage#getWeaknessCatalog_Weaknesses()
	 * @model containment="true"
	 * @generated
	 */
	Weaknesses getWeaknesses();

	/**
	 * Sets the value of the '{@link dsm.cve.model.CVECatalog.WeaknessCatalog#getWeaknesses <em>Weaknesses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weaknesses</em>' containment reference.
	 * @see #getWeaknesses()
	 * @generated
	 */
	void setWeaknesses(Weaknesses value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference.
	 * @see #setCategories(Categories)
	 * @see dsm.cve.model.CVECatalog.CVECatalogPackage#getWeaknessCatalog_Categories()
	 * @model containment="true"
	 * @generated
	 */
	Categories getCategories();

	/**
	 * Sets the value of the '{@link dsm.cve.model.CVECatalog.WeaknessCatalog#getCategories <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categories</em>' containment reference.
	 * @see #getCategories()
	 * @generated
	 */
	void setCategories(Categories value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference.
	 * @see #setViews(Views)
	 * @see dsm.cve.model.CVECatalog.CVECatalogPackage#getWeaknessCatalog_Views()
	 * @model containment="true"
	 * @generated
	 */
	Views getViews();

	/**
	 * Sets the value of the '{@link dsm.cve.model.CVECatalog.WeaknessCatalog#getViews <em>Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Views</em>' containment reference.
	 * @see #getViews()
	 * @generated
	 */
	void setViews(Views value);

	/**
	 * Returns the value of the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External References</em>' containment reference.
	 * @see #setExternalReferences(ExternalReferences)
	 * @see dsm.cve.model.CVECatalog.CVECatalogPackage#getWeaknessCatalog_ExternalReferences()
	 * @model containment="true"
	 * @generated
	 */
	ExternalReferences getExternalReferences();

	/**
	 * Sets the value of the '{@link dsm.cve.model.CVECatalog.WeaknessCatalog#getExternalReferences <em>External References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External References</em>' containment reference.
	 * @see #getExternalReferences()
	 * @generated
	 */
	void setExternalReferences(ExternalReferences value);

} // WeaknessCatalog
