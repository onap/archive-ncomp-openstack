
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
/**
 */
package org.openecomp.ncomp.openstack.compute;

import org.openecomp.ncomp.core.NamedEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Volume#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Volume#getDisplay_name <em>Display name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Volume#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Volume#getAvailability_zone <em>Availability zone</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Volume#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Volume#getVolume_type <em>Volume type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Volume#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Volume#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Volume#getSize <em>Size</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Volume#getSnapshot_id <em>Snapshot id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Volume#getDisplay_description <em>Display description</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolume_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Volume#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display name</em>' attribute.
	 * @see #setDisplay_name(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolume_Display_name()
	 * @model unique="false"
	 * @generated
	 */
	String getDisplay_name();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Volume#getDisplay_name <em>Display name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display name</em>' attribute.
	 * @see #getDisplay_name()
	 * @generated
	 */
	void setDisplay_name(String value);

	/**
	 * Returns the value of the '<em><b>Attachments</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.VolumeAttachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachments</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolume_Attachments()
	 * @model containment="true"
	 * @generated
	 */
	EList<VolumeAttachment> getAttachments();

	/**
	 * Returns the value of the '<em><b>Availability zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability zone</em>' attribute.
	 * @see #setAvailability_zone(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolume_Availability_zone()
	 * @model unique="false"
	 * @generated
	 */
	String getAvailability_zone();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Volume#getAvailability_zone <em>Availability zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability zone</em>' attribute.
	 * @see #getAvailability_zone()
	 * @generated
	 */
	void setAvailability_zone(String value);

	/**
	 * Returns the value of the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created at</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created at</em>' attribute.
	 * @see #setCreated_at(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolume_Created_at()
	 * @model unique="false"
	 * @generated
	 */
	String getCreated_at();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Volume#getCreated_at <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created at</em>' attribute.
	 * @see #getCreated_at()
	 * @generated
	 */
	void setCreated_at(String value);

	/**
	 * Returns the value of the '<em><b>Volume type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume type</em>' attribute.
	 * @see #setVolume_type(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolume_Volume_type()
	 * @model unique="false"
	 * @generated
	 */
	String getVolume_type();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Volume#getVolume_type <em>Volume type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume type</em>' attribute.
	 * @see #getVolume_type()
	 * @generated
	 */
	void setVolume_type(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.Metadata}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolume_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metadata> getMetadata();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolume_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Volume#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolume_Size()
	 * @model unique="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Volume#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Snapshot id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snapshot id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snapshot id</em>' attribute.
	 * @see #setSnapshot_id(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolume_Snapshot_id()
	 * @model unique="false"
	 * @generated
	 */
	String getSnapshot_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Volume#getSnapshot_id <em>Snapshot id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snapshot id</em>' attribute.
	 * @see #getSnapshot_id()
	 * @generated
	 */
	void setSnapshot_id(String value);

	/**
	 * Returns the value of the '<em><b>Display description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display description</em>' attribute.
	 * @see #setDisplay_description(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolume_Display_description()
	 * @model unique="false"
	 * @generated
	 */
	String getDisplay_description();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Volume#getDisplay_description <em>Display description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display description</em>' attribute.
	 * @see #getDisplay_description()
	 * @generated
	 */
	void setDisplay_description(String value);

} // Volume
