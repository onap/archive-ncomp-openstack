
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
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getUser_id <em>User id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getUpdated <em>Updated</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getCreated <em>Created</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getHostId <em>Host Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getAccessIPv4 <em>Access IPv4</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getAccessIPv6 <em>Access IPv6</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getConfig_drive <em>Config drive</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getKey_name <em>Key name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getOS_DCF_diskConfig <em>OS DCF disk Config</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_STS_power_state <em>OS EXT STS power state</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_STS_vm_state <em>OS EXT STS vm state</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_STS_task_state <em>OS EXT STS task state</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_SRV_ATTR_host <em>OS EXT SRV ATTR host</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_SRV_ATTR_instance_name <em>OS EXT SRV ATTR instance name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_SRV_ATTR_hypervisor_hostname <em>OS EXT SRV ATTR hypervisor hostname</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getOS_SRV_USG_launched_at <em>OS SRV USG launched at</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getOS_SRV_USG_terminated_at <em>OS SRV USG terminated at</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getImage <em>Image</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getFlavor <em>Flavor</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getSecurity_groups <em>Security groups</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getLinks <em>Links</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Server#getFault <em>Fault</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer()
 * @model
 * @generated
 */
public interface Server extends EObject {
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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Tenant_id()
	 * @model unique="false"
	 * @generated
	 */
	String getTenant_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getTenant_id <em>Tenant id</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_User_id()
	 * @model unique="false"
	 * @generated
	 */
	String getUser_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getUser_id <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User id</em>' attribute.
	 * @see #getUser_id()
	 * @generated
	 */
	void setUser_id(String value);

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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getName <em>Name</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Updated()
	 * @model unique="false"
	 * @generated
	 */
	String getUpdated();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getUpdated <em>Updated</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Created()
	 * @model unique="false"
	 * @generated
	 */
	String getCreated();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(String value);

	/**
	 * Returns the value of the '<em><b>Host Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Id</em>' attribute.
	 * @see #setHostId(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_HostId()
	 * @model unique="false"
	 * @generated
	 */
	String getHostId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getHostId <em>Host Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Id</em>' attribute.
	 * @see #getHostId()
	 * @generated
	 */
	void setHostId(String value);

	/**
	 * Returns the value of the '<em><b>Access IPv4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access IPv4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access IPv4</em>' attribute.
	 * @see #setAccessIPv4(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_AccessIPv4()
	 * @model unique="false"
	 * @generated
	 */
	String getAccessIPv4();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getAccessIPv4 <em>Access IPv4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access IPv4</em>' attribute.
	 * @see #getAccessIPv4()
	 * @generated
	 */
	void setAccessIPv4(String value);

	/**
	 * Returns the value of the '<em><b>Access IPv6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access IPv6</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access IPv6</em>' attribute.
	 * @see #setAccessIPv6(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_AccessIPv6()
	 * @model unique="false"
	 * @generated
	 */
	String getAccessIPv6();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getAccessIPv6 <em>Access IPv6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access IPv6</em>' attribute.
	 * @see #getAccessIPv6()
	 * @generated
	 */
	void setAccessIPv6(String value);

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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Config drive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config drive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config drive</em>' attribute.
	 * @see #setConfig_drive(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Config_drive()
	 * @model unique="false"
	 * @generated
	 */
	String getConfig_drive();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getConfig_drive <em>Config drive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config drive</em>' attribute.
	 * @see #getConfig_drive()
	 * @generated
	 */
	void setConfig_drive(String value);

	/**
	 * Returns the value of the '<em><b>Key name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key name</em>' attribute.
	 * @see #setKey_name(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Key_name()
	 * @model unique="false"
	 * @generated
	 */
	String getKey_name();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getKey_name <em>Key name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key name</em>' attribute.
	 * @see #getKey_name()
	 * @generated
	 */
	void setKey_name(String value);

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see #setProgress(int)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Progress()
	 * @model unique="false"
	 * @generated
	 */
	int getProgress();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(int value);

	/**
	 * Returns the value of the '<em><b>OS DCF disk Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS DCF disk Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS DCF disk Config</em>' attribute.
	 * @see #setOS_DCF_diskConfig(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_OS_DCF_diskConfig()
	 * @model unique="false"
	 * @generated
	 */
	String getOS_DCF_diskConfig();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_DCF_diskConfig <em>OS DCF disk Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS DCF disk Config</em>' attribute.
	 * @see #getOS_DCF_diskConfig()
	 * @generated
	 */
	void setOS_DCF_diskConfig(String value);

	/**
	 * Returns the value of the '<em><b>OS EXT STS power state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS EXT STS power state</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS EXT STS power state</em>' attribute.
	 * @see #setOS_EXT_STS_power_state(int)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_OS_EXT_STS_power_state()
	 * @model unique="false"
	 * @generated
	 */
	int getOS_EXT_STS_power_state();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_STS_power_state <em>OS EXT STS power state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS EXT STS power state</em>' attribute.
	 * @see #getOS_EXT_STS_power_state()
	 * @generated
	 */
	void setOS_EXT_STS_power_state(int value);

	/**
	 * Returns the value of the '<em><b>OS EXT STS vm state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS EXT STS vm state</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS EXT STS vm state</em>' attribute.
	 * @see #setOS_EXT_STS_vm_state(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_OS_EXT_STS_vm_state()
	 * @model unique="false"
	 * @generated
	 */
	String getOS_EXT_STS_vm_state();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_STS_vm_state <em>OS EXT STS vm state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS EXT STS vm state</em>' attribute.
	 * @see #getOS_EXT_STS_vm_state()
	 * @generated
	 */
	void setOS_EXT_STS_vm_state(String value);

	/**
	 * Returns the value of the '<em><b>OS EXT STS task state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS EXT STS task state</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS EXT STS task state</em>' attribute.
	 * @see #setOS_EXT_STS_task_state(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_OS_EXT_STS_task_state()
	 * @model unique="false"
	 * @generated
	 */
	String getOS_EXT_STS_task_state();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_STS_task_state <em>OS EXT STS task state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS EXT STS task state</em>' attribute.
	 * @see #getOS_EXT_STS_task_state()
	 * @generated
	 */
	void setOS_EXT_STS_task_state(String value);

	/**
	 * Returns the value of the '<em><b>OS EXT SRV ATTR host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS EXT SRV ATTR host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS EXT SRV ATTR host</em>' attribute.
	 * @see #setOS_EXT_SRV_ATTR_host(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_OS_EXT_SRV_ATTR_host()
	 * @model unique="false"
	 * @generated
	 */
	String getOS_EXT_SRV_ATTR_host();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_SRV_ATTR_host <em>OS EXT SRV ATTR host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS EXT SRV ATTR host</em>' attribute.
	 * @see #getOS_EXT_SRV_ATTR_host()
	 * @generated
	 */
	void setOS_EXT_SRV_ATTR_host(String value);

	/**
	 * Returns the value of the '<em><b>OS EXT SRV ATTR instance name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS EXT SRV ATTR instance name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS EXT SRV ATTR instance name</em>' attribute.
	 * @see #setOS_EXT_SRV_ATTR_instance_name(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_OS_EXT_SRV_ATTR_instance_name()
	 * @model unique="false"
	 * @generated
	 */
	String getOS_EXT_SRV_ATTR_instance_name();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_SRV_ATTR_instance_name <em>OS EXT SRV ATTR instance name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS EXT SRV ATTR instance name</em>' attribute.
	 * @see #getOS_EXT_SRV_ATTR_instance_name()
	 * @generated
	 */
	void setOS_EXT_SRV_ATTR_instance_name(String value);

	/**
	 * Returns the value of the '<em><b>OS EXT SRV ATTR hypervisor hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS EXT SRV ATTR hypervisor hostname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS EXT SRV ATTR hypervisor hostname</em>' attribute.
	 * @see #setOS_EXT_SRV_ATTR_hypervisor_hostname(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_OS_EXT_SRV_ATTR_hypervisor_hostname()
	 * @model unique="false"
	 * @generated
	 */
	String getOS_EXT_SRV_ATTR_hypervisor_hostname();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_SRV_ATTR_hypervisor_hostname <em>OS EXT SRV ATTR hypervisor hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS EXT SRV ATTR hypervisor hostname</em>' attribute.
	 * @see #getOS_EXT_SRV_ATTR_hypervisor_hostname()
	 * @generated
	 */
	void setOS_EXT_SRV_ATTR_hypervisor_hostname(String value);

	/**
	 * Returns the value of the '<em><b>OS SRV USG launched at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS SRV USG launched at</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS SRV USG launched at</em>' attribute.
	 * @see #setOS_SRV_USG_launched_at(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_OS_SRV_USG_launched_at()
	 * @model unique="false"
	 * @generated
	 */
	String getOS_SRV_USG_launched_at();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_SRV_USG_launched_at <em>OS SRV USG launched at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS SRV USG launched at</em>' attribute.
	 * @see #getOS_SRV_USG_launched_at()
	 * @generated
	 */
	void setOS_SRV_USG_launched_at(String value);

	/**
	 * Returns the value of the '<em><b>OS SRV USG terminated at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS SRV USG terminated at</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS SRV USG terminated at</em>' attribute.
	 * @see #setOS_SRV_USG_terminated_at(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_OS_SRV_USG_terminated_at()
	 * @model unique="false"
	 * @generated
	 */
	String getOS_SRV_USG_terminated_at();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_SRV_USG_terminated_at <em>OS SRV USG terminated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS SRV USG terminated at</em>' attribute.
	 * @see #getOS_SRV_USG_terminated_at()
	 * @generated
	 */
	void setOS_SRV_USG_terminated_at(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Reference)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Image()
	 * @model containment="true"
	 * @generated
	 */
	Reference getImage();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Reference value);

	/**
	 * Returns the value of the '<em><b>Flavor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flavor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flavor</em>' containment reference.
	 * @see #setFlavor(Reference)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Flavor()
	 * @model containment="true"
	 * @generated
	 */
	Reference getFlavor();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getFlavor <em>Flavor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor</em>' containment reference.
	 * @see #getFlavor()
	 * @generated
	 */
	void setFlavor(Reference value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.Addresses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Addresses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Addresses> getAddresses();

	/**
	 * Returns the value of the '<em><b>Security groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.SecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security groups</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Security_groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityGroup> getSecurity_groups();

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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metadata> getMetadata();

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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault</em>' containment reference.
	 * @see #setFault(Fault)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getServer_Fault()
	 * @model containment="true"
	 * @generated
	 */
	Fault getFault();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Server#getFault <em>Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault</em>' containment reference.
	 * @see #getFault()
	 * @generated
	 */
	void setFault(Fault value);

} // Server
