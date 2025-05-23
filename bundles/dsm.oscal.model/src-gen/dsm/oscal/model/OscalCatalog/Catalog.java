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
package dsm.oscal.model.OscalCatalog;

import org.eclipse.emf.common.util.EList;

import dsm.TRADES.ICatalogDefinition;
import dsm.oscal.model.OscalMetadata.BackMatter;
import dsm.oscal.model.OscalMetadata.ControlOwner;
import dsm.oscal.model.OscalMetadata.Metadata;
import dsm.oscal.model.OscalMetadata.OscalElement;
import dsm.oscal.model.OscalMetadata.ParameterOwner;
import dsm.oscal.model.OscalMetadata.UUIDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>catalog</h1>
 * <h2>Description</h2>
 * <p>A collection of controls.</p><h2>Remarks</h2>
 * <p>Catalogs may use one or more <code>group</code> objects to subdivide the control contents of a catalog.</p>
 * <p>An OSCAL catalog model provides a structured representation of control information.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Catalog#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Catalog#getGroups <em>Groups</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Catalog#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getCatalog()
 * @model
 * @generated
 */
public interface Catalog extends OscalElement, UUIDElement, ParameterOwner, ControlOwner, ICatalogDefinition {
	/**
	 * Returns the value of the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Matter</em>' containment reference.
	 * @see #setBackMatter(BackMatter)
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getCatalog_BackMatter()
	 * @model containment="true"
	 * @generated
	 */
	BackMatter getBackMatter();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalog.Catalog#getBackMatter <em>Back Matter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Matter</em>' containment reference.
	 * @see #getBackMatter()
	 * @generated
	 */
	void setBackMatter(BackMatter value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalCatalog.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getCatalog_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getCatalog_Metadata()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalog.Catalog#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

} // Catalog
