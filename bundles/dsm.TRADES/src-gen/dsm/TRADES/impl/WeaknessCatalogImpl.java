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

import dsm.TRADES.Category;
import dsm.TRADES.ExternalReference;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.View;
import dsm.TRADES.Weakness;
import dsm.TRADES.WeaknessCatalog;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weakness Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.WeaknessCatalogImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link dsm.TRADES.impl.WeaknessCatalogImpl#getWeaknesses <em>Weaknesses</em>}</li>
 *   <li>{@link dsm.TRADES.impl.WeaknessCatalogImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link dsm.TRADES.impl.WeaknessCatalogImpl#getViews <em>Views</em>}</li>
 *   <li>{@link dsm.TRADES.impl.WeaknessCatalogImpl#getExternalReferences <em>External References</em>}</li>
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
	 * The cached value of the '{@link #getWeaknesses() <em>Weaknesses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeaknesses()
	 * @generated
	 * @ordered
	 */
	protected EList<Weakness> weaknesses;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalReference> externalReferences;

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
		return TRADESPackage.Literals.WEAKNESS_CATALOG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.WEAKNESS_CATALOG__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Weakness> getWeaknesses() {
		if (weaknesses == null) {
			weaknesses = new EObjectContainmentEList<Weakness>(Weakness.class, this,
					TRADESPackage.WEAKNESS_CATALOG__WEAKNESSES);
		}
		return weaknesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Category>(Category.class, this,
					TRADESPackage.WEAKNESS_CATALOG__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<View>(View.class, this, TRADESPackage.WEAKNESS_CATALOG__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalReference> getExternalReferences() {
		if (externalReferences == null) {
			externalReferences = new EObjectContainmentEList<ExternalReference>(ExternalReference.class, this,
					TRADESPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES);
		}
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.WEAKNESS_CATALOG__WEAKNESSES:
			return ((InternalEList<?>) getWeaknesses()).basicRemove(otherEnd, msgs);
		case TRADESPackage.WEAKNESS_CATALOG__CATEGORIES:
			return ((InternalEList<?>) getCategories()).basicRemove(otherEnd, msgs);
		case TRADESPackage.WEAKNESS_CATALOG__VIEWS:
			return ((InternalEList<?>) getViews()).basicRemove(otherEnd, msgs);
		case TRADESPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES:
			return ((InternalEList<?>) getExternalReferences()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.WEAKNESS_CATALOG__VERSION:
			return getVersion();
		case TRADESPackage.WEAKNESS_CATALOG__WEAKNESSES:
			return getWeaknesses();
		case TRADESPackage.WEAKNESS_CATALOG__CATEGORIES:
			return getCategories();
		case TRADESPackage.WEAKNESS_CATALOG__VIEWS:
			return getViews();
		case TRADESPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES:
			return getExternalReferences();
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
		case TRADESPackage.WEAKNESS_CATALOG__VERSION:
			setVersion((String) newValue);
			return;
		case TRADESPackage.WEAKNESS_CATALOG__WEAKNESSES:
			getWeaknesses().clear();
			getWeaknesses().addAll((Collection<? extends Weakness>) newValue);
			return;
		case TRADESPackage.WEAKNESS_CATALOG__CATEGORIES:
			getCategories().clear();
			getCategories().addAll((Collection<? extends Category>) newValue);
			return;
		case TRADESPackage.WEAKNESS_CATALOG__VIEWS:
			getViews().clear();
			getViews().addAll((Collection<? extends View>) newValue);
			return;
		case TRADESPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES:
			getExternalReferences().clear();
			getExternalReferences().addAll((Collection<? extends ExternalReference>) newValue);
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
		case TRADESPackage.WEAKNESS_CATALOG__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case TRADESPackage.WEAKNESS_CATALOG__WEAKNESSES:
			getWeaknesses().clear();
			return;
		case TRADESPackage.WEAKNESS_CATALOG__CATEGORIES:
			getCategories().clear();
			return;
		case TRADESPackage.WEAKNESS_CATALOG__VIEWS:
			getViews().clear();
			return;
		case TRADESPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES:
			getExternalReferences().clear();
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
		case TRADESPackage.WEAKNESS_CATALOG__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case TRADESPackage.WEAKNESS_CATALOG__WEAKNESSES:
			return weaknesses != null && !weaknesses.isEmpty();
		case TRADESPackage.WEAKNESS_CATALOG__CATEGORIES:
			return categories != null && !categories.isEmpty();
		case TRADESPackage.WEAKNESS_CATALOG__VIEWS:
			return views != null && !views.isEmpty();
		case TRADESPackage.WEAKNESS_CATALOG__EXTERNAL_REFERENCES:
			return externalReferences != null && !externalReferences.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //WeaknessCatalogImpl
