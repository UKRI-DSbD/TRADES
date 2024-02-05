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
 * A representation of the model object '<em><b>Abstract Component Type Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.AbstractComponentTypeOwner#getComponentTypeOwner <em>Component Type Owner</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAbstractComponentTypeOwner()
 * @model abstract="true"
 * @generated
 */
public interface AbstractComponentTypeOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Type Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type Owner</em>' containment reference.
	 * @see #setComponentTypeOwner(ComponentTypeOwner)
	 * @see dsm.TRADES.TRADESPackage#getAbstractComponentTypeOwner_ComponentTypeOwner()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentTypeOwner getComponentTypeOwner();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AbstractComponentTypeOwner#getComponentTypeOwner <em>Component Type Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type Owner</em>' containment reference.
	 * @see #getComponentTypeOwner()
	 * @generated
	 */
	void setComponentTypeOwner(ComponentTypeOwner value);

} // AbstractComponentTypeOwner
