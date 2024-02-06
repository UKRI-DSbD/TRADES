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
package dsm.cve.model.CVECatalog.impl;

import dsm.cve.model.CVECatalog.CVECatalogPackage;
import dsm.cve.model.CVECatalog.Weakness;
import dsm.cve.model.CVECatalog.Weaknesses;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weaknesses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.cve.model.CVECatalog.impl.WeaknessesImpl#getWeaknesses <em>Weaknesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeaknessesImpl extends MinimalEObjectImpl.Container implements Weaknesses {
	/**
	 * The cached value of the '{@link #getWeaknesses() <em>Weaknesses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeaknesses()
	 * @generated
	 * @ordered
	 */
	protected EList<Weakness> weaknesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeaknessesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CVECatalogPackage.Literals.WEAKNESSES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Weakness> getWeaknesses() {
		if (weaknesses == null) {
			weaknesses = new EObjectContainmentEList<Weakness>(Weakness.class, this, CVECatalogPackage.WEAKNESSES__WEAKNESSES);
		}
		return weaknesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CVECatalogPackage.WEAKNESSES__WEAKNESSES:
				return ((InternalEList<?>)getWeaknesses()).basicRemove(otherEnd, msgs);
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
			case CVECatalogPackage.WEAKNESSES__WEAKNESSES:
				return getWeaknesses();
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
			case CVECatalogPackage.WEAKNESSES__WEAKNESSES:
				getWeaknesses().clear();
				getWeaknesses().addAll((Collection<? extends Weakness>)newValue);
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
			case CVECatalogPackage.WEAKNESSES__WEAKNESSES:
				getWeaknesses().clear();
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
			case CVECatalogPackage.WEAKNESSES__WEAKNESSES:
				return weaknesses != null && !weaknesses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WeaknessesImpl
