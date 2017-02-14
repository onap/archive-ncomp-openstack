
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.openstack.location.LocationPackage
 * @generated
 */
public interface LocationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LocationFactory eINSTANCE = org.openecomp.ncomp.openstack.location.impl.LocationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Open Stack Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Stack Location</em>'.
	 * @generated
	 */
	OpenStackLocation createOpenStackLocation();

	/**
	 * Returns a new object of class '<em>Open Stack Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Stack Project</em>'.
	 * @generated
	 */
	OpenStackProject createOpenStackProject();

	/**
	 * Returns a new object of class '<em>Open Stack User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Stack User</em>'.
	 * @generated
	 */
	OpenStackUser createOpenStackUser();

	/**
	 * Returns a new object of class '<em>Hypervisor Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hypervisor Service</em>'.
	 * @generated
	 */
	HypervisorService createHypervisorService();

	/**
	 * Returns a new object of class '<em>Hypervisor Cpu Topology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hypervisor Cpu Topology</em>'.
	 * @generated
	 */
	HypervisorCpuTopology createHypervisorCpuTopology();

	/**
	 * Returns a new object of class '<em>Hypervisor Cpu Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hypervisor Cpu Info</em>'.
	 * @generated
	 */
	HypervisorCpuInfo createHypervisorCpuInfo();

	/**
	 * Returns a new object of class '<em>Hypervisor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hypervisor</em>'.
	 * @generated
	 */
	Hypervisor createHypervisor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LocationPackage getLocationPackage();

} //LocationFactory
