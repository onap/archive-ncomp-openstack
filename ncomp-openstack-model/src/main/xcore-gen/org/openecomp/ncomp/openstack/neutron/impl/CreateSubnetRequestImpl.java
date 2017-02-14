
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
package org.openecomp.ncomp.openstack.neutron.impl;

import org.openecomp.ncomp.openstack.neutron.AllocationPool;
import org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Subnet Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateSubnetRequestImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateSubnetRequestImpl#getNetwork_id <em>Network id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateSubnetRequestImpl#getIp_version <em>Ip version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateSubnetRequestImpl#getCidr <em>Cidr</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateSubnetRequestImpl#getAllocation_pools <em>Allocation pools</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateSubnetRequestImpl#getDns_nameservers <em>Dns nameservers</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateSubnetRequestImpl#getEnable_dhcp <em>Enable dhcp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateSubnetRequestImpl#getGateway_ip <em>Gateway ip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateSubnetRequestImpl extends NeutronRequestImpl implements CreateSubnetRequest {
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
	 * The default value of the '{@link #getNetwork_id() <em>Network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_id()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetwork_id() <em>Network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_id()
	 * @generated
	 * @ordered
	 */
	protected String network_id = NETWORK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIp_version() <em>Ip version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_version()
	 * @generated
	 * @ordered
	 */
	protected static final int IP_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIp_version() <em>Ip version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_version()
	 * @generated
	 * @ordered
	 */
	protected int ip_version = IP_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCidr() <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidr() <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected String cidr = CIDR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocation_pools() <em>Allocation pools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation_pools()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationPool> allocation_pools;

	/**
	 * The cached value of the '{@link #getDns_nameservers() <em>Dns nameservers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns_nameservers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dns_nameservers;

	/**
	 * The default value of the '{@link #getEnable_dhcp() <em>Enable dhcp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable_dhcp()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_DHCP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnable_dhcp() <em>Enable dhcp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable_dhcp()
	 * @generated
	 * @ordered
	 */
	protected Boolean enable_dhcp = ENABLE_DHCP_EDEFAULT;

	/**
	 * The default value of the '{@link #getGateway_ip() <em>Gateway ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGateway_ip() <em>Gateway ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway_ip()
	 * @generated
	 * @ordered
	 */
	protected String gateway_ip = GATEWAY_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateSubnetRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.CREATE_SUBNET_REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_SUBNET_REQUEST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetwork_id() {
		return network_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork_id(String newNetwork_id) {
		String oldNetwork_id = network_id;
		network_id = newNetwork_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_SUBNET_REQUEST__NETWORK_ID, oldNetwork_id, network_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIp_version() {
		return ip_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp_version(int newIp_version) {
		int oldIp_version = ip_version;
		ip_version = newIp_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_SUBNET_REQUEST__IP_VERSION, oldIp_version, ip_version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCidr() {
		return cidr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCidr(String newCidr) {
		String oldCidr = cidr;
		cidr = newCidr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_SUBNET_REQUEST__CIDR, oldCidr, cidr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationPool> getAllocation_pools() {
		if (allocation_pools == null) {
			allocation_pools = new EObjectContainmentEList<AllocationPool>(AllocationPool.class, this, NeutronPackage.CREATE_SUBNET_REQUEST__ALLOCATION_POOLS);
		}
		return allocation_pools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDns_nameservers() {
		if (dns_nameservers == null) {
			dns_nameservers = new EDataTypeEList<String>(String.class, this, NeutronPackage.CREATE_SUBNET_REQUEST__DNS_NAMESERVERS);
		}
		return dns_nameservers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEnable_dhcp() {
		return enable_dhcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable_dhcp(Boolean newEnable_dhcp) {
		Boolean oldEnable_dhcp = enable_dhcp;
		enable_dhcp = newEnable_dhcp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_SUBNET_REQUEST__ENABLE_DHCP, oldEnable_dhcp, enable_dhcp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGateway_ip() {
		return gateway_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateway_ip(String newGateway_ip) {
		String oldGateway_ip = gateway_ip;
		gateway_ip = newGateway_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_SUBNET_REQUEST__GATEWAY_IP, oldGateway_ip, gateway_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NeutronPackage.CREATE_SUBNET_REQUEST__ALLOCATION_POOLS:
				return ((InternalEList<?>)getAllocation_pools()).basicRemove(otherEnd, msgs);
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
			case NeutronPackage.CREATE_SUBNET_REQUEST__NAME:
				return getName();
			case NeutronPackage.CREATE_SUBNET_REQUEST__NETWORK_ID:
				return getNetwork_id();
			case NeutronPackage.CREATE_SUBNET_REQUEST__IP_VERSION:
				return getIp_version();
			case NeutronPackage.CREATE_SUBNET_REQUEST__CIDR:
				return getCidr();
			case NeutronPackage.CREATE_SUBNET_REQUEST__ALLOCATION_POOLS:
				return getAllocation_pools();
			case NeutronPackage.CREATE_SUBNET_REQUEST__DNS_NAMESERVERS:
				return getDns_nameservers();
			case NeutronPackage.CREATE_SUBNET_REQUEST__ENABLE_DHCP:
				return getEnable_dhcp();
			case NeutronPackage.CREATE_SUBNET_REQUEST__GATEWAY_IP:
				return getGateway_ip();
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
			case NeutronPackage.CREATE_SUBNET_REQUEST__NAME:
				setName((String)newValue);
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__NETWORK_ID:
				setNetwork_id((String)newValue);
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__IP_VERSION:
				setIp_version((Integer)newValue);
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__CIDR:
				setCidr((String)newValue);
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__ALLOCATION_POOLS:
				getAllocation_pools().clear();
				getAllocation_pools().addAll((Collection<? extends AllocationPool>)newValue);
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__DNS_NAMESERVERS:
				getDns_nameservers().clear();
				getDns_nameservers().addAll((Collection<? extends String>)newValue);
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__ENABLE_DHCP:
				setEnable_dhcp((Boolean)newValue);
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__GATEWAY_IP:
				setGateway_ip((String)newValue);
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
			case NeutronPackage.CREATE_SUBNET_REQUEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__NETWORK_ID:
				setNetwork_id(NETWORK_ID_EDEFAULT);
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__IP_VERSION:
				setIp_version(IP_VERSION_EDEFAULT);
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__CIDR:
				setCidr(CIDR_EDEFAULT);
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__ALLOCATION_POOLS:
				getAllocation_pools().clear();
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__DNS_NAMESERVERS:
				getDns_nameservers().clear();
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__ENABLE_DHCP:
				setEnable_dhcp(ENABLE_DHCP_EDEFAULT);
				return;
			case NeutronPackage.CREATE_SUBNET_REQUEST__GATEWAY_IP:
				setGateway_ip(GATEWAY_IP_EDEFAULT);
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
			case NeutronPackage.CREATE_SUBNET_REQUEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NeutronPackage.CREATE_SUBNET_REQUEST__NETWORK_ID:
				return NETWORK_ID_EDEFAULT == null ? network_id != null : !NETWORK_ID_EDEFAULT.equals(network_id);
			case NeutronPackage.CREATE_SUBNET_REQUEST__IP_VERSION:
				return ip_version != IP_VERSION_EDEFAULT;
			case NeutronPackage.CREATE_SUBNET_REQUEST__CIDR:
				return CIDR_EDEFAULT == null ? cidr != null : !CIDR_EDEFAULT.equals(cidr);
			case NeutronPackage.CREATE_SUBNET_REQUEST__ALLOCATION_POOLS:
				return allocation_pools != null && !allocation_pools.isEmpty();
			case NeutronPackage.CREATE_SUBNET_REQUEST__DNS_NAMESERVERS:
				return dns_nameservers != null && !dns_nameservers.isEmpty();
			case NeutronPackage.CREATE_SUBNET_REQUEST__ENABLE_DHCP:
				return ENABLE_DHCP_EDEFAULT == null ? enable_dhcp != null : !ENABLE_DHCP_EDEFAULT.equals(enable_dhcp);
			case NeutronPackage.CREATE_SUBNET_REQUEST__GATEWAY_IP:
				return GATEWAY_IP_EDEFAULT == null ? gateway_ip != null : !GATEWAY_IP_EDEFAULT.equals(gateway_ip);
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
		result.append(", network_id: ");
		result.append(network_id);
		result.append(", ip_version: ");
		result.append(ip_version);
		result.append(", cidr: ");
		result.append(cidr);
		result.append(", dns_nameservers: ");
		result.append(dns_nameservers);
		result.append(", enable_dhcp: ");
		result.append(enable_dhcp);
		result.append(", gateway_ip: ");
		result.append(gateway_ip);
		result.append(')');
		return result.toString();
	}

} //CreateSubnetRequestImpl
