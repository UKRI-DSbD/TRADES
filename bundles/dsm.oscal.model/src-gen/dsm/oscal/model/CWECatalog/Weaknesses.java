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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weaknesses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.CWECatalog.Weaknesses#getWeakness <em>Weakness</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.CWECatalog.CWECatalogPackage#getWeaknesses()
 * @model
 * @generated
 */
public interface Weaknesses extends EObject {
	/**
	 * Returns the value of the '<em><b>Weakness</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.CWECatalog.Weakness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weakness</em>' containment reference list.
	 * @see dsm.oscal.model.CWECatalog.CWECatalogPackage#getWeaknesses_Weakness()
	 * @model containment="true"
	 * @generated
	 */
	EList<Weakness> getWeakness();

} // Weaknesses