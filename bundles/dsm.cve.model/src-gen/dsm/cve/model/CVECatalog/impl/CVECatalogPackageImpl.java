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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import dsm.TRADES.TRADESPackage;
import dsm.cve.model.CVECatalog.CVECatalogFactory;
import dsm.cve.model.CVECatalog.CVECatalogPackage;
import dsm.cve.model.CVECatalog.Vulnerability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CVECatalogPackageImpl extends EPackageImpl implements CVECatalogPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulnerabilityEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dsm.cve.model.CVECatalog.CVECatalogPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CVECatalogPackageImpl() {
		super(eNS_URI, CVECatalogFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CVECatalogPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CVECatalogPackage init() {
		if (isInited) return (CVECatalogPackage)EPackage.Registry.INSTANCE.getEPackage(CVECatalogPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCVECatalogPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CVECatalogPackageImpl theCVECatalogPackage = registeredCVECatalogPackage instanceof CVECatalogPackageImpl ? (CVECatalogPackageImpl)registeredCVECatalogPackage : new CVECatalogPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TRADESPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCVECatalogPackage.createPackageContents();

		// Initialize created meta-data
		theCVECatalogPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCVECatalogPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CVECatalogPackage.eNS_URI, theCVECatalogPackage);
		return theCVECatalogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVulnerability() {
		return vulnerabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CVECatalogFactory getCVECatalogFactory() {
		return (CVECatalogFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vulnerabilityEClass = createEClass(VULNERABILITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TRADESPackage theTRADESPackage = (TRADESPackage)EPackage.Registry.INSTANCE.getEPackage(TRADESPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vulnerabilityEClass.getESuperTypes().add(theTRADESPackage.getVulnerability());

		// Initialize classes, features, and operations; add parameters
		initEClass(vulnerabilityEClass, Vulnerability.class, "Vulnerability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CVECatalogPackageImpl
