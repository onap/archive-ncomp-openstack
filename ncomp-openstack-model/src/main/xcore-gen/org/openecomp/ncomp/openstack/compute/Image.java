
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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getUpdated <em>Updated</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getCreated <em>Created</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getUser_id <em>User id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getMinDisk <em>Min Disk</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getMinRam <em>Min Ram</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getOS_EXT_IMG_SIZE_size <em>OS EXT IMG SIZE size</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getServer <em>Server</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getLinks <em>Links</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Image#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage()
 * @model
 * @generated
 */
public interface Image extends EObject {
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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Image#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Image#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated</em>' attribute.
	 * @see #setUpdated(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_Updated()
	 * @model unique="false"
	 * @generated
	 */
	String getUpdated();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Image#getUpdated <em>Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated</em>' attribute.
	 * @see #getUpdated()
	 * @generated
	 */
	void setUpdated(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_Created()
	 * @model unique="false"
	 * @generated
	 */
	String getCreated();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Image#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(String value);

	/**
	 * Returns the value of the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant id</em>' attribute.
	 * @see #setTenant_id(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_Tenant_id()
	 * @model unique="false"
	 * @generated
	 */
	String getTenant_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Image#getTenant_id <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant id</em>' attribute.
	 * @see #getTenant_id()
	 * @generated
	 */
	void setTenant_id(String value);

	/**
	 * Returns the value of the '<em><b>User id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User id</em>' attribute.
	 * @see #setUser_id(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_User_id()
	 * @model unique="false"
	 * @generated
	 */
	String getUser_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Image#getUser_id <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User id</em>' attribute.
	 * @see #getUser_id()
	 * @generated
	 */
	void setUser_id(String value);

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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Image#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see #setProgress(Long)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_Progress()
	 * @model unique="false"
	 * @generated
	 */
	Long getProgress();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Image#getProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(Long value);

	/**
	 * Returns the value of the '<em><b>Min Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Disk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Disk</em>' attribute.
	 * @see #setMinDisk(Long)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_MinDisk()
	 * @model unique="false"
	 * @generated
	 */
	Long getMinDisk();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Image#getMinDisk <em>Min Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Disk</em>' attribute.
	 * @see #getMinDisk()
	 * @generated
	 */
	void setMinDisk(Long value);

	/**
	 * Returns the value of the '<em><b>Min Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Ram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Ram</em>' attribute.
	 * @see #setMinRam(Long)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_MinRam()
	 * @model unique="false"
	 * @generated
	 */
	Long getMinRam();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Image#getMinRam <em>Min Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Ram</em>' attribute.
	 * @see #getMinRam()
	 * @generated
	 */
	void setMinRam(Long value);

	/**
	 * Returns the value of the '<em><b>OS EXT IMG SIZE size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS EXT IMG SIZE size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS EXT IMG SIZE size</em>' attribute.
	 * @see #setOS_EXT_IMG_SIZE_size(Long)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_OS_EXT_IMG_SIZE_size()
	 * @model unique="false"
	 * @generated
	 */
	Long getOS_EXT_IMG_SIZE_size();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Image#getOS_EXT_IMG_SIZE_size <em>OS EXT IMG SIZE size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS EXT IMG SIZE size</em>' attribute.
	 * @see #getOS_EXT_IMG_SIZE_size()
	 * @generated
	 */
	void setOS_EXT_IMG_SIZE_size(Long value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference.
	 * @see #setServer(Reference)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_Server()
	 * @model containment="true"
	 * @generated
	 */
	Reference getServer();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Image#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' containment reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Reference value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getImage_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metadata> getMetadata();

} // Image
