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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dsm.TRADES.AttackChain;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.TRADESPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AttackChainImpl#getAttackChainSteps <em>Attack Chain Steps</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainImpl#getComputedDifficulty <em>Computed Difficulty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackChainImpl extends NamedElementImpl implements AttackChain {
	/**
	 * The cached value of the '{@link #getAttackChainSteps() <em>Attack Chain Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackChainSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackChainStep> attackChainSteps;

	/**
	 * The default value of the '{@link #getComputedDifficulty() <em>Computed Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPUTED_DIFFICULTY_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ATTACK_CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttackChainStep> getAttackChainSteps() {
		if (attackChainSteps == null) {
			attackChainSteps = new EObjectContainmentEList<AttackChainStep>(AttackChainStep.class, this,
					TRADESPackage.ATTACK_CHAIN__ATTACK_CHAIN_STEPS);
		}
		return attackChainSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getComputedDifficulty() {
		// TODO: implement this method to return the 'Computed Difficulty' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComputedDifficulty(int newComputedDifficulty) {
		// TODO: implement this method to set the 'Computed Difficulty' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.ATTACK_CHAIN__ATTACK_CHAIN_STEPS:
			return ((InternalEList<?>) getAttackChainSteps()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.ATTACK_CHAIN__ATTACK_CHAIN_STEPS:
			return getAttackChainSteps();
		case TRADESPackage.ATTACK_CHAIN__COMPUTED_DIFFICULTY:
			return getComputedDifficulty();
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
		case TRADESPackage.ATTACK_CHAIN__ATTACK_CHAIN_STEPS:
			getAttackChainSteps().clear();
			getAttackChainSteps().addAll((Collection<? extends AttackChainStep>) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN__COMPUTED_DIFFICULTY:
			setComputedDifficulty((Integer) newValue);
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
		case TRADESPackage.ATTACK_CHAIN__ATTACK_CHAIN_STEPS:
			getAttackChainSteps().clear();
			return;
		case TRADESPackage.ATTACK_CHAIN__COMPUTED_DIFFICULTY:
			setComputedDifficulty(COMPUTED_DIFFICULTY_EDEFAULT);
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
		case TRADESPackage.ATTACK_CHAIN__ATTACK_CHAIN_STEPS:
			return attackChainSteps != null && !attackChainSteps.isEmpty();
		case TRADESPackage.ATTACK_CHAIN__COMPUTED_DIFFICULTY:
			return getComputedDifficulty() != COMPUTED_DIFFICULTY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //AttackChainImpl
