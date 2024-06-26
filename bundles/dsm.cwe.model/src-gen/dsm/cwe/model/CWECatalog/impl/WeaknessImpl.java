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
package dsm.cwe.model.CWECatalog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import dsm.TRADES.impl.VulnerabilityImpl;
import dsm.cwe.model.CWECatalog.CWECatalogPackage;
import dsm.cwe.model.CWECatalog.Weakness;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weakness</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.cwe.model.CWECatalog.impl.WeaknessImpl#getID <em>ID</em>}</li>
 *   <li>{@link dsm.cwe.model.CWECatalog.impl.WeaknessImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link dsm.cwe.model.CWECatalog.impl.WeaknessImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link dsm.cwe.model.CWECatalog.impl.WeaknessImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeaknessImpl extends VulnerabilityImpl implements Weakness {
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
		return CWECatalogPackage.Literals.WEAKNESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS__ABSTRACTION, oldAbstraction, abstraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS__STRUCTURE, oldStructure, structure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CWECatalogPackage.WEAKNESS__ID:
				return getID();
			case CWECatalogPackage.WEAKNESS__ABSTRACTION:
				return getAbstraction();
			case CWECatalogPackage.WEAKNESS__STRUCTURE:
				return getStructure();
			case CWECatalogPackage.WEAKNESS__STATUS:
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
			case CWECatalogPackage.WEAKNESS__ID:
				setID((String)newValue);
				return;
			case CWECatalogPackage.WEAKNESS__ABSTRACTION:
				setAbstraction((String)newValue);
				return;
			case CWECatalogPackage.WEAKNESS__STRUCTURE:
				setStructure((String)newValue);
				return;
			case CWECatalogPackage.WEAKNESS__STATUS:
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
			case CWECatalogPackage.WEAKNESS__ID:
				setID(ID_EDEFAULT);
				return;
			case CWECatalogPackage.WEAKNESS__ABSTRACTION:
				setAbstraction(ABSTRACTION_EDEFAULT);
				return;
			case CWECatalogPackage.WEAKNESS__STRUCTURE:
				setStructure(STRUCTURE_EDEFAULT);
				return;
			case CWECatalogPackage.WEAKNESS__STATUS:
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
			case CWECatalogPackage.WEAKNESS__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case CWECatalogPackage.WEAKNESS__ABSTRACTION:
				return ABSTRACTION_EDEFAULT == null ? abstraction != null : !ABSTRACTION_EDEFAULT.equals(abstraction);
			case CWECatalogPackage.WEAKNESS__STRUCTURE:
				return STRUCTURE_EDEFAULT == null ? structure != null : !STRUCTURE_EDEFAULT.equals(structure);
			case CWECatalogPackage.WEAKNESS__STATUS:
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
