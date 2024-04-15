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
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ComponentTypeImpl#getManifests <em>Manifests</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentTypeImpl#getSubjectToThreats <em>Subject To Threats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeImpl extends NamedElementImpl implements ComponentType {
	/**
	 * The cached value of the '{@link #getManifests() <em>Manifests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifests()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> manifests;
	/**
	 * The cached value of the '{@link #getSubjectToThreats() <em>Subject To Threats</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectToThreats()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> subjectToThreats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentType> getManifests() {
		if (manifests == null) {
			manifests = new EObjectResolvingEList<ComponentType>(ComponentType.class, this,
					TRADESPackage.COMPONENT_TYPE__MANIFESTS);
		}
		return manifests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Threat> getSubjectToThreats() {
		if (subjectToThreats == null) {
			subjectToThreats = new EObjectResolvingEList<Threat>(Threat.class, this,
					TRADESPackage.COMPONENT_TYPE__SUBJECT_TO_THREATS);
		}
		return subjectToThreats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.COMPONENT_TYPE__MANIFESTS:
			return getManifests();
		case TRADESPackage.COMPONENT_TYPE__SUBJECT_TO_THREATS:
			return getSubjectToThreats();
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
		case TRADESPackage.COMPONENT_TYPE__MANIFESTS:
			getManifests().clear();
			getManifests().addAll((Collection<? extends ComponentType>) newValue);
			return;
		case TRADESPackage.COMPONENT_TYPE__SUBJECT_TO_THREATS:
			getSubjectToThreats().clear();
			getSubjectToThreats().addAll((Collection<? extends Threat>) newValue);
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
		case TRADESPackage.COMPONENT_TYPE__MANIFESTS:
			getManifests().clear();
			return;
		case TRADESPackage.COMPONENT_TYPE__SUBJECT_TO_THREATS:
			getSubjectToThreats().clear();
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
		case TRADESPackage.COMPONENT_TYPE__MANIFESTS:
			return manifests != null && !manifests.isEmpty();
		case TRADESPackage.COMPONENT_TYPE__SUBJECT_TO_THREATS:
			return subjectToThreats != null && !subjectToThreats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentTypeImpl
