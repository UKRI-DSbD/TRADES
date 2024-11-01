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
package dsm.cve.model.CVECatalog;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see dsm.cve.model.CVECatalog.CVECatalogFactory
 * @model kind="package"
 * @generated
 */
public interface CVECatalogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CVECatalog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsm.cve.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cve-catalog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CVECatalogPackage eINSTANCE = dsm.cve.model.CVECatalog.impl.CVECatalogPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsm.cve.model.CVECatalog.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.cve.model.CVECatalog.impl.VulnerabilityImpl
	 * @see dsm.cve.model.CVECatalog.impl.CVECatalogPackageImpl#getVulnerability()
	 * @generated
	 */
	int VULNERABILITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__NAME = TRADESPackage.VULNERABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__ID = TRADESPackage.VULNERABILITY__ID;

	/**
	 * The feature id for the '<em><b>Manifests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__MANIFESTS = TRADESPackage.VULNERABILITY__MANIFESTS;

	/**
	 * The feature id for the '<em><b>Vulnerability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__VULNERABILITY_TYPE = TRADESPackage.VULNERABILITY__VULNERABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__AFFECTS = TRADESPackage.VULNERABILITY__AFFECTS;

	/**
	 * The number of structural features of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_FEATURE_COUNT = TRADESPackage.VULNERABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_OPERATION_COUNT = TRADESPackage.VULNERABILITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link dsm.cve.model.CVECatalog.Vulnerability <em>Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerability</em>'.
	 * @see dsm.cve.model.CVECatalog.Vulnerability
	 * @generated
	 */
	EClass getVulnerability();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CVECatalogFactory getCVECatalogFactory();

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
		 * The meta object literal for the '{@link dsm.cve.model.CVECatalog.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.cve.model.CVECatalog.impl.VulnerabilityImpl
		 * @see dsm.cve.model.CVECatalog.impl.CVECatalogPackageImpl#getVulnerability()
		 * @generated
		 */
		EClass VULNERABILITY = eINSTANCE.getVulnerability();

	}

} //CVECatalogPackage
