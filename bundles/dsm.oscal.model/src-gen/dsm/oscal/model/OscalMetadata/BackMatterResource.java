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
package dsm.oscal.model.OscalMetadata;

import org.eclipse.emf.common.util.EList;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Back Matter Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>resource</h1>
 * <h2>Description</h2>
 * <p>A resource associated with content in the containing document. A resource may be directly included in the document base64 encoded or may point to one or more equivalent internet resources.</p><h2>Remarks</h2>
 * <p>A resource can be used in two ways. 1) it may point to an specific retrievable network resource using a <code>rlink</code>, or 2) it may be included as an attachment using a <code>base64</code>. A resource may contain multiple <code>rlink</code> and <code>base64</code> entries that represent alternative download locations (rlink) and attachments (base64) for the same resource. Both rlink and base64 allow for a <code>media-type</code> to be specified, which is used to distinguish between different representations of the same resource (e.g., Microsoft Word, PDF). When multiple <code>rlink</code> and <code>base64</code> items are included for a given resource, all items must contain equivalent information. This allows the document consumer to choose a preferred item to process based on a the selected item's <code>media-type</code>. This is extremely important when the items represent OSCAL content that is represented in alternate formats (i.e., XML, JSON, YAML), allowing the same OSCAL data to be processed from any of the available formats indicated by the items.</p>
 * <p>When a resource includes a citation, then the <code>title</code> and <code>citation</code> properties must both be included.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getBase64 <em>Base64</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getCitation <em>Citation</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getDocumentIds <em>Document Ids</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getRlinks <em>Rlinks</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getBackMatterResource()
 * @model
 * @generated
 */
public interface BackMatterResource extends OscalElement, UUIDElement, PropertyOwner, ElementWithRemarks {
	/**
	 * Returns the value of the '<em><b>Base64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base64</em>' containment reference.
	 * @see #setBase64(Base64)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getBackMatterResource_Base64()
	 * @model containment="true"
	 * @generated
	 */
	Base64 getBase64();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getBase64 <em>Base64</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base64</em>' containment reference.
	 * @see #getBase64()
	 * @generated
	 */
	void setBase64(Base64 value);

	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference.
	 * @see #setCitation(ResourceCitation)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getBackMatterResource_Citation()
	 * @model containment="true"
	 * @generated
	 */
	ResourceCitation getCitation();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getCitation <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' containment reference.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(ResourceCitation value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>description</h1>
	 * <h2>Description</h2>
	 * <p>A short summary of the resource used to indicate the purpose of the resource.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(MarkupMultiline)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getBackMatterResource_Description()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupMultilineType"
	 * @generated
	 */
	MarkupMultiline getDescription();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(MarkupMultiline value);

	/**
	 * Returns the value of the '<em><b>Document Ids</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.DocumentId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Ids</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getBackMatterResource_DocumentIds()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentId> getDocumentIds();

	/**
	 * Returns the value of the '<em><b>Rlinks</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.ResourceRlink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rlinks</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getBackMatterResource_Rlinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceRlink> getRlinks();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>title</h1>
	 * <h2>Description</h2>
	 * <p>A name given to the resource, which may be used by a tool for display and navigation.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(MarkupLine)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getBackMatterResource_Title()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType"
	 * @generated
	 */
	MarkupLine getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLine value);

} // BackMatterResource
