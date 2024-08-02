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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dsm.TRADES.ComponentType;
import dsm.TRADES.ElementWithId;
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
 *   <li>{@link dsm.TRADES.impl.ComponentTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentTypeImpl#getManifests <em>Manifests</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentTypeImpl#getSubjectToThreats <em>Subject To Threats</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentTypeImpl#getAffectedBy <em>Affected By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeImpl extends NamedElementImpl implements ComponentType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.COMPONENT_TYPE__ID, oldId, id));
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
		case TRADESPackage.COMPONENT_TYPE__ID:
			return getId();
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
		case TRADESPackage.COMPONENT_TYPE__ID:
			setId((String) newValue);
			return;
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
		case TRADESPackage.COMPONENT_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
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
		case TRADESPackage.COMPONENT_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TRADESPackage.COMPONENT_TYPE__MANIFESTS:
			return manifests != null && !manifests.isEmpty();
		case TRADESPackage.COMPONENT_TYPE__SUBJECT_TO_THREATS:
			return subjectToThreats != null && !subjectToThreats.isEmpty();
		case TRADESPackage.COMPONENT_TYPE__AFFECTED_BY:
			return affectedBy != null && !affectedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ElementWithId.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.COMPONENT_TYPE__ID:
				return TRADESPackage.ELEMENT_WITH_ID__ID;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ElementWithId.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ELEMENT_WITH_ID__ID:
				return TRADESPackage.COMPONENT_TYPE__ID;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl
