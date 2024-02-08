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
package dsm.TRADES.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import dsm.TRADES.AbstractComponentTypeOwner;
import dsm.TRADES.ComponentTypeOwner;
import dsm.TRADES.TRADESPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Component Type Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AbstractComponentTypeOwnerImpl#getComponentTypeOwner <em>Component Type Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractComponentTypeOwnerImpl extends MinimalEObjectImpl.Container
		implements AbstractComponentTypeOwner {
	/**
	 * The cached value of the '{@link #getComponentTypeOwner() <em>Component Type Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypeOwner()
	 * @generated
	 * @ordered
	 */
	protected ComponentTypeOwner componentTypeOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractComponentTypeOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ABSTRACT_COMPONENT_TYPE_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentTypeOwner getComponentTypeOwner() {
		return componentTypeOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentTypeOwner(ComponentTypeOwner newComponentTypeOwner,
			NotificationChain msgs) {
		ComponentTypeOwner oldComponentTypeOwner = componentTypeOwner;
		componentTypeOwner = newComponentTypeOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER, oldComponentTypeOwner,
					newComponentTypeOwner);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentTypeOwner(ComponentTypeOwner newComponentTypeOwner) {
		if (newComponentTypeOwner != componentTypeOwner) {
			NotificationChain msgs = null;
			if (componentTypeOwner != null)
				msgs = ((InternalEObject) componentTypeOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER,
						null, msgs);
			if (newComponentTypeOwner != null)
				msgs = ((InternalEObject) newComponentTypeOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER,
						null, msgs);
			msgs = basicSetComponentTypeOwner(newComponentTypeOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER, newComponentTypeOwner,
					newComponentTypeOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER:
			return basicSetComponentTypeOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER:
			return getComponentTypeOwner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER:
			setComponentTypeOwner((ComponentTypeOwner) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER:
			setComponentTypeOwner((ComponentTypeOwner) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER:
			return componentTypeOwner != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractComponentTypeOwnerImpl
