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
 *   <li>{@link dsm.TRADES.Analysis#isP1a <em>P1a</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#isP1b <em>P1b</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#isP5a <em>P5a</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#isP5b <em>P5b</em>}</li>
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
	 * Returns the value of the '<em><b>P1a</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P1a</em>' attribute.
	 * @see #setP1a(boolean)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_P1a()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isP1a();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#isP1a <em>P1a</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P1a</em>' attribute.
	 * @see #isP1a()
	 * @generated
	 */
	void setP1a(boolean value);

	/**
	 * Returns the value of the '<em><b>P1b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P1b</em>' attribute.
	 * @see #setP1b(boolean)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_P1b()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isP1b();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#isP1b <em>P1b</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P1b</em>' attribute.
	 * @see #isP1b()
	 * @generated
	 */
	void setP1b(boolean value);

	/**
	 * Returns the value of the '<em><b>P5a</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P5a</em>' attribute.
	 * @see #setP5a(boolean)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_P5a()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isP5a();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#isP5a <em>P5a</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P5a</em>' attribute.
	 * @see #isP5a()
	 * @generated
	 */
	void setP5a(boolean value);

	/**
	 * Returns the value of the '<em><b>P5b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P5b</em>' attribute.
	 * @see #setP5b(boolean)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_P5b()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isP5b();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#isP5b <em>P5b</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P5b</em>' attribute.
	 * @see #isP5b()
	 * @generated
	 */
	void setP5b(boolean value);

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
