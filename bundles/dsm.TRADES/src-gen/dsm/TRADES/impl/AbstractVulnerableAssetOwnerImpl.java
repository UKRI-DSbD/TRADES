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

import dsm.TRADES.AbstractVulnerableAssetOwner;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.VulnerableAssetOwner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Vulnerable Asset Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AbstractVulnerableAssetOwnerImpl#getVulnerableAssetOwner <em>Vulnerable Asset Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractVulnerableAssetOwnerImpl extends MinimalEObjectImpl.Container
		implements AbstractVulnerableAssetOwner {
	/**
	 * The cached value of the '{@link #getVulnerableAssetOwner() <em>Vulnerable Asset Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerableAssetOwner()
	 * @generated
	 * @ordered
	 */
	protected VulnerableAssetOwner vulnerableAssetOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractVulnerableAssetOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ABSTRACT_VULNERABLE_ASSET_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VulnerableAssetOwner getVulnerableAssetOwner() {
		return vulnerableAssetOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVulnerableAssetOwner(VulnerableAssetOwner newVulnerableAssetOwner,
			NotificationChain msgs) {
		VulnerableAssetOwner oldVulnerableAssetOwner = vulnerableAssetOwner;
		vulnerableAssetOwner = newVulnerableAssetOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ABSTRACT_VULNERABLE_ASSET_OWNER__VULNERABLE_ASSET_OWNER, oldVulnerableAssetOwner,
					newVulnerableAssetOwner);
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
	public void setVulnerableAssetOwner(VulnerableAssetOwner newVulnerableAssetOwner) {
		if (newVulnerableAssetOwner != vulnerableAssetOwner) {
			NotificationChain msgs = null;
			if (vulnerableAssetOwner != null)
				msgs = ((InternalEObject) vulnerableAssetOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ABSTRACT_VULNERABLE_ASSET_OWNER__VULNERABLE_ASSET_OWNER,
						null, msgs);
			if (newVulnerableAssetOwner != null)
				msgs = ((InternalEObject) newVulnerableAssetOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ABSTRACT_VULNERABLE_ASSET_OWNER__VULNERABLE_ASSET_OWNER,
						null, msgs);
			msgs = basicSetVulnerableAssetOwner(newVulnerableAssetOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ABSTRACT_VULNERABLE_ASSET_OWNER__VULNERABLE_ASSET_OWNER, newVulnerableAssetOwner,
					newVulnerableAssetOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.ABSTRACT_VULNERABLE_ASSET_OWNER__VULNERABLE_ASSET_OWNER:
			return basicSetVulnerableAssetOwner(null, msgs);
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
		case TRADESPackage.ABSTRACT_VULNERABLE_ASSET_OWNER__VULNERABLE_ASSET_OWNER:
			return getVulnerableAssetOwner();
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
		case TRADESPackage.ABSTRACT_VULNERABLE_ASSET_OWNER__VULNERABLE_ASSET_OWNER:
			setVulnerableAssetOwner((VulnerableAssetOwner) newValue);
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
		case TRADESPackage.ABSTRACT_VULNERABLE_ASSET_OWNER__VULNERABLE_ASSET_OWNER:
			setVulnerableAssetOwner((VulnerableAssetOwner) null);
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
		case TRADESPackage.ABSTRACT_VULNERABLE_ASSET_OWNER__VULNERABLE_ASSET_OWNER:
			return vulnerableAssetOwner != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractVulnerableAssetOwnerImpl
