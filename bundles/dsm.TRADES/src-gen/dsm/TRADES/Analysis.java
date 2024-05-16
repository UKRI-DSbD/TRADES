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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Analysis#getScoreSystem <em>Score System</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getLinkTypes <em>Link Types</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getNVDAPIKey <em>NVDAPI Key</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#isProperty_VulnerabilityMitigationRulesAvailable <em>Property Vulnerability Mitigation Rules Available</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#isProperty_WeaknessMitigationRulesAvailable <em>Property Weakness Mitigation Rules Available</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#isProperty_DesignAddressesVulnerabilities <em>Property Design Addresses Vulnerabilities</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#isProperty_DesignAddressesWeaknesses <em>Property Design Addresses Weaknesses</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAnalysis()
 * @model
 * @generated
 */
public interface Analysis extends ComponentOwner, DataOwnerElement, NamedElement, AbstractControlOwner,
		AbstractThreatOwner, ElementWithId, AbstractVulnerabilityOwner, AbstractComponentTypeOwner, AbstractRuleOwner {
	/**
	 * Returns the value of the '<em><b>Score System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score System</em>' containment reference.
	 * @see #setScoreSystem(ScoreSystem)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_ScoreSystem()
	 * @model containment="true"
	 * @generated
	 */
	ScoreSystem getScoreSystem();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#getScoreSystem <em>Score System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score System</em>' containment reference.
	 * @see #getScoreSystem()
	 * @generated
	 */
	void setScoreSystem(ScoreSystem value);

	/**
	 * Returns the value of the '<em><b>Link Types</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Types</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_LinkTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkType> getLinkTypes();

	/**
	 * Returns the value of the '<em><b>NVDAPI Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NVDAPI Key</em>' attribute.
	 * @see #setNVDAPIKey(String)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_NVDAPIKey()
	 * @model
	 * @generated
	 */
	String getNVDAPIKey();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#getNVDAPIKey <em>NVDAPI Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NVDAPI Key</em>' attribute.
	 * @see #getNVDAPIKey()
	 * @generated
	 */
	void setNVDAPIKey(String value);

	/**
	 * Returns the value of the '<em><b>Property Vulnerability Mitigation Rules Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Vulnerability Mitigation Rules Available</em>' attribute.
	 * @see #setProperty_VulnerabilityMitigationRulesAvailable(boolean)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Property_VulnerabilityMitigationRulesAvailable()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isProperty_VulnerabilityMitigationRulesAvailable();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#isProperty_VulnerabilityMitigationRulesAvailable <em>Property Vulnerability Mitigation Rules Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Vulnerability Mitigation Rules Available</em>' attribute.
	 * @see #isProperty_VulnerabilityMitigationRulesAvailable()
	 * @generated
	 */
	void setProperty_VulnerabilityMitigationRulesAvailable(boolean value);

	/**
	 * Returns the value of the '<em><b>Property Weakness Mitigation Rules Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Weakness Mitigation Rules Available</em>' attribute.
	 * @see #setProperty_WeaknessMitigationRulesAvailable(boolean)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Property_WeaknessMitigationRulesAvailable()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isProperty_WeaknessMitigationRulesAvailable();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#isProperty_WeaknessMitigationRulesAvailable <em>Property Weakness Mitigation Rules Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Weakness Mitigation Rules Available</em>' attribute.
	 * @see #isProperty_WeaknessMitigationRulesAvailable()
	 * @generated
	 */
	void setProperty_WeaknessMitigationRulesAvailable(boolean value);

	/**
	 * Returns the value of the '<em><b>Property Design Addresses Vulnerabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Design Addresses Vulnerabilities</em>' attribute.
	 * @see #setProperty_DesignAddressesVulnerabilities(boolean)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Property_DesignAddressesVulnerabilities()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isProperty_DesignAddressesVulnerabilities();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#isProperty_DesignAddressesVulnerabilities <em>Property Design Addresses Vulnerabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Design Addresses Vulnerabilities</em>' attribute.
	 * @see #isProperty_DesignAddressesVulnerabilities()
	 * @generated
	 */
	void setProperty_DesignAddressesVulnerabilities(boolean value);

	/**
	 * Returns the value of the '<em><b>Property Design Addresses Weaknesses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Design Addresses Weaknesses</em>' attribute.
	 * @see #setProperty_DesignAddressesWeaknesses(boolean)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Property_DesignAddressesWeaknesses()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isProperty_DesignAddressesWeaknesses();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#isProperty_DesignAddressesWeaknesses <em>Property Design Addresses Weaknesses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Design Addresses Weaknesses</em>' attribute.
	 * @see #isProperty_DesignAddressesWeaknesses()
	 * @generated
	 */
	void setProperty_DesignAddressesWeaknesses(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<ExternalThreat> getExternalThreats(String id, String catalogIdentifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean directRuleExists(Vulnerability vulnerability, ComponentType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean proxyRuleExists(Vulnerability vulnerability, ComponentType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean ruleExists(Vulnerability vulnerability, ComponentType type);

} // Analysis
