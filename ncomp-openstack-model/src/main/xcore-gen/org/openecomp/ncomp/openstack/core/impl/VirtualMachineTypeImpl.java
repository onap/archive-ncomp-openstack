
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
package org.openecomp.ncomp.openstack.core.impl;

import org.openecomp.ncomp.core.DeploymentStatus;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.openecomp.ncomp.openstack.core.CorePackage;
import org.openecomp.ncomp.openstack.core.SecurityRule;
import org.openecomp.ncomp.openstack.core.VirtualMachineType;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl#getNumberOfCores <em>Number Of Cores</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl#getMemorySizeMB <em>Memory Size MB</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl#getRootDiskSizeGB <em>Root Disk Size GB</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl#getDiskSizeGB <em>Disk Size GB</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl#getVolumeSizeGB <em>Volume Size GB</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl#getImageName <em>Image Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl#getFlavorName <em>Flavor Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl#isNeedPublicIp <em>Need Public Ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl#getDeploymentStatus <em>Deployment Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl#getIncomingSecurityRules <em>Incoming Security Rules</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl#getOutboundSecurityRules <em>Outbound Security Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualMachineTypeImpl extends NamedEntityImpl implements VirtualMachineType {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfCores() <em>Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCores()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfCores() <em>Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCores()
	 * @generated
	 * @ordered
	 */
	protected int numberOfCores = NUMBER_OF_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemorySizeMB() <em>Memory Size MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySizeMB()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_SIZE_MB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemorySizeMB() <em>Memory Size MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySizeMB()
	 * @generated
	 * @ordered
	 */
	protected int memorySizeMB = MEMORY_SIZE_MB_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootDiskSizeGB() <em>Root Disk Size GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootDiskSizeGB()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOT_DISK_SIZE_GB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRootDiskSizeGB() <em>Root Disk Size GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootDiskSizeGB()
	 * @generated
	 * @ordered
	 */
	protected int rootDiskSizeGB = ROOT_DISK_SIZE_GB_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskSizeGB() <em>Disk Size GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSizeGB()
	 * @generated
	 * @ordered
	 */
	protected static final int DISK_SIZE_GB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDiskSizeGB() <em>Disk Size GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSizeGB()
	 * @generated
	 * @ordered
	 */
	protected int diskSizeGB = DISK_SIZE_GB_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolumeSizeGB() <em>Volume Size GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeSizeGB()
	 * @generated
	 * @ordered
	 */
	protected static final int VOLUME_SIZE_GB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVolumeSizeGB() <em>Volume Size GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeSizeGB()
	 * @generated
	 * @ordered
	 */
	protected int volumeSizeGB = VOLUME_SIZE_GB_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageName() <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageName() <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageName()
	 * @generated
	 * @ordered
	 */
	protected String imageName = IMAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlavorName() <em>Flavor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavorName()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAVOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlavorName() <em>Flavor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavorName()
	 * @generated
	 * @ordered
	 */
	protected String flavorName = FLAVOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedPublicIp() <em>Need Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedPublicIp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEED_PUBLIC_IP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedPublicIp() <em>Need Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedPublicIp()
	 * @generated
	 * @ordered
	 */
	protected boolean needPublicIp = NEED_PUBLIC_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeploymentStatus() <em>Deployment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final DeploymentStatus DEPLOYMENT_STATUS_EDEFAULT = DeploymentStatus.UNDEPLOYED;

	/**
	 * The cached value of the '{@link #getDeploymentStatus() <em>Deployment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentStatus()
	 * @generated
	 * @ordered
	 */
	protected DeploymentStatus deploymentStatus = DEPLOYMENT_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingSecurityRules() <em>Incoming Security Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingSecurityRules()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRule> incomingSecurityRules;

	/**
	 * The cached value of the '{@link #getOutboundSecurityRules() <em>Outbound Security Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundSecurityRules()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRule> outboundSecurityRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.VIRTUAL_MACHINE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIRTUAL_MACHINE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfCores() {
		return numberOfCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCores(int newNumberOfCores) {
		int oldNumberOfCores = numberOfCores;
		numberOfCores = newNumberOfCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIRTUAL_MACHINE_TYPE__NUMBER_OF_CORES, oldNumberOfCores, numberOfCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemorySizeMB() {
		return memorySizeMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySizeMB(int newMemorySizeMB) {
		int oldMemorySizeMB = memorySizeMB;
		memorySizeMB = newMemorySizeMB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIRTUAL_MACHINE_TYPE__MEMORY_SIZE_MB, oldMemorySizeMB, memorySizeMB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRootDiskSizeGB() {
		return rootDiskSizeGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootDiskSizeGB(int newRootDiskSizeGB) {
		int oldRootDiskSizeGB = rootDiskSizeGB;
		rootDiskSizeGB = newRootDiskSizeGB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIRTUAL_MACHINE_TYPE__ROOT_DISK_SIZE_GB, oldRootDiskSizeGB, rootDiskSizeGB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDiskSizeGB() {
		return diskSizeGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskSizeGB(int newDiskSizeGB) {
		int oldDiskSizeGB = diskSizeGB;
		diskSizeGB = newDiskSizeGB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIRTUAL_MACHINE_TYPE__DISK_SIZE_GB, oldDiskSizeGB, diskSizeGB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVolumeSizeGB() {
		return volumeSizeGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeSizeGB(int newVolumeSizeGB) {
		int oldVolumeSizeGB = volumeSizeGB;
		volumeSizeGB = newVolumeSizeGB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIRTUAL_MACHINE_TYPE__VOLUME_SIZE_GB, oldVolumeSizeGB, volumeSizeGB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageName(String newImageName) {
		String oldImageName = imageName;
		imageName = newImageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIRTUAL_MACHINE_TYPE__IMAGE_NAME, oldImageName, imageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlavorName() {
		return flavorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlavorName(String newFlavorName) {
		String oldFlavorName = flavorName;
		flavorName = newFlavorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIRTUAL_MACHINE_TYPE__FLAVOR_NAME, oldFlavorName, flavorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedPublicIp() {
		return needPublicIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedPublicIp(boolean newNeedPublicIp) {
		boolean oldNeedPublicIp = needPublicIp;
		needPublicIp = newNeedPublicIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIRTUAL_MACHINE_TYPE__NEED_PUBLIC_IP, oldNeedPublicIp, needPublicIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentStatus getDeploymentStatus() {
		return deploymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentStatus(DeploymentStatus newDeploymentStatus) {
		DeploymentStatus oldDeploymentStatus = deploymentStatus;
		deploymentStatus = newDeploymentStatus == null ? DEPLOYMENT_STATUS_EDEFAULT : newDeploymentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIRTUAL_MACHINE_TYPE__DEPLOYMENT_STATUS, oldDeploymentStatus, deploymentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRule> getIncomingSecurityRules() {
		if (incomingSecurityRules == null) {
			incomingSecurityRules = new EObjectContainmentEList<SecurityRule>(SecurityRule.class, this, CorePackage.VIRTUAL_MACHINE_TYPE__INCOMING_SECURITY_RULES);
		}
		return incomingSecurityRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRule> getOutboundSecurityRules() {
		if (outboundSecurityRules == null) {
			outboundSecurityRules = new EObjectContainmentEList<SecurityRule>(SecurityRule.class, this, CorePackage.VIRTUAL_MACHINE_TYPE__OUTBOUND_SECURITY_RULES);
		}
		return outboundSecurityRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.VIRTUAL_MACHINE_TYPE__INCOMING_SECURITY_RULES:
				return ((InternalEList<?>)getIncomingSecurityRules()).basicRemove(otherEnd, msgs);
			case CorePackage.VIRTUAL_MACHINE_TYPE__OUTBOUND_SECURITY_RULES:
				return ((InternalEList<?>)getOutboundSecurityRules()).basicRemove(otherEnd, msgs);
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
			case CorePackage.VIRTUAL_MACHINE_TYPE__DESCRIPTION:
				return getDescription();
			case CorePackage.VIRTUAL_MACHINE_TYPE__NUMBER_OF_CORES:
				return getNumberOfCores();
			case CorePackage.VIRTUAL_MACHINE_TYPE__MEMORY_SIZE_MB:
				return getMemorySizeMB();
			case CorePackage.VIRTUAL_MACHINE_TYPE__ROOT_DISK_SIZE_GB:
				return getRootDiskSizeGB();
			case CorePackage.VIRTUAL_MACHINE_TYPE__DISK_SIZE_GB:
				return getDiskSizeGB();
			case CorePackage.VIRTUAL_MACHINE_TYPE__VOLUME_SIZE_GB:
				return getVolumeSizeGB();
			case CorePackage.VIRTUAL_MACHINE_TYPE__IMAGE_NAME:
				return getImageName();
			case CorePackage.VIRTUAL_MACHINE_TYPE__FLAVOR_NAME:
				return getFlavorName();
			case CorePackage.VIRTUAL_MACHINE_TYPE__NEED_PUBLIC_IP:
				return isNeedPublicIp();
			case CorePackage.VIRTUAL_MACHINE_TYPE__DEPLOYMENT_STATUS:
				return getDeploymentStatus();
			case CorePackage.VIRTUAL_MACHINE_TYPE__INCOMING_SECURITY_RULES:
				return getIncomingSecurityRules();
			case CorePackage.VIRTUAL_MACHINE_TYPE__OUTBOUND_SECURITY_RULES:
				return getOutboundSecurityRules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.VIRTUAL_MACHINE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__NUMBER_OF_CORES:
				setNumberOfCores((Integer)newValue);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__MEMORY_SIZE_MB:
				setMemorySizeMB((Integer)newValue);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__ROOT_DISK_SIZE_GB:
				setRootDiskSizeGB((Integer)newValue);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__DISK_SIZE_GB:
				setDiskSizeGB((Integer)newValue);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__VOLUME_SIZE_GB:
				setVolumeSizeGB((Integer)newValue);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__IMAGE_NAME:
				setImageName((String)newValue);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__FLAVOR_NAME:
				setFlavorName((String)newValue);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__NEED_PUBLIC_IP:
				setNeedPublicIp((Boolean)newValue);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__DEPLOYMENT_STATUS:
				setDeploymentStatus((DeploymentStatus)newValue);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__INCOMING_SECURITY_RULES:
				getIncomingSecurityRules().clear();
				getIncomingSecurityRules().addAll((Collection<? extends SecurityRule>)newValue);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__OUTBOUND_SECURITY_RULES:
				getOutboundSecurityRules().clear();
				getOutboundSecurityRules().addAll((Collection<? extends SecurityRule>)newValue);
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
			case CorePackage.VIRTUAL_MACHINE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__NUMBER_OF_CORES:
				setNumberOfCores(NUMBER_OF_CORES_EDEFAULT);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__MEMORY_SIZE_MB:
				setMemorySizeMB(MEMORY_SIZE_MB_EDEFAULT);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__ROOT_DISK_SIZE_GB:
				setRootDiskSizeGB(ROOT_DISK_SIZE_GB_EDEFAULT);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__DISK_SIZE_GB:
				setDiskSizeGB(DISK_SIZE_GB_EDEFAULT);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__VOLUME_SIZE_GB:
				setVolumeSizeGB(VOLUME_SIZE_GB_EDEFAULT);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__IMAGE_NAME:
				setImageName(IMAGE_NAME_EDEFAULT);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__FLAVOR_NAME:
				setFlavorName(FLAVOR_NAME_EDEFAULT);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__NEED_PUBLIC_IP:
				setNeedPublicIp(NEED_PUBLIC_IP_EDEFAULT);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__DEPLOYMENT_STATUS:
				setDeploymentStatus(DEPLOYMENT_STATUS_EDEFAULT);
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__INCOMING_SECURITY_RULES:
				getIncomingSecurityRules().clear();
				return;
			case CorePackage.VIRTUAL_MACHINE_TYPE__OUTBOUND_SECURITY_RULES:
				getOutboundSecurityRules().clear();
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
			case CorePackage.VIRTUAL_MACHINE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.VIRTUAL_MACHINE_TYPE__NUMBER_OF_CORES:
				return numberOfCores != NUMBER_OF_CORES_EDEFAULT;
			case CorePackage.VIRTUAL_MACHINE_TYPE__MEMORY_SIZE_MB:
				return memorySizeMB != MEMORY_SIZE_MB_EDEFAULT;
			case CorePackage.VIRTUAL_MACHINE_TYPE__ROOT_DISK_SIZE_GB:
				return rootDiskSizeGB != ROOT_DISK_SIZE_GB_EDEFAULT;
			case CorePackage.VIRTUAL_MACHINE_TYPE__DISK_SIZE_GB:
				return diskSizeGB != DISK_SIZE_GB_EDEFAULT;
			case CorePackage.VIRTUAL_MACHINE_TYPE__VOLUME_SIZE_GB:
				return volumeSizeGB != VOLUME_SIZE_GB_EDEFAULT;
			case CorePackage.VIRTUAL_MACHINE_TYPE__IMAGE_NAME:
				return IMAGE_NAME_EDEFAULT == null ? imageName != null : !IMAGE_NAME_EDEFAULT.equals(imageName);
			case CorePackage.VIRTUAL_MACHINE_TYPE__FLAVOR_NAME:
				return FLAVOR_NAME_EDEFAULT == null ? flavorName != null : !FLAVOR_NAME_EDEFAULT.equals(flavorName);
			case CorePackage.VIRTUAL_MACHINE_TYPE__NEED_PUBLIC_IP:
				return needPublicIp != NEED_PUBLIC_IP_EDEFAULT;
			case CorePackage.VIRTUAL_MACHINE_TYPE__DEPLOYMENT_STATUS:
				return deploymentStatus != DEPLOYMENT_STATUS_EDEFAULT;
			case CorePackage.VIRTUAL_MACHINE_TYPE__INCOMING_SECURITY_RULES:
				return incomingSecurityRules != null && !incomingSecurityRules.isEmpty();
			case CorePackage.VIRTUAL_MACHINE_TYPE__OUTBOUND_SECURITY_RULES:
				return outboundSecurityRules != null && !outboundSecurityRules.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", numberOfCores: ");
		result.append(numberOfCores);
		result.append(", memorySizeMB: ");
		result.append(memorySizeMB);
		result.append(", rootDiskSizeGB: ");
		result.append(rootDiskSizeGB);
		result.append(", diskSizeGB: ");
		result.append(diskSizeGB);
		result.append(", volumeSizeGB: ");
		result.append(volumeSizeGB);
		result.append(", imageName: ");
		result.append(imageName);
		result.append(", flavorName: ");
		result.append(flavorName);
		result.append(", needPublicIp: ");
		result.append(needPublicIp);
		result.append(", deploymentStatus: ");
		result.append(deploymentStatus);
		result.append(')');
		return result.toString();
	}

} //VirtualMachineTypeImpl
