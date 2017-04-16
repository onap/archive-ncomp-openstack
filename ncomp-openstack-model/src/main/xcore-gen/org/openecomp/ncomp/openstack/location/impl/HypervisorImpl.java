
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
package org.openecomp.ncomp.openstack.location.impl;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.openecomp.ncomp.openstack.location.Hypervisor;
import org.openecomp.ncomp.openstack.location.HypervisorCpuInfo;
import org.openecomp.ncomp.openstack.location.HypervisorService;
import org.openecomp.ncomp.openstack.location.LocationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypervisor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getHost_ip <em>Host ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getVcpus_used <em>Vcpus used</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getHypervisor_type <em>Hypervisor type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getLocal_gb_used <em>Local gb used</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getHypervisor_hostname <em>Hypervisor hostname</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getMemory_mb_used <em>Memory mb used</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getMemory_mb <em>Memory mb</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getCurrent_workload <em>Current workload</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getVcpus <em>Vcpus</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getCpu_info <em>Cpu info</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getRunning_vms <em>Running vms</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getFree_disk_gb <em>Free disk gb</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getHypervisor_version <em>Hypervisor version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getDisk_available_least <em>Disk available least</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getLocal_gb <em>Local gb</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getFree_ram_mb <em>Free ram mb</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HypervisorImpl extends NamedEntityImpl implements Hypervisor {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected HypervisorService service;

	/**
	 * The default value of the '{@link #getHost_ip() <em>Host ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost_ip() <em>Host ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_ip()
	 * @generated
	 * @ordered
	 */
	protected String host_ip = HOST_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVcpus_used() <em>Vcpus used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpus_used()
	 * @generated
	 * @ordered
	 */
	protected static final int VCPUS_USED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVcpus_used() <em>Vcpus used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpus_used()
	 * @generated
	 * @ordered
	 */
	protected int vcpus_used = VCPUS_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getHypervisor_type() <em>Hypervisor type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor_type()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERVISOR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHypervisor_type() <em>Hypervisor type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor_type()
	 * @generated
	 * @ordered
	 */
	protected String hypervisor_type = HYPERVISOR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocal_gb_used() <em>Local gb used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal_gb_used()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCAL_GB_USED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLocal_gb_used() <em>Local gb used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal_gb_used()
	 * @generated
	 * @ordered
	 */
	protected int local_gb_used = LOCAL_GB_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getHypervisor_hostname() <em>Hypervisor hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor_hostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERVISOR_HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHypervisor_hostname() <em>Hypervisor hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor_hostname()
	 * @generated
	 * @ordered
	 */
	protected String hypervisor_hostname = HYPERVISOR_HOSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory_mb_used() <em>Memory mb used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_mb_used()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_MB_USED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory_mb_used() <em>Memory mb used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_mb_used()
	 * @generated
	 * @ordered
	 */
	protected int memory_mb_used = MEMORY_MB_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory_mb() <em>Memory mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_mb()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_MB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory_mb() <em>Memory mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_mb()
	 * @generated
	 * @ordered
	 */
	protected int memory_mb = MEMORY_MB_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_workload() <em>Current workload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_workload()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_WORKLOAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrent_workload() <em>Current workload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_workload()
	 * @generated
	 * @ordered
	 */
	protected int current_workload = CURRENT_WORKLOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getVcpus() <em>Vcpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpus()
	 * @generated
	 * @ordered
	 */
	protected static final int VCPUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVcpus() <em>Vcpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpus()
	 * @generated
	 * @ordered
	 */
	protected int vcpus = VCPUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCpu_info() <em>Cpu info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_info()
	 * @generated
	 * @ordered
	 */
	protected HypervisorCpuInfo cpu_info;

	/**
	 * The default value of the '{@link #getRunning_vms() <em>Running vms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunning_vms()
	 * @generated
	 * @ordered
	 */
	protected static final int RUNNING_VMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRunning_vms() <em>Running vms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunning_vms()
	 * @generated
	 * @ordered
	 */
	protected int running_vms = RUNNING_VMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFree_disk_gb() <em>Free disk gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree_disk_gb()
	 * @generated
	 * @ordered
	 */
	protected static final int FREE_DISK_GB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFree_disk_gb() <em>Free disk gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree_disk_gb()
	 * @generated
	 * @ordered
	 */
	protected int free_disk_gb = FREE_DISK_GB_EDEFAULT;

	/**
	 * The default value of the '{@link #getHypervisor_version() <em>Hypervisor version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor_version()
	 * @generated
	 * @ordered
	 */
	protected static final int HYPERVISOR_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHypervisor_version() <em>Hypervisor version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor_version()
	 * @generated
	 * @ordered
	 */
	protected int hypervisor_version = HYPERVISOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_available_least() <em>Disk available least</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_available_least()
	 * @generated
	 * @ordered
	 */
	protected static final int DISK_AVAILABLE_LEAST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDisk_available_least() <em>Disk available least</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_available_least()
	 * @generated
	 * @ordered
	 */
	protected int disk_available_least = DISK_AVAILABLE_LEAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocal_gb() <em>Local gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal_gb()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCAL_GB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLocal_gb() <em>Local gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal_gb()
	 * @generated
	 * @ordered
	 */
	protected int local_gb = LOCAL_GB_EDEFAULT;

	/**
	 * The default value of the '{@link #getFree_ram_mb() <em>Free ram mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree_ram_mb()
	 * @generated
	 * @ordered
	 */
	protected static final int FREE_RAM_MB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFree_ram_mb() <em>Free ram mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree_ram_mb()
	 * @generated
	 * @ordered
	 */
	protected int free_ram_mb = FREE_RAM_MB_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypervisorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.HYPERVISOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorService getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(HypervisorService newService, NotificationChain msgs) {
		HypervisorService oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(HypervisorService newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocationPackage.HYPERVISOR__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocationPackage.HYPERVISOR__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost_ip() {
		return host_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost_ip(String newHost_ip) {
		String oldHost_ip = host_ip;
		host_ip = newHost_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__HOST_IP, oldHost_ip, host_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVcpus_used() {
		return vcpus_used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcpus_used(int newVcpus_used) {
		int oldVcpus_used = vcpus_used;
		vcpus_used = newVcpus_used;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__VCPUS_USED, oldVcpus_used, vcpus_used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHypervisor_type() {
		return hypervisor_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHypervisor_type(String newHypervisor_type) {
		String oldHypervisor_type = hypervisor_type;
		hypervisor_type = newHypervisor_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__HYPERVISOR_TYPE, oldHypervisor_type, hypervisor_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLocal_gb_used() {
		return local_gb_used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal_gb_used(int newLocal_gb_used) {
		int oldLocal_gb_used = local_gb_used;
		local_gb_used = newLocal_gb_used;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__LOCAL_GB_USED, oldLocal_gb_used, local_gb_used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHypervisor_hostname() {
		return hypervisor_hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHypervisor_hostname(String newHypervisor_hostname) {
		String oldHypervisor_hostname = hypervisor_hostname;
		hypervisor_hostname = newHypervisor_hostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__HYPERVISOR_HOSTNAME, oldHypervisor_hostname, hypervisor_hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory_mb_used() {
		return memory_mb_used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_mb_used(int newMemory_mb_used) {
		int oldMemory_mb_used = memory_mb_used;
		memory_mb_used = newMemory_mb_used;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__MEMORY_MB_USED, oldMemory_mb_used, memory_mb_used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory_mb() {
		return memory_mb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_mb(int newMemory_mb) {
		int oldMemory_mb = memory_mb;
		memory_mb = newMemory_mb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__MEMORY_MB, oldMemory_mb, memory_mb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrent_workload() {
		return current_workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_workload(int newCurrent_workload) {
		int oldCurrent_workload = current_workload;
		current_workload = newCurrent_workload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__CURRENT_WORKLOAD, oldCurrent_workload, current_workload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVcpus() {
		return vcpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcpus(int newVcpus) {
		int oldVcpus = vcpus;
		vcpus = newVcpus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__VCPUS, oldVcpus, vcpus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorCpuInfo getCpu_info() {
		return cpu_info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCpu_info(HypervisorCpuInfo newCpu_info, NotificationChain msgs) {
		HypervisorCpuInfo oldCpu_info = cpu_info;
		cpu_info = newCpu_info;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__CPU_INFO, oldCpu_info, newCpu_info);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu_info(HypervisorCpuInfo newCpu_info) {
		if (newCpu_info != cpu_info) {
			NotificationChain msgs = null;
			if (cpu_info != null)
				msgs = ((InternalEObject)cpu_info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocationPackage.HYPERVISOR__CPU_INFO, null, msgs);
			if (newCpu_info != null)
				msgs = ((InternalEObject)newCpu_info).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocationPackage.HYPERVISOR__CPU_INFO, null, msgs);
			msgs = basicSetCpu_info(newCpu_info, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__CPU_INFO, newCpu_info, newCpu_info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRunning_vms() {
		return running_vms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunning_vms(int newRunning_vms) {
		int oldRunning_vms = running_vms;
		running_vms = newRunning_vms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__RUNNING_VMS, oldRunning_vms, running_vms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFree_disk_gb() {
		return free_disk_gb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFree_disk_gb(int newFree_disk_gb) {
		int oldFree_disk_gb = free_disk_gb;
		free_disk_gb = newFree_disk_gb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__FREE_DISK_GB, oldFree_disk_gb, free_disk_gb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHypervisor_version() {
		return hypervisor_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHypervisor_version(int newHypervisor_version) {
		int oldHypervisor_version = hypervisor_version;
		hypervisor_version = newHypervisor_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__HYPERVISOR_VERSION, oldHypervisor_version, hypervisor_version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDisk_available_least() {
		return disk_available_least;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_available_least(int newDisk_available_least) {
		int oldDisk_available_least = disk_available_least;
		disk_available_least = newDisk_available_least;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__DISK_AVAILABLE_LEAST, oldDisk_available_least, disk_available_least));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLocal_gb() {
		return local_gb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal_gb(int newLocal_gb) {
		int oldLocal_gb = local_gb;
		local_gb = newLocal_gb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__LOCAL_GB, oldLocal_gb, local_gb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFree_ram_mb() {
		return free_ram_mb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFree_ram_mb(int newFree_ram_mb) {
		int oldFree_ram_mb = free_ram_mb;
		free_ram_mb = newFree_ram_mb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__FREE_RAM_MB, oldFree_ram_mb, free_ram_mb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationPackage.HYPERVISOR__SERVICE:
				return basicSetService(null, msgs);
			case LocationPackage.HYPERVISOR__CPU_INFO:
				return basicSetCpu_info(null, msgs);
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
			case LocationPackage.HYPERVISOR__SERVICE:
				return getService();
			case LocationPackage.HYPERVISOR__HOST_IP:
				return getHost_ip();
			case LocationPackage.HYPERVISOR__VCPUS_USED:
				return getVcpus_used();
			case LocationPackage.HYPERVISOR__HYPERVISOR_TYPE:
				return getHypervisor_type();
			case LocationPackage.HYPERVISOR__LOCAL_GB_USED:
				return getLocal_gb_used();
			case LocationPackage.HYPERVISOR__HYPERVISOR_HOSTNAME:
				return getHypervisor_hostname();
			case LocationPackage.HYPERVISOR__MEMORY_MB_USED:
				return getMemory_mb_used();
			case LocationPackage.HYPERVISOR__MEMORY_MB:
				return getMemory_mb();
			case LocationPackage.HYPERVISOR__CURRENT_WORKLOAD:
				return getCurrent_workload();
			case LocationPackage.HYPERVISOR__VCPUS:
				return getVcpus();
			case LocationPackage.HYPERVISOR__CPU_INFO:
				return getCpu_info();
			case LocationPackage.HYPERVISOR__RUNNING_VMS:
				return getRunning_vms();
			case LocationPackage.HYPERVISOR__FREE_DISK_GB:
				return getFree_disk_gb();
			case LocationPackage.HYPERVISOR__HYPERVISOR_VERSION:
				return getHypervisor_version();
			case LocationPackage.HYPERVISOR__DISK_AVAILABLE_LEAST:
				return getDisk_available_least();
			case LocationPackage.HYPERVISOR__LOCAL_GB:
				return getLocal_gb();
			case LocationPackage.HYPERVISOR__FREE_RAM_MB:
				return getFree_ram_mb();
			case LocationPackage.HYPERVISOR__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LocationPackage.HYPERVISOR__SERVICE:
				setService((HypervisorService)newValue);
				return;
			case LocationPackage.HYPERVISOR__HOST_IP:
				setHost_ip((String)newValue);
				return;
			case LocationPackage.HYPERVISOR__VCPUS_USED:
				setVcpus_used((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR__HYPERVISOR_TYPE:
				setHypervisor_type((String)newValue);
				return;
			case LocationPackage.HYPERVISOR__LOCAL_GB_USED:
				setLocal_gb_used((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR__HYPERVISOR_HOSTNAME:
				setHypervisor_hostname((String)newValue);
				return;
			case LocationPackage.HYPERVISOR__MEMORY_MB_USED:
				setMemory_mb_used((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR__MEMORY_MB:
				setMemory_mb((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR__CURRENT_WORKLOAD:
				setCurrent_workload((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR__VCPUS:
				setVcpus((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR__CPU_INFO:
				setCpu_info((HypervisorCpuInfo)newValue);
				return;
			case LocationPackage.HYPERVISOR__RUNNING_VMS:
				setRunning_vms((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR__FREE_DISK_GB:
				setFree_disk_gb((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR__HYPERVISOR_VERSION:
				setHypervisor_version((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR__DISK_AVAILABLE_LEAST:
				setDisk_available_least((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR__LOCAL_GB:
				setLocal_gb((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR__FREE_RAM_MB:
				setFree_ram_mb((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR__ID:
				setId((Integer)newValue);
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
			case LocationPackage.HYPERVISOR__SERVICE:
				setService((HypervisorService)null);
				return;
			case LocationPackage.HYPERVISOR__HOST_IP:
				setHost_ip(HOST_IP_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__VCPUS_USED:
				setVcpus_used(VCPUS_USED_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__HYPERVISOR_TYPE:
				setHypervisor_type(HYPERVISOR_TYPE_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__LOCAL_GB_USED:
				setLocal_gb_used(LOCAL_GB_USED_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__HYPERVISOR_HOSTNAME:
				setHypervisor_hostname(HYPERVISOR_HOSTNAME_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__MEMORY_MB_USED:
				setMemory_mb_used(MEMORY_MB_USED_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__MEMORY_MB:
				setMemory_mb(MEMORY_MB_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__CURRENT_WORKLOAD:
				setCurrent_workload(CURRENT_WORKLOAD_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__VCPUS:
				setVcpus(VCPUS_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__CPU_INFO:
				setCpu_info((HypervisorCpuInfo)null);
				return;
			case LocationPackage.HYPERVISOR__RUNNING_VMS:
				setRunning_vms(RUNNING_VMS_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__FREE_DISK_GB:
				setFree_disk_gb(FREE_DISK_GB_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__HYPERVISOR_VERSION:
				setHypervisor_version(HYPERVISOR_VERSION_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__DISK_AVAILABLE_LEAST:
				setDisk_available_least(DISK_AVAILABLE_LEAST_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__LOCAL_GB:
				setLocal_gb(LOCAL_GB_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__FREE_RAM_MB:
				setFree_ram_mb(FREE_RAM_MB_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR__ID:
				setId(ID_EDEFAULT);
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
			case LocationPackage.HYPERVISOR__SERVICE:
				return service != null;
			case LocationPackage.HYPERVISOR__HOST_IP:
				return HOST_IP_EDEFAULT == null ? host_ip != null : !HOST_IP_EDEFAULT.equals(host_ip);
			case LocationPackage.HYPERVISOR__VCPUS_USED:
				return vcpus_used != VCPUS_USED_EDEFAULT;
			case LocationPackage.HYPERVISOR__HYPERVISOR_TYPE:
				return HYPERVISOR_TYPE_EDEFAULT == null ? hypervisor_type != null : !HYPERVISOR_TYPE_EDEFAULT.equals(hypervisor_type);
			case LocationPackage.HYPERVISOR__LOCAL_GB_USED:
				return local_gb_used != LOCAL_GB_USED_EDEFAULT;
			case LocationPackage.HYPERVISOR__HYPERVISOR_HOSTNAME:
				return HYPERVISOR_HOSTNAME_EDEFAULT == null ? hypervisor_hostname != null : !HYPERVISOR_HOSTNAME_EDEFAULT.equals(hypervisor_hostname);
			case LocationPackage.HYPERVISOR__MEMORY_MB_USED:
				return memory_mb_used != MEMORY_MB_USED_EDEFAULT;
			case LocationPackage.HYPERVISOR__MEMORY_MB:
				return memory_mb != MEMORY_MB_EDEFAULT;
			case LocationPackage.HYPERVISOR__CURRENT_WORKLOAD:
				return current_workload != CURRENT_WORKLOAD_EDEFAULT;
			case LocationPackage.HYPERVISOR__VCPUS:
				return vcpus != VCPUS_EDEFAULT;
			case LocationPackage.HYPERVISOR__CPU_INFO:
				return cpu_info != null;
			case LocationPackage.HYPERVISOR__RUNNING_VMS:
				return running_vms != RUNNING_VMS_EDEFAULT;
			case LocationPackage.HYPERVISOR__FREE_DISK_GB:
				return free_disk_gb != FREE_DISK_GB_EDEFAULT;
			case LocationPackage.HYPERVISOR__HYPERVISOR_VERSION:
				return hypervisor_version != HYPERVISOR_VERSION_EDEFAULT;
			case LocationPackage.HYPERVISOR__DISK_AVAILABLE_LEAST:
				return disk_available_least != DISK_AVAILABLE_LEAST_EDEFAULT;
			case LocationPackage.HYPERVISOR__LOCAL_GB:
				return local_gb != LOCAL_GB_EDEFAULT;
			case LocationPackage.HYPERVISOR__FREE_RAM_MB:
				return free_ram_mb != FREE_RAM_MB_EDEFAULT;
			case LocationPackage.HYPERVISOR__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (host_ip: ");
		result.append(host_ip);
		result.append(", vcpus_used: ");
		result.append(vcpus_used);
		result.append(", hypervisor_type: ");
		result.append(hypervisor_type);
		result.append(", local_gb_used: ");
		result.append(local_gb_used);
		result.append(", hypervisor_hostname: ");
		result.append(hypervisor_hostname);
		result.append(", memory_mb_used: ");
		result.append(memory_mb_used);
		result.append(", memory_mb: ");
		result.append(memory_mb);
		result.append(", current_workload: ");
		result.append(current_workload);
		result.append(", vcpus: ");
		result.append(vcpus);
		result.append(", running_vms: ");
		result.append(running_vms);
		result.append(", free_disk_gb: ");
		result.append(free_disk_gb);
		result.append(", hypervisor_version: ");
		result.append(hypervisor_version);
		result.append(", disk_available_least: ");
		result.append(disk_available_least);
		result.append(", local_gb: ");
		result.append(local_gb);
		result.append(", free_ram_mb: ");
		result.append(free_ram_mb);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //HypervisorImpl
