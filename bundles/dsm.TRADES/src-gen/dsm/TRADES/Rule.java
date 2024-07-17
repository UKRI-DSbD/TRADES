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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Rule#getVulnerabilities <em>Vulnerabilities</em>}</li>
 *   <li>{@link dsm.TRADES.Rule#getComponentTypesAffected <em>Component Types Affected</em>}</li>
 *   <li>{@link dsm.TRADES.Rule#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends Asset, ElementWithId {
	/**
	 * Returns the value of the '<em><b>Vulnerabilities</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerabilities</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getRule_Vulnerabilities()
	 * @model required="true"
	 * @generated
	 */
	EList<Vulnerability> getVulnerabilities();

	/**
	 * Returns the value of the '<em><b>Component Types Affected</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Types Affected</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getRule_ComponentTypesAffected()
	 * @model required="true"
	 * @generated
	 */
	EList<ComponentType> getComponentTypesAffected();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getRule_Controls()
	 * @model
	 * @generated
	 */
	EList<Control> getControls();

} // Rule
