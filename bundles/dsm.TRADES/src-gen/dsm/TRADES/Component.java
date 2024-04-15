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
 *   <li>{@link dsm.TRADES.Component#getComponenttype <em>Componenttype</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getVulnerableasset <em>Vulnerableasset</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getAssignedControl <em>Assigned Control</em>}</li>
 *   <li>{@link dsm.TRADES.Component#isVulnerable <em>Vulnerable</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ComponentOwner, DataOwnerElement, NamedElement, AbstractControlOwner, DomainAsset {
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
	 * Returns the value of the '<em><b>Componenttype</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componenttype</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_Componenttype()
	 * @model required="true"
	 * @generated
	 */
	EList<ComponentType> getComponenttype();

	/**
	 * Returns the value of the '<em><b>Vulnerableasset</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.VulnerableAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerableasset</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_Vulnerableasset()
	 * @model derived="true"
	 * @generated
	 */
	EList<VulnerableAsset> getVulnerableasset();

	/**
	 * Returns the value of the '<em><b>Assigned Control</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Control</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_AssignedControl()
	 * @model
	 * @generated
	 */
	EList<Control> getAssignedControl();

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
