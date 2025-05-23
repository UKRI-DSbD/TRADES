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
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Control#getMitigatedThreats <em>Mitigated Threats</em>}</li>
 *   <li>{@link dsm.TRADES.Control#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.TRADES.Control#getDescriptionWithPlaceholders <em>Description With Placeholders</em>}</li>
 *   <li>{@link dsm.TRADES.Control#getMitigationRelations <em>Mitigation Relations</em>}</li>
 *   <li>{@link dsm.TRADES.Control#getStatus <em>Status</em>}</li>
 *   <li>{@link dsm.TRADES.Control#getMitigatesVulnerability <em>Mitigates Vulnerability</em>}</li>
 *   <li>{@link dsm.TRADES.Control#getSecurityObjective <em>Security Objective</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends NamedElement, IControlDefinition, ElementWithId, CharacteristicOwner {
	/**
	 * Returns the value of the '<em><b>Mitigated Threats</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigated Threats</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getControl_MitigatedThreats()
	 * @model
	 * @generated
	 */
	EList<Threat> getMitigatedThreats();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dsm.TRADES.TRADESPackage#getControl_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Control#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Description With Placeholders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description With Placeholders</em>' attribute.
	 * @see #setDescriptionWithPlaceholders(String)
	 * @see dsm.TRADES.TRADESPackage#getControl_DescriptionWithPlaceholders()
	 * @model
	 * @generated
	 */
	String getDescriptionWithPlaceholders();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Control#getDescriptionWithPlaceholders <em>Description With Placeholders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description With Placeholders</em>' attribute.
	 * @see #getDescriptionWithPlaceholders()
	 * @generated
	 */
	void setDescriptionWithPlaceholders(String value);

	/**
	 * Returns the value of the '<em><b>Mitigation Relations</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ThreatMitigationRelation}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.ThreatMitigationRelation#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigation Relations</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getControl_MitigationRelations()
	 * @see dsm.TRADES.ThreatMitigationRelation#getControl
	 * @model opposite="control" containment="true"
	 * @generated
	 */
	EList<ThreatMitigationRelation> getMitigationRelations();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link dsm.TRADES.ControlStatusENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see dsm.TRADES.ControlStatusENUM
	 * @see #setStatus(ControlStatusENUM)
	 * @see dsm.TRADES.TRADESPackage#getControl_Status()
	 * @model
	 * @generated
	 */
	ControlStatusENUM getStatus();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Control#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see dsm.TRADES.ControlStatusENUM
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ControlStatusENUM value);

	/**
	 * Returns the value of the '<em><b>Mitigates Vulnerability</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigates Vulnerability</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getControl_MitigatesVulnerability()
	 * @model
	 * @generated
	 */
	EList<Vulnerability> getMitigatesVulnerability();

	/**
	 * Returns the value of the '<em><b>Security Objective</b></em>' attribute.
	 * The default value is <code>"Undefined"</code>.
	 * The literals are from the enumeration {@link dsm.TRADES.SecurityObjectiveENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Objective</em>' attribute.
	 * @see dsm.TRADES.SecurityObjectiveENUM
	 * @see #setSecurityObjective(SecurityObjectiveENUM)
	 * @see dsm.TRADES.TRADESPackage#getControl_SecurityObjective()
	 * @model default="Undefined"
	 * @generated
	 */
	SecurityObjectiveENUM getSecurityObjective();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Control#getSecurityObjective <em>Security Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Objective</em>' attribute.
	 * @see dsm.TRADES.SecurityObjectiveENUM
	 * @see #getSecurityObjective()
	 * @generated
	 */
	void setSecurityObjective(SecurityObjectiveENUM value);

} // Control
