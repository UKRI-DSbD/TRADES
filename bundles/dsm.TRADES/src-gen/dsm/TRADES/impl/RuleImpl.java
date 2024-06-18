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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import dsm.TRADES.ComponentType;
import dsm.TRADES.Control;
import dsm.TRADES.Rule;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Vulnerability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.RuleImpl#getVulnerabilities <em>Vulnerabilities</em>}</li>
 *   <li>{@link dsm.TRADES.impl.RuleImpl#getComponentTypesAffected <em>Component Types Affected</em>}</li>
 *   <li>{@link dsm.TRADES.impl.RuleImpl#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends AssetImpl implements Rule {
	/**
	 * The cached value of the '{@link #getVulnerabilities() <em>Vulnerabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> vulnerabilities;

	/**
	 * The cached value of the '{@link #getComponentTypesAffected() <em>Component Types Affected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypesAffected()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> componentTypesAffected;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vulnerability> getVulnerabilities() {
		if (vulnerabilities == null) {
			vulnerabilities = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this,
					TRADESPackage.RULE__VULNERABILITIES);
		}
		return vulnerabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentType> getComponentTypesAffected() {
		if (componentTypesAffected == null) {
			componentTypesAffected = new EObjectResolvingEList<ComponentType>(ComponentType.class, this,
					TRADESPackage.RULE__COMPONENT_TYPES_AFFECTED);
		}
		return componentTypesAffected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectResolvingEList<Control>(Control.class, this, TRADESPackage.RULE__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.RULE__VULNERABILITIES:
			return getVulnerabilities();
		case TRADESPackage.RULE__COMPONENT_TYPES_AFFECTED:
			return getComponentTypesAffected();
		case TRADESPackage.RULE__CONTROLS:
			return getControls();
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
		case TRADESPackage.RULE__VULNERABILITIES:
			getVulnerabilities().clear();
			getVulnerabilities().addAll((Collection<? extends Vulnerability>) newValue);
			return;
		case TRADESPackage.RULE__COMPONENT_TYPES_AFFECTED:
			getComponentTypesAffected().clear();
			getComponentTypesAffected().addAll((Collection<? extends ComponentType>) newValue);
			return;
		case TRADESPackage.RULE__CONTROLS:
			getControls().clear();
			getControls().addAll((Collection<? extends Control>) newValue);
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
		case TRADESPackage.RULE__VULNERABILITIES:
			getVulnerabilities().clear();
			return;
		case TRADESPackage.RULE__COMPONENT_TYPES_AFFECTED:
			getComponentTypesAffected().clear();
			return;
		case TRADESPackage.RULE__CONTROLS:
			getControls().clear();
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
		case TRADESPackage.RULE__VULNERABILITIES:
			return vulnerabilities != null && !vulnerabilities.isEmpty();
		case TRADESPackage.RULE__COMPONENT_TYPES_AFFECTED:
			return componentTypesAffected != null && !componentTypesAffected.isEmpty();
		case TRADESPackage.RULE__CONTROLS:
			return controls != null && !controls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleImpl
