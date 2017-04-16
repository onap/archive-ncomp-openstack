
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
package org.openecomp.ncomp.openstack.core;

import org.openecomp.ncomp.core.DeploymentStatus;
import org.openecomp.ncomp.core.NamedEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getNumberOfCores <em>Number Of Cores</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getMemorySizeMB <em>Memory Size MB</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getRootDiskSizeGB <em>Root Disk Size GB</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getDiskSizeGB <em>Disk Size GB</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getVolumeSizeGB <em>Volume Size GB</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getImageName <em>Image Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getFlavorName <em>Flavor Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#isNeedPublicIp <em>Need Public Ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getDeploymentStatus <em>Deployment Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getIncomingSecurityRules <em>Incoming Security Rules</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getOutboundSecurityRules <em>Outbound Security Rules</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType()
 * @model
 * @generated
 */
public interface VirtualMachineType extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Cores</em>' attribute.
	 * @see #setNumberOfCores(int)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType_NumberOfCores()
	 * @model unique="false"
	 * @generated
	 */
	int getNumberOfCores();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getNumberOfCores <em>Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Cores</em>' attribute.
	 * @see #getNumberOfCores()
	 * @generated
	 */
	void setNumberOfCores(int value);

	/**
	 * Returns the value of the '<em><b>Memory Size MB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Size MB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Size MB</em>' attribute.
	 * @see #setMemorySizeMB(int)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType_MemorySizeMB()
	 * @model unique="false"
	 * @generated
	 */
	int getMemorySizeMB();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getMemorySizeMB <em>Memory Size MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size MB</em>' attribute.
	 * @see #getMemorySizeMB()
	 * @generated
	 */
	void setMemorySizeMB(int value);

	/**
	 * Returns the value of the '<em><b>Root Disk Size GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Disk Size GB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Disk Size GB</em>' attribute.
	 * @see #setRootDiskSizeGB(int)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType_RootDiskSizeGB()
	 * @model unique="false"
	 * @generated
	 */
	int getRootDiskSizeGB();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getRootDiskSizeGB <em>Root Disk Size GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Disk Size GB</em>' attribute.
	 * @see #getRootDiskSizeGB()
	 * @generated
	 */
	void setRootDiskSizeGB(int value);

	/**
	 * Returns the value of the '<em><b>Disk Size GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk Size GB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk Size GB</em>' attribute.
	 * @see #setDiskSizeGB(int)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType_DiskSizeGB()
	 * @model unique="false"
	 * @generated
	 */
	int getDiskSizeGB();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getDiskSizeGB <em>Disk Size GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Size GB</em>' attribute.
	 * @see #getDiskSizeGB()
	 * @generated
	 */
	void setDiskSizeGB(int value);

	/**
	 * Returns the value of the '<em><b>Volume Size GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Size GB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Size GB</em>' attribute.
	 * @see #setVolumeSizeGB(int)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType_VolumeSizeGB()
	 * @model unique="false"
	 * @generated
	 */
	int getVolumeSizeGB();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getVolumeSizeGB <em>Volume Size GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Size GB</em>' attribute.
	 * @see #getVolumeSizeGB()
	 * @generated
	 */
	void setVolumeSizeGB(int value);

	/**
	 * Returns the value of the '<em><b>Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Name</em>' attribute.
	 * @see #setImageName(String)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType_ImageName()
	 * @model unique="false"
	 * @generated
	 */
	String getImageName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getImageName <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Name</em>' attribute.
	 * @see #getImageName()
	 * @generated
	 */
	void setImageName(String value);

	/**
	 * Returns the value of the '<em><b>Flavor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flavor Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flavor Name</em>' attribute.
	 * @see #setFlavorName(String)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType_FlavorName()
	 * @model unique="false"
	 * @generated
	 */
	String getFlavorName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getFlavorName <em>Flavor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor Name</em>' attribute.
	 * @see #getFlavorName()
	 * @generated
	 */
	void setFlavorName(String value);

	/**
	 * Returns the value of the '<em><b>Need Public Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need Public Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need Public Ip</em>' attribute.
	 * @see #setNeedPublicIp(boolean)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType_NeedPublicIp()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNeedPublicIp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#isNeedPublicIp <em>Need Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need Public Ip</em>' attribute.
	 * @see #isNeedPublicIp()
	 * @generated
	 */
	void setNeedPublicIp(boolean value);

	/**
	 * Returns the value of the '<em><b>Deployment Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.core.DeploymentStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Status</em>' attribute.
	 * @see org.openecomp.ncomp.core.DeploymentStatus
	 * @see #setDeploymentStatus(DeploymentStatus)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType_DeploymentStatus()
	 * @model unique="false"
	 * @generated
	 */
	DeploymentStatus getDeploymentStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getDeploymentStatus <em>Deployment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Status</em>' attribute.
	 * @see org.openecomp.ncomp.core.DeploymentStatus
	 * @see #getDeploymentStatus()
	 * @generated
	 */
	void setDeploymentStatus(DeploymentStatus value);

	/**
	 * Returns the value of the '<em><b>Incoming Security Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.core.SecurityRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Security Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Security Rules</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType_IncomingSecurityRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRule> getIncomingSecurityRules();

	/**
	 * Returns the value of the '<em><b>Outbound Security Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.core.SecurityRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Security Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Security Rules</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getVirtualMachineType_OutboundSecurityRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRule> getOutboundSecurityRules();

} // VirtualMachineType
