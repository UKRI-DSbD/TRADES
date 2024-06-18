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

import dsm.TRADES.AbstractRuleOwner;
import dsm.TRADES.RuleOwner;
import dsm.TRADES.TRADESPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Rule Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AbstractRuleOwnerImpl#getRuleOwner <em>Rule Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractRuleOwnerImpl extends MinimalEObjectImpl.Container implements AbstractRuleOwner {
	/**
	 * The cached value of the '{@link #getRuleOwner() <em>Rule Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleOwner()
	 * @generated
	 * @ordered
	 */
	protected RuleOwner ruleOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRuleOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ABSTRACT_RULE_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleOwner getRuleOwner() {
		return ruleOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleOwner(RuleOwner newRuleOwner, NotificationChain msgs) {
		RuleOwner oldRuleOwner = ruleOwner;
		ruleOwner = newRuleOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ABSTRACT_RULE_OWNER__RULE_OWNER, oldRuleOwner, newRuleOwner);
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
	public void setRuleOwner(RuleOwner newRuleOwner) {
		if (newRuleOwner != ruleOwner) {
			NotificationChain msgs = null;
			if (ruleOwner != null)
				msgs = ((InternalEObject) ruleOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ABSTRACT_RULE_OWNER__RULE_OWNER, null, msgs);
			if (newRuleOwner != null)
				msgs = ((InternalEObject) newRuleOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ABSTRACT_RULE_OWNER__RULE_OWNER, null, msgs);
			msgs = basicSetRuleOwner(newRuleOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ABSTRACT_RULE_OWNER__RULE_OWNER,
					newRuleOwner, newRuleOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.ABSTRACT_RULE_OWNER__RULE_OWNER:
			return basicSetRuleOwner(null, msgs);
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
		case TRADESPackage.ABSTRACT_RULE_OWNER__RULE_OWNER:
			return getRuleOwner();
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
		case TRADESPackage.ABSTRACT_RULE_OWNER__RULE_OWNER:
			setRuleOwner((RuleOwner) newValue);
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
		case TRADESPackage.ABSTRACT_RULE_OWNER__RULE_OWNER:
			setRuleOwner((RuleOwner) null);
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
		case TRADESPackage.ABSTRACT_RULE_OWNER__RULE_OWNER:
			return ruleOwner != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractRuleOwnerImpl
