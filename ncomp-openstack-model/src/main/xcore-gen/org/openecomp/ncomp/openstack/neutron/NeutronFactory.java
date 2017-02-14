
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
package org.openecomp.ncomp.openstack.neutron;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage
 * @generated
 */
public interface NeutronFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NeutronFactory eINSTANCE = org.openecomp.ncomp.openstack.neutron.impl.NeutronFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subnet</em>'.
	 * @generated
	 */
	Subnet createSubnet();

	/**
	 * Returns a new object of class '<em>Allocation Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Pool</em>'.
	 * @generated
	 */
	AllocationPool createAllocationPool();

	/**
	 * Returns a new object of class '<em>Router</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Router</em>'.
	 * @generated
	 */
	Router createRouter();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Group</em>'.
	 * @generated
	 */
	NeutronSecurityGroup createNeutronSecurityGroup();

	/**
	 * Returns a new object of class '<em>Security Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Rule</em>'.
	 * @generated
	 */
	NeutronSecurityRule createNeutronSecurityRule();

	/**
	 * Returns a new object of class '<em>Floating Ip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floating Ip</em>'.
	 * @generated
	 */
	NeutronFloatingIp createNeutronFloatingIp();

	/**
	 * Returns a new object of class '<em>Binding Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Profile</em>'.
	 * @generated
	 */
	BindingProfile createBindingProfile();

	/**
	 * Returns a new object of class '<em>Binding Vif Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Vif Detail</em>'.
	 * @generated
	 */
	BindingVifDetail createBindingVifDetail();

	/**
	 * Returns a new object of class '<em>Fixed Ip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Ip</em>'.
	 * @generated
	 */
	FixedIp createFixedIp();

	/**
	 * Returns a new object of class '<em>External Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Gateway</em>'.
	 * @generated
	 */
	ExternalGateway createExternalGateway();

	/**
	 * Returns a new object of class '<em>Create Network Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Network Request</em>'.
	 * @generated
	 */
	CreateNetworkRequest createCreateNetworkRequest();

	/**
	 * Returns a new object of class '<em>Create Subnet Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Subnet Request</em>'.
	 * @generated
	 */
	CreateSubnetRequest createCreateSubnetRequest();

	/**
	 * Returns a new object of class '<em>Create Router Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Router Request</em>'.
	 * @generated
	 */
	CreateRouterRequest createCreateRouterRequest();

	/**
	 * Returns a new object of class '<em>Create Port Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Port Request</em>'.
	 * @generated
	 */
	CreatePortRequest createCreatePortRequest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NeutronPackage getNeutronPackage();

} //NeutronFactory
