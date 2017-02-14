
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
package org.openecomp.ncomp.openstack.compute.impl;

import org.openecomp.ncomp.openstack.compute.ComputePackage;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer;

import org.openecomp.ncomp.openstack.core.VirtualMachineType;

import org.openecomp.ncomp.openstack.core.impl.OpenStackRequestImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Openstack Request New Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestNewServerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestNewServerImpl#getHypervisor <em>Hypervisor</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestNewServerImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestNewServerImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestNewServerImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestNewServerImpl#getUser_data <em>User data</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestNewServerImpl#getFloatingIp <em>Floating Ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestNewServerImpl#getVmType <em>Vm Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenstackRequestNewServerImpl extends OpenStackRequestImpl implements OpenstackRequestNewServer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHypervisor() <em>Hypervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERVISOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHypervisor() <em>Hypervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor()
	 * @generated
	 * @ordered
	 */
	protected String hypervisor = HYPERVISOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> networks;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ports;

	/**
	 * The default value of the '{@link #getUser_data() <em>User data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_data()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser_data() <em>User data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_data()
	 * @generated
	 * @ordered
	 */
	protected String user_data = USER_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloatingIp() <em>Floating Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingIp()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOATING_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloatingIp() <em>Floating Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingIp()
	 * @generated
	 * @ordered
	 */
	protected String floatingIp = FLOATING_IP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVmType() <em>Vm Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmType()
	 * @generated
	 * @ordered
	 */
	protected VirtualMachineType vmType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenstackRequestNewServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.OPENSTACK_REQUEST_NEW_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHypervisor() {
		return hypervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHypervisor(String newHypervisor) {
		String oldHypervisor = hypervisor;
		hypervisor = newHypervisor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__HYPERVISOR, oldHypervisor, hypervisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNetworks() {
		if (networks == null) {
			networks = new EDataTypeEList<String>(String.class, this, ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPorts() {
		if (ports == null) {
			ports = new EDataTypeEList<String>(String.class, this, ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser_data() {
		return user_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser_data(String newUser_data) {
		String oldUser_data = user_data;
		user_data = newUser_data;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__USER_DATA, oldUser_data, user_data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloatingIp() {
		return floatingIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingIp(String newFloatingIp) {
		String oldFloatingIp = floatingIp;
		floatingIp = newFloatingIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__FLOATING_IP, oldFloatingIp, floatingIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineType getVmType() {
		return vmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVmType(VirtualMachineType newVmType, NotificationChain msgs) {
		VirtualMachineType oldVmType = vmType;
		vmType = newVmType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__VM_TYPE, oldVmType, newVmType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmType(VirtualMachineType newVmType) {
		if (newVmType != vmType) {
			NotificationChain msgs = null;
			if (vmType != null)
				msgs = ((InternalEObject)vmType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__VM_TYPE, null, msgs);
			if (newVmType != null)
				msgs = ((InternalEObject)newVmType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__VM_TYPE, null, msgs);
			msgs = basicSetVmType(newVmType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__VM_TYPE, newVmType, newVmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__VM_TYPE:
				return basicSetVmType(null, msgs);
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
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__NAME:
				return getName();
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__HYPERVISOR:
				return getHypervisor();
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__USER:
				return getUser();
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__NETWORKS:
				return getNetworks();
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__PORTS:
				return getPorts();
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__USER_DATA:
				return getUser_data();
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__FLOATING_IP:
				return getFloatingIp();
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__VM_TYPE:
				return getVmType();
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
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__NAME:
				setName((String)newValue);
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__HYPERVISOR:
				setHypervisor((String)newValue);
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__USER:
				setUser((String)newValue);
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends String>)newValue);
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends String>)newValue);
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__USER_DATA:
				setUser_data((String)newValue);
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__FLOATING_IP:
				setFloatingIp((String)newValue);
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__VM_TYPE:
				setVmType((VirtualMachineType)newValue);
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
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__HYPERVISOR:
				setHypervisor(HYPERVISOR_EDEFAULT);
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__USER:
				setUser(USER_EDEFAULT);
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__NETWORKS:
				getNetworks().clear();
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__PORTS:
				getPorts().clear();
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__USER_DATA:
				setUser_data(USER_DATA_EDEFAULT);
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__FLOATING_IP:
				setFloatingIp(FLOATING_IP_EDEFAULT);
				return;
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__VM_TYPE:
				setVmType((VirtualMachineType)null);
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
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__HYPERVISOR:
				return HYPERVISOR_EDEFAULT == null ? hypervisor != null : !HYPERVISOR_EDEFAULT.equals(hypervisor);
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__NETWORKS:
				return networks != null && !networks.isEmpty();
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__PORTS:
				return ports != null && !ports.isEmpty();
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__USER_DATA:
				return USER_DATA_EDEFAULT == null ? user_data != null : !USER_DATA_EDEFAULT.equals(user_data);
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__FLOATING_IP:
				return FLOATING_IP_EDEFAULT == null ? floatingIp != null : !FLOATING_IP_EDEFAULT.equals(floatingIp);
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER__VM_TYPE:
				return vmType != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", hypervisor: ");
		result.append(hypervisor);
		result.append(", user: ");
		result.append(user);
		result.append(", networks: ");
		result.append(networks);
		result.append(", ports: ");
		result.append(ports);
		result.append(", user_data: ");
		result.append(user_data);
		result.append(", floatingIp: ");
		result.append(floatingIp);
		result.append(')');
		return result.toString();
	}

} //OpenstackRequestNewServerImpl
