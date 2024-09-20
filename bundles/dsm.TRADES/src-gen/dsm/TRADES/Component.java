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
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Component#getThreatAllocations <em>Threat Allocations</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getAffectRelations <em>Affect Relations</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getComponentTypes <em>Component Types</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getRules <em>Rules</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getAssignedControls <em>Assigned Controls</em>}</li>
 *   <li>{@link dsm.TRADES.Component#isVulnerable <em>Vulnerable</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getCVA <em>CVA</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getCWA <em>CWA</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getAssociatedControls <em>Associated Controls</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getUnmitigatedVulnerabilities <em>Unmitigated Vulnerabilities</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getUnmitigatedWeaknesses <em>Unmitigated Weaknesses</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getComponent()
 * @model
 * @generated
 */
public interface Component
		extends AbstractComponentOwner, DataOwnerElement, NamedElement, AbstractControlOwner, DomainAsset {
	/**
	 * Returns the value of the '<em><b>Threat Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ThreatAllocationRelation}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.ThreatAllocationRelation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat Allocations</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_ThreatAllocations()
	 * @see dsm.TRADES.ThreatAllocationRelation#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<ThreatAllocationRelation> getThreatAllocations();

	/**
	 * Returns the value of the '<em><b>Affect Relations</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.AffectRelation}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.AffectRelation#getSourceComponent <em>Source Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affect Relations</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_AffectRelations()
	 * @see dsm.TRADES.AffectRelation#getSourceComponent
	 * @model opposite="sourceComponent" containment="true"
	 * @generated
	 */
	EList<AffectRelation> getAffectRelations();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Component Types</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Types</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_ComponentTypes()
	 * @model required="true"
	 * @generated
	 */
	EList<ComponentType> getComponentTypes();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_Rules()
	 * @model derived="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Assigned Controls</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Controls</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_AssignedControls()
	 * @model
	 * @generated
	 */
	EList<Control> getAssignedControls();

	/**
	 * Returns the value of the '<em><b>Vulnerable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerable</em>' attribute.
	 * @see #setVulnerable(boolean)
	 * @see dsm.TRADES.TRADESPackage#getComponent_Vulnerable()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isVulnerable();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Component#isVulnerable <em>Vulnerable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vulnerable</em>' attribute.
	 * @see #isVulnerable()
	 * @generated
	 */
	void setVulnerable(boolean value);

	/**
	 * Returns the value of the '<em><b>CVA</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CVA</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_CVA()
	 * @model derived="true"
	 * @generated
	 */
	EList<Vulnerability> getCVA();

	/**
	 * Returns the value of the '<em><b>CWA</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CWA</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_CWA()
	 * @model derived="true"
	 * @generated
	 */
	EList<Vulnerability> getCWA();

	/**
	 * Returns the value of the '<em><b>Associated Controls</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Controls</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_AssociatedControls()
	 * @model derived="true"
	 * @generated
	 */
	EList<Control> getAssociatedControls();

	/**
	 * Returns the value of the '<em><b>Unmitigated Vulnerabilities</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmitigated Vulnerabilities</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_UnmitigatedVulnerabilities()
	 * @model derived="true"
	 * @generated
	 */
	EList<Vulnerability> getUnmitigatedVulnerabilities();

	/**
	 * Returns the value of the '<em><b>Unmitigated Weaknesses</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmitigated Weaknesses</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_UnmitigatedWeaknesses()
	 * @model derived="true"
	 * @generated
	 */
	EList<Vulnerability> getUnmitigatedWeaknesses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean ofType(ComponentType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean mitigatedV(Vulnerability vulnerability);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean mitigatedW(Vulnerability weakness);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean mitigatedByW(Vulnerability vulnerability);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean mitigated(Vulnerability vulnerability);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean vulnerableW();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean vulnerableV();

} // Component
