
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypervisor Cpu Topology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.location.HypervisorCpuTopology#getCores <em>Cores</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.HypervisorCpuTopology#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.HypervisorCpuTopology#getSockets <em>Sockets</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorCpuTopology()
 * @model
 * @generated
 */
public interface HypervisorCpuTopology extends EObject {
	/**
	 * Returns the value of the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' attribute.
	 * @see #setCores(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorCpuTopology_Cores()
	 * @model unique="false"
	 * @generated
	 */
	int getCores();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuTopology#getCores <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores</em>' attribute.
	 * @see #getCores()
	 * @generated
	 */
	void setCores(int value);

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' attribute.
	 * @see #setThreads(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorCpuTopology_Threads()
	 * @model unique="false"
	 * @generated
	 */
	int getThreads();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuTopology#getThreads <em>Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threads</em>' attribute.
	 * @see #getThreads()
	 * @generated
	 */
	void setThreads(int value);

	/**
	 * Returns the value of the '<em><b>Sockets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sockets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sockets</em>' attribute.
	 * @see #setSockets(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorCpuTopology_Sockets()
	 * @model unique="false"
	 * @generated
	 */
	int getSockets();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuTopology#getSockets <em>Sockets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sockets</em>' attribute.
	 * @see #getSockets()
	 * @generated
	 */
	void setSockets(int value);

} // HypervisorCpuTopology
