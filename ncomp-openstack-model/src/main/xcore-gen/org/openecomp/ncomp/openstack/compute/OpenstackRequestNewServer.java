
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

import org.openecomp.ncomp.openstack.core.OpenStackRequest;
import org.openecomp.ncomp.openstack.core.VirtualMachineType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Openstack Request New Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getHypervisor <em>Hypervisor</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getUser <em>User</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getUser_data <em>User data</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getFloatingIp <em>Floating Ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getVmType <em>Vm Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getOpenstackRequestNewServer()
 * @model
 * @generated
 */
public interface OpenstackRequestNewServer extends OpenStackRequest {
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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getOpenstackRequestNewServer_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hypervisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypervisor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypervisor</em>' attribute.
	 * @see #setHypervisor(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getOpenstackRequestNewServer_Hypervisor()
	 * @model unique="false"
	 * @generated
	 */
	String getHypervisor();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getHypervisor <em>Hypervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hypervisor</em>' attribute.
	 * @see #getHypervisor()
	 * @generated
	 */
	void setHypervisor(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getOpenstackRequestNewServer_User()
	 * @model unique="false"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getOpenstackRequestNewServer_Networks()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getNetworks();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getOpenstackRequestNewServer_Ports()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPorts();

	/**
	 * Returns the value of the '<em><b>User data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User data</em>' attribute.
	 * @see #setUser_data(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getOpenstackRequestNewServer_User_data()
	 * @model unique="false"
	 * @generated
	 */
	String getUser_data();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getUser_data <em>User data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User data</em>' attribute.
	 * @see #getUser_data()
	 * @generated
	 */
	void setUser_data(String value);

	/**
	 * Returns the value of the '<em><b>Floating Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating Ip</em>' attribute.
	 * @see #setFloatingIp(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getOpenstackRequestNewServer_FloatingIp()
	 * @model unique="false"
	 * @generated
	 */
	String getFloatingIp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getFloatingIp <em>Floating Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating Ip</em>' attribute.
	 * @see #getFloatingIp()
	 * @generated
	 */
	void setFloatingIp(String value);

	/**
	 * Returns the value of the '<em><b>Vm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Type</em>' containment reference.
	 * @see #setVmType(VirtualMachineType)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getOpenstackRequestNewServer_VmType()
	 * @model containment="true"
	 * @generated
	 */
	VirtualMachineType getVmType();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getVmType <em>Vm Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Type</em>' containment reference.
	 * @see #getVmType()
	 * @generated
	 */
	void setVmType(VirtualMachineType value);

} // OpenstackRequestNewServer
