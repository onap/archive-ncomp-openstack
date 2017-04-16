
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment#getDevice <em>Device</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment#getServer_id <em>Server id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment#getVolume_id <em>Volume id</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolumeAttachment()
 * @model
 * @generated
 */
public interface VolumeAttachment extends EObject {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolumeAttachment_Device()
	 * @model unique="false"
	 * @generated
	 */
	String getDevice();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(String value);

	/**
	 * Returns the value of the '<em><b>Server id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server id</em>' attribute.
	 * @see #setServer_id(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolumeAttachment_Server_id()
	 * @model unique="false"
	 * @generated
	 */
	String getServer_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment#getServer_id <em>Server id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server id</em>' attribute.
	 * @see #getServer_id()
	 * @generated
	 */
	void setServer_id(String value);

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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolumeAttachment_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Volume id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume id</em>' attribute.
	 * @see #setVolume_id(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getVolumeAttachment_Volume_id()
	 * @model unique="false"
	 * @generated
	 */
	String getVolume_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment#getVolume_id <em>Volume id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume id</em>' attribute.
	 * @see #getVolume_id()
	 * @generated
	 */
	void setVolume_id(String value);

} // VolumeAttachment
