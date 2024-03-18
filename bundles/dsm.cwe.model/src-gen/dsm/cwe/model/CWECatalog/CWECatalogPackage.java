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
package dsm.cwe.model.CWECatalog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import dsm.TRADES.TRADESPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dsm.cwe.model.CWECatalog.CWECatalogFactory
 * @model kind="package"
 * @generated
 */
public interface CWECatalogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CWECatalog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsm.cwe.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cwe-catalog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CWECatalogPackage eINSTANCE = dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsm.cwe.model.CWECatalog.impl.WeaknessCatalogImpl <em>Weakness Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.cwe.model.CWECatalog.impl.WeaknessCatalogImpl
	 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getWeaknessCatalog()
	 * @generated
	 */
	int WEAKNESS_CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS_CATALOG__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Weaknesses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS_CATALOG__WEAKNESSES = 1;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS_CATALOG__CATEGORIES = 2;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS_CATALOG__VIEWS = 3;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS_CATALOG__EXTERNAL_REFERENCES = 4;

	/**
	 * The number of structural features of the '<em>Weakness Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS_CATALOG_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Weakness Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS_CATALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.cwe.model.CWECatalog.impl.WeaknessesImpl <em>Weaknesses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.cwe.model.CWECatalog.impl.WeaknessesImpl
	 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getWeaknesses()
	 * @generated
	 */
	int WEAKNESSES = 1;

	/**
	 * The feature id for the '<em><b>Weaknesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESSES__WEAKNESSES = 0;

	/**
	 * The number of structural features of the '<em>Weaknesses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESSES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Weaknesses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.cwe.model.CWECatalog.impl.WeaknessImpl <em>Weakness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.cwe.model.CWECatalog.impl.WeaknessImpl
	 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getWeakness()
	 * @generated
	 */
	int WEAKNESS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__NAME = TRADESPackage.VULNERABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Manifests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__MANIFESTS = TRADESPackage.VULNERABILITY__MANIFESTS;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__AFFECTS = TRADESPackage.VULNERABILITY__AFFECTS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__ID = TRADESPackage.VULNERABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__ABSTRACTION = TRADESPackage.VULNERABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__STRUCTURE = TRADESPackage.VULNERABILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__STATUS = TRADESPackage.VULNERABILITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Weakness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS_FEATURE_COUNT = TRADESPackage.VULNERABILITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Weakness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS_OPERATION_COUNT = TRADESPackage.VULNERABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.cwe.model.CWECatalog.impl.CategoriesImpl <em>Categories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.cwe.model.CWECatalog.impl.CategoriesImpl
	 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getCategories()
	 * @generated
	 */
	int CATEGORIES = 3;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__CATEGORIES = 0;

	/**
	 * The number of structural features of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.cwe.model.CWECatalog.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.cwe.model.CWECatalog.impl.CategoryImpl
	 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__STATUS = 2;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.cwe.model.CWECatalog.impl.ViewsImpl <em>Views</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.cwe.model.CWECatalog.impl.ViewsImpl
	 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getViews()
	 * @generated
	 */
	int VIEWS = 5;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__VIEWS = 0;

	/**
	 * The number of structural features of the '<em>Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.cwe.model.CWECatalog.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.cwe.model.CWECatalog.impl.ViewImpl
	 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__STATUS = 3;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.cwe.model.CWECatalog.impl.ExternalReferencesImpl <em>External References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.cwe.model.CWECatalog.impl.ExternalReferencesImpl
	 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getExternalReferences()
	 * @generated
	 */
	int EXTERNAL_REFERENCES = 7;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCES__EXTERNAL_REFERENCES = 0;

	/**
	 * The number of structural features of the '<em>External References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>External References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.cwe.model.CWECatalog.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.cwe.model.CWECatalog.impl.ExternalReferenceImpl
	 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Reference ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__REFERENCE_ID = 0;

	/**
	 * The number of structural features of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link dsm.cwe.model.CWECatalog.WeaknessCatalog <em>Weakness Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weakness Catalog</em>'.
	 * @see dsm.cwe.model.CWECatalog.WeaknessCatalog
	 * @generated
	 */
	EClass getWeaknessCatalog();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.WeaknessCatalog#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see dsm.cwe.model.CWECatalog.WeaknessCatalog#getVersion()
	 * @see #getWeaknessCatalog()
	 * @generated
	 */
	EAttribute getWeaknessCatalog_Version();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.cwe.model.CWECatalog.WeaknessCatalog#getWeaknesses <em>Weaknesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weaknesses</em>'.
	 * @see dsm.cwe.model.CWECatalog.WeaknessCatalog#getWeaknesses()
	 * @see #getWeaknessCatalog()
	 * @generated
	 */
	EReference getWeaknessCatalog_Weaknesses();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.cwe.model.CWECatalog.WeaknessCatalog#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categories</em>'.
	 * @see dsm.cwe.model.CWECatalog.WeaknessCatalog#getCategories()
	 * @see #getWeaknessCatalog()
	 * @generated
	 */
	EReference getWeaknessCatalog_Categories();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.cwe.model.CWECatalog.WeaknessCatalog#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Views</em>'.
	 * @see dsm.cwe.model.CWECatalog.WeaknessCatalog#getViews()
	 * @see #getWeaknessCatalog()
	 * @generated
	 */
	EReference getWeaknessCatalog_Views();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.cwe.model.CWECatalog.WeaknessCatalog#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External References</em>'.
	 * @see dsm.cwe.model.CWECatalog.WeaknessCatalog#getExternalReferences()
	 * @see #getWeaknessCatalog()
	 * @generated
	 */
	EReference getWeaknessCatalog_ExternalReferences();

	/**
	 * Returns the meta object for class '{@link dsm.cwe.model.CWECatalog.Weaknesses <em>Weaknesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weaknesses</em>'.
	 * @see dsm.cwe.model.CWECatalog.Weaknesses
	 * @generated
	 */
	EClass getWeaknesses();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.cwe.model.CWECatalog.Weaknesses#getWeaknesses <em>Weaknesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weaknesses</em>'.
	 * @see dsm.cwe.model.CWECatalog.Weaknesses#getWeaknesses()
	 * @see #getWeaknesses()
	 * @generated
	 */
	EReference getWeaknesses_Weaknesses();

	/**
	 * Returns the meta object for class '{@link dsm.cwe.model.CWECatalog.Weakness <em>Weakness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weakness</em>'.
	 * @see dsm.cwe.model.CWECatalog.Weakness
	 * @generated
	 */
	EClass getWeakness();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.Weakness#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see dsm.cwe.model.CWECatalog.Weakness#getID()
	 * @see #getWeakness()
	 * @generated
	 */
	EAttribute getWeakness_ID();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.Weakness#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstraction</em>'.
	 * @see dsm.cwe.model.CWECatalog.Weakness#getAbstraction()
	 * @see #getWeakness()
	 * @generated
	 */
	EAttribute getWeakness_Abstraction();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.Weakness#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure</em>'.
	 * @see dsm.cwe.model.CWECatalog.Weakness#getStructure()
	 * @see #getWeakness()
	 * @generated
	 */
	EAttribute getWeakness_Structure();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.Weakness#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see dsm.cwe.model.CWECatalog.Weakness#getStatus()
	 * @see #getWeakness()
	 * @generated
	 */
	EAttribute getWeakness_Status();

	/**
	 * Returns the meta object for class '{@link dsm.cwe.model.CWECatalog.Categories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categories</em>'.
	 * @see dsm.cwe.model.CWECatalog.Categories
	 * @generated
	 */
	EClass getCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.cwe.model.CWECatalog.Categories#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see dsm.cwe.model.CWECatalog.Categories#getCategories()
	 * @see #getCategories()
	 * @generated
	 */
	EReference getCategories_Categories();

	/**
	 * Returns the meta object for class '{@link dsm.cwe.model.CWECatalog.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see dsm.cwe.model.CWECatalog.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.Category#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see dsm.cwe.model.CWECatalog.Category#getID()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_ID();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.cwe.model.CWECatalog.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.Category#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see dsm.cwe.model.CWECatalog.Category#getStatus()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Status();

	/**
	 * Returns the meta object for class '{@link dsm.cwe.model.CWECatalog.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Views</em>'.
	 * @see dsm.cwe.model.CWECatalog.Views
	 * @generated
	 */
	EClass getViews();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.cwe.model.CWECatalog.Views#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see dsm.cwe.model.CWECatalog.Views#getViews()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_Views();

	/**
	 * Returns the meta object for class '{@link dsm.cwe.model.CWECatalog.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see dsm.cwe.model.CWECatalog.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.View#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see dsm.cwe.model.CWECatalog.View#getID()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_ID();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.cwe.model.CWECatalog.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.View#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsm.cwe.model.CWECatalog.View#getType()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Type();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.View#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see dsm.cwe.model.CWECatalog.View#getStatus()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Status();

	/**
	 * Returns the meta object for class '{@link dsm.cwe.model.CWECatalog.ExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External References</em>'.
	 * @see dsm.cwe.model.CWECatalog.ExternalReferences
	 * @generated
	 */
	EClass getExternalReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.cwe.model.CWECatalog.ExternalReferences#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External References</em>'.
	 * @see dsm.cwe.model.CWECatalog.ExternalReferences#getExternalReferences()
	 * @see #getExternalReferences()
	 * @generated
	 */
	EReference getExternalReferences_ExternalReferences();

	/**
	 * Returns the meta object for class '{@link dsm.cwe.model.CWECatalog.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see dsm.cwe.model.CWECatalog.ExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cwe.model.CWECatalog.ExternalReference#getReferenceID <em>Reference ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference ID</em>'.
	 * @see dsm.cwe.model.CWECatalog.ExternalReference#getReferenceID()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_ReferenceID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CWECatalogFactory getCWECatalogFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dsm.cwe.model.CWECatalog.impl.WeaknessCatalogImpl <em>Weakness Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.cwe.model.CWECatalog.impl.WeaknessCatalogImpl
		 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getWeaknessCatalog()
		 * @generated
		 */
		EClass WEAKNESS_CATALOG = eINSTANCE.getWeaknessCatalog();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAKNESS_CATALOG__VERSION = eINSTANCE.getWeaknessCatalog_Version();

		/**
		 * The meta object literal for the '<em><b>Weaknesses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAKNESS_CATALOG__WEAKNESSES = eINSTANCE.getWeaknessCatalog_Weaknesses();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAKNESS_CATALOG__CATEGORIES = eINSTANCE.getWeaknessCatalog_Categories();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAKNESS_CATALOG__VIEWS = eINSTANCE.getWeaknessCatalog_Views();

		/**
		 * The meta object literal for the '<em><b>External References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAKNESS_CATALOG__EXTERNAL_REFERENCES = eINSTANCE.getWeaknessCatalog_ExternalReferences();

		/**
		 * The meta object literal for the '{@link dsm.cwe.model.CWECatalog.impl.WeaknessesImpl <em>Weaknesses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.cwe.model.CWECatalog.impl.WeaknessesImpl
		 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getWeaknesses()
		 * @generated
		 */
		EClass WEAKNESSES = eINSTANCE.getWeaknesses();

		/**
		 * The meta object literal for the '<em><b>Weaknesses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAKNESSES__WEAKNESSES = eINSTANCE.getWeaknesses_Weaknesses();

		/**
		 * The meta object literal for the '{@link dsm.cwe.model.CWECatalog.impl.WeaknessImpl <em>Weakness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.cwe.model.CWECatalog.impl.WeaknessImpl
		 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getWeakness()
		 * @generated
		 */
		EClass WEAKNESS = eINSTANCE.getWeakness();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAKNESS__ID = eINSTANCE.getWeakness_ID();

		/**
		 * The meta object literal for the '<em><b>Abstraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAKNESS__ABSTRACTION = eINSTANCE.getWeakness_Abstraction();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAKNESS__STRUCTURE = eINSTANCE.getWeakness_Structure();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAKNESS__STATUS = eINSTANCE.getWeakness_Status();

		/**
		 * The meta object literal for the '{@link dsm.cwe.model.CWECatalog.impl.CategoriesImpl <em>Categories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.cwe.model.CWECatalog.impl.CategoriesImpl
		 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getCategories()
		 * @generated
		 */
		EClass CATEGORIES = eINSTANCE.getCategories();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__CATEGORIES = eINSTANCE.getCategories_Categories();

		/**
		 * The meta object literal for the '{@link dsm.cwe.model.CWECatalog.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.cwe.model.CWECatalog.impl.CategoryImpl
		 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__ID = eINSTANCE.getCategory_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__STATUS = eINSTANCE.getCategory_Status();

		/**
		 * The meta object literal for the '{@link dsm.cwe.model.CWECatalog.impl.ViewsImpl <em>Views</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.cwe.model.CWECatalog.impl.ViewsImpl
		 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getViews()
		 * @generated
		 */
		EClass VIEWS = eINSTANCE.getViews();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__VIEWS = eINSTANCE.getViews_Views();

		/**
		 * The meta object literal for the '{@link dsm.cwe.model.CWECatalog.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.cwe.model.CWECatalog.impl.ViewImpl
		 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__ID = eINSTANCE.getView_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__TYPE = eINSTANCE.getView_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__STATUS = eINSTANCE.getView_Status();

		/**
		 * The meta object literal for the '{@link dsm.cwe.model.CWECatalog.impl.ExternalReferencesImpl <em>External References</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.cwe.model.CWECatalog.impl.ExternalReferencesImpl
		 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getExternalReferences()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCES = eINSTANCE.getExternalReferences();

		/**
		 * The meta object literal for the '<em><b>External References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_REFERENCES__EXTERNAL_REFERENCES = eINSTANCE.getExternalReferences_ExternalReferences();

		/**
		 * The meta object literal for the '{@link dsm.cwe.model.CWECatalog.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.cwe.model.CWECatalog.impl.ExternalReferenceImpl
		 * @see dsm.cwe.model.CWECatalog.impl.CWECatalogPackageImpl#getExternalReference()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
		 * The meta object literal for the '<em><b>Reference ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__REFERENCE_ID = eINSTANCE.getExternalReference_ReferenceID();

	}

} //CWECatalogPackage
