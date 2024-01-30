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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import dsm.oscal.model.CWECatalog.CWECatalogFactory;
import dsm.oscal.model.CWECatalog.CWECatalogPackage;
import dsm.oscal.model.CWECatalog.Categories;
import dsm.oscal.model.CWECatalog.Category;
import dsm.oscal.model.CWECatalog.ExternalReference;
import dsm.oscal.model.CWECatalog.ExternalReferences;
import dsm.oscal.model.CWECatalog.View;
import dsm.oscal.model.CWECatalog.Views;
import dsm.oscal.model.CWECatalog.Weakness;
import dsm.oscal.model.CWECatalog.WeaknessCatalog;
import dsm.oscal.model.CWECatalog.Weaknesses;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CWECatalogFactoryImpl extends EFactoryImpl implements CWECatalogFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CWECatalogFactory init() {
		try {
			CWECatalogFactory theCWECatalogFactory = (CWECatalogFactory)EPackage.Registry.INSTANCE.getEFactory(CWECatalogPackage.eNS_URI);
			if (theCWECatalogFactory != null) {
				return theCWECatalogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CWECatalogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWECatalogFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CWECatalogPackage.WEAKNESS_CATALOG: return createWeaknessCatalog();
			case CWECatalogPackage.WEAKNESSES: return createWeaknesses();
			case CWECatalogPackage.WEAKNESS: return createWeakness();
			case CWECatalogPackage.CATEGORIES: return createCategories();
			case CWECatalogPackage.CATEGORY: return createCategory();
			case CWECatalogPackage.VIEWS: return createViews();
			case CWECatalogPackage.VIEW: return createView();
			case CWECatalogPackage.EXTERNAL_REFERENCES: return createExternalReferences();
			case CWECatalogPackage.EXTERNAL_REFERENCE: return createExternalReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeaknessCatalog createWeaknessCatalog() {
		WeaknessCatalogImpl weaknessCatalog = new WeaknessCatalogImpl();
		return weaknessCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weaknesses createWeaknesses() {
		WeaknessesImpl weaknesses = new WeaknessesImpl();
		return weaknesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weakness createWeakness() {
		WeaknessImpl weakness = new WeaknessImpl();
		return weakness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Categories createCategories() {
		CategoriesImpl categories = new CategoriesImpl();
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Views createViews() {
		ViewsImpl views = new ViewsImpl();
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReferences createExternalReferences() {
		ExternalReferencesImpl externalReferences = new ExternalReferencesImpl();
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReference createExternalReference() {
		ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CWECatalogPackage getCWECatalogPackage() {
		return (CWECatalogPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CWECatalogPackage getPackage() {
		return CWECatalogPackage.eINSTANCE;
	}

} //CWECatalogFactoryImpl
