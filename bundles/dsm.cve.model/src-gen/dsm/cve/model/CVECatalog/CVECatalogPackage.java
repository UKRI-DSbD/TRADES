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

import dsm.TRADES.TRADESPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
	 * The feature id for the '<em><b>Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__REFINES = TRADESPackage.VULNERABILITY__REFINES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__ID = TRADESPackage.VULNERABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vulnerability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__VULNERABILITY_TYPE = TRADESPackage.VULNERABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_FEATURE_COUNT = TRADESPackage.VULNERABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_OPERATION_COUNT = TRADESPackage.VULNERABILITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link dsm.cve.model.CVECatalog.VulnerabilityTypeENUM <em>Vulnerability Type ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.cve.model.CVECatalog.VulnerabilityTypeENUM
	 * @see dsm.cve.model.CVECatalog.impl.CVECatalogPackageImpl#getVulnerabilityTypeENUM()
	 * @generated
	 */
	int VULNERABILITY_TYPE_ENUM = 1;


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
	 * Returns the meta object for the attribute '{@link dsm.cve.model.CVECatalog.Vulnerability#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsm.cve.model.CVECatalog.Vulnerability#getId()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsm.cve.model.CVECatalog.Vulnerability#getVulnerabilityType <em>Vulnerability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vulnerability Type</em>'.
	 * @see dsm.cve.model.CVECatalog.Vulnerability#getVulnerabilityType()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_VulnerabilityType();

	/**
	 * Returns the meta object for enum '{@link dsm.cve.model.CVECatalog.VulnerabilityTypeENUM <em>Vulnerability Type ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vulnerability Type ENUM</em>'.
	 * @see dsm.cve.model.CVECatalog.VulnerabilityTypeENUM
	 * @generated
	 */
	EEnum getVulnerabilityTypeENUM();

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

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__ID = eINSTANCE.getVulnerability_Id();

		/**
		 * The meta object literal for the '<em><b>Vulnerability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__VULNERABILITY_TYPE = eINSTANCE.getVulnerability_VulnerabilityType();

		/**
		 * The meta object literal for the '{@link dsm.cve.model.CVECatalog.VulnerabilityTypeENUM <em>Vulnerability Type ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.cve.model.CVECatalog.VulnerabilityTypeENUM
		 * @see dsm.cve.model.CVECatalog.impl.CVECatalogPackageImpl#getVulnerabilityTypeENUM()
		 * @generated
		 */
		EEnum VULNERABILITY_TYPE_ENUM = eINSTANCE.getVulnerabilityTypeENUM();

	}

} //CVECatalogPackage
