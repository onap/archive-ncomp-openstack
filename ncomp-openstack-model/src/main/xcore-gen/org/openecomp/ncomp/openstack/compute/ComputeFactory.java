
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage
 * @generated
 */
public interface ComputeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComputeFactory eINSTANCE = org.openecomp.ncomp.openstack.compute.impl.ComputeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Openstack Request New Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Openstack Request New Server</em>'.
	 * @generated
	 */
	OpenstackRequestNewServer createOpenstackRequestNewServer();

	/**
	 * Returns a new object of class '<em>Openstack Request Key Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Openstack Request Key Pair</em>'.
	 * @generated
	 */
	OpenstackRequestKeyPair createOpenstackRequestKeyPair();

	/**
	 * Returns a new object of class '<em>Openstack Request Flavor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Openstack Request Flavor</em>'.
	 * @generated
	 */
	OpenstackRequestFlavor createOpenstackRequestFlavor();

	/**
	 * Returns a new object of class '<em>Openstack Request Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Openstack Request Security Group</em>'.
	 * @generated
	 */
	OpenstackRequestSecurityGroup createOpenstackRequestSecurityGroup();

	/**
	 * Returns a new object of class '<em>Openstack Request Server Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Openstack Request Server Action</em>'.
	 * @generated
	 */
	OpenstackRequestServerAction createOpenstackRequestServerAction();

	/**
	 * Returns a new object of class '<em>Openstack Request Poll</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Openstack Request Poll</em>'.
	 * @generated
	 */
	OpenstackRequestPoll createOpenstackRequestPoll();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Flavor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flavor</em>'.
	 * @generated
	 */
	Flavor createFlavor();

	/**
	 * Returns a new object of class '<em>Addresses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addresses</em>'.
	 * @generated
	 */
	Addresses createAddresses();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata</em>'.
	 * @generated
	 */
	Metadata createMetadata();

	/**
	 * Returns a new object of class '<em>Fault</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault</em>'.
	 * @generated
	 */
	Fault createFault();

	/**
	 * Returns a new object of class '<em>Personality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personality</em>'.
	 * @generated
	 */
	Personality createPersonality();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume</em>'.
	 * @generated
	 */
	Volume createVolume();

	/**
	 * Returns a new object of class '<em>Volume Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume Attachment</em>'.
	 * @generated
	 */
	VolumeAttachment createVolumeAttachment();

	/**
	 * Returns a new object of class '<em>Floating Ip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floating Ip</em>'.
	 * @generated
	 */
	FloatingIp createFloatingIp();

	/**
	 * Returns a new object of class '<em>Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Group</em>'.
	 * @generated
	 */
	SecurityGroup createSecurityGroup();

	/**
	 * Returns a new object of class '<em>Security Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Rule</em>'.
	 * @generated
	 */
	SecurityRule createSecurityRule();

	/**
	 * Returns a new object of class '<em>Security Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Range</em>'.
	 * @generated
	 */
	SecurityRange createSecurityRange();

	/**
	 * Returns a new object of class '<em>Key Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Pair</em>'.
	 * @generated
	 */
	KeyPair createKeyPair();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComputePackage getComputePackage();

} //ComputeFactory
