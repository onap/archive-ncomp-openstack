
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
 * A representation of the model object '<em><b>Flavor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Flavor#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Flavor#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Flavor#getRam <em>Ram</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Flavor#getDisk <em>Disk</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Flavor#getVcpus <em>Vcpus</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Flavor#getSwap <em>Swap</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Flavor#getRxtx_factor <em>Rxtx factor</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Flavor#getOS_FLV_EXT_DATA_ephemeral <em>OS FLV EXT DATA ephemeral</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Flavor#isOS_FLV_DISABLED_disabled <em>OS FLV DISABLED disabled</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Flavor#isOs_flavor_access_is_public <em>Os flavor access is public</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Flavor#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFlavor()
 * @model
 * @generated
 */
public interface Flavor extends EObject {
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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFlavor_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Flavor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFlavor_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Flavor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram</em>' attribute.
	 * @see #setRam(int)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFlavor_Ram()
	 * @model unique="false"
	 * @generated
	 */
	int getRam();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Flavor#getRam <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram</em>' attribute.
	 * @see #getRam()
	 * @generated
	 */
	void setRam(int value);

	/**
	 * Returns the value of the '<em><b>Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk</em>' attribute.
	 * @see #setDisk(int)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFlavor_Disk()
	 * @model unique="false"
	 * @generated
	 */
	int getDisk();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Flavor#getDisk <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk</em>' attribute.
	 * @see #getDisk()
	 * @generated
	 */
	void setDisk(int value);

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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFlavor_Vcpus()
	 * @model unique="false"
	 * @generated
	 */
	int getVcpus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Flavor#getVcpus <em>Vcpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vcpus</em>' attribute.
	 * @see #getVcpus()
	 * @generated
	 */
	void setVcpus(int value);

	/**
	 * Returns the value of the '<em><b>Swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swap</em>' attribute.
	 * @see #setSwap(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFlavor_Swap()
	 * @model unique="false"
	 * @generated
	 */
	String getSwap();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Flavor#getSwap <em>Swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swap</em>' attribute.
	 * @see #getSwap()
	 * @generated
	 */
	void setSwap(String value);

	/**
	 * Returns the value of the '<em><b>Rxtx factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rxtx factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rxtx factor</em>' attribute.
	 * @see #setRxtx_factor(double)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFlavor_Rxtx_factor()
	 * @model unique="false"
	 * @generated
	 */
	double getRxtx_factor();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Flavor#getRxtx_factor <em>Rxtx factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rxtx factor</em>' attribute.
	 * @see #getRxtx_factor()
	 * @generated
	 */
	void setRxtx_factor(double value);

	/**
	 * Returns the value of the '<em><b>OS FLV EXT DATA ephemeral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS FLV EXT DATA ephemeral</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS FLV EXT DATA ephemeral</em>' attribute.
	 * @see #setOS_FLV_EXT_DATA_ephemeral(int)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFlavor_OS_FLV_EXT_DATA_ephemeral()
	 * @model unique="false"
	 * @generated
	 */
	int getOS_FLV_EXT_DATA_ephemeral();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Flavor#getOS_FLV_EXT_DATA_ephemeral <em>OS FLV EXT DATA ephemeral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS FLV EXT DATA ephemeral</em>' attribute.
	 * @see #getOS_FLV_EXT_DATA_ephemeral()
	 * @generated
	 */
	void setOS_FLV_EXT_DATA_ephemeral(int value);

	/**
	 * Returns the value of the '<em><b>OS FLV DISABLED disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS FLV DISABLED disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS FLV DISABLED disabled</em>' attribute.
	 * @see #setOS_FLV_DISABLED_disabled(boolean)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFlavor_OS_FLV_DISABLED_disabled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOS_FLV_DISABLED_disabled();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Flavor#isOS_FLV_DISABLED_disabled <em>OS FLV DISABLED disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS FLV DISABLED disabled</em>' attribute.
	 * @see #isOS_FLV_DISABLED_disabled()
	 * @generated
	 */
	void setOS_FLV_DISABLED_disabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Os flavor access is public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os flavor access is public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os flavor access is public</em>' attribute.
	 * @see #setOs_flavor_access_is_public(boolean)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFlavor_Os_flavor_access_is_public()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOs_flavor_access_is_public();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Flavor#isOs_flavor_access_is_public <em>Os flavor access is public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os flavor access is public</em>' attribute.
	 * @see #isOs_flavor_access_is_public()
	 * @generated
	 */
	void setOs_flavor_access_is_public(boolean value);

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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFlavor_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Flavor
