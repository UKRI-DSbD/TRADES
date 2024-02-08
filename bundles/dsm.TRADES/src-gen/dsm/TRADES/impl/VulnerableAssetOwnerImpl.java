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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dsm.TRADES.TRADESPackage;
import dsm.TRADES.VulnerableAsset;
import dsm.TRADES.VulnerableAssetOwner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vulnerable Asset Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.VulnerableAssetOwnerImpl#getVulnerableAssets <em>Vulnerable Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VulnerableAssetOwnerImpl extends MinimalEObjectImpl.Container implements VulnerableAssetOwner {
	/**
	 * The cached value of the '{@link #getVulnerableAssets() <em>Vulnerable Assets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerableAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<VulnerableAsset> vulnerableAssets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VulnerableAssetOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.VULNERABLE_ASSET_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VulnerableAsset> getVulnerableAssets() {
		if (vulnerableAssets == null) {
			vulnerableAssets = new EObjectContainmentEList<VulnerableAsset>(VulnerableAsset.class, this,
					TRADESPackage.VULNERABLE_ASSET_OWNER__VULNERABLE_ASSETS);
		}
		return vulnerableAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.VULNERABLE_ASSET_OWNER__VULNERABLE_ASSETS:
			return ((InternalEList<?>) getVulnerableAssets()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.VULNERABLE_ASSET_OWNER__VULNERABLE_ASSETS:
			return getVulnerableAssets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.VULNERABLE_ASSET_OWNER__VULNERABLE_ASSETS:
			getVulnerableAssets().clear();
			getVulnerableAssets().addAll((Collection<? extends VulnerableAsset>) newValue);
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
		case TRADESPackage.VULNERABLE_ASSET_OWNER__VULNERABLE_ASSETS:
			getVulnerableAssets().clear();
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
		case TRADESPackage.VULNERABLE_ASSET_OWNER__VULNERABLE_ASSETS:
			return vulnerableAssets != null && !vulnerableAssets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VulnerableAssetOwnerImpl
