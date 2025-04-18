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
package dsm.TRADES;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- begin-model-doc -->
 * TRADES model, by Israel Aerospace Industries. All rights reserved.
 * 
 * The TRADES model, based on Threat and Risk assessment ontology and the TRADES model-based methodology.
 * <!-- end-model-doc -->
 * @see dsm.TRADES.TRADESFactory
 * @model kind="package"
 * @generated
 */
public interface TRADESPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TRADES";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsm.TRADES";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TRADES";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TRADESPackage eINSTANCE = dsm.TRADES.impl.TRADESPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AbstractComponentOwnerImpl <em>Abstract Component Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AbstractComponentOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractComponentOwner()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_OWNER = 14;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OWNER__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Abstract Component Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Component Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AnalysisImpl <em>Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AnalysisImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAnalysis()
	 * @generated
	 */
	int ANALYSIS = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__COMPONENTS = ABSTRACT_COMPONENT_OWNER__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Data Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__DATA_OWNER = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__NAME = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__CONTROL_OWNER = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Threat Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__THREAT_OWNER = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__ID = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vulnerability Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__VULNERABILITY_OWNER = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Component Type Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__COMPONENT_TYPE_OWNER = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rule Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__RULE_OWNER = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Score System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__SCORE_SYSTEM = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Link Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__LINK_TYPES = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>NVDAPI Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__NVDAPI_KEY = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Property Vulnerability Mitigation Rules Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__PROPERTY_VULNERABILITY_MITIGATION_RULES_AVAILABLE = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Property Weakness Mitigation Rules Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__PROPERTY_WEAKNESS_MITIGATION_RULES_AVAILABLE = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Property Design Addresses Vulnerabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__PROPERTY_DESIGN_ADDRESSES_VULNERABILITIES = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Property Design Addresses Weaknesses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__PROPERTY_DESIGN_ADDRESSES_WEAKNESSES = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Vulnerabilities Uncovered By Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__VULNERABILITIES_UNCOVERED_BY_RULE = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Weaknesses Uncovered By Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__WEAKNESSES_UNCOVERED_BY_RULE = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Vulnerable Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__VULNERABLE_COMPONENTS = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FEATURE_COUNT = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_DATAS = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inherited Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_INHERITED_DATAS = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_ALL_DATAS = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Controls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_ALL_CONTROLS = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get External Controls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_EXTERNAL_CONTROLS__STRING_STRING = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get External Threats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_EXTERNAL_THREATS__STRING_STRING = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Direct Rule Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___DIRECT_RULE_EXISTS__VULNERABILITY_COMPONENTTYPE = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Proxy Rule Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___PROXY_RULE_EXISTS__VULNERABILITY_COMPONENTTYPE = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Rule Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___RULE_EXISTS__VULNERABILITY_COMPONENTTYPE = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION_COUNT = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.NamedElementImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ThreatImpl <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ThreatImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__CHARACTERISTICS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Threat Allocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__THREAT_ALLOCATIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Threat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__THREAT_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Applicability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__APPLICABILITY = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exploits Vulnerability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__EXPLOITS_VULNERABILITY = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__REFINES = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Source Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT___GET_SOURCE_NAME = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT___GET_SOURCE_IDENTIFIER = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT___GET_ID = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT___GET_DESCRIPTION = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT___GET_NAME = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Check Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT___CHECK_IS_USED__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ComponentImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENTS = ABSTRACT_COMPONENT_OWNER__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Data Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATA_OWNER = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTROL_OWNER = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CATEGORY = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CHARACTERISTICS = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Threat Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__THREAT_ALLOCATIONS = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Affect Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AFFECT_RELATIONS = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LINKS = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Component Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_TYPES = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RULES = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Assigned Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ASSIGNED_CONTROLS = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Vulnerable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VULNERABLE = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>CVA</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CVA = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>CWA</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CWA = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Associated Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ASSOCIATED_CONTROLS = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Unmitigated Vulnerabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UNMITIGATED_VULNERABILITIES = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Unmitigated Weaknesses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UNMITIGATED_WEAKNESSES = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ABSTRACT_COMPONENT_OWNER_FEATURE_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_DATAS = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inherited Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_INHERITED_DATAS = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_ALL_DATAS = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Controls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_ALL_CONTROLS = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get External Controls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_EXTERNAL_CONTROLS__STRING_STRING = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Of Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___OF_TYPE__COMPONENTTYPE = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Mitigated V</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___MITIGATED_V__VULNERABILITY = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Mitigated W</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___MITIGATED_W__VULNERABILITY = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Mitigated By W</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___MITIGATED_BY_W__VULNERABILITY = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Mitigated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___MITIGATED__VULNERABILITY = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Vulnerable W</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___VULNERABLE_W = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Vulnerable V</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___VULNERABLE_V = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 11;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ABSTRACT_COMPONENT_OWNER_OPERATION_COUNT + 12;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ControlImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CHARACTERISTICS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mitigated Threats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MITIGATED_THREATS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description With Placeholders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DESCRIPTION_WITH_PLACEHOLDERS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mitigation Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MITIGATION_RELATIONS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mitigates Vulnerability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MITIGATES_VULNERABILITY = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Security Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SECURITY_OBJECTIVE = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Source Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___GET_SOURCE_NAME = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___GET_SOURCE_IDENTIFIER = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___GET_DESCRIPTION = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___GET_ID = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Mitigated Threat Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___GET_MITIGATED_THREAT_DEFINITIONS = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___GET_NAME = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ThreatAllocationRelationImpl <em>Threat Allocation Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ThreatAllocationRelationImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreatAllocationRelation()
	 * @generated
	 */
	int THREAT_ALLOCATION_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__ASSESSMENT = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Threat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__THREAT = 2;

	/**
	 * The feature id for the '<em><b>Impact Score</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__IMPACT_SCORE = 3;

	/**
	 * The feature id for the '<em><b>Difficulty Score</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__DIFFICULTY_SCORE = 4;

	/**
	 * The feature id for the '<em><b>Attack Chain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__ATTACK_CHAIN = 5;

	/**
	 * The feature id for the '<em><b>Mitigated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__MITIGATED = 6;

	/**
	 * The number of structural features of the '<em>Threat Allocation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Check Computed Difficulty Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION___CHECK_COMPUTED_DIFFICULTY_CONSTRAINT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Mitigated AV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION___MITIGATED_AV = 1;

	/**
	 * The operation id for the '<em>Mitigated AW</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION___MITIGATED_AW = 2;

	/**
	 * The operation id for the '<em>Mitigated VSteps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION___MITIGATED_VSTEPS = 3;

	/**
	 * The operation id for the '<em>Mitigated WSteps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION___MITIGATED_WSTEPS = 4;

	/**
	 * The operation id for the '<em>Mitigated V</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION___MITIGATED_V = 5;

	/**
	 * The operation id for the '<em>Mitigated W</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION___MITIGATED_W = 6;

	/**
	 * The number of operations of the '<em>Threat Allocation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link dsm.TRADES.IMitigationLink <em>IMitigation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.IMitigationLink
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getIMitigationLink()
	 * @generated
	 */
	int IMITIGATION_LINK = 31;

	/**
	 * The number of structural features of the '<em>IMitigation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMITIGATION_LINK_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMITIGATION_LINK___GET_DESCRIPTION = 0;

	/**
	 * The operation id for the '<em>Get Threat</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMITIGATION_LINK___GET_THREAT = 1;

	/**
	 * The number of operations of the '<em>IMitigation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMITIGATION_LINK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ThreatMitigationRelationImpl <em>Threat Mitigation Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ThreatMitigationRelationImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreatMitigationRelation()
	 * @generated
	 */
	int THREAT_MITIGATION_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__ASSESSMENT = IMITIGATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__CONTROL = IMITIGATION_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Threat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__THREAT = IMITIGATION_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mitigated Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__MITIGATED_ALLOCATION = IMITIGATION_LINK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__DESCRIPTION = IMITIGATION_LINK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Threat Mitigation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION_FEATURE_COUNT = IMITIGATION_LINK_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION___GET_DESCRIPTION = IMITIGATION_LINK___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Threat</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION___GET_THREAT = IMITIGATION_LINK___GET_THREAT;

	/**
	 * The number of operations of the '<em>Threat Mitigation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION_OPERATION_COUNT = IMITIGATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.DataImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getData()
	 * @generated
	 */
	int DATA = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CATEGORY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AffectRelationImpl <em>Affect Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AffectRelationImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAffectRelation()
	 * @generated
	 */
	int AFFECT_RELATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__DATA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__SOURCE_COMPONENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__TARGET_COMPONENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Analysis Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__ANALYSIS_STATUS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__LINK = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Affect Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Check Data Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION___CHECK_DATA_SCOPE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Affect Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AttackChainImpl <em>Attack Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AttackChainImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAttackChain()
	 * @generated
	 */
	int ATTACK_CHAIN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attack Chain Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN__ATTACK_CHAIN_STEPS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Computed Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN__COMPUTED_DIFFICULTY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attack Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attack Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AttackChainStepImpl <em>Attack Chain Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AttackChainStepImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAttackChainStep()
	 * @generated
	 */
	int ATTACK_CHAIN_STEP = 9;

	/**
	 * The feature id for the '<em><b>Step Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__STEP_NUM = 0;

	/**
	 * The feature id for the '<em><b>Threat Allocation Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION = 1;

	/**
	 * The feature id for the '<em><b>Impact Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__NEXT = 3;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__PREVIOUS = 4;

	/**
	 * The number of structural features of the '<em>Attack Chain Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Threat Allocation Relation Candidates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP___GET_THREAT_ALLOCATION_RELATION_CANDIDATES = 0;

	/**
	 * The operation id for the '<em>Check Allocation Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP___CHECK_ALLOCATION_VALUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Attack Chain Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ScoreSystemImpl <em>Score System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ScoreSystemImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getScoreSystem()
	 * @generated
	 */
	int SCORE_SYSTEM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Impact Scores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM__IMPACT_SCORES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Difficulty Scores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM__DIFFICULTY_SCORES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Score System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Score System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ImpactScoreImpl <em>Impact Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ImpactScoreImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getImpactScore()
	 * @generated
	 */
	int IMPACT_SCORE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE__IMPACT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE__CONFIGURATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Impact Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Impact Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.DifficultyScoreImpl <em>Difficulty Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.DifficultyScoreImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getDifficultyScore()
	 * @generated
	 */
	int DIFFICULTY_SCORE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_SCORE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_SCORE__DIFFICULTY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Difficulty Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_SCORE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Difficulty Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_SCORE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.DataOwnerElementImpl <em>Data Owner Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.DataOwnerElementImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getDataOwnerElement()
	 * @generated
	 */
	int DATA_OWNER_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Data Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_ELEMENT__DATA_OWNER = 0;

	/**
	 * The number of structural features of the '<em>Data Owner Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_ELEMENT___GET_DATAS = 0;

	/**
	 * The operation id for the '<em>Get Inherited Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_ELEMENT___GET_INHERITED_DATAS = 1;

	/**
	 * The operation id for the '<em>Get All Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_ELEMENT___GET_ALL_DATAS = 2;

	/**
	 * The number of operations of the '<em>Data Owner Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_ELEMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ExternalThreatImpl <em>External Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ExternalThreatImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getExternalThreat()
	 * @generated
	 */
	int EXTERNAL_THREAT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__NAME = THREAT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__ID = THREAT__ID;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__CHARACTERISTICS = THREAT__CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Threat Allocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__THREAT_ALLOCATIONS = THREAT__THREAT_ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Threat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__THREAT_TYPE = THREAT__THREAT_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__DESCRIPTION = THREAT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Applicability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__APPLICABILITY = THREAT__APPLICABILITY;

	/**
	 * The feature id for the '<em><b>Exploits Vulnerability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__EXPLOITS_VULNERABILITY = THREAT__EXPLOITS_VULNERABILITY;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__REFINES = THREAT__REFINES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__SOURCE = THREAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__LINK = THREAT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__SOURCE_ID = THREAT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>External Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT_FEATURE_COUNT = THREAT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Source Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT___GET_SOURCE_NAME = THREAT___GET_SOURCE_NAME;

	/**
	 * The operation id for the '<em>Get Source Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT___GET_SOURCE_IDENTIFIER = THREAT___GET_SOURCE_IDENTIFIER;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT___GET_ID = THREAT___GET_ID;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT___GET_DESCRIPTION = THREAT___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT___GET_NAME = THREAT___GET_NAME;

	/**
	 * The operation id for the '<em>Check Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT___CHECK_IS_USED__DIAGNOSTICCHAIN_MAP = THREAT___CHECK_IS_USED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>External Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT_OPERATION_COUNT = THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ExternalElementImpl <em>External Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ExternalElementImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getExternalElement()
	 * @generated
	 */
	int EXTERNAL_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT__LINK = 1;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT__SOURCE_ID = 2;

	/**
	 * The number of structural features of the '<em>External Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>External Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ColoredElementImpl <em>Colored Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ColoredElementImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getColoredElement()
	 * @generated
	 */
	int COLORED_ELEMENT = 32;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_ELEMENT__COLOR = 0;

	/**
	 * The number of structural features of the '<em>Colored Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Colored Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ImpactConfigurationImpl <em>Impact Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ImpactConfigurationImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getImpactConfiguration()
	 * @generated
	 */
	int IMPACT_CONFIGURATION = 18;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_CONFIGURATION__COLOR = COLORED_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_CONFIGURATION__DIFFICULTY = COLORED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_CONFIGURATION__IMPACT = COLORED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Impact Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_CONFIGURATION_FEATURE_COUNT = COLORED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Impact Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_CONFIGURATION_OPERATION_COUNT = COLORED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ExternalControlImpl <em>External Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ExternalControlImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getExternalControl()
	 * @generated
	 */
	int EXTERNAL_CONTROL = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__SOURCE = EXTERNAL_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__LINK = EXTERNAL_ELEMENT__LINK;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__SOURCE_ID = EXTERNAL_ELEMENT__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__NAME = EXTERNAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__ID = EXTERNAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__CHARACTERISTICS = EXTERNAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mitigated Threats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__MITIGATED_THREATS = EXTERNAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__DESCRIPTION = EXTERNAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description With Placeholders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__DESCRIPTION_WITH_PLACEHOLDERS = EXTERNAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mitigation Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__MITIGATION_RELATIONS = EXTERNAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__STATUS = EXTERNAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mitigates Vulnerability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__MITIGATES_VULNERABILITY = EXTERNAL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Security Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__SECURITY_OBJECTIVE = EXTERNAL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>External Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL_FEATURE_COUNT = EXTERNAL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Source Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL___GET_SOURCE_NAME = EXTERNAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL___GET_SOURCE_IDENTIFIER = EXTERNAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL___GET_DESCRIPTION = EXTERNAL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL___GET_ID = EXTERNAL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Mitigated Threat Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL___GET_MITIGATED_THREAT_DEFINITIONS = EXTERNAL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL___GET_NAME = EXTERNAL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>External Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL_OPERATION_COUNT = EXTERNAL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ThreatsOwnerImpl <em>Threats Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ThreatsOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreatsOwner()
	 * @generated
	 */
	int THREATS_OWNER = 20;

	/**
	 * The feature id for the '<em><b>Internals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATS_OWNER__INTERNALS = 0;

	/**
	 * The feature id for the '<em><b>Externals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATS_OWNER__EXTERNALS = 1;

	/**
	 * The number of structural features of the '<em>Threats Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATS_OWNER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Threats Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATS_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ControlOwnerImpl <em>Control Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ControlOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getControlOwner()
	 * @generated
	 */
	int CONTROL_OWNER = 21;

	/**
	 * The feature id for the '<em><b>Internals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OWNER__INTERNALS = 0;

	/**
	 * The feature id for the '<em><b>Externals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OWNER__EXTERNALS = 1;

	/**
	 * The number of structural features of the '<em>Control Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OWNER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Control Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AbstractControlOwnerImpl <em>Abstract Control Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AbstractControlOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractControlOwner()
	 * @generated
	 */
	int ABSTRACT_CONTROL_OWNER = 22;

	/**
	 * The feature id for the '<em><b>Control Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROL_OWNER__CONTROL_OWNER = 0;

	/**
	 * The number of structural features of the '<em>Abstract Control Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROL_OWNER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get All Controls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROL_OWNER___GET_ALL_CONTROLS = 0;

	/**
	 * The operation id for the '<em>Get External Controls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROL_OWNER___GET_EXTERNAL_CONTROLS__STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Abstract Control Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROL_OWNER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.DataOwnerImpl <em>Data Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.DataOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getDataOwner()
	 * @generated
	 */
	int DATA_OWNER = 23;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER__DATA = 0;

	/**
	 * The number of structural features of the '<em>Data Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.LinkImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Link Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINK_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Conveyed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINK_CONVEYED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conveying Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONVEYING_LINK = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__COMPONENTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.LinkTypeImpl <em>Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.LinkTypeImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__COLOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AbstractThreatOwnerImpl <em>Abstract Threat Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AbstractThreatOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractThreatOwner()
	 * @generated
	 */
	int ABSTRACT_THREAT_OWNER = 27;

	/**
	 * The feature id for the '<em><b>Threat Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_THREAT_OWNER__THREAT_OWNER = 0;

	/**
	 * The number of structural features of the '<em>Abstract Threat Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_THREAT_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Threat Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_THREAT_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.CatalogImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 26;

	/**
	 * The feature id for the '<em><b>Threat Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__THREAT_OWNER = ABSTRACT_THREAT_OWNER__THREAT_OWNER;

	/**
	 * The feature id for the '<em><b>Control Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CONTROL_OWNER = ABSTRACT_THREAT_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__NAME = ABSTRACT_THREAT_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ID = ABSTRACT_THREAT_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vulnerability Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__VULNERABILITY_OWNER = ABSTRACT_THREAT_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rule Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__RULE_OWNER = ABSTRACT_THREAT_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Component Type Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__COMPONENT_TYPE_OWNER = ABSTRACT_THREAT_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__COMPONENTS = ABSTRACT_THREAT_OWNER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = ABSTRACT_THREAT_OWNER_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get All Controls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_ALL_CONTROLS = ABSTRACT_THREAT_OWNER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get External Controls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_EXTERNAL_CONTROLS__STRING_STRING = ABSTRACT_THREAT_OWNER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Threat By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_THREAT_BY_ID__STRING = ABSTRACT_THREAT_OWNER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Control By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_CONTROL_BY_ID__STRING = ABSTRACT_THREAT_OWNER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Threat Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_THREAT_DEFINITIONS = ABSTRACT_THREAT_OWNER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Control Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_CONTROL_DEFINITIONS = ABSTRACT_THREAT_OWNER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_IDENTIFIER = ABSTRACT_THREAT_OWNER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_NAME = ABSTRACT_THREAT_OWNER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Rule By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_RULE_BY_ID__STRING = ABSTRACT_THREAT_OWNER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Vulnerability By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_VULNERABILITY_BY_ID__STRING = ABSTRACT_THREAT_OWNER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Component Type By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_COMPONENT_TYPE_BY_ID__STRING = ABSTRACT_THREAT_OWNER_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_OPERATION_COUNT = ABSTRACT_THREAT_OWNER_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link dsm.TRADES.IElementWithSource <em>IElement With Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.IElementWithSource
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getIElementWithSource()
	 * @generated
	 */
	int IELEMENT_WITH_SOURCE = 33;

	/**
	 * The number of structural features of the '<em>IElement With Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_WITH_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Source Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_WITH_SOURCE___GET_SOURCE_NAME = 0;

	/**
	 * The operation id for the '<em>Get Source Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_WITH_SOURCE___GET_SOURCE_IDENTIFIER = 1;

	/**
	 * The number of operations of the '<em>IElement With Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_WITH_SOURCE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dsm.TRADES.IThreatDefinition <em>IThreat Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.IThreatDefinition
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getIThreatDefinition()
	 * @generated
	 */
	int ITHREAT_DEFINITION = 28;

	/**
	 * The number of structural features of the '<em>IThreat Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITHREAT_DEFINITION_FEATURE_COUNT = IELEMENT_WITH_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITHREAT_DEFINITION___GET_SOURCE_NAME = IELEMENT_WITH_SOURCE___GET_SOURCE_NAME;

	/**
	 * The operation id for the '<em>Get Source Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITHREAT_DEFINITION___GET_SOURCE_IDENTIFIER = IELEMENT_WITH_SOURCE___GET_SOURCE_IDENTIFIER;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITHREAT_DEFINITION___GET_ID = IELEMENT_WITH_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITHREAT_DEFINITION___GET_DESCRIPTION = IELEMENT_WITH_SOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITHREAT_DEFINITION___GET_NAME = IELEMENT_WITH_SOURCE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>IThreat Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITHREAT_DEFINITION_OPERATION_COUNT = IELEMENT_WITH_SOURCE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link dsm.TRADES.IControlDefinition <em>IControl Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.IControlDefinition
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getIControlDefinition()
	 * @generated
	 */
	int ICONTROL_DEFINITION = 29;

	/**
	 * The number of structural features of the '<em>IControl Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTROL_DEFINITION_FEATURE_COUNT = IELEMENT_WITH_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTROL_DEFINITION___GET_SOURCE_NAME = IELEMENT_WITH_SOURCE___GET_SOURCE_NAME;

	/**
	 * The operation id for the '<em>Get Source Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTROL_DEFINITION___GET_SOURCE_IDENTIFIER = IELEMENT_WITH_SOURCE___GET_SOURCE_IDENTIFIER;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTROL_DEFINITION___GET_DESCRIPTION = IELEMENT_WITH_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTROL_DEFINITION___GET_ID = IELEMENT_WITH_SOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Mitigated Threat Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTROL_DEFINITION___GET_MITIGATED_THREAT_DEFINITIONS = IELEMENT_WITH_SOURCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTROL_DEFINITION___GET_NAME = IELEMENT_WITH_SOURCE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>IControl Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTROL_DEFINITION_OPERATION_COUNT = IELEMENT_WITH_SOURCE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link dsm.TRADES.ICatalogDefinition <em>ICatalog Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.ICatalogDefinition
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getICatalogDefinition()
	 * @generated
	 */
	int ICATALOG_DEFINITION = 30;

	/**
	 * The number of structural features of the '<em>ICatalog Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICATALOG_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Threat By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICATALOG_DEFINITION___GET_THREAT_BY_ID__STRING = 0;

	/**
	 * The operation id for the '<em>Get Control By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICATALOG_DEFINITION___GET_CONTROL_BY_ID__STRING = 1;

	/**
	 * The operation id for the '<em>Get Threat Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICATALOG_DEFINITION___GET_THREAT_DEFINITIONS = 2;

	/**
	 * The operation id for the '<em>Get Control Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICATALOG_DEFINITION___GET_CONTROL_DEFINITIONS = 3;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICATALOG_DEFINITION___GET_IDENTIFIER = 4;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICATALOG_DEFINITION___GET_NAME = 5;

	/**
	 * The operation id for the '<em>Get Rule By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICATALOG_DEFINITION___GET_RULE_BY_ID__STRING = 6;

	/**
	 * The operation id for the '<em>Get Vulnerability By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICATALOG_DEFINITION___GET_VULNERABILITY_BY_ID__STRING = 7;

	/**
	 * The operation id for the '<em>Get Component Type By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICATALOG_DEFINITION___GET_COMPONENT_TYPE_BY_ID__STRING = 8;

	/**
	 * The number of operations of the '<em>ICatalog Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICATALOG_DEFINITION_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ElementWithIdImpl <em>Element With Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ElementWithIdImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getElementWithId()
	 * @generated
	 */
	int ELEMENT_WITH_ID = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_ID__ID = 0;

	/**
	 * The number of structural features of the '<em>Element With Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_ID_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element With Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AssetImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.DomainAssetImpl <em>Domain Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.DomainAssetImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getDomainAsset()
	 * @generated
	 */
	int DOMAIN_ASSET = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSET__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSET__CATEGORY = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AbstractVulnerabilityOwnerImpl <em>Abstract Vulnerability Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AbstractVulnerabilityOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractVulnerabilityOwner()
	 * @generated
	 */
	int ABSTRACT_VULNERABILITY_OWNER = 36;

	/**
	 * The feature id for the '<em><b>Vulnerability Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VULNERABILITY_OWNER__VULNERABILITY_OWNER = 0;

	/**
	 * The number of structural features of the '<em>Abstract Vulnerability Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VULNERABILITY_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Vulnerability Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VULNERABILITY_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.VulnerabilityOwnerImpl <em>Vulnerability Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.VulnerabilityOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getVulnerabilityOwner()
	 * @generated
	 */
	int VULNERABILITY_OWNER = 37;

	/**
	 * The feature id for the '<em><b>Vulnerabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_OWNER__VULNERABILITIES = 0;

	/**
	 * The number of structural features of the '<em>Vulnerability Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Vulnerability Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.VulnerabilityImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getVulnerability()
	 * @generated
	 */
	int VULNERABILITY = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__CHARACTERISTICS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Manifests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__MANIFESTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vulnerability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__VULNERABILITY_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__AFFECTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AbstractComponentTypeOwnerImpl <em>Abstract Component Type Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AbstractComponentTypeOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractComponentTypeOwner()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_TYPE_OWNER = 39;

	/**
	 * The feature id for the '<em><b>Component Type Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER = 0;

	/**
	 * The number of structural features of the '<em>Abstract Component Type Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_TYPE_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Component Type Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_TYPE_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ComponentTypeOwnerImpl <em>Component Type Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ComponentTypeOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponentTypeOwner()
	 * @generated
	 */
	int COMPONENT_TYPE_OWNER = 40;

	/**
	 * The feature id for the '<em><b>Component Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OWNER__COMPONENT_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Component Type Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component Type Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ComponentTypeImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manifests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__MANIFESTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subject To Threats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__SUBJECT_TO_THREATS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Affected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__AFFECTED_BY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AbstractRuleOwnerImpl <em>Abstract Rule Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AbstractRuleOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractRuleOwner()
	 * @generated
	 */
	int ABSTRACT_RULE_OWNER = 43;

	/**
	 * The feature id for the '<em><b>Rule Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RULE_OWNER__RULE_OWNER = 0;

	/**
	 * The number of structural features of the '<em>Abstract Rule Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RULE_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Rule Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RULE_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.RuleOwnerImpl <em>Rule Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.RuleOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getRuleOwner()
	 * @generated
	 */
	int RULE_OWNER = 44;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OWNER__RULES = 0;

	/**
	 * The number of structural features of the '<em>Rule Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rule Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.RuleImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vulnerabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__VULNERABILITIES = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Types Affected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__COMPONENT_TYPES_AFFECTED = ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONTROLS = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.CharacteristicImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__LABEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__OPTIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.CharacteristicOwnerImpl <em>Characteristic Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.CharacteristicOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getCharacteristicOwner()
	 * @generated
	 */
	int CHARACTERISTIC_OWNER = 47;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_OWNER__CHARACTERISTICS = 0;

	/**
	 * The number of structural features of the '<em>Characteristic Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Characteristic Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.AssessmentENUM <em>Assessment ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.AssessmentENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAssessmentENUM()
	 * @generated
	 */
	int ASSESSMENT_ENUM = 48;

	/**
	 * The meta object id for the '{@link dsm.TRADES.AffectedENUM <em>Affected ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.AffectedENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAffectedENUM()
	 * @generated
	 */
	int AFFECTED_ENUM = 49;

	/**
	 * The meta object id for the '{@link dsm.TRADES.threatTypeENUM <em>threat Type ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.threatTypeENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getthreatTypeENUM()
	 * @generated
	 */
	int THREAT_TYPE_ENUM = 50;

	/**
	 * The meta object id for the '{@link dsm.TRADES.ControlStatusENUM <em>Control Status ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.ControlStatusENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getControlStatusENUM()
	 * @generated
	 */
	int CONTROL_STATUS_ENUM = 51;

	/**
	 * The meta object id for the '{@link dsm.TRADES.ComponentCategoryENUM <em>Component Category ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.ComponentCategoryENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponentCategoryENUM()
	 * @generated
	 */
	int COMPONENT_CATEGORY_ENUM = 52;

	/**
	 * The meta object id for the '{@link dsm.TRADES.SecurityObjectiveENUM <em>Security Objective ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.SecurityObjectiveENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getSecurityObjectiveENUM()
	 * @generated
	 */
	int SECURITY_OBJECTIVE_ENUM = 53;

	/**
	 * The meta object id for the '{@link dsm.TRADES.VulnerabilityTypeENUM <em>Vulnerability Type ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.VulnerabilityTypeENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getVulnerabilityTypeENUM()
	 * @generated
	 */
	int VULNERABILITY_TYPE_ENUM = 54;

	/**
	 * The meta object id for the '<em>RGB Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.RGBColor
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getRGBColor()
	 * @generated
	 */
	int RGB_COLOR = 55;

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis</em>'.
	 * @see dsm.TRADES.Analysis
	 * @generated
	 */
	EClass getAnalysis();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.Analysis#getScoreSystem <em>Score System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Score System</em>'.
	 * @see dsm.TRADES.Analysis#getScoreSystem()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_ScoreSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Analysis#getLinkTypes <em>Link Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Types</em>'.
	 * @see dsm.TRADES.Analysis#getLinkTypes()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_LinkTypes();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Analysis#getNVDAPIKey <em>NVDAPI Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NVDAPI Key</em>'.
	 * @see dsm.TRADES.Analysis#getNVDAPIKey()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_NVDAPIKey();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Analysis#isProperty_VulnerabilityMitigationRulesAvailable <em>Property Vulnerability Mitigation Rules Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Vulnerability Mitigation Rules Available</em>'.
	 * @see dsm.TRADES.Analysis#isProperty_VulnerabilityMitigationRulesAvailable()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Property_VulnerabilityMitigationRulesAvailable();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Analysis#isProperty_WeaknessMitigationRulesAvailable <em>Property Weakness Mitigation Rules Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Weakness Mitigation Rules Available</em>'.
	 * @see dsm.TRADES.Analysis#isProperty_WeaknessMitigationRulesAvailable()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Property_WeaknessMitigationRulesAvailable();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Analysis#isProperty_DesignAddressesVulnerabilities <em>Property Design Addresses Vulnerabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Design Addresses Vulnerabilities</em>'.
	 * @see dsm.TRADES.Analysis#isProperty_DesignAddressesVulnerabilities()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Property_DesignAddressesVulnerabilities();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Analysis#isProperty_DesignAddressesWeaknesses <em>Property Design Addresses Weaknesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Design Addresses Weaknesses</em>'.
	 * @see dsm.TRADES.Analysis#isProperty_DesignAddressesWeaknesses()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Property_DesignAddressesWeaknesses();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Analysis#getVulnerabilitiesUncoveredByRule <em>Vulnerabilities Uncovered By Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vulnerabilities Uncovered By Rule</em>'.
	 * @see dsm.TRADES.Analysis#getVulnerabilitiesUncoveredByRule()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_VulnerabilitiesUncoveredByRule();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Analysis#getWeaknessesUncoveredByRule <em>Weaknesses Uncovered By Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Weaknesses Uncovered By Rule</em>'.
	 * @see dsm.TRADES.Analysis#getWeaknessesUncoveredByRule()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_WeaknessesUncoveredByRule();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Analysis#getVulnerableComponents <em>Vulnerable Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vulnerable Components</em>'.
	 * @see dsm.TRADES.Analysis#getVulnerableComponents()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_VulnerableComponents();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Analysis#getExternalThreats(java.lang.String, java.lang.String) <em>Get External Threats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get External Threats</em>' operation.
	 * @see dsm.TRADES.Analysis#getExternalThreats(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAnalysis__GetExternalThreats__String_String();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Analysis#directRuleExists(dsm.TRADES.Vulnerability, dsm.TRADES.ComponentType) <em>Direct Rule Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Direct Rule Exists</em>' operation.
	 * @see dsm.TRADES.Analysis#directRuleExists(dsm.TRADES.Vulnerability, dsm.TRADES.ComponentType)
	 * @generated
	 */
	EOperation getAnalysis__DirectRuleExists__Vulnerability_ComponentType();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Analysis#proxyRuleExists(dsm.TRADES.Vulnerability, dsm.TRADES.ComponentType) <em>Proxy Rule Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Proxy Rule Exists</em>' operation.
	 * @see dsm.TRADES.Analysis#proxyRuleExists(dsm.TRADES.Vulnerability, dsm.TRADES.ComponentType)
	 * @generated
	 */
	EOperation getAnalysis__ProxyRuleExists__Vulnerability_ComponentType();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Analysis#ruleExists(dsm.TRADES.Vulnerability, dsm.TRADES.ComponentType) <em>Rule Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule Exists</em>' operation.
	 * @see dsm.TRADES.Analysis#ruleExists(dsm.TRADES.Vulnerability, dsm.TRADES.ComponentType)
	 * @generated
	 */
	EOperation getAnalysis__RuleExists__Vulnerability_ComponentType();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see dsm.TRADES.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Threat#getThreatAllocations <em>Threat Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threat Allocations</em>'.
	 * @see dsm.TRADES.Threat#getThreatAllocations()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_ThreatAllocations();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Threat#getThreatType <em>Threat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threat Type</em>'.
	 * @see dsm.TRADES.Threat#getThreatType()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_ThreatType();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Threat#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.TRADES.Threat#getDescription()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Description();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Threat#getApplicability <em>Applicability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicability</em>'.
	 * @see dsm.TRADES.Threat#getApplicability()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Applicability();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Threat#getExploitsVulnerability <em>Exploits Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exploits Vulnerability</em>'.
	 * @see dsm.TRADES.Threat#getExploitsVulnerability()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_ExploitsVulnerability();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Threat#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refines</em>'.
	 * @see dsm.TRADES.Threat#getRefines()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Refines();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Threat#checkIsUsed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Is Used</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Is Used</em>' operation.
	 * @see dsm.TRADES.Threat#checkIsUsed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getThreat__CheckIsUsed__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see dsm.TRADES.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Component#getThreatAllocations <em>Threat Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threat Allocations</em>'.
	 * @see dsm.TRADES.Component#getThreatAllocations()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ThreatAllocations();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Component#getAffectRelations <em>Affect Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affect Relations</em>'.
	 * @see dsm.TRADES.Component#getAffectRelations()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AffectRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Component#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see dsm.TRADES.Component#getLinks()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Links();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Component#getComponentTypes <em>Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Types</em>'.
	 * @see dsm.TRADES.Component#getComponentTypes()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentTypes();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Component#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rules</em>'.
	 * @see dsm.TRADES.Component#getRules()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Rules();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Component#getAssignedControls <em>Assigned Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Controls</em>'.
	 * @see dsm.TRADES.Component#getAssignedControls()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AssignedControls();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Component#isVulnerable <em>Vulnerable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vulnerable</em>'.
	 * @see dsm.TRADES.Component#isVulnerable()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Vulnerable();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Component#getCVA <em>CVA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CVA</em>'.
	 * @see dsm.TRADES.Component#getCVA()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_CVA();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Component#getCWA <em>CWA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CWA</em>'.
	 * @see dsm.TRADES.Component#getCWA()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_CWA();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Component#getAssociatedControls <em>Associated Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated Controls</em>'.
	 * @see dsm.TRADES.Component#getAssociatedControls()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AssociatedControls();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Component#getUnmitigatedVulnerabilities <em>Unmitigated Vulnerabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unmitigated Vulnerabilities</em>'.
	 * @see dsm.TRADES.Component#getUnmitigatedVulnerabilities()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_UnmitigatedVulnerabilities();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Component#getUnmitigatedWeaknesses <em>Unmitigated Weaknesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unmitigated Weaknesses</em>'.
	 * @see dsm.TRADES.Component#getUnmitigatedWeaknesses()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_UnmitigatedWeaknesses();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Component#ofType(dsm.TRADES.ComponentType) <em>Of Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Of Type</em>' operation.
	 * @see dsm.TRADES.Component#ofType(dsm.TRADES.ComponentType)
	 * @generated
	 */
	EOperation getComponent__OfType__ComponentType();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Component#mitigatedV(dsm.TRADES.Vulnerability) <em>Mitigated V</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mitigated V</em>' operation.
	 * @see dsm.TRADES.Component#mitigatedV(dsm.TRADES.Vulnerability)
	 * @generated
	 */
	EOperation getComponent__MitigatedV__Vulnerability();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Component#mitigatedW(dsm.TRADES.Vulnerability) <em>Mitigated W</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mitigated W</em>' operation.
	 * @see dsm.TRADES.Component#mitigatedW(dsm.TRADES.Vulnerability)
	 * @generated
	 */
	EOperation getComponent__MitigatedW__Vulnerability();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Component#mitigatedByW(dsm.TRADES.Vulnerability) <em>Mitigated By W</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mitigated By W</em>' operation.
	 * @see dsm.TRADES.Component#mitigatedByW(dsm.TRADES.Vulnerability)
	 * @generated
	 */
	EOperation getComponent__MitigatedByW__Vulnerability();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Component#mitigated(dsm.TRADES.Vulnerability) <em>Mitigated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mitigated</em>' operation.
	 * @see dsm.TRADES.Component#mitigated(dsm.TRADES.Vulnerability)
	 * @generated
	 */
	EOperation getComponent__Mitigated__Vulnerability();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Component#vulnerableW() <em>Vulnerable W</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vulnerable W</em>' operation.
	 * @see dsm.TRADES.Component#vulnerableW()
	 * @generated
	 */
	EOperation getComponent__VulnerableW();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Component#vulnerableV() <em>Vulnerable V</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vulnerable V</em>' operation.
	 * @see dsm.TRADES.Component#vulnerableV()
	 * @generated
	 */
	EOperation getComponent__VulnerableV();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see dsm.TRADES.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Control#getMitigatedThreats <em>Mitigated Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mitigated Threats</em>'.
	 * @see dsm.TRADES.Control#getMitigatedThreats()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_MitigatedThreats();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Control#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.TRADES.Control#getDescription()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Description();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Control#getDescriptionWithPlaceholders <em>Description With Placeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description With Placeholders</em>'.
	 * @see dsm.TRADES.Control#getDescriptionWithPlaceholders()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_DescriptionWithPlaceholders();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Control#getMitigationRelations <em>Mitigation Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mitigation Relations</em>'.
	 * @see dsm.TRADES.Control#getMitigationRelations()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_MitigationRelations();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Control#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see dsm.TRADES.Control#getStatus()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Status();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Control#getMitigatesVulnerability <em>Mitigates Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mitigates Vulnerability</em>'.
	 * @see dsm.TRADES.Control#getMitigatesVulnerability()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_MitigatesVulnerability();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Control#getSecurityObjective <em>Security Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Objective</em>'.
	 * @see dsm.TRADES.Control#getSecurityObjective()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_SecurityObjective();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ThreatAllocationRelation <em>Threat Allocation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat Allocation Relation</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation
	 * @generated
	 */
	EClass getThreatAllocationRelation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ThreatAllocationRelation#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessment</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getAssessment()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EAttribute getThreatAllocationRelation_Assessment();

	/**
	 * Returns the meta object for the container reference '{@link dsm.TRADES.ThreatAllocationRelation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getComponent()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_Component();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatAllocationRelation#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Threat</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getThreat()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_Threat();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatAllocationRelation#getImpactScore <em>Impact Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impact Score</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getImpactScore()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_ImpactScore();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatAllocationRelation#getDifficultyScore <em>Difficulty Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Difficulty Score</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getDifficultyScore()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_DifficultyScore();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.ThreatAllocationRelation#getAttackChain <em>Attack Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attack Chain</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getAttackChain()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_AttackChain();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ThreatAllocationRelation#isMitigated <em>Mitigated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mitigated</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#isMitigated()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EAttribute getThreatAllocationRelation_Mitigated();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ThreatAllocationRelation#checkComputedDifficultyConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Computed Difficulty Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Computed Difficulty Constraint</em>' operation.
	 * @see dsm.TRADES.ThreatAllocationRelation#checkComputedDifficultyConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getThreatAllocationRelation__CheckComputedDifficultyConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ThreatAllocationRelation#mitigatedAV() <em>Mitigated AV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mitigated AV</em>' operation.
	 * @see dsm.TRADES.ThreatAllocationRelation#mitigatedAV()
	 * @generated
	 */
	EOperation getThreatAllocationRelation__MitigatedAV();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ThreatAllocationRelation#mitigatedAW() <em>Mitigated AW</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mitigated AW</em>' operation.
	 * @see dsm.TRADES.ThreatAllocationRelation#mitigatedAW()
	 * @generated
	 */
	EOperation getThreatAllocationRelation__MitigatedAW();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ThreatAllocationRelation#mitigatedVSteps() <em>Mitigated VSteps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mitigated VSteps</em>' operation.
	 * @see dsm.TRADES.ThreatAllocationRelation#mitigatedVSteps()
	 * @generated
	 */
	EOperation getThreatAllocationRelation__MitigatedVSteps();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ThreatAllocationRelation#mitigatedWSteps() <em>Mitigated WSteps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mitigated WSteps</em>' operation.
	 * @see dsm.TRADES.ThreatAllocationRelation#mitigatedWSteps()
	 * @generated
	 */
	EOperation getThreatAllocationRelation__MitigatedWSteps();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ThreatAllocationRelation#mitigatedV() <em>Mitigated V</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mitigated V</em>' operation.
	 * @see dsm.TRADES.ThreatAllocationRelation#mitigatedV()
	 * @generated
	 */
	EOperation getThreatAllocationRelation__MitigatedV();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ThreatAllocationRelation#mitigatedW() <em>Mitigated W</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mitigated W</em>' operation.
	 * @see dsm.TRADES.ThreatAllocationRelation#mitigatedW()
	 * @generated
	 */
	EOperation getThreatAllocationRelation__MitigatedW();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ThreatMitigationRelation <em>Threat Mitigation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat Mitigation Relation</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation
	 * @generated
	 */
	EClass getThreatMitigationRelation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ThreatMitigationRelation#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessment</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation#getAssessment()
	 * @see #getThreatMitigationRelation()
	 * @generated
	 */
	EAttribute getThreatMitigationRelation_Assessment();

	/**
	 * Returns the meta object for the container reference '{@link dsm.TRADES.ThreatMitigationRelation#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Control</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation#getControl()
	 * @see #getThreatMitigationRelation()
	 * @generated
	 */
	EReference getThreatMitigationRelation_Control();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatMitigationRelation#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Threat</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation#getThreat()
	 * @see #getThreatMitigationRelation()
	 * @generated
	 */
	EReference getThreatMitigationRelation_Threat();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatMitigationRelation#getMitigatedAllocation <em>Mitigated Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mitigated Allocation</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation#getMitigatedAllocation()
	 * @see #getThreatMitigationRelation()
	 * @generated
	 */
	EReference getThreatMitigationRelation_MitigatedAllocation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ThreatMitigationRelation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation#getDescription()
	 * @see #getThreatMitigationRelation()
	 * @generated
	 */
	EAttribute getThreatMitigationRelation_Description();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see dsm.TRADES.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AffectRelation <em>Affect Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affect Relation</em>'.
	 * @see dsm.TRADES.AffectRelation
	 * @generated
	 */
	EClass getAffectRelation();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.AffectRelation#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see dsm.TRADES.AffectRelation#getData()
	 * @see #getAffectRelation()
	 * @generated
	 */
	EReference getAffectRelation_Data();

	/**
	 * Returns the meta object for the container reference '{@link dsm.TRADES.AffectRelation#getSourceComponent <em>Source Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Component</em>'.
	 * @see dsm.TRADES.AffectRelation#getSourceComponent()
	 * @see #getAffectRelation()
	 * @generated
	 */
	EReference getAffectRelation_SourceComponent();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.AffectRelation#getTargetComponent <em>Target Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Component</em>'.
	 * @see dsm.TRADES.AffectRelation#getTargetComponent()
	 * @see #getAffectRelation()
	 * @generated
	 */
	EReference getAffectRelation_TargetComponent();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AffectRelation#getAnalysisStatus <em>Analysis Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analysis Status</em>'.
	 * @see dsm.TRADES.AffectRelation#getAnalysisStatus()
	 * @see #getAffectRelation()
	 * @generated
	 */
	EAttribute getAffectRelation_AnalysisStatus();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.AffectRelation#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see dsm.TRADES.AffectRelation#getLink()
	 * @see #getAffectRelation()
	 * @generated
	 */
	EReference getAffectRelation_Link();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.AffectRelation#checkDataScope(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Data Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Data Scope</em>' operation.
	 * @see dsm.TRADES.AffectRelation#checkDataScope(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAffectRelation__CheckDataScope__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AttackChain <em>Attack Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack Chain</em>'.
	 * @see dsm.TRADES.AttackChain
	 * @generated
	 */
	EClass getAttackChain();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.AttackChain#getAttackChainSteps <em>Attack Chain Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attack Chain Steps</em>'.
	 * @see dsm.TRADES.AttackChain#getAttackChainSteps()
	 * @see #getAttackChain()
	 * @generated
	 */
	EReference getAttackChain_AttackChainSteps();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AttackChain#getComputedDifficulty <em>Computed Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computed Difficulty</em>'.
	 * @see dsm.TRADES.AttackChain#getComputedDifficulty()
	 * @see #getAttackChain()
	 * @generated
	 */
	EAttribute getAttackChain_ComputedDifficulty();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AttackChainStep <em>Attack Chain Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack Chain Step</em>'.
	 * @see dsm.TRADES.AttackChainStep
	 * @generated
	 */
	EClass getAttackChainStep();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AttackChainStep#getStepNum <em>Step Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Num</em>'.
	 * @see dsm.TRADES.AttackChainStep#getStepNum()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EAttribute getAttackChainStep_StepNum();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.AttackChainStep#getThreatAllocationRelation <em>Threat Allocation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Threat Allocation Relation</em>'.
	 * @see dsm.TRADES.AttackChainStep#getThreatAllocationRelation()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EReference getAttackChainStep_ThreatAllocationRelation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AttackChainStep#getImpactDescription <em>Impact Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact Description</em>'.
	 * @see dsm.TRADES.AttackChainStep#getImpactDescription()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EAttribute getAttackChainStep_ImpactDescription();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.AttackChainStep#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see dsm.TRADES.AttackChainStep#getNext()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EReference getAttackChainStep_Next();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.AttackChainStep#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous</em>'.
	 * @see dsm.TRADES.AttackChainStep#getPrevious()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EReference getAttackChainStep_Previous();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.AttackChainStep#getThreatAllocationRelationCandidates() <em>Get Threat Allocation Relation Candidates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Threat Allocation Relation Candidates</em>' operation.
	 * @see dsm.TRADES.AttackChainStep#getThreatAllocationRelationCandidates()
	 * @generated
	 */
	EOperation getAttackChainStep__GetThreatAllocationRelationCandidates();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.AttackChainStep#checkAllocationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Allocation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Allocation Value</em>' operation.
	 * @see dsm.TRADES.AttackChainStep#checkAllocationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAttackChainStep__CheckAllocationValue__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ScoreSystem <em>Score System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score System</em>'.
	 * @see dsm.TRADES.ScoreSystem
	 * @generated
	 */
	EClass getScoreSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ScoreSystem#getImpactScores <em>Impact Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Impact Scores</em>'.
	 * @see dsm.TRADES.ScoreSystem#getImpactScores()
	 * @see #getScoreSystem()
	 * @generated
	 */
	EReference getScoreSystem_ImpactScores();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ScoreSystem#getDifficultyScores <em>Difficulty Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difficulty Scores</em>'.
	 * @see dsm.TRADES.ScoreSystem#getDifficultyScores()
	 * @see #getScoreSystem()
	 * @generated
	 */
	EReference getScoreSystem_DifficultyScores();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ImpactScore <em>Impact Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impact Score</em>'.
	 * @see dsm.TRADES.ImpactScore
	 * @generated
	 */
	EClass getImpactScore();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ImpactScore#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact</em>'.
	 * @see dsm.TRADES.ImpactScore#getImpact()
	 * @see #getImpactScore()
	 * @generated
	 */
	EAttribute getImpactScore_Impact();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ImpactScore#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see dsm.TRADES.ImpactScore#getConfigurations()
	 * @see #getImpactScore()
	 * @generated
	 */
	EReference getImpactScore_Configurations();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.DifficultyScore <em>Difficulty Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difficulty Score</em>'.
	 * @see dsm.TRADES.DifficultyScore
	 * @generated
	 */
	EClass getDifficultyScore();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.DifficultyScore#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see dsm.TRADES.DifficultyScore#getDifficulty()
	 * @see #getDifficultyScore()
	 * @generated
	 */
	EAttribute getDifficultyScore_Difficulty();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.DataOwnerElement <em>Data Owner Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Owner Element</em>'.
	 * @see dsm.TRADES.DataOwnerElement
	 * @generated
	 */
	EClass getDataOwnerElement();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.DataOwnerElement#getDataOwner <em>Data Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Owner</em>'.
	 * @see dsm.TRADES.DataOwnerElement#getDataOwner()
	 * @see #getDataOwnerElement()
	 * @generated
	 */
	EReference getDataOwnerElement_DataOwner();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.DataOwnerElement#getDatas() <em>Get Datas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Datas</em>' operation.
	 * @see dsm.TRADES.DataOwnerElement#getDatas()
	 * @generated
	 */
	EOperation getDataOwnerElement__GetDatas();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.DataOwnerElement#getInheritedDatas() <em>Get Inherited Datas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inherited Datas</em>' operation.
	 * @see dsm.TRADES.DataOwnerElement#getInheritedDatas()
	 * @generated
	 */
	EOperation getDataOwnerElement__GetInheritedDatas();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.DataOwnerElement#getAllDatas() <em>Get All Datas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Datas</em>' operation.
	 * @see dsm.TRADES.DataOwnerElement#getAllDatas()
	 * @generated
	 */
	EOperation getDataOwnerElement__GetAllDatas();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AbstractComponentOwner <em>Abstract Component Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Owner</em>'.
	 * @see dsm.TRADES.AbstractComponentOwner
	 * @generated
	 */
	EClass getAbstractComponentOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.AbstractComponentOwner#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see dsm.TRADES.AbstractComponentOwner#getComponents()
	 * @see #getAbstractComponentOwner()
	 * @generated
	 */
	EReference getAbstractComponentOwner_Components();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see dsm.TRADES.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ExternalThreat <em>External Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Threat</em>'.
	 * @see dsm.TRADES.ExternalThreat
	 * @generated
	 */
	EClass getExternalThreat();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ExternalElement <em>External Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Element</em>'.
	 * @see dsm.TRADES.ExternalElement
	 * @generated
	 */
	EClass getExternalElement();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ExternalElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see dsm.TRADES.ExternalElement#getSource()
	 * @see #getExternalElement()
	 * @generated
	 */
	EAttribute getExternalElement_Source();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ExternalElement#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see dsm.TRADES.ExternalElement#getLink()
	 * @see #getExternalElement()
	 * @generated
	 */
	EAttribute getExternalElement_Link();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ExternalElement#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see dsm.TRADES.ExternalElement#getSourceID()
	 * @see #getExternalElement()
	 * @generated
	 */
	EAttribute getExternalElement_SourceID();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ImpactConfiguration <em>Impact Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impact Configuration</em>'.
	 * @see dsm.TRADES.ImpactConfiguration
	 * @generated
	 */
	EClass getImpactConfiguration();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ImpactConfiguration#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Difficulty</em>'.
	 * @see dsm.TRADES.ImpactConfiguration#getDifficulty()
	 * @see #getImpactConfiguration()
	 * @generated
	 */
	EReference getImpactConfiguration_Difficulty();

	/**
	 * Returns the meta object for the container reference '{@link dsm.TRADES.ImpactConfiguration#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Impact</em>'.
	 * @see dsm.TRADES.ImpactConfiguration#getImpact()
	 * @see #getImpactConfiguration()
	 * @generated
	 */
	EReference getImpactConfiguration_Impact();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ExternalControl <em>External Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Control</em>'.
	 * @see dsm.TRADES.ExternalControl
	 * @generated
	 */
	EClass getExternalControl();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ThreatsOwner <em>Threats Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threats Owner</em>'.
	 * @see dsm.TRADES.ThreatsOwner
	 * @generated
	 */
	EClass getThreatsOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ThreatsOwner#getInternals <em>Internals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internals</em>'.
	 * @see dsm.TRADES.ThreatsOwner#getInternals()
	 * @see #getThreatsOwner()
	 * @generated
	 */
	EReference getThreatsOwner_Internals();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ThreatsOwner#getExternals <em>Externals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Externals</em>'.
	 * @see dsm.TRADES.ThreatsOwner#getExternals()
	 * @see #getThreatsOwner()
	 * @generated
	 */
	EReference getThreatsOwner_Externals();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ControlOwner <em>Control Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Owner</em>'.
	 * @see dsm.TRADES.ControlOwner
	 * @generated
	 */
	EClass getControlOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ControlOwner#getInternals <em>Internals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internals</em>'.
	 * @see dsm.TRADES.ControlOwner#getInternals()
	 * @see #getControlOwner()
	 * @generated
	 */
	EReference getControlOwner_Internals();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ControlOwner#getExternals <em>Externals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Externals</em>'.
	 * @see dsm.TRADES.ControlOwner#getExternals()
	 * @see #getControlOwner()
	 * @generated
	 */
	EReference getControlOwner_Externals();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AbstractControlOwner <em>Abstract Control Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Control Owner</em>'.
	 * @see dsm.TRADES.AbstractControlOwner
	 * @generated
	 */
	EClass getAbstractControlOwner();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.AbstractControlOwner#getControlOwner <em>Control Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control Owner</em>'.
	 * @see dsm.TRADES.AbstractControlOwner#getControlOwner()
	 * @see #getAbstractControlOwner()
	 * @generated
	 */
	EReference getAbstractControlOwner_ControlOwner();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.AbstractControlOwner#getAllControls() <em>Get All Controls</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Controls</em>' operation.
	 * @see dsm.TRADES.AbstractControlOwner#getAllControls()
	 * @generated
	 */
	EOperation getAbstractControlOwner__GetAllControls();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.AbstractControlOwner#getExternalControls(java.lang.String, java.lang.String) <em>Get External Controls</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get External Controls</em>' operation.
	 * @see dsm.TRADES.AbstractControlOwner#getExternalControls(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractControlOwner__GetExternalControls__String_String();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.DataOwner <em>Data Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Owner</em>'.
	 * @see dsm.TRADES.DataOwner
	 * @generated
	 */
	EClass getDataOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.DataOwner#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see dsm.TRADES.DataOwner#getData()
	 * @see #getDataOwner()
	 * @generated
	 */
	EReference getDataOwner_Data();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see dsm.TRADES.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.Link#getLinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Type</em>'.
	 * @see dsm.TRADES.Link#getLinkType()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_LinkType();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Link#getLinkConveyed <em>Link Conveyed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link Conveyed</em>'.
	 * @see dsm.TRADES.Link#getLinkConveyed()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_LinkConveyed();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Link#getConveyingLink <em>Conveying Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conveying Link</em>'.
	 * @see dsm.TRADES.Link#getConveyingLink()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_ConveyingLink();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Link#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see dsm.TRADES.Link#getComponents()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Components();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Type</em>'.
	 * @see dsm.TRADES.LinkType
	 * @generated
	 */
	EClass getLinkType();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see dsm.TRADES.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AbstractThreatOwner <em>Abstract Threat Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Threat Owner</em>'.
	 * @see dsm.TRADES.AbstractThreatOwner
	 * @generated
	 */
	EClass getAbstractThreatOwner();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.AbstractThreatOwner#getThreatOwner <em>Threat Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Threat Owner</em>'.
	 * @see dsm.TRADES.AbstractThreatOwner#getThreatOwner()
	 * @see #getAbstractThreatOwner()
	 * @generated
	 */
	EReference getAbstractThreatOwner_ThreatOwner();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.IThreatDefinition <em>IThreat Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IThreat Definition</em>'.
	 * @see dsm.TRADES.IThreatDefinition
	 * @generated
	 */
	EClass getIThreatDefinition();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.IThreatDefinition#getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id</em>' operation.
	 * @see dsm.TRADES.IThreatDefinition#getId()
	 * @generated
	 */
	EOperation getIThreatDefinition__GetId();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.IThreatDefinition#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see dsm.TRADES.IThreatDefinition#getDescription()
	 * @generated
	 */
	EOperation getIThreatDefinition__GetDescription();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.IThreatDefinition#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see dsm.TRADES.IThreatDefinition#getName()
	 * @generated
	 */
	EOperation getIThreatDefinition__GetName();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.IControlDefinition <em>IControl Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IControl Definition</em>'.
	 * @see dsm.TRADES.IControlDefinition
	 * @generated
	 */
	EClass getIControlDefinition();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.IControlDefinition#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see dsm.TRADES.IControlDefinition#getDescription()
	 * @generated
	 */
	EOperation getIControlDefinition__GetDescription();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.IControlDefinition#getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id</em>' operation.
	 * @see dsm.TRADES.IControlDefinition#getId()
	 * @generated
	 */
	EOperation getIControlDefinition__GetId();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.IControlDefinition#getMitigatedThreatDefinitions() <em>Get Mitigated Threat Definitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mitigated Threat Definitions</em>' operation.
	 * @see dsm.TRADES.IControlDefinition#getMitigatedThreatDefinitions()
	 * @generated
	 */
	EOperation getIControlDefinition__GetMitigatedThreatDefinitions();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.IControlDefinition#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see dsm.TRADES.IControlDefinition#getName()
	 * @generated
	 */
	EOperation getIControlDefinition__GetName();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ICatalogDefinition <em>ICatalog Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICatalog Definition</em>'.
	 * @see dsm.TRADES.ICatalogDefinition
	 * @generated
	 */
	EClass getICatalogDefinition();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ICatalogDefinition#getThreatById(java.lang.String) <em>Get Threat By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Threat By Id</em>' operation.
	 * @see dsm.TRADES.ICatalogDefinition#getThreatById(java.lang.String)
	 * @generated
	 */
	EOperation getICatalogDefinition__GetThreatById__String();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ICatalogDefinition#getControlById(java.lang.String) <em>Get Control By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Control By Id</em>' operation.
	 * @see dsm.TRADES.ICatalogDefinition#getControlById(java.lang.String)
	 * @generated
	 */
	EOperation getICatalogDefinition__GetControlById__String();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ICatalogDefinition#getThreatDefinitions() <em>Get Threat Definitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Threat Definitions</em>' operation.
	 * @see dsm.TRADES.ICatalogDefinition#getThreatDefinitions()
	 * @generated
	 */
	EOperation getICatalogDefinition__GetThreatDefinitions();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ICatalogDefinition#getControlDefinitions() <em>Get Control Definitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Control Definitions</em>' operation.
	 * @see dsm.TRADES.ICatalogDefinition#getControlDefinitions()
	 * @generated
	 */
	EOperation getICatalogDefinition__GetControlDefinitions();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ICatalogDefinition#getIdentifier() <em>Get Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Identifier</em>' operation.
	 * @see dsm.TRADES.ICatalogDefinition#getIdentifier()
	 * @generated
	 */
	EOperation getICatalogDefinition__GetIdentifier();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ICatalogDefinition#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see dsm.TRADES.ICatalogDefinition#getName()
	 * @generated
	 */
	EOperation getICatalogDefinition__GetName();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ICatalogDefinition#getRuleById(java.lang.String) <em>Get Rule By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rule By Id</em>' operation.
	 * @see dsm.TRADES.ICatalogDefinition#getRuleById(java.lang.String)
	 * @generated
	 */
	EOperation getICatalogDefinition__GetRuleById__String();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ICatalogDefinition#getVulnerabilityById(java.lang.String) <em>Get Vulnerability By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Vulnerability By Id</em>' operation.
	 * @see dsm.TRADES.ICatalogDefinition#getVulnerabilityById(java.lang.String)
	 * @generated
	 */
	EOperation getICatalogDefinition__GetVulnerabilityById__String();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ICatalogDefinition#getComponentTypeById(java.lang.String) <em>Get Component Type By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Component Type By Id</em>' operation.
	 * @see dsm.TRADES.ICatalogDefinition#getComponentTypeById(java.lang.String)
	 * @generated
	 */
	EOperation getICatalogDefinition__GetComponentTypeById__String();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.IMitigationLink <em>IMitigation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMitigation Link</em>'.
	 * @see dsm.TRADES.IMitigationLink
	 * @generated
	 */
	EClass getIMitigationLink();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.IMitigationLink#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see dsm.TRADES.IMitigationLink#getDescription()
	 * @generated
	 */
	EOperation getIMitigationLink__GetDescription();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.IMitigationLink#getThreat() <em>Get Threat</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Threat</em>' operation.
	 * @see dsm.TRADES.IMitigationLink#getThreat()
	 * @generated
	 */
	EOperation getIMitigationLink__GetThreat();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ColoredElement <em>Colored Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colored Element</em>'.
	 * @see dsm.TRADES.ColoredElement
	 * @generated
	 */
	EClass getColoredElement();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ColoredElement#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see dsm.TRADES.ColoredElement#getColor()
	 * @see #getColoredElement()
	 * @generated
	 */
	EAttribute getColoredElement_Color();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.IElementWithSource <em>IElement With Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IElement With Source</em>'.
	 * @see dsm.TRADES.IElementWithSource
	 * @generated
	 */
	EClass getIElementWithSource();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.IElementWithSource#getSourceName() <em>Get Source Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Name</em>' operation.
	 * @see dsm.TRADES.IElementWithSource#getSourceName()
	 * @generated
	 */
	EOperation getIElementWithSource__GetSourceName();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.IElementWithSource#getSourceIdentifier() <em>Get Source Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Identifier</em>' operation.
	 * @see dsm.TRADES.IElementWithSource#getSourceIdentifier()
	 * @generated
	 */
	EOperation getIElementWithSource__GetSourceIdentifier();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ElementWithId <em>Element With Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element With Id</em>'.
	 * @see dsm.TRADES.ElementWithId
	 * @generated
	 */
	EClass getElementWithId();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ElementWithId#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsm.TRADES.ElementWithId#getId()
	 * @see #getElementWithId()
	 * @generated
	 */
	EAttribute getElementWithId_Id();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.DomainAsset <em>Domain Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Asset</em>'.
	 * @see dsm.TRADES.DomainAsset
	 * @generated
	 */
	EClass getDomainAsset();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.TRADES.DomainAsset#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Category</em>'.
	 * @see dsm.TRADES.DomainAsset#getCategory()
	 * @see #getDomainAsset()
	 * @generated
	 */
	EAttribute getDomainAsset_Category();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AbstractVulnerabilityOwner <em>Abstract Vulnerability Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Vulnerability Owner</em>'.
	 * @see dsm.TRADES.AbstractVulnerabilityOwner
	 * @generated
	 */
	EClass getAbstractVulnerabilityOwner();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.AbstractVulnerabilityOwner#getVulnerabilityOwner <em>Vulnerability Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vulnerability Owner</em>'.
	 * @see dsm.TRADES.AbstractVulnerabilityOwner#getVulnerabilityOwner()
	 * @see #getAbstractVulnerabilityOwner()
	 * @generated
	 */
	EReference getAbstractVulnerabilityOwner_VulnerabilityOwner();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.VulnerabilityOwner <em>Vulnerability Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerability Owner</em>'.
	 * @see dsm.TRADES.VulnerabilityOwner
	 * @generated
	 */
	EClass getVulnerabilityOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.VulnerabilityOwner#getVulnerabilities <em>Vulnerabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vulnerabilities</em>'.
	 * @see dsm.TRADES.VulnerabilityOwner#getVulnerabilities()
	 * @see #getVulnerabilityOwner()
	 * @generated
	 */
	EReference getVulnerabilityOwner_Vulnerabilities();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Vulnerability <em>Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerability</em>'.
	 * @see dsm.TRADES.Vulnerability
	 * @generated
	 */
	EClass getVulnerability();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Vulnerability#getManifests <em>Manifests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manifests</em>'.
	 * @see dsm.TRADES.Vulnerability#getManifests()
	 * @see #getVulnerability()
	 * @generated
	 */
	EReference getVulnerability_Manifests();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Vulnerability#getVulnerabilityType <em>Vulnerability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vulnerability Type</em>'.
	 * @see dsm.TRADES.Vulnerability#getVulnerabilityType()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_VulnerabilityType();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Vulnerability#getAffects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affects</em>'.
	 * @see dsm.TRADES.Vulnerability#getAffects()
	 * @see #getVulnerability()
	 * @generated
	 */
	EReference getVulnerability_Affects();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AbstractComponentTypeOwner <em>Abstract Component Type Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Type Owner</em>'.
	 * @see dsm.TRADES.AbstractComponentTypeOwner
	 * @generated
	 */
	EClass getAbstractComponentTypeOwner();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.AbstractComponentTypeOwner#getComponentTypeOwner <em>Component Type Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Type Owner</em>'.
	 * @see dsm.TRADES.AbstractComponentTypeOwner#getComponentTypeOwner()
	 * @see #getAbstractComponentTypeOwner()
	 * @generated
	 */
	EReference getAbstractComponentTypeOwner_ComponentTypeOwner();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ComponentTypeOwner <em>Component Type Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type Owner</em>'.
	 * @see dsm.TRADES.ComponentTypeOwner
	 * @generated
	 */
	EClass getComponentTypeOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ComponentTypeOwner#getComponentTypes <em>Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Types</em>'.
	 * @see dsm.TRADES.ComponentTypeOwner#getComponentTypes()
	 * @see #getComponentTypeOwner()
	 * @generated
	 */
	EReference getComponentTypeOwner_ComponentTypes();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see dsm.TRADES.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.ComponentType#getManifests <em>Manifests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manifests</em>'.
	 * @see dsm.TRADES.ComponentType#getManifests()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Manifests();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.ComponentType#getSubjectToThreats <em>Subject To Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subject To Threats</em>'.
	 * @see dsm.TRADES.ComponentType#getSubjectToThreats()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_SubjectToThreats();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.ComponentType#getAffectedBy <em>Affected By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected By</em>'.
	 * @see dsm.TRADES.ComponentType#getAffectedBy()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_AffectedBy();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see dsm.TRADES.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AbstractRuleOwner <em>Abstract Rule Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Rule Owner</em>'.
	 * @see dsm.TRADES.AbstractRuleOwner
	 * @generated
	 */
	EClass getAbstractRuleOwner();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.AbstractRuleOwner#getRuleOwner <em>Rule Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Owner</em>'.
	 * @see dsm.TRADES.AbstractRuleOwner#getRuleOwner()
	 * @see #getAbstractRuleOwner()
	 * @generated
	 */
	EReference getAbstractRuleOwner_RuleOwner();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.RuleOwner <em>Rule Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Owner</em>'.
	 * @see dsm.TRADES.RuleOwner
	 * @generated
	 */
	EClass getRuleOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.RuleOwner#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see dsm.TRADES.RuleOwner#getRules()
	 * @see #getRuleOwner()
	 * @generated
	 */
	EReference getRuleOwner_Rules();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see dsm.TRADES.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Rule#getVulnerabilities <em>Vulnerabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vulnerabilities</em>'.
	 * @see dsm.TRADES.Rule#getVulnerabilities()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Vulnerabilities();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Rule#getComponentTypesAffected <em>Component Types Affected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Types Affected</em>'.
	 * @see dsm.TRADES.Rule#getComponentTypesAffected()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ComponentTypesAffected();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Rule#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see dsm.TRADES.Rule#getControls()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Controls();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see dsm.TRADES.Characteristic
	 * @generated
	 */
	EClass getCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Characteristic#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dsm.TRADES.Characteristic#getLabel()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Label();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Characteristic#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsm.TRADES.Characteristic#getValue()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Value();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.TRADES.Characteristic#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see dsm.TRADES.Characteristic#getOptions()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Options();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.CharacteristicOwner <em>Characteristic Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Owner</em>'.
	 * @see dsm.TRADES.CharacteristicOwner
	 * @generated
	 */
	EClass getCharacteristicOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.CharacteristicOwner#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristics</em>'.
	 * @see dsm.TRADES.CharacteristicOwner#getCharacteristics()
	 * @see #getCharacteristicOwner()
	 * @generated
	 */
	EReference getCharacteristicOwner_Characteristics();

	/**
	 * Returns the meta object for enum '{@link dsm.TRADES.AssessmentENUM <em>Assessment ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assessment ENUM</em>'.
	 * @see dsm.TRADES.AssessmentENUM
	 * @generated
	 */
	EEnum getAssessmentENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.TRADES.AffectedENUM <em>Affected ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Affected ENUM</em>'.
	 * @see dsm.TRADES.AffectedENUM
	 * @generated
	 */
	EEnum getAffectedENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.TRADES.threatTypeENUM <em>threat Type ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>threat Type ENUM</em>'.
	 * @see dsm.TRADES.threatTypeENUM
	 * @generated
	 */
	EEnum getthreatTypeENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.TRADES.ControlStatusENUM <em>Control Status ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Status ENUM</em>'.
	 * @see dsm.TRADES.ControlStatusENUM
	 * @generated
	 */
	EEnum getControlStatusENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.TRADES.ComponentCategoryENUM <em>Component Category ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Category ENUM</em>'.
	 * @see dsm.TRADES.ComponentCategoryENUM
	 * @generated
	 */
	EEnum getComponentCategoryENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.TRADES.SecurityObjectiveENUM <em>Security Objective ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Objective ENUM</em>'.
	 * @see dsm.TRADES.SecurityObjectiveENUM
	 * @generated
	 */
	EEnum getSecurityObjectiveENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.TRADES.VulnerabilityTypeENUM <em>Vulnerability Type ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vulnerability Type ENUM</em>'.
	 * @see dsm.TRADES.VulnerabilityTypeENUM
	 * @generated
	 */
	EEnum getVulnerabilityTypeENUM();

	/**
	 * Returns the meta object for data type '{@link dsm.TRADES.RGBColor <em>RGB Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RGB Color</em>'.
	 * @see dsm.TRADES.RGBColor
	 * @model instanceClass="dsm.TRADES.RGBColor"
	 * @generated
	 */
	EDataType getRGBColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TRADESFactory getTRADESFactory();

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
		 * The meta object literal for the '{@link dsm.TRADES.impl.AnalysisImpl <em>Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AnalysisImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAnalysis()
		 * @generated
		 */
		EClass ANALYSIS = eINSTANCE.getAnalysis();

		/**
		 * The meta object literal for the '<em><b>Score System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__SCORE_SYSTEM = eINSTANCE.getAnalysis_ScoreSystem();

		/**
		 * The meta object literal for the '<em><b>Link Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__LINK_TYPES = eINSTANCE.getAnalysis_LinkTypes();

		/**
		 * The meta object literal for the '<em><b>NVDAPI Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__NVDAPI_KEY = eINSTANCE.getAnalysis_NVDAPIKey();

		/**
		 * The meta object literal for the '<em><b>Property Vulnerability Mitigation Rules Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__PROPERTY_VULNERABILITY_MITIGATION_RULES_AVAILABLE = eINSTANCE
				.getAnalysis_Property_VulnerabilityMitigationRulesAvailable();

		/**
		 * The meta object literal for the '<em><b>Property Weakness Mitigation Rules Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__PROPERTY_WEAKNESS_MITIGATION_RULES_AVAILABLE = eINSTANCE
				.getAnalysis_Property_WeaknessMitigationRulesAvailable();

		/**
		 * The meta object literal for the '<em><b>Property Design Addresses Vulnerabilities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__PROPERTY_DESIGN_ADDRESSES_VULNERABILITIES = eINSTANCE
				.getAnalysis_Property_DesignAddressesVulnerabilities();

		/**
		 * The meta object literal for the '<em><b>Property Design Addresses Weaknesses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__PROPERTY_DESIGN_ADDRESSES_WEAKNESSES = eINSTANCE
				.getAnalysis_Property_DesignAddressesWeaknesses();

		/**
		 * The meta object literal for the '<em><b>Vulnerabilities Uncovered By Rule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__VULNERABILITIES_UNCOVERED_BY_RULE = eINSTANCE.getAnalysis_VulnerabilitiesUncoveredByRule();

		/**
		 * The meta object literal for the '<em><b>Weaknesses Uncovered By Rule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__WEAKNESSES_UNCOVERED_BY_RULE = eINSTANCE.getAnalysis_WeaknessesUncoveredByRule();

		/**
		 * The meta object literal for the '<em><b>Vulnerable Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__VULNERABLE_COMPONENTS = eINSTANCE.getAnalysis_VulnerableComponents();

		/**
		 * The meta object literal for the '<em><b>Get External Threats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___GET_EXTERNAL_THREATS__STRING_STRING = eINSTANCE
				.getAnalysis__GetExternalThreats__String_String();

		/**
		 * The meta object literal for the '<em><b>Direct Rule Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___DIRECT_RULE_EXISTS__VULNERABILITY_COMPONENTTYPE = eINSTANCE
				.getAnalysis__DirectRuleExists__Vulnerability_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Proxy Rule Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___PROXY_RULE_EXISTS__VULNERABILITY_COMPONENTTYPE = eINSTANCE
				.getAnalysis__ProxyRuleExists__Vulnerability_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Rule Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___RULE_EXISTS__VULNERABILITY_COMPONENTTYPE = eINSTANCE
				.getAnalysis__RuleExists__Vulnerability_ComponentType();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ThreatImpl <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ThreatImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '<em><b>Threat Allocations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__THREAT_ALLOCATIONS = eINSTANCE.getThreat_ThreatAllocations();

		/**
		 * The meta object literal for the '<em><b>Threat Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__THREAT_TYPE = eINSTANCE.getThreat_ThreatType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__DESCRIPTION = eINSTANCE.getThreat_Description();

		/**
		 * The meta object literal for the '<em><b>Applicability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__APPLICABILITY = eINSTANCE.getThreat_Applicability();

		/**
		 * The meta object literal for the '<em><b>Exploits Vulnerability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__EXPLOITS_VULNERABILITY = eINSTANCE.getThreat_ExploitsVulnerability();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__REFINES = eINSTANCE.getThreat_Refines();

		/**
		 * The meta object literal for the '<em><b>Check Is Used</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAT___CHECK_IS_USED__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getThreat__CheckIsUsed__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ComponentImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Threat Allocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__THREAT_ALLOCATIONS = eINSTANCE.getComponent_ThreatAllocations();

		/**
		 * The meta object literal for the '<em><b>Affect Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__AFFECT_RELATIONS = eINSTANCE.getComponent_AffectRelations();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__LINKS = eINSTANCE.getComponent_Links();

		/**
		 * The meta object literal for the '<em><b>Component Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_TYPES = eINSTANCE.getComponent_ComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__RULES = eINSTANCE.getComponent_Rules();

		/**
		 * The meta object literal for the '<em><b>Assigned Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ASSIGNED_CONTROLS = eINSTANCE.getComponent_AssignedControls();

		/**
		 * The meta object literal for the '<em><b>Vulnerable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__VULNERABLE = eINSTANCE.getComponent_Vulnerable();

		/**
		 * The meta object literal for the '<em><b>CVA</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CVA = eINSTANCE.getComponent_CVA();

		/**
		 * The meta object literal for the '<em><b>CWA</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CWA = eINSTANCE.getComponent_CWA();

		/**
		 * The meta object literal for the '<em><b>Associated Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ASSOCIATED_CONTROLS = eINSTANCE.getComponent_AssociatedControls();

		/**
		 * The meta object literal for the '<em><b>Unmitigated Vulnerabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__UNMITIGATED_VULNERABILITIES = eINSTANCE.getComponent_UnmitigatedVulnerabilities();

		/**
		 * The meta object literal for the '<em><b>Unmitigated Weaknesses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__UNMITIGATED_WEAKNESSES = eINSTANCE.getComponent_UnmitigatedWeaknesses();

		/**
		 * The meta object literal for the '<em><b>Of Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___OF_TYPE__COMPONENTTYPE = eINSTANCE.getComponent__OfType__ComponentType();

		/**
		 * The meta object literal for the '<em><b>Mitigated V</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___MITIGATED_V__VULNERABILITY = eINSTANCE.getComponent__MitigatedV__Vulnerability();

		/**
		 * The meta object literal for the '<em><b>Mitigated W</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___MITIGATED_W__VULNERABILITY = eINSTANCE.getComponent__MitigatedW__Vulnerability();

		/**
		 * The meta object literal for the '<em><b>Mitigated By W</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___MITIGATED_BY_W__VULNERABILITY = eINSTANCE.getComponent__MitigatedByW__Vulnerability();

		/**
		 * The meta object literal for the '<em><b>Mitigated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___MITIGATED__VULNERABILITY = eINSTANCE.getComponent__Mitigated__Vulnerability();

		/**
		 * The meta object literal for the '<em><b>Vulnerable W</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___VULNERABLE_W = eINSTANCE.getComponent__VulnerableW();

		/**
		 * The meta object literal for the '<em><b>Vulnerable V</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___VULNERABLE_V = eINSTANCE.getComponent__VulnerableV();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ControlImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Mitigated Threats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__MITIGATED_THREATS = eINSTANCE.getControl_MitigatedThreats();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__DESCRIPTION = eINSTANCE.getControl_Description();

		/**
		 * The meta object literal for the '<em><b>Description With Placeholders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__DESCRIPTION_WITH_PLACEHOLDERS = eINSTANCE.getControl_DescriptionWithPlaceholders();

		/**
		 * The meta object literal for the '<em><b>Mitigation Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__MITIGATION_RELATIONS = eINSTANCE.getControl_MitigationRelations();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__STATUS = eINSTANCE.getControl_Status();

		/**
		 * The meta object literal for the '<em><b>Mitigates Vulnerability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__MITIGATES_VULNERABILITY = eINSTANCE.getControl_MitigatesVulnerability();

		/**
		 * The meta object literal for the '<em><b>Security Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__SECURITY_OBJECTIVE = eINSTANCE.getControl_SecurityObjective();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ThreatAllocationRelationImpl <em>Threat Allocation Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ThreatAllocationRelationImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreatAllocationRelation()
		 * @generated
		 */
		EClass THREAT_ALLOCATION_RELATION = eINSTANCE.getThreatAllocationRelation();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_ALLOCATION_RELATION__ASSESSMENT = eINSTANCE.getThreatAllocationRelation_Assessment();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__COMPONENT = eINSTANCE.getThreatAllocationRelation_Component();

		/**
		 * The meta object literal for the '<em><b>Threat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__THREAT = eINSTANCE.getThreatAllocationRelation_Threat();

		/**
		 * The meta object literal for the '<em><b>Impact Score</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__IMPACT_SCORE = eINSTANCE.getThreatAllocationRelation_ImpactScore();

		/**
		 * The meta object literal for the '<em><b>Difficulty Score</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__DIFFICULTY_SCORE = eINSTANCE
				.getThreatAllocationRelation_DifficultyScore();

		/**
		 * The meta object literal for the '<em><b>Attack Chain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__ATTACK_CHAIN = eINSTANCE.getThreatAllocationRelation_AttackChain();

		/**
		 * The meta object literal for the '<em><b>Mitigated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_ALLOCATION_RELATION__MITIGATED = eINSTANCE.getThreatAllocationRelation_Mitigated();

		/**
		 * The meta object literal for the '<em><b>Check Computed Difficulty Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAT_ALLOCATION_RELATION___CHECK_COMPUTED_DIFFICULTY_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getThreatAllocationRelation__CheckComputedDifficultyConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Mitigated AV</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAT_ALLOCATION_RELATION___MITIGATED_AV = eINSTANCE.getThreatAllocationRelation__MitigatedAV();

		/**
		 * The meta object literal for the '<em><b>Mitigated AW</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAT_ALLOCATION_RELATION___MITIGATED_AW = eINSTANCE.getThreatAllocationRelation__MitigatedAW();

		/**
		 * The meta object literal for the '<em><b>Mitigated VSteps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAT_ALLOCATION_RELATION___MITIGATED_VSTEPS = eINSTANCE
				.getThreatAllocationRelation__MitigatedVSteps();

		/**
		 * The meta object literal for the '<em><b>Mitigated WSteps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAT_ALLOCATION_RELATION___MITIGATED_WSTEPS = eINSTANCE
				.getThreatAllocationRelation__MitigatedWSteps();

		/**
		 * The meta object literal for the '<em><b>Mitigated V</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAT_ALLOCATION_RELATION___MITIGATED_V = eINSTANCE.getThreatAllocationRelation__MitigatedV();

		/**
		 * The meta object literal for the '<em><b>Mitigated W</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAT_ALLOCATION_RELATION___MITIGATED_W = eINSTANCE.getThreatAllocationRelation__MitigatedW();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ThreatMitigationRelationImpl <em>Threat Mitigation Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ThreatMitigationRelationImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreatMitigationRelation()
		 * @generated
		 */
		EClass THREAT_MITIGATION_RELATION = eINSTANCE.getThreatMitigationRelation();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_MITIGATION_RELATION__ASSESSMENT = eINSTANCE.getThreatMitigationRelation_Assessment();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MITIGATION_RELATION__CONTROL = eINSTANCE.getThreatMitigationRelation_Control();

		/**
		 * The meta object literal for the '<em><b>Threat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MITIGATION_RELATION__THREAT = eINSTANCE.getThreatMitigationRelation_Threat();

		/**
		 * The meta object literal for the '<em><b>Mitigated Allocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MITIGATION_RELATION__MITIGATED_ALLOCATION = eINSTANCE
				.getThreatMitigationRelation_MitigatedAllocation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_MITIGATION_RELATION__DESCRIPTION = eINSTANCE.getThreatMitigationRelation_Description();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.DataImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AffectRelationImpl <em>Affect Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AffectRelationImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAffectRelation()
		 * @generated
		 */
		EClass AFFECT_RELATION = eINSTANCE.getAffectRelation();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECT_RELATION__DATA = eINSTANCE.getAffectRelation_Data();

		/**
		 * The meta object literal for the '<em><b>Source Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECT_RELATION__SOURCE_COMPONENT = eINSTANCE.getAffectRelation_SourceComponent();

		/**
		 * The meta object literal for the '<em><b>Target Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECT_RELATION__TARGET_COMPONENT = eINSTANCE.getAffectRelation_TargetComponent();

		/**
		 * The meta object literal for the '<em><b>Analysis Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECT_RELATION__ANALYSIS_STATUS = eINSTANCE.getAffectRelation_AnalysisStatus();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECT_RELATION__LINK = eINSTANCE.getAffectRelation_Link();

		/**
		 * The meta object literal for the '<em><b>Check Data Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AFFECT_RELATION___CHECK_DATA_SCOPE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAffectRelation__CheckDataScope__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AttackChainImpl <em>Attack Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AttackChainImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAttackChain()
		 * @generated
		 */
		EClass ATTACK_CHAIN = eINSTANCE.getAttackChain();

		/**
		 * The meta object literal for the '<em><b>Attack Chain Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN__ATTACK_CHAIN_STEPS = eINSTANCE.getAttackChain_AttackChainSteps();

		/**
		 * The meta object literal for the '<em><b>Computed Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK_CHAIN__COMPUTED_DIFFICULTY = eINSTANCE.getAttackChain_ComputedDifficulty();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AttackChainStepImpl <em>Attack Chain Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AttackChainStepImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAttackChainStep()
		 * @generated
		 */
		EClass ATTACK_CHAIN_STEP = eINSTANCE.getAttackChainStep();

		/**
		 * The meta object literal for the '<em><b>Step Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK_CHAIN_STEP__STEP_NUM = eINSTANCE.getAttackChainStep_StepNum();

		/**
		 * The meta object literal for the '<em><b>Threat Allocation Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION = eINSTANCE
				.getAttackChainStep_ThreatAllocationRelation();

		/**
		 * The meta object literal for the '<em><b>Impact Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION = eINSTANCE.getAttackChainStep_ImpactDescription();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN_STEP__NEXT = eINSTANCE.getAttackChainStep_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN_STEP__PREVIOUS = eINSTANCE.getAttackChainStep_Previous();

		/**
		 * The meta object literal for the '<em><b>Get Threat Allocation Relation Candidates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTACK_CHAIN_STEP___GET_THREAT_ALLOCATION_RELATION_CANDIDATES = eINSTANCE
				.getAttackChainStep__GetThreatAllocationRelationCandidates();

		/**
		 * The meta object literal for the '<em><b>Check Allocation Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTACK_CHAIN_STEP___CHECK_ALLOCATION_VALUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAttackChainStep__CheckAllocationValue__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ScoreSystemImpl <em>Score System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ScoreSystemImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getScoreSystem()
		 * @generated
		 */
		EClass SCORE_SYSTEM = eINSTANCE.getScoreSystem();

		/**
		 * The meta object literal for the '<em><b>Impact Scores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE_SYSTEM__IMPACT_SCORES = eINSTANCE.getScoreSystem_ImpactScores();

		/**
		 * The meta object literal for the '<em><b>Difficulty Scores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE_SYSTEM__DIFFICULTY_SCORES = eINSTANCE.getScoreSystem_DifficultyScores();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ImpactScoreImpl <em>Impact Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ImpactScoreImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getImpactScore()
		 * @generated
		 */
		EClass IMPACT_SCORE = eINSTANCE.getImpactScore();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPACT_SCORE__IMPACT = eINSTANCE.getImpactScore_Impact();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACT_SCORE__CONFIGURATIONS = eINSTANCE.getImpactScore_Configurations();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.DifficultyScoreImpl <em>Difficulty Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.DifficultyScoreImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getDifficultyScore()
		 * @generated
		 */
		EClass DIFFICULTY_SCORE = eINSTANCE.getDifficultyScore();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFICULTY_SCORE__DIFFICULTY = eINSTANCE.getDifficultyScore_Difficulty();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.DataOwnerElementImpl <em>Data Owner Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.DataOwnerElementImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getDataOwnerElement()
		 * @generated
		 */
		EClass DATA_OWNER_ELEMENT = eINSTANCE.getDataOwnerElement();

		/**
		 * The meta object literal for the '<em><b>Data Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OWNER_ELEMENT__DATA_OWNER = eINSTANCE.getDataOwnerElement_DataOwner();

		/**
		 * The meta object literal for the '<em><b>Get Datas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OWNER_ELEMENT___GET_DATAS = eINSTANCE.getDataOwnerElement__GetDatas();

		/**
		 * The meta object literal for the '<em><b>Get Inherited Datas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OWNER_ELEMENT___GET_INHERITED_DATAS = eINSTANCE.getDataOwnerElement__GetInheritedDatas();

		/**
		 * The meta object literal for the '<em><b>Get All Datas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OWNER_ELEMENT___GET_ALL_DATAS = eINSTANCE.getDataOwnerElement__GetAllDatas();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AbstractComponentOwnerImpl <em>Abstract Component Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AbstractComponentOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractComponentOwner()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT_OWNER = eINSTANCE.getAbstractComponentOwner();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_OWNER__COMPONENTS = eINSTANCE.getAbstractComponentOwner_Components();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.NamedElementImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ExternalThreatImpl <em>External Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ExternalThreatImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getExternalThreat()
		 * @generated
		 */
		EClass EXTERNAL_THREAT = eINSTANCE.getExternalThreat();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ExternalElementImpl <em>External Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ExternalElementImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getExternalElement()
		 * @generated
		 */
		EClass EXTERNAL_ELEMENT = eINSTANCE.getExternalElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ELEMENT__SOURCE = eINSTANCE.getExternalElement_Source();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ELEMENT__LINK = eINSTANCE.getExternalElement_Link();

		/**
		 * The meta object literal for the '<em><b>Source ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ELEMENT__SOURCE_ID = eINSTANCE.getExternalElement_SourceID();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ImpactConfigurationImpl <em>Impact Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ImpactConfigurationImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getImpactConfiguration()
		 * @generated
		 */
		EClass IMPACT_CONFIGURATION = eINSTANCE.getImpactConfiguration();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACT_CONFIGURATION__DIFFICULTY = eINSTANCE.getImpactConfiguration_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACT_CONFIGURATION__IMPACT = eINSTANCE.getImpactConfiguration_Impact();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ExternalControlImpl <em>External Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ExternalControlImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getExternalControl()
		 * @generated
		 */
		EClass EXTERNAL_CONTROL = eINSTANCE.getExternalControl();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ThreatsOwnerImpl <em>Threats Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ThreatsOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreatsOwner()
		 * @generated
		 */
		EClass THREATS_OWNER = eINSTANCE.getThreatsOwner();

		/**
		 * The meta object literal for the '<em><b>Internals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREATS_OWNER__INTERNALS = eINSTANCE.getThreatsOwner_Internals();

		/**
		 * The meta object literal for the '<em><b>Externals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREATS_OWNER__EXTERNALS = eINSTANCE.getThreatsOwner_Externals();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ControlOwnerImpl <em>Control Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ControlOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getControlOwner()
		 * @generated
		 */
		EClass CONTROL_OWNER = eINSTANCE.getControlOwner();

		/**
		 * The meta object literal for the '<em><b>Internals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_OWNER__INTERNALS = eINSTANCE.getControlOwner_Internals();

		/**
		 * The meta object literal for the '<em><b>Externals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_OWNER__EXTERNALS = eINSTANCE.getControlOwner_Externals();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AbstractControlOwnerImpl <em>Abstract Control Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AbstractControlOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractControlOwner()
		 * @generated
		 */
		EClass ABSTRACT_CONTROL_OWNER = eINSTANCE.getAbstractControlOwner();

		/**
		 * The meta object literal for the '<em><b>Control Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTROL_OWNER__CONTROL_OWNER = eINSTANCE.getAbstractControlOwner_ControlOwner();

		/**
		 * The meta object literal for the '<em><b>Get All Controls</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROL_OWNER___GET_ALL_CONTROLS = eINSTANCE.getAbstractControlOwner__GetAllControls();

		/**
		 * The meta object literal for the '<em><b>Get External Controls</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROL_OWNER___GET_EXTERNAL_CONTROLS__STRING_STRING = eINSTANCE
				.getAbstractControlOwner__GetExternalControls__String_String();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.DataOwnerImpl <em>Data Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.DataOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getDataOwner()
		 * @generated
		 */
		EClass DATA_OWNER = eINSTANCE.getDataOwner();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OWNER__DATA = eINSTANCE.getDataOwner_Data();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.LinkImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Link Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LINK_TYPE = eINSTANCE.getLink_LinkType();

		/**
		 * The meta object literal for the '<em><b>Link Conveyed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LINK_CONVEYED = eINSTANCE.getLink_LinkConveyed();

		/**
		 * The meta object literal for the '<em><b>Conveying Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__CONVEYING_LINK = eINSTANCE.getLink_ConveyingLink();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__COMPONENTS = eINSTANCE.getLink_Components();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.LinkTypeImpl <em>Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.LinkTypeImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getLinkType()
		 * @generated
		 */
		EClass LINK_TYPE = eINSTANCE.getLinkType();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.CatalogImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AbstractThreatOwnerImpl <em>Abstract Threat Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AbstractThreatOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractThreatOwner()
		 * @generated
		 */
		EClass ABSTRACT_THREAT_OWNER = eINSTANCE.getAbstractThreatOwner();

		/**
		 * The meta object literal for the '<em><b>Threat Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_THREAT_OWNER__THREAT_OWNER = eINSTANCE.getAbstractThreatOwner_ThreatOwner();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.IThreatDefinition <em>IThreat Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.IThreatDefinition
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getIThreatDefinition()
		 * @generated
		 */
		EClass ITHREAT_DEFINITION = eINSTANCE.getIThreatDefinition();

		/**
		 * The meta object literal for the '<em><b>Get Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITHREAT_DEFINITION___GET_ID = eINSTANCE.getIThreatDefinition__GetId();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITHREAT_DEFINITION___GET_DESCRIPTION = eINSTANCE.getIThreatDefinition__GetDescription();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITHREAT_DEFINITION___GET_NAME = eINSTANCE.getIThreatDefinition__GetName();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.IControlDefinition <em>IControl Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.IControlDefinition
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getIControlDefinition()
		 * @generated
		 */
		EClass ICONTROL_DEFINITION = eINSTANCE.getIControlDefinition();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICONTROL_DEFINITION___GET_DESCRIPTION = eINSTANCE.getIControlDefinition__GetDescription();

		/**
		 * The meta object literal for the '<em><b>Get Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICONTROL_DEFINITION___GET_ID = eINSTANCE.getIControlDefinition__GetId();

		/**
		 * The meta object literal for the '<em><b>Get Mitigated Threat Definitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICONTROL_DEFINITION___GET_MITIGATED_THREAT_DEFINITIONS = eINSTANCE
				.getIControlDefinition__GetMitigatedThreatDefinitions();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICONTROL_DEFINITION___GET_NAME = eINSTANCE.getIControlDefinition__GetName();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.ICatalogDefinition <em>ICatalog Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.ICatalogDefinition
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getICatalogDefinition()
		 * @generated
		 */
		EClass ICATALOG_DEFINITION = eINSTANCE.getICatalogDefinition();

		/**
		 * The meta object literal for the '<em><b>Get Threat By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICATALOG_DEFINITION___GET_THREAT_BY_ID__STRING = eINSTANCE
				.getICatalogDefinition__GetThreatById__String();

		/**
		 * The meta object literal for the '<em><b>Get Control By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICATALOG_DEFINITION___GET_CONTROL_BY_ID__STRING = eINSTANCE
				.getICatalogDefinition__GetControlById__String();

		/**
		 * The meta object literal for the '<em><b>Get Threat Definitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICATALOG_DEFINITION___GET_THREAT_DEFINITIONS = eINSTANCE
				.getICatalogDefinition__GetThreatDefinitions();

		/**
		 * The meta object literal for the '<em><b>Get Control Definitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICATALOG_DEFINITION___GET_CONTROL_DEFINITIONS = eINSTANCE
				.getICatalogDefinition__GetControlDefinitions();

		/**
		 * The meta object literal for the '<em><b>Get Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICATALOG_DEFINITION___GET_IDENTIFIER = eINSTANCE.getICatalogDefinition__GetIdentifier();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICATALOG_DEFINITION___GET_NAME = eINSTANCE.getICatalogDefinition__GetName();

		/**
		 * The meta object literal for the '<em><b>Get Rule By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICATALOG_DEFINITION___GET_RULE_BY_ID__STRING = eINSTANCE
				.getICatalogDefinition__GetRuleById__String();

		/**
		 * The meta object literal for the '<em><b>Get Vulnerability By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICATALOG_DEFINITION___GET_VULNERABILITY_BY_ID__STRING = eINSTANCE
				.getICatalogDefinition__GetVulnerabilityById__String();

		/**
		 * The meta object literal for the '<em><b>Get Component Type By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICATALOG_DEFINITION___GET_COMPONENT_TYPE_BY_ID__STRING = eINSTANCE
				.getICatalogDefinition__GetComponentTypeById__String();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.IMitigationLink <em>IMitigation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.IMitigationLink
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getIMitigationLink()
		 * @generated
		 */
		EClass IMITIGATION_LINK = eINSTANCE.getIMitigationLink();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMITIGATION_LINK___GET_DESCRIPTION = eINSTANCE.getIMitigationLink__GetDescription();

		/**
		 * The meta object literal for the '<em><b>Get Threat</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMITIGATION_LINK___GET_THREAT = eINSTANCE.getIMitigationLink__GetThreat();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ColoredElementImpl <em>Colored Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ColoredElementImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getColoredElement()
		 * @generated
		 */
		EClass COLORED_ELEMENT = eINSTANCE.getColoredElement();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLORED_ELEMENT__COLOR = eINSTANCE.getColoredElement_Color();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.IElementWithSource <em>IElement With Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.IElementWithSource
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getIElementWithSource()
		 * @generated
		 */
		EClass IELEMENT_WITH_SOURCE = eINSTANCE.getIElementWithSource();

		/**
		 * The meta object literal for the '<em><b>Get Source Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT_WITH_SOURCE___GET_SOURCE_NAME = eINSTANCE.getIElementWithSource__GetSourceName();

		/**
		 * The meta object literal for the '<em><b>Get Source Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT_WITH_SOURCE___GET_SOURCE_IDENTIFIER = eINSTANCE
				.getIElementWithSource__GetSourceIdentifier();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ElementWithIdImpl <em>Element With Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ElementWithIdImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getElementWithId()
		 * @generated
		 */
		EClass ELEMENT_WITH_ID = eINSTANCE.getElementWithId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_WITH_ID__ID = eINSTANCE.getElementWithId_Id();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.DomainAssetImpl <em>Domain Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.DomainAssetImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getDomainAsset()
		 * @generated
		 */
		EClass DOMAIN_ASSET = eINSTANCE.getDomainAsset();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ASSET__CATEGORY = eINSTANCE.getDomainAsset_Category();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AbstractVulnerabilityOwnerImpl <em>Abstract Vulnerability Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AbstractVulnerabilityOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractVulnerabilityOwner()
		 * @generated
		 */
		EClass ABSTRACT_VULNERABILITY_OWNER = eINSTANCE.getAbstractVulnerabilityOwner();

		/**
		 * The meta object literal for the '<em><b>Vulnerability Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VULNERABILITY_OWNER__VULNERABILITY_OWNER = eINSTANCE
				.getAbstractVulnerabilityOwner_VulnerabilityOwner();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.VulnerabilityOwnerImpl <em>Vulnerability Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.VulnerabilityOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getVulnerabilityOwner()
		 * @generated
		 */
		EClass VULNERABILITY_OWNER = eINSTANCE.getVulnerabilityOwner();

		/**
		 * The meta object literal for the '<em><b>Vulnerabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VULNERABILITY_OWNER__VULNERABILITIES = eINSTANCE.getVulnerabilityOwner_Vulnerabilities();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.VulnerabilityImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getVulnerability()
		 * @generated
		 */
		EClass VULNERABILITY = eINSTANCE.getVulnerability();

		/**
		 * The meta object literal for the '<em><b>Manifests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VULNERABILITY__MANIFESTS = eINSTANCE.getVulnerability_Manifests();

		/**
		 * The meta object literal for the '<em><b>Vulnerability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__VULNERABILITY_TYPE = eINSTANCE.getVulnerability_VulnerabilityType();

		/**
		 * The meta object literal for the '<em><b>Affects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VULNERABILITY__AFFECTS = eINSTANCE.getVulnerability_Affects();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AbstractComponentTypeOwnerImpl <em>Abstract Component Type Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AbstractComponentTypeOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractComponentTypeOwner()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT_TYPE_OWNER = eINSTANCE.getAbstractComponentTypeOwner();

		/**
		 * The meta object literal for the '<em><b>Component Type Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER = eINSTANCE
				.getAbstractComponentTypeOwner_ComponentTypeOwner();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ComponentTypeOwnerImpl <em>Component Type Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ComponentTypeOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponentTypeOwner()
		 * @generated
		 */
		EClass COMPONENT_TYPE_OWNER = eINSTANCE.getComponentTypeOwner();

		/**
		 * The meta object literal for the '<em><b>Component Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE_OWNER__COMPONENT_TYPES = eINSTANCE.getComponentTypeOwner_ComponentTypes();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ComponentTypeImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Manifests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__MANIFESTS = eINSTANCE.getComponentType_Manifests();

		/**
		 * The meta object literal for the '<em><b>Subject To Threats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__SUBJECT_TO_THREATS = eINSTANCE.getComponentType_SubjectToThreats();

		/**
		 * The meta object literal for the '<em><b>Affected By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__AFFECTED_BY = eINSTANCE.getComponentType_AffectedBy();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AssetImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AbstractRuleOwnerImpl <em>Abstract Rule Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AbstractRuleOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractRuleOwner()
		 * @generated
		 */
		EClass ABSTRACT_RULE_OWNER = eINSTANCE.getAbstractRuleOwner();

		/**
		 * The meta object literal for the '<em><b>Rule Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RULE_OWNER__RULE_OWNER = eINSTANCE.getAbstractRuleOwner_RuleOwner();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.RuleOwnerImpl <em>Rule Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.RuleOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getRuleOwner()
		 * @generated
		 */
		EClass RULE_OWNER = eINSTANCE.getRuleOwner();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_OWNER__RULES = eINSTANCE.getRuleOwner_Rules();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.RuleImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Vulnerabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__VULNERABILITIES = eINSTANCE.getRule_Vulnerabilities();

		/**
		 * The meta object literal for the '<em><b>Component Types Affected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__COMPONENT_TYPES_AFFECTED = eINSTANCE.getRule_ComponentTypesAffected();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONTROLS = eINSTANCE.getRule_Controls();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.CharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.CharacteristicImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getCharacteristic()
		 * @generated
		 */
		EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__LABEL = eINSTANCE.getCharacteristic_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__VALUE = eINSTANCE.getCharacteristic_Value();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__OPTIONS = eINSTANCE.getCharacteristic_Options();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.CharacteristicOwnerImpl <em>Characteristic Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.CharacteristicOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getCharacteristicOwner()
		 * @generated
		 */
		EClass CHARACTERISTIC_OWNER = eINSTANCE.getCharacteristicOwner();

		/**
		 * The meta object literal for the '<em><b>Characteristics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_OWNER__CHARACTERISTICS = eINSTANCE.getCharacteristicOwner_Characteristics();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.AssessmentENUM <em>Assessment ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.AssessmentENUM
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAssessmentENUM()
		 * @generated
		 */
		EEnum ASSESSMENT_ENUM = eINSTANCE.getAssessmentENUM();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.AffectedENUM <em>Affected ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.AffectedENUM
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAffectedENUM()
		 * @generated
		 */
		EEnum AFFECTED_ENUM = eINSTANCE.getAffectedENUM();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.threatTypeENUM <em>threat Type ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.threatTypeENUM
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getthreatTypeENUM()
		 * @generated
		 */
		EEnum THREAT_TYPE_ENUM = eINSTANCE.getthreatTypeENUM();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.ControlStatusENUM <em>Control Status ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.ControlStatusENUM
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getControlStatusENUM()
		 * @generated
		 */
		EEnum CONTROL_STATUS_ENUM = eINSTANCE.getControlStatusENUM();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.ComponentCategoryENUM <em>Component Category ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.ComponentCategoryENUM
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponentCategoryENUM()
		 * @generated
		 */
		EEnum COMPONENT_CATEGORY_ENUM = eINSTANCE.getComponentCategoryENUM();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.SecurityObjectiveENUM <em>Security Objective ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.SecurityObjectiveENUM
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getSecurityObjectiveENUM()
		 * @generated
		 */
		EEnum SECURITY_OBJECTIVE_ENUM = eINSTANCE.getSecurityObjectiveENUM();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.VulnerabilityTypeENUM <em>Vulnerability Type ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.VulnerabilityTypeENUM
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getVulnerabilityTypeENUM()
		 * @generated
		 */
		EEnum VULNERABILITY_TYPE_ENUM = eINSTANCE.getVulnerabilityTypeENUM();

		/**
		 * The meta object literal for the '<em>RGB Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.RGBColor
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getRGBColor()
		 * @generated
		 */
		EDataType RGB_COLOR = eINSTANCE.getRGBColor();

	}

} //TRADESPackage
