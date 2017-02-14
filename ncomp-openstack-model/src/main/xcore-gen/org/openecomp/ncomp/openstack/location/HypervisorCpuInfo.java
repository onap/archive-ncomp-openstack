
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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypervisor Cpu Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getModel <em>Model</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getArch <em>Arch</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getTopology <em>Topology</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorCpuInfo()
 * @model
 * @generated
 */
public interface HypervisorCpuInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorCpuInfo_Vendor()
	 * @model unique="false"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorCpuInfo_Model()
	 * @model unique="false"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch</em>' attribute.
	 * @see #setArch(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorCpuInfo_Arch()
	 * @model unique="false"
	 * @generated
	 */
	String getArch();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getArch <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch</em>' attribute.
	 * @see #getArch()
	 * @generated
	 */
	void setArch(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorCpuInfo_Features()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getFeatures();

	/**
	 * Returns the value of the '<em><b>Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topology</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology</em>' containment reference.
	 * @see #setTopology(HypervisorCpuTopology)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorCpuInfo_Topology()
	 * @model containment="true"
	 * @generated
	 */
	HypervisorCpuTopology getTopology();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getTopology <em>Topology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology</em>' containment reference.
	 * @see #getTopology()
	 * @generated
	 */
	void setTopology(HypervisorCpuTopology value);

} // HypervisorCpuInfo
