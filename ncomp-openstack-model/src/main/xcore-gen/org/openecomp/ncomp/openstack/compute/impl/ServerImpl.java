
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
package org.openecomp.ncomp.openstack.compute.impl;

import org.openecomp.ncomp.openstack.compute.Addresses;
import org.openecomp.ncomp.openstack.compute.ComputePackage;
import org.openecomp.ncomp.openstack.compute.Fault;
import org.openecomp.ncomp.openstack.compute.Link;
import org.openecomp.ncomp.openstack.compute.Metadata;
import org.openecomp.ncomp.openstack.compute.Reference;
import org.openecomp.ncomp.openstack.compute.SecurityGroup;
import org.openecomp.ncomp.openstack.compute.Server;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getUser_id <em>User id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getUpdated <em>Updated</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getHostId <em>Host Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getAccessIPv4 <em>Access IPv4</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getAccessIPv6 <em>Access IPv6</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getConfig_drive <em>Config drive</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getKey_name <em>Key name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getOS_DCF_diskConfig <em>OS DCF disk Config</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getOS_EXT_STS_power_state <em>OS EXT STS power state</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getOS_EXT_STS_vm_state <em>OS EXT STS vm state</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getOS_EXT_STS_task_state <em>OS EXT STS task state</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getOS_EXT_SRV_ATTR_host <em>OS EXT SRV ATTR host</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getOS_EXT_SRV_ATTR_instance_name <em>OS EXT SRV ATTR instance name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getOS_EXT_SRV_ATTR_hypervisor_hostname <em>OS EXT SRV ATTR hypervisor hostname</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getOS_SRV_USG_launched_at <em>OS SRV USG launched at</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getOS_SRV_USG_terminated_at <em>OS SRV USG terminated at</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getFlavor <em>Flavor</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getSecurity_groups <em>Security groups</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl#getFault <em>Fault</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends MinimalEObjectImpl.Container implements Server {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenant_id() <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_id()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenant_id() <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_id()
	 * @generated
	 * @ordered
	 */
	protected String tenant_id = TENANT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser_id() <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_id()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser_id() <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_id()
	 * @generated
	 * @ordered
	 */
	protected String user_id = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdated() <em>Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdated() <em>Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated()
	 * @generated
	 * @ordered
	 */
	protected String updated = UPDATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected String created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostId() <em>Host Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostId()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostId() <em>Host Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostId()
	 * @generated
	 * @ordered
	 */
	protected String hostId = HOST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessIPv4() <em>Access IPv4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessIPv4()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_IPV4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessIPv4() <em>Access IPv4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessIPv4()
	 * @generated
	 * @ordered
	 */
	protected String accessIPv4 = ACCESS_IPV4_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessIPv6() <em>Access IPv6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessIPv6()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_IPV6_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessIPv6() <em>Access IPv6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessIPv6()
	 * @generated
	 * @ordered
	 */
	protected String accessIPv6 = ACCESS_IPV6_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfig_drive() <em>Config drive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig_drive()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_DRIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfig_drive() <em>Config drive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig_drive()
	 * @generated
	 * @ordered
	 */
	protected String config_drive = CONFIG_DRIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey_name() <em>Key name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey_name()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey_name() <em>Key name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey_name()
	 * @generated
	 * @ordered
	 */
	protected String key_name = KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected static final int PROGRESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected int progress = PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_DCF_diskConfig() <em>OS DCF disk Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_DCF_diskConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_DCF_DISK_CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS_DCF_diskConfig() <em>OS DCF disk Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_DCF_diskConfig()
	 * @generated
	 * @ordered
	 */
	protected String oS_DCF_diskConfig = OS_DCF_DISK_CONFIG_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_EXT_STS_power_state() <em>OS EXT STS power state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_STS_power_state()
	 * @generated
	 * @ordered
	 */
	protected static final int OS_EXT_STS_POWER_STATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOS_EXT_STS_power_state() <em>OS EXT STS power state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_STS_power_state()
	 * @generated
	 * @ordered
	 */
	protected int oS_EXT_STS_power_state = OS_EXT_STS_POWER_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_EXT_STS_vm_state() <em>OS EXT STS vm state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_STS_vm_state()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EXT_STS_VM_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS_EXT_STS_vm_state() <em>OS EXT STS vm state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_STS_vm_state()
	 * @generated
	 * @ordered
	 */
	protected String oS_EXT_STS_vm_state = OS_EXT_STS_VM_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_EXT_STS_task_state() <em>OS EXT STS task state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_STS_task_state()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EXT_STS_TASK_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS_EXT_STS_task_state() <em>OS EXT STS task state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_STS_task_state()
	 * @generated
	 * @ordered
	 */
	protected String oS_EXT_STS_task_state = OS_EXT_STS_TASK_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_EXT_SRV_ATTR_host() <em>OS EXT SRV ATTR host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_SRV_ATTR_host()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EXT_SRV_ATTR_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS_EXT_SRV_ATTR_host() <em>OS EXT SRV ATTR host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_SRV_ATTR_host()
	 * @generated
	 * @ordered
	 */
	protected String oS_EXT_SRV_ATTR_host = OS_EXT_SRV_ATTR_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_EXT_SRV_ATTR_instance_name() <em>OS EXT SRV ATTR instance name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_SRV_ATTR_instance_name()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EXT_SRV_ATTR_INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS_EXT_SRV_ATTR_instance_name() <em>OS EXT SRV ATTR instance name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_SRV_ATTR_instance_name()
	 * @generated
	 * @ordered
	 */
	protected String oS_EXT_SRV_ATTR_instance_name = OS_EXT_SRV_ATTR_INSTANCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_EXT_SRV_ATTR_hypervisor_hostname() <em>OS EXT SRV ATTR hypervisor hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_SRV_ATTR_hypervisor_hostname()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS_EXT_SRV_ATTR_hypervisor_hostname() <em>OS EXT SRV ATTR hypervisor hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_SRV_ATTR_hypervisor_hostname()
	 * @generated
	 * @ordered
	 */
	protected String oS_EXT_SRV_ATTR_hypervisor_hostname = OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_SRV_USG_launched_at() <em>OS SRV USG launched at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_SRV_USG_launched_at()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_SRV_USG_LAUNCHED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS_SRV_USG_launched_at() <em>OS SRV USG launched at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_SRV_USG_launched_at()
	 * @generated
	 * @ordered
	 */
	protected String oS_SRV_USG_launched_at = OS_SRV_USG_LAUNCHED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_SRV_USG_terminated_at() <em>OS SRV USG terminated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_SRV_USG_terminated_at()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_SRV_USG_TERMINATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS_SRV_USG_terminated_at() <em>OS SRV USG terminated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_SRV_USG_terminated_at()
	 * @generated
	 * @ordered
	 */
	protected String oS_SRV_USG_terminated_at = OS_SRV_USG_TERMINATED_AT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Reference image;

	/**
	 * The cached value of the '{@link #getFlavor() <em>Flavor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor()
	 * @generated
	 * @ordered
	 */
	protected Reference flavor;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Addresses> addresses;

	/**
	 * The cached value of the '{@link #getSecurity_groups() <em>Security groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_groups()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroup> security_groups;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> metadata;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault()
	 * @generated
	 * @ordered
	 */
	protected Fault fault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenant_id() {
		return tenant_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenant_id(String newTenant_id) {
		String oldTenant_id = tenant_id;
		tenant_id = newTenant_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__TENANT_ID, oldTenant_id, tenant_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser_id(String newUser_id) {
		String oldUser_id = user_id;
		user_id = newUser_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__USER_ID, oldUser_id, user_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdated() {
		return updated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdated(String newUpdated) {
		String oldUpdated = updated;
		updated = newUpdated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__UPDATED, oldUpdated, updated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(String newCreated) {
		String oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostId() {
		return hostId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostId(String newHostId) {
		String oldHostId = hostId;
		hostId = newHostId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__HOST_ID, oldHostId, hostId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessIPv4() {
		return accessIPv4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessIPv4(String newAccessIPv4) {
		String oldAccessIPv4 = accessIPv4;
		accessIPv4 = newAccessIPv4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__ACCESS_IPV4, oldAccessIPv4, accessIPv4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessIPv6() {
		return accessIPv6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessIPv6(String newAccessIPv6) {
		String oldAccessIPv6 = accessIPv6;
		accessIPv6 = newAccessIPv6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__ACCESS_IPV6, oldAccessIPv6, accessIPv6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfig_drive() {
		return config_drive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig_drive(String newConfig_drive) {
		String oldConfig_drive = config_drive;
		config_drive = newConfig_drive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__CONFIG_DRIVE, oldConfig_drive, config_drive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey_name() {
		return key_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey_name(String newKey_name) {
		String oldKey_name = key_name;
		key_name = newKey_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__KEY_NAME, oldKey_name, key_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProgress() {
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgress(int newProgress) {
		int oldProgress = progress;
		progress = newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__PROGRESS, oldProgress, progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOS_DCF_diskConfig() {
		return oS_DCF_diskConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_DCF_diskConfig(String newOS_DCF_diskConfig) {
		String oldOS_DCF_diskConfig = oS_DCF_diskConfig;
		oS_DCF_diskConfig = newOS_DCF_diskConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__OS_DCF_DISK_CONFIG, oldOS_DCF_diskConfig, oS_DCF_diskConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOS_EXT_STS_power_state() {
		return oS_EXT_STS_power_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_EXT_STS_power_state(int newOS_EXT_STS_power_state) {
		int oldOS_EXT_STS_power_state = oS_EXT_STS_power_state;
		oS_EXT_STS_power_state = newOS_EXT_STS_power_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__OS_EXT_STS_POWER_STATE, oldOS_EXT_STS_power_state, oS_EXT_STS_power_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOS_EXT_STS_vm_state() {
		return oS_EXT_STS_vm_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_EXT_STS_vm_state(String newOS_EXT_STS_vm_state) {
		String oldOS_EXT_STS_vm_state = oS_EXT_STS_vm_state;
		oS_EXT_STS_vm_state = newOS_EXT_STS_vm_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__OS_EXT_STS_VM_STATE, oldOS_EXT_STS_vm_state, oS_EXT_STS_vm_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOS_EXT_STS_task_state() {
		return oS_EXT_STS_task_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_EXT_STS_task_state(String newOS_EXT_STS_task_state) {
		String oldOS_EXT_STS_task_state = oS_EXT_STS_task_state;
		oS_EXT_STS_task_state = newOS_EXT_STS_task_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__OS_EXT_STS_TASK_STATE, oldOS_EXT_STS_task_state, oS_EXT_STS_task_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOS_EXT_SRV_ATTR_host() {
		return oS_EXT_SRV_ATTR_host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_EXT_SRV_ATTR_host(String newOS_EXT_SRV_ATTR_host) {
		String oldOS_EXT_SRV_ATTR_host = oS_EXT_SRV_ATTR_host;
		oS_EXT_SRV_ATTR_host = newOS_EXT_SRV_ATTR_host;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__OS_EXT_SRV_ATTR_HOST, oldOS_EXT_SRV_ATTR_host, oS_EXT_SRV_ATTR_host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOS_EXT_SRV_ATTR_instance_name() {
		return oS_EXT_SRV_ATTR_instance_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_EXT_SRV_ATTR_instance_name(String newOS_EXT_SRV_ATTR_instance_name) {
		String oldOS_EXT_SRV_ATTR_instance_name = oS_EXT_SRV_ATTR_instance_name;
		oS_EXT_SRV_ATTR_instance_name = newOS_EXT_SRV_ATTR_instance_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__OS_EXT_SRV_ATTR_INSTANCE_NAME, oldOS_EXT_SRV_ATTR_instance_name, oS_EXT_SRV_ATTR_instance_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOS_EXT_SRV_ATTR_hypervisor_hostname() {
		return oS_EXT_SRV_ATTR_hypervisor_hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_EXT_SRV_ATTR_hypervisor_hostname(String newOS_EXT_SRV_ATTR_hypervisor_hostname) {
		String oldOS_EXT_SRV_ATTR_hypervisor_hostname = oS_EXT_SRV_ATTR_hypervisor_hostname;
		oS_EXT_SRV_ATTR_hypervisor_hostname = newOS_EXT_SRV_ATTR_hypervisor_hostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME, oldOS_EXT_SRV_ATTR_hypervisor_hostname, oS_EXT_SRV_ATTR_hypervisor_hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOS_SRV_USG_launched_at() {
		return oS_SRV_USG_launched_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_SRV_USG_launched_at(String newOS_SRV_USG_launched_at) {
		String oldOS_SRV_USG_launched_at = oS_SRV_USG_launched_at;
		oS_SRV_USG_launched_at = newOS_SRV_USG_launched_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__OS_SRV_USG_LAUNCHED_AT, oldOS_SRV_USG_launched_at, oS_SRV_USG_launched_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOS_SRV_USG_terminated_at() {
		return oS_SRV_USG_terminated_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_SRV_USG_terminated_at(String newOS_SRV_USG_terminated_at) {
		String oldOS_SRV_USG_terminated_at = oS_SRV_USG_terminated_at;
		oS_SRV_USG_terminated_at = newOS_SRV_USG_terminated_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__OS_SRV_USG_TERMINATED_AT, oldOS_SRV_USG_terminated_at, oS_SRV_USG_terminated_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(Reference newImage, NotificationChain msgs) {
		Reference oldImage = image;
		image = newImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__IMAGE, oldImage, newImage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(Reference newImage) {
		if (newImage != image) {
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject)image).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputePackage.SERVER__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject)newImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComputePackage.SERVER__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__IMAGE, newImage, newImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getFlavor() {
		return flavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlavor(Reference newFlavor, NotificationChain msgs) {
		Reference oldFlavor = flavor;
		flavor = newFlavor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__FLAVOR, oldFlavor, newFlavor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlavor(Reference newFlavor) {
		if (newFlavor != flavor) {
			NotificationChain msgs = null;
			if (flavor != null)
				msgs = ((InternalEObject)flavor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputePackage.SERVER__FLAVOR, null, msgs);
			if (newFlavor != null)
				msgs = ((InternalEObject)newFlavor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComputePackage.SERVER__FLAVOR, null, msgs);
			msgs = basicSetFlavor(newFlavor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__FLAVOR, newFlavor, newFlavor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Addresses> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Addresses>(Addresses.class, this, ComputePackage.SERVER__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGroup> getSecurity_groups() {
		if (security_groups == null) {
			security_groups = new EObjectContainmentEList<SecurityGroup>(SecurityGroup.class, this, ComputePackage.SERVER__SECURITY_GROUPS);
		}
		return security_groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<Metadata>(Metadata.class, this, ComputePackage.SERVER__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, ComputePackage.SERVER__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fault getFault() {
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFault(Fault newFault, NotificationChain msgs) {
		Fault oldFault = fault;
		fault = newFault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__FAULT, oldFault, newFault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault(Fault newFault) {
		if (newFault != fault) {
			NotificationChain msgs = null;
			if (fault != null)
				msgs = ((InternalEObject)fault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputePackage.SERVER__FAULT, null, msgs);
			if (newFault != null)
				msgs = ((InternalEObject)newFault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComputePackage.SERVER__FAULT, null, msgs);
			msgs = basicSetFault(newFault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SERVER__FAULT, newFault, newFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComputePackage.SERVER__IMAGE:
				return basicSetImage(null, msgs);
			case ComputePackage.SERVER__FLAVOR:
				return basicSetFlavor(null, msgs);
			case ComputePackage.SERVER__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case ComputePackage.SERVER__SECURITY_GROUPS:
				return ((InternalEList<?>)getSecurity_groups()).basicRemove(otherEnd, msgs);
			case ComputePackage.SERVER__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
			case ComputePackage.SERVER__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case ComputePackage.SERVER__FAULT:
				return basicSetFault(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputePackage.SERVER__ID:
				return getId();
			case ComputePackage.SERVER__TENANT_ID:
				return getTenant_id();
			case ComputePackage.SERVER__USER_ID:
				return getUser_id();
			case ComputePackage.SERVER__NAME:
				return getName();
			case ComputePackage.SERVER__UPDATED:
				return getUpdated();
			case ComputePackage.SERVER__CREATED:
				return getCreated();
			case ComputePackage.SERVER__HOST_ID:
				return getHostId();
			case ComputePackage.SERVER__ACCESS_IPV4:
				return getAccessIPv4();
			case ComputePackage.SERVER__ACCESS_IPV6:
				return getAccessIPv6();
			case ComputePackage.SERVER__STATUS:
				return getStatus();
			case ComputePackage.SERVER__CONFIG_DRIVE:
				return getConfig_drive();
			case ComputePackage.SERVER__KEY_NAME:
				return getKey_name();
			case ComputePackage.SERVER__PROGRESS:
				return getProgress();
			case ComputePackage.SERVER__OS_DCF_DISK_CONFIG:
				return getOS_DCF_diskConfig();
			case ComputePackage.SERVER__OS_EXT_STS_POWER_STATE:
				return getOS_EXT_STS_power_state();
			case ComputePackage.SERVER__OS_EXT_STS_VM_STATE:
				return getOS_EXT_STS_vm_state();
			case ComputePackage.SERVER__OS_EXT_STS_TASK_STATE:
				return getOS_EXT_STS_task_state();
			case ComputePackage.SERVER__OS_EXT_SRV_ATTR_HOST:
				return getOS_EXT_SRV_ATTR_host();
			case ComputePackage.SERVER__OS_EXT_SRV_ATTR_INSTANCE_NAME:
				return getOS_EXT_SRV_ATTR_instance_name();
			case ComputePackage.SERVER__OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME:
				return getOS_EXT_SRV_ATTR_hypervisor_hostname();
			case ComputePackage.SERVER__OS_SRV_USG_LAUNCHED_AT:
				return getOS_SRV_USG_launched_at();
			case ComputePackage.SERVER__OS_SRV_USG_TERMINATED_AT:
				return getOS_SRV_USG_terminated_at();
			case ComputePackage.SERVER__IMAGE:
				return getImage();
			case ComputePackage.SERVER__FLAVOR:
				return getFlavor();
			case ComputePackage.SERVER__ADDRESSES:
				return getAddresses();
			case ComputePackage.SERVER__SECURITY_GROUPS:
				return getSecurity_groups();
			case ComputePackage.SERVER__METADATA:
				return getMetadata();
			case ComputePackage.SERVER__LINKS:
				return getLinks();
			case ComputePackage.SERVER__FAULT:
				return getFault();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComputePackage.SERVER__ID:
				setId((String)newValue);
				return;
			case ComputePackage.SERVER__TENANT_ID:
				setTenant_id((String)newValue);
				return;
			case ComputePackage.SERVER__USER_ID:
				setUser_id((String)newValue);
				return;
			case ComputePackage.SERVER__NAME:
				setName((String)newValue);
				return;
			case ComputePackage.SERVER__UPDATED:
				setUpdated((String)newValue);
				return;
			case ComputePackage.SERVER__CREATED:
				setCreated((String)newValue);
				return;
			case ComputePackage.SERVER__HOST_ID:
				setHostId((String)newValue);
				return;
			case ComputePackage.SERVER__ACCESS_IPV4:
				setAccessIPv4((String)newValue);
				return;
			case ComputePackage.SERVER__ACCESS_IPV6:
				setAccessIPv6((String)newValue);
				return;
			case ComputePackage.SERVER__STATUS:
				setStatus((String)newValue);
				return;
			case ComputePackage.SERVER__CONFIG_DRIVE:
				setConfig_drive((String)newValue);
				return;
			case ComputePackage.SERVER__KEY_NAME:
				setKey_name((String)newValue);
				return;
			case ComputePackage.SERVER__PROGRESS:
				setProgress((Integer)newValue);
				return;
			case ComputePackage.SERVER__OS_DCF_DISK_CONFIG:
				setOS_DCF_diskConfig((String)newValue);
				return;
			case ComputePackage.SERVER__OS_EXT_STS_POWER_STATE:
				setOS_EXT_STS_power_state((Integer)newValue);
				return;
			case ComputePackage.SERVER__OS_EXT_STS_VM_STATE:
				setOS_EXT_STS_vm_state((String)newValue);
				return;
			case ComputePackage.SERVER__OS_EXT_STS_TASK_STATE:
				setOS_EXT_STS_task_state((String)newValue);
				return;
			case ComputePackage.SERVER__OS_EXT_SRV_ATTR_HOST:
				setOS_EXT_SRV_ATTR_host((String)newValue);
				return;
			case ComputePackage.SERVER__OS_EXT_SRV_ATTR_INSTANCE_NAME:
				setOS_EXT_SRV_ATTR_instance_name((String)newValue);
				return;
			case ComputePackage.SERVER__OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME:
				setOS_EXT_SRV_ATTR_hypervisor_hostname((String)newValue);
				return;
			case ComputePackage.SERVER__OS_SRV_USG_LAUNCHED_AT:
				setOS_SRV_USG_launched_at((String)newValue);
				return;
			case ComputePackage.SERVER__OS_SRV_USG_TERMINATED_AT:
				setOS_SRV_USG_terminated_at((String)newValue);
				return;
			case ComputePackage.SERVER__IMAGE:
				setImage((Reference)newValue);
				return;
			case ComputePackage.SERVER__FLAVOR:
				setFlavor((Reference)newValue);
				return;
			case ComputePackage.SERVER__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Addresses>)newValue);
				return;
			case ComputePackage.SERVER__SECURITY_GROUPS:
				getSecurity_groups().clear();
				getSecurity_groups().addAll((Collection<? extends SecurityGroup>)newValue);
				return;
			case ComputePackage.SERVER__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
				return;
			case ComputePackage.SERVER__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case ComputePackage.SERVER__FAULT:
				setFault((Fault)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComputePackage.SERVER__ID:
				setId(ID_EDEFAULT);
				return;
			case ComputePackage.SERVER__TENANT_ID:
				setTenant_id(TENANT_ID_EDEFAULT);
				return;
			case ComputePackage.SERVER__USER_ID:
				setUser_id(USER_ID_EDEFAULT);
				return;
			case ComputePackage.SERVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComputePackage.SERVER__UPDATED:
				setUpdated(UPDATED_EDEFAULT);
				return;
			case ComputePackage.SERVER__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case ComputePackage.SERVER__HOST_ID:
				setHostId(HOST_ID_EDEFAULT);
				return;
			case ComputePackage.SERVER__ACCESS_IPV4:
				setAccessIPv4(ACCESS_IPV4_EDEFAULT);
				return;
			case ComputePackage.SERVER__ACCESS_IPV6:
				setAccessIPv6(ACCESS_IPV6_EDEFAULT);
				return;
			case ComputePackage.SERVER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ComputePackage.SERVER__CONFIG_DRIVE:
				setConfig_drive(CONFIG_DRIVE_EDEFAULT);
				return;
			case ComputePackage.SERVER__KEY_NAME:
				setKey_name(KEY_NAME_EDEFAULT);
				return;
			case ComputePackage.SERVER__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
				return;
			case ComputePackage.SERVER__OS_DCF_DISK_CONFIG:
				setOS_DCF_diskConfig(OS_DCF_DISK_CONFIG_EDEFAULT);
				return;
			case ComputePackage.SERVER__OS_EXT_STS_POWER_STATE:
				setOS_EXT_STS_power_state(OS_EXT_STS_POWER_STATE_EDEFAULT);
				return;
			case ComputePackage.SERVER__OS_EXT_STS_VM_STATE:
				setOS_EXT_STS_vm_state(OS_EXT_STS_VM_STATE_EDEFAULT);
				return;
			case ComputePackage.SERVER__OS_EXT_STS_TASK_STATE:
				setOS_EXT_STS_task_state(OS_EXT_STS_TASK_STATE_EDEFAULT);
				return;
			case ComputePackage.SERVER__OS_EXT_SRV_ATTR_HOST:
				setOS_EXT_SRV_ATTR_host(OS_EXT_SRV_ATTR_HOST_EDEFAULT);
				return;
			case ComputePackage.SERVER__OS_EXT_SRV_ATTR_INSTANCE_NAME:
				setOS_EXT_SRV_ATTR_instance_name(OS_EXT_SRV_ATTR_INSTANCE_NAME_EDEFAULT);
				return;
			case ComputePackage.SERVER__OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME:
				setOS_EXT_SRV_ATTR_hypervisor_hostname(OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME_EDEFAULT);
				return;
			case ComputePackage.SERVER__OS_SRV_USG_LAUNCHED_AT:
				setOS_SRV_USG_launched_at(OS_SRV_USG_LAUNCHED_AT_EDEFAULT);
				return;
			case ComputePackage.SERVER__OS_SRV_USG_TERMINATED_AT:
				setOS_SRV_USG_terminated_at(OS_SRV_USG_TERMINATED_AT_EDEFAULT);
				return;
			case ComputePackage.SERVER__IMAGE:
				setImage((Reference)null);
				return;
			case ComputePackage.SERVER__FLAVOR:
				setFlavor((Reference)null);
				return;
			case ComputePackage.SERVER__ADDRESSES:
				getAddresses().clear();
				return;
			case ComputePackage.SERVER__SECURITY_GROUPS:
				getSecurity_groups().clear();
				return;
			case ComputePackage.SERVER__METADATA:
				getMetadata().clear();
				return;
			case ComputePackage.SERVER__LINKS:
				getLinks().clear();
				return;
			case ComputePackage.SERVER__FAULT:
				setFault((Fault)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComputePackage.SERVER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ComputePackage.SERVER__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenant_id != null : !TENANT_ID_EDEFAULT.equals(tenant_id);
			case ComputePackage.SERVER__USER_ID:
				return USER_ID_EDEFAULT == null ? user_id != null : !USER_ID_EDEFAULT.equals(user_id);
			case ComputePackage.SERVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComputePackage.SERVER__UPDATED:
				return UPDATED_EDEFAULT == null ? updated != null : !UPDATED_EDEFAULT.equals(updated);
			case ComputePackage.SERVER__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case ComputePackage.SERVER__HOST_ID:
				return HOST_ID_EDEFAULT == null ? hostId != null : !HOST_ID_EDEFAULT.equals(hostId);
			case ComputePackage.SERVER__ACCESS_IPV4:
				return ACCESS_IPV4_EDEFAULT == null ? accessIPv4 != null : !ACCESS_IPV4_EDEFAULT.equals(accessIPv4);
			case ComputePackage.SERVER__ACCESS_IPV6:
				return ACCESS_IPV6_EDEFAULT == null ? accessIPv6 != null : !ACCESS_IPV6_EDEFAULT.equals(accessIPv6);
			case ComputePackage.SERVER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case ComputePackage.SERVER__CONFIG_DRIVE:
				return CONFIG_DRIVE_EDEFAULT == null ? config_drive != null : !CONFIG_DRIVE_EDEFAULT.equals(config_drive);
			case ComputePackage.SERVER__KEY_NAME:
				return KEY_NAME_EDEFAULT == null ? key_name != null : !KEY_NAME_EDEFAULT.equals(key_name);
			case ComputePackage.SERVER__PROGRESS:
				return progress != PROGRESS_EDEFAULT;
			case ComputePackage.SERVER__OS_DCF_DISK_CONFIG:
				return OS_DCF_DISK_CONFIG_EDEFAULT == null ? oS_DCF_diskConfig != null : !OS_DCF_DISK_CONFIG_EDEFAULT.equals(oS_DCF_diskConfig);
			case ComputePackage.SERVER__OS_EXT_STS_POWER_STATE:
				return oS_EXT_STS_power_state != OS_EXT_STS_POWER_STATE_EDEFAULT;
			case ComputePackage.SERVER__OS_EXT_STS_VM_STATE:
				return OS_EXT_STS_VM_STATE_EDEFAULT == null ? oS_EXT_STS_vm_state != null : !OS_EXT_STS_VM_STATE_EDEFAULT.equals(oS_EXT_STS_vm_state);
			case ComputePackage.SERVER__OS_EXT_STS_TASK_STATE:
				return OS_EXT_STS_TASK_STATE_EDEFAULT == null ? oS_EXT_STS_task_state != null : !OS_EXT_STS_TASK_STATE_EDEFAULT.equals(oS_EXT_STS_task_state);
			case ComputePackage.SERVER__OS_EXT_SRV_ATTR_HOST:
				return OS_EXT_SRV_ATTR_HOST_EDEFAULT == null ? oS_EXT_SRV_ATTR_host != null : !OS_EXT_SRV_ATTR_HOST_EDEFAULT.equals(oS_EXT_SRV_ATTR_host);
			case ComputePackage.SERVER__OS_EXT_SRV_ATTR_INSTANCE_NAME:
				return OS_EXT_SRV_ATTR_INSTANCE_NAME_EDEFAULT == null ? oS_EXT_SRV_ATTR_instance_name != null : !OS_EXT_SRV_ATTR_INSTANCE_NAME_EDEFAULT.equals(oS_EXT_SRV_ATTR_instance_name);
			case ComputePackage.SERVER__OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME:
				return OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME_EDEFAULT == null ? oS_EXT_SRV_ATTR_hypervisor_hostname != null : !OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME_EDEFAULT.equals(oS_EXT_SRV_ATTR_hypervisor_hostname);
			case ComputePackage.SERVER__OS_SRV_USG_LAUNCHED_AT:
				return OS_SRV_USG_LAUNCHED_AT_EDEFAULT == null ? oS_SRV_USG_launched_at != null : !OS_SRV_USG_LAUNCHED_AT_EDEFAULT.equals(oS_SRV_USG_launched_at);
			case ComputePackage.SERVER__OS_SRV_USG_TERMINATED_AT:
				return OS_SRV_USG_TERMINATED_AT_EDEFAULT == null ? oS_SRV_USG_terminated_at != null : !OS_SRV_USG_TERMINATED_AT_EDEFAULT.equals(oS_SRV_USG_terminated_at);
			case ComputePackage.SERVER__IMAGE:
				return image != null;
			case ComputePackage.SERVER__FLAVOR:
				return flavor != null;
			case ComputePackage.SERVER__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case ComputePackage.SERVER__SECURITY_GROUPS:
				return security_groups != null && !security_groups.isEmpty();
			case ComputePackage.SERVER__METADATA:
				return metadata != null && !metadata.isEmpty();
			case ComputePackage.SERVER__LINKS:
				return links != null && !links.isEmpty();
			case ComputePackage.SERVER__FAULT:
				return fault != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", tenant_id: ");
		result.append(tenant_id);
		result.append(", user_id: ");
		result.append(user_id);
		result.append(", name: ");
		result.append(name);
		result.append(", updated: ");
		result.append(updated);
		result.append(", created: ");
		result.append(created);
		result.append(", hostId: ");
		result.append(hostId);
		result.append(", accessIPv4: ");
		result.append(accessIPv4);
		result.append(", accessIPv6: ");
		result.append(accessIPv6);
		result.append(", status: ");
		result.append(status);
		result.append(", config_drive: ");
		result.append(config_drive);
		result.append(", key_name: ");
		result.append(key_name);
		result.append(", progress: ");
		result.append(progress);
		result.append(", OS_DCF_diskConfig: ");
		result.append(oS_DCF_diskConfig);
		result.append(", OS_EXT_STS_power_state: ");
		result.append(oS_EXT_STS_power_state);
		result.append(", OS_EXT_STS_vm_state: ");
		result.append(oS_EXT_STS_vm_state);
		result.append(", OS_EXT_STS_task_state: ");
		result.append(oS_EXT_STS_task_state);
		result.append(", OS_EXT_SRV_ATTR_host: ");
		result.append(oS_EXT_SRV_ATTR_host);
		result.append(", OS_EXT_SRV_ATTR_instance_name: ");
		result.append(oS_EXT_SRV_ATTR_instance_name);
		result.append(", OS_EXT_SRV_ATTR_hypervisor_hostname: ");
		result.append(oS_EXT_SRV_ATTR_hypervisor_hostname);
		result.append(", OS_SRV_USG_launched_at: ");
		result.append(oS_SRV_USG_launched_at);
		result.append(", OS_SRV_USG_terminated_at: ");
		result.append(oS_SRV_USG_terminated_at);
		result.append(')');
		return result.toString();
	}

} //ServerImpl
