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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weakness</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.cve.model.CVECatalog.impl.WeaknessImpl#getID <em>ID</em>}</li>
 *   <li>{@link dsm.cve.model.CVECatalog.impl.WeaknessImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.cve.model.CVECatalog.impl.WeaknessImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link dsm.cve.model.CVECatalog.impl.WeaknessImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link dsm.cve.model.CVECatalog.impl.WeaknessImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeaknessImpl extends MinimalEObjectImpl.Container implements Weakness {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstraction() <em>Abstraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstraction()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstraction() <em>Abstraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstraction()
	 * @generated
	 * @ordered
	 */
	protected String abstraction = ABSTRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStructure() <em>Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected static final String STRUCTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected String structure = STRUCTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeaknessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CVECatalogPackage.Literals.WEAKNESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVECatalogPackage.WEAKNESS__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVECatalogPackage.WEAKNESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbstraction() {
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstraction(String newAbstraction) {
		String oldAbstraction = abstraction;
		abstraction = newAbstraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVECatalogPackage.WEAKNESS__ABSTRACTION, oldAbstraction, abstraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStructure(String newStructure) {
		String oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVECatalogPackage.WEAKNESS__STRUCTURE, oldStructure, structure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVECatalogPackage.WEAKNESS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CVECatalogPackage.WEAKNESS__ID:
				return getID();
			case CVECatalogPackage.WEAKNESS__NAME:
				return getName();
			case CVECatalogPackage.WEAKNESS__ABSTRACTION:
				return getAbstraction();
			case CVECatalogPackage.WEAKNESS__STRUCTURE:
				return getStructure();
			case CVECatalogPackage.WEAKNESS__STATUS:
				return getStatus();
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
			case CVECatalogPackage.WEAKNESS__ID:
				setID((String)newValue);
				return;
			case CVECatalogPackage.WEAKNESS__NAME:
				setName((String)newValue);
				return;
			case CVECatalogPackage.WEAKNESS__ABSTRACTION:
				setAbstraction((String)newValue);
				return;
			case CVECatalogPackage.WEAKNESS__STRUCTURE:
				setStructure((String)newValue);
				return;
			case CVECatalogPackage.WEAKNESS__STATUS:
				setStatus((String)newValue);
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
			case CVECatalogPackage.WEAKNESS__ID:
				setID(ID_EDEFAULT);
				return;
			case CVECatalogPackage.WEAKNESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CVECatalogPackage.WEAKNESS__ABSTRACTION:
				setAbstraction(ABSTRACTION_EDEFAULT);
				return;
			case CVECatalogPackage.WEAKNESS__STRUCTURE:
				setStructure(STRUCTURE_EDEFAULT);
				return;
			case CVECatalogPackage.WEAKNESS__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case CVECatalogPackage.WEAKNESS__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case CVECatalogPackage.WEAKNESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CVECatalogPackage.WEAKNESS__ABSTRACTION:
				return ABSTRACTION_EDEFAULT == null ? abstraction != null : !ABSTRACTION_EDEFAULT.equals(abstraction);
			case CVECatalogPackage.WEAKNESS__STRUCTURE:
				return STRUCTURE_EDEFAULT == null ? structure != null : !STRUCTURE_EDEFAULT.equals(structure);
			case CVECatalogPackage.WEAKNESS__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (iD: ");
		result.append(iD);
		result.append(", name: ");
		result.append(name);
		result.append(", abstraction: ");
		result.append(abstraction);
		result.append(", structure: ");
		result.append(structure);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //WeaknessImpl
