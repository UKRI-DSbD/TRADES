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
package dsm.oscal.model.CWECatalog.impl;

import dsm.oscal.model.CWECatalog.CWECatalogPackage;
import dsm.oscal.model.CWECatalog.Categories;
import dsm.oscal.model.CWECatalog.ExternalReferences;
import dsm.oscal.model.CWECatalog.Views;
import dsm.oscal.model.CWECatalog.WeaknessCatalog;
import dsm.oscal.model.CWECatalog.Weaknesses;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weakness Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.CWECatalog.impl.WeaknessCatalogImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link dsm.oscal.model.CWECatalog.impl.WeaknessCatalogImpl#getWeaknesses <em>Weaknesses</em>}</li>
 *   <li>{@link dsm.oscal.model.CWECatalog.impl.WeaknessCatalogImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link dsm.oscal.model.CWECatalog.impl.WeaknessCatalogImpl#getViews <em>Views</em>}</li>
 *   <li>{@link dsm.oscal.model.CWECatalog.impl.WeaknessCatalogImpl#getExternalReferences <em>External References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeaknessCatalogImpl extends MinimalEObjectImpl.Container implements WeaknessCatalog {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWeaknesses() <em>Weaknesses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeaknesses()
	 * @generated
	 * @ordered
	 */
	protected Weaknesses weaknesses;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected Categories categories;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected Views views;

	/**
	 * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences()
	 * @generated
	 * @ordered
	 */
	protected ExternalReferences externalReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeaknessCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CWECatalogPackage.Literals.WEAKNESS_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS_CATALOG__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weaknesses getWeaknesses() {
		return weaknesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeaknesses(Weaknesses newWeaknesses, NotificationChain msgs) {
		Weaknesses oldWeaknesses = weaknesses;
		weaknesses = newWeaknesses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS_CATALOG__WEAKNESSES, oldWeaknesses, newWeaknesses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeaknesses(Weaknesses newWeaknesses) {
		if (newWeaknesses != weaknesses) {
			NotificationChain msgs = null;
			if (weaknesses != null)
				msgs = ((InternalEObject)weaknesses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWECatalogPackage.WEAKNESS_CATALOG__WEAKNESSES, null, msgs);
			if (newWeaknesses != null)
				msgs = ((InternalEObject)newWeaknesses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWECatalogPackage.WEAKNESS_CATALOG__WEAKNESSES, null, msgs);
			msgs = basicSetWeaknesses(newWeaknesses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS_CATALOG__WEAKNESSES, newWeaknesses, newWeaknesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Categories getCategories() {
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategories(Categories newCategories, NotificationChain msgs) {
		Categories oldCategories = categories;
		categories = newCategories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS_CATALOG__CATEGORIES, oldCategories, newCategories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategories(Categories newCategories) {
		if (newCategories != categories) {
			NotificationChain msgs = null;
			if (categories != null)
				msgs = ((InternalEObject)categories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWECatalogPackage.WEAKNESS_CATALOG__CATEGORIES, null, msgs);
			if (newCategories != null)
				msgs = ((InternalEObject)newCategories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWECatalogPackage.WEAKNESS_CATALOG__CATEGORIES, null, msgs);
			msgs = basicSetCategories(newCategories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS_CATALOG__CATEGORIES, newCategories, newCategories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Views getViews() {
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViews(Views newViews, NotificationChain msgs) {
		Views oldViews = views;
		views = newViews;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS_CATALOG__VIEWS, oldViews, newViews);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViews(Views newViews) {
		if (newViews != views) {
			NotificationChain msgs = null;
			if (views != null)
				msgs = ((InternalEObject)views).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWECatalogPackage.WEAKNESS_CATALOG__VIEWS, null, msgs);
			if (newViews != null)
				msgs = ((InternalEObject)newViews).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWECatalogPackage.WEAKNESS_CATALOG__VIEWS, null, msgs);
			msgs = basicSetViews(newViews, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS_CATALOG__VIEWS, newViews, newViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReferences getExternalReferences() {
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalReferences(ExternalReferences newExternalReferences, NotificationChain msgs) {
		ExternalReferences oldExternalReferences = externalReferences;
		externalReferences = newExternalReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES, oldExternalReferences, newExternalReferences);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalReferences(ExternalReferences newExternalReferences) {
		if (newExternalReferences != externalReferences) {
			NotificationChain msgs = null;
			if (externalReferences != null)
				msgs = ((InternalEObject)externalReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWECatalogPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES, null, msgs);
			if (newExternalReferences != null)
				msgs = ((InternalEObject)newExternalReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWECatalogPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES, null, msgs);
			msgs = basicSetExternalReferences(newExternalReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWECatalogPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES, newExternalReferences, newExternalReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CWECatalogPackage.WEAKNESS_CATALOG__WEAKNESSES:
				return basicSetWeaknesses(null, msgs);
			case CWECatalogPackage.WEAKNESS_CATALOG__CATEGORIES:
				return basicSetCategories(null, msgs);
			case CWECatalogPackage.WEAKNESS_CATALOG__VIEWS:
				return basicSetViews(null, msgs);
			case CWECatalogPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES:
				return basicSetExternalReferences(null, msgs);
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
			case CWECatalogPackage.WEAKNESS_CATALOG__VERSION:
				return getVersion();
			case CWECatalogPackage.WEAKNESS_CATALOG__WEAKNESSES:
				return getWeaknesses();
			case CWECatalogPackage.WEAKNESS_CATALOG__CATEGORIES:
				return getCategories();
			case CWECatalogPackage.WEAKNESS_CATALOG__VIEWS:
				return getViews();
			case CWECatalogPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES:
				return getExternalReferences();
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
			case CWECatalogPackage.WEAKNESS_CATALOG__VERSION:
				setVersion((String)newValue);
				return;
			case CWECatalogPackage.WEAKNESS_CATALOG__WEAKNESSES:
				setWeaknesses((Weaknesses)newValue);
				return;
			case CWECatalogPackage.WEAKNESS_CATALOG__CATEGORIES:
				setCategories((Categories)newValue);
				return;
			case CWECatalogPackage.WEAKNESS_CATALOG__VIEWS:
				setViews((Views)newValue);
				return;
			case CWECatalogPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)newValue);
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
			case CWECatalogPackage.WEAKNESS_CATALOG__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CWECatalogPackage.WEAKNESS_CATALOG__WEAKNESSES:
				setWeaknesses((Weaknesses)null);
				return;
			case CWECatalogPackage.WEAKNESS_CATALOG__CATEGORIES:
				setCategories((Categories)null);
				return;
			case CWECatalogPackage.WEAKNESS_CATALOG__VIEWS:
				setViews((Views)null);
				return;
			case CWECatalogPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)null);
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
			case CWECatalogPackage.WEAKNESS_CATALOG__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CWECatalogPackage.WEAKNESS_CATALOG__WEAKNESSES:
				return weaknesses != null;
			case CWECatalogPackage.WEAKNESS_CATALOG__CATEGORIES:
				return categories != null;
			case CWECatalogPackage.WEAKNESS_CATALOG__VIEWS:
				return views != null;
			case CWECatalogPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES:
				return externalReferences != null;
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //WeaknessCatalogImpl
