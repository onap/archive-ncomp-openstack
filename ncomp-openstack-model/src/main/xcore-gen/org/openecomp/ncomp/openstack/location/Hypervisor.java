
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
package org.openecomp.ncomp.openstack.location;

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypervisor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getService <em>Service</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getHost_ip <em>Host ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getVcpus_used <em>Vcpus used</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getHypervisor_type <em>Hypervisor type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getLocal_gb_used <em>Local gb used</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getHypervisor_hostname <em>Hypervisor hostname</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getMemory_mb_used <em>Memory mb used</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getMemory_mb <em>Memory mb</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getCurrent_workload <em>Current workload</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getVcpus <em>Vcpus</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getCpu_info <em>Cpu info</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getRunning_vms <em>Running vms</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getFree_disk_gb <em>Free disk gb</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getHypervisor_version <em>Hypervisor version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getDisk_available_least <em>Disk available least</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getLocal_gb <em>Local gb</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getFree_ram_mb <em>Free ram mb</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.Hypervisor#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor()
 * @model
 * @generated
 */
public interface Hypervisor extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(HypervisorService)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Service()
	 * @model containment="true"
	 * @generated
	 */
	HypervisorService getService();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(HypervisorService value);

	/**
	 * Returns the value of the '<em><b>Host ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host ip</em>' attribute.
	 * @see #setHost_ip(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Host_ip()
	 * @model unique="false"
	 * @generated
	 */
	String getHost_ip();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getHost_ip <em>Host ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host ip</em>' attribute.
	 * @see #getHost_ip()
	 * @generated
	 */
	void setHost_ip(String value);

	/**
	 * Returns the value of the '<em><b>Vcpus used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vcpus used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vcpus used</em>' attribute.
	 * @see #setVcpus_used(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Vcpus_used()
	 * @model unique="false"
	 * @generated
	 */
	int getVcpus_used();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getVcpus_used <em>Vcpus used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vcpus used</em>' attribute.
	 * @see #getVcpus_used()
	 * @generated
	 */
	void setVcpus_used(int value);

	/**
	 * Returns the value of the '<em><b>Hypervisor type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypervisor type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypervisor type</em>' attribute.
	 * @see #setHypervisor_type(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Hypervisor_type()
	 * @model unique="false"
	 * @generated
	 */
	String getHypervisor_type();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getHypervisor_type <em>Hypervisor type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hypervisor type</em>' attribute.
	 * @see #getHypervisor_type()
	 * @generated
	 */
	void setHypervisor_type(String value);

	/**
	 * Returns the value of the '<em><b>Local gb used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local gb used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local gb used</em>' attribute.
	 * @see #setLocal_gb_used(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Local_gb_used()
	 * @model unique="false"
	 * @generated
	 */
	int getLocal_gb_used();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getLocal_gb_used <em>Local gb used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local gb used</em>' attribute.
	 * @see #getLocal_gb_used()
	 * @generated
	 */
	void setLocal_gb_used(int value);

	/**
	 * Returns the value of the '<em><b>Hypervisor hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypervisor hostname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypervisor hostname</em>' attribute.
	 * @see #setHypervisor_hostname(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Hypervisor_hostname()
	 * @model unique="false"
	 * @generated
	 */
	String getHypervisor_hostname();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getHypervisor_hostname <em>Hypervisor hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hypervisor hostname</em>' attribute.
	 * @see #getHypervisor_hostname()
	 * @generated
	 */
	void setHypervisor_hostname(String value);

	/**
	 * Returns the value of the '<em><b>Memory mb used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory mb used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory mb used</em>' attribute.
	 * @see #setMemory_mb_used(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Memory_mb_used()
	 * @model unique="false"
	 * @generated
	 */
	int getMemory_mb_used();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getMemory_mb_used <em>Memory mb used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory mb used</em>' attribute.
	 * @see #getMemory_mb_used()
	 * @generated
	 */
	void setMemory_mb_used(int value);

	/**
	 * Returns the value of the '<em><b>Memory mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory mb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory mb</em>' attribute.
	 * @see #setMemory_mb(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Memory_mb()
	 * @model unique="false"
	 * @generated
	 */
	int getMemory_mb();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getMemory_mb <em>Memory mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory mb</em>' attribute.
	 * @see #getMemory_mb()
	 * @generated
	 */
	void setMemory_mb(int value);

	/**
	 * Returns the value of the '<em><b>Current workload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current workload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current workload</em>' attribute.
	 * @see #setCurrent_workload(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Current_workload()
	 * @model unique="false"
	 * @generated
	 */
	int getCurrent_workload();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getCurrent_workload <em>Current workload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current workload</em>' attribute.
	 * @see #getCurrent_workload()
	 * @generated
	 */
	void setCurrent_workload(int value);

	/**
	 * Returns the value of the '<em><b>Vcpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vcpus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vcpus</em>' attribute.
	 * @see #setVcpus(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Vcpus()
	 * @model unique="false"
	 * @generated
	 */
	int getVcpus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getVcpus <em>Vcpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vcpus</em>' attribute.
	 * @see #getVcpus()
	 * @generated
	 */
	void setVcpus(int value);

	/**
	 * Returns the value of the '<em><b>Cpu info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu info</em>' containment reference.
	 * @see #setCpu_info(HypervisorCpuInfo)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Cpu_info()
	 * @model containment="true"
	 * @generated
	 */
	HypervisorCpuInfo getCpu_info();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getCpu_info <em>Cpu info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu info</em>' containment reference.
	 * @see #getCpu_info()
	 * @generated
	 */
	void setCpu_info(HypervisorCpuInfo value);

	/**
	 * Returns the value of the '<em><b>Running vms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running vms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running vms</em>' attribute.
	 * @see #setRunning_vms(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Running_vms()
	 * @model unique="false"
	 * @generated
	 */
	int getRunning_vms();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getRunning_vms <em>Running vms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running vms</em>' attribute.
	 * @see #getRunning_vms()
	 * @generated
	 */
	void setRunning_vms(int value);

	/**
	 * Returns the value of the '<em><b>Free disk gb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free disk gb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free disk gb</em>' attribute.
	 * @see #setFree_disk_gb(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Free_disk_gb()
	 * @model unique="false"
	 * @generated
	 */
	int getFree_disk_gb();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getFree_disk_gb <em>Free disk gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free disk gb</em>' attribute.
	 * @see #getFree_disk_gb()
	 * @generated
	 */
	void setFree_disk_gb(int value);

	/**
	 * Returns the value of the '<em><b>Hypervisor version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypervisor version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypervisor version</em>' attribute.
	 * @see #setHypervisor_version(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Hypervisor_version()
	 * @model unique="false"
	 * @generated
	 */
	int getHypervisor_version();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getHypervisor_version <em>Hypervisor version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hypervisor version</em>' attribute.
	 * @see #getHypervisor_version()
	 * @generated
	 */
	void setHypervisor_version(int value);

	/**
	 * Returns the value of the '<em><b>Disk available least</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk available least</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk available least</em>' attribute.
	 * @see #setDisk_available_least(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Disk_available_least()
	 * @model unique="false"
	 * @generated
	 */
	int getDisk_available_least();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getDisk_available_least <em>Disk available least</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk available least</em>' attribute.
	 * @see #getDisk_available_least()
	 * @generated
	 */
	void setDisk_available_least(int value);

	/**
	 * Returns the value of the '<em><b>Local gb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local gb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local gb</em>' attribute.
	 * @see #setLocal_gb(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Local_gb()
	 * @model unique="false"
	 * @generated
	 */
	int getLocal_gb();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getLocal_gb <em>Local gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local gb</em>' attribute.
	 * @see #getLocal_gb()
	 * @generated
	 */
	void setLocal_gb(int value);

	/**
	 * Returns the value of the '<em><b>Free ram mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free ram mb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free ram mb</em>' attribute.
	 * @see #setFree_ram_mb(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Free_ram_mb()
	 * @model unique="false"
	 * @generated
	 */
	int getFree_ram_mb();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getFree_ram_mb <em>Free ram mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free ram mb</em>' attribute.
	 * @see #getFree_ram_mb()
	 * @generated
	 */
	void setFree_ram_mb(int value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisor_Id()
	 * @model unique="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Hypervisor
