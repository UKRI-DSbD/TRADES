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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dsm.TRADES.ComponentType;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.Vulnerability;

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
 *   <li>{@link dsm.TRADES.impl.ComponentTypeImpl#getAffectedBy <em>Affected By</em>}</li>
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
	 * The cached value of the '{@link #getAffectedBy() <em>Affected By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> affectedBy;

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
	public EList<Vulnerability> getAffectedBy() {
		if (affectedBy == null) {
			affectedBy = new EObjectWithInverseResolvingEList.ManyInverse<Vulnerability>(Vulnerability.class, this,
					TRADESPackage.COMPONENT_TYPE__AFFECTED_BY, TRADESPackage.VULNERABILITY__AFFECTS);
		}
		return affectedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.COMPONENT_TYPE__AFFECTED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAffectedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.COMPONENT_TYPE__AFFECTED_BY:
			return ((InternalEList<?>) getAffectedBy()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.COMPONENT_TYPE__MANIFESTS:
			return getManifests();
		case TRADESPackage.COMPONENT_TYPE__SUBJECT_TO_THREATS:
			return getSubjectToThreats();
		case TRADESPackage.COMPONENT_TYPE__AFFECTED_BY:
			return getAffectedBy();
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
		case TRADESPackage.COMPONENT_TYPE__AFFECTED_BY:
			getAffectedBy().clear();
			getAffectedBy().addAll((Collection<? extends Vulnerability>) newValue);
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
		case TRADESPackage.COMPONENT_TYPE__AFFECTED_BY:
			getAffectedBy().clear();
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
		case TRADESPackage.COMPONENT_TYPE__AFFECTED_BY:
			return affectedBy != null && !affectedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentTypeImpl
