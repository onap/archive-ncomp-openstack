
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
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;
import org.openecomp.ncomp.openstack.neutron.Subnet;

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
 * An implementation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getCidr <em>Cidr</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getAllocation_pools <em>Allocation pools</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getDns_nameservers <em>Dns nameservers</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getEnable_dhcp <em>Enable dhcp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getGateway_ip <em>Gateway ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getHost_routes <em>Host routes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getIp_version <em>Ip version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getNetwork_id <em>Network id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl#getTenant_id <em>Tenant id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubnetImpl extends NeutronObjectImpl implements Subnet {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdmin_state_up() <em>Admin state up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmin_state_up()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ADMIN_STATE_UP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdmin_state_up() <em>Admin state up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmin_state_up()
	 * @generated
	 * @ordered
	 */
	protected Boolean admin_state_up = ADMIN_STATE_UP_EDEFAULT;

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
	 * The cached value of the '{@link #getHost_routes() <em>Host routes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_routes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> host_routes;

	/**
	 * The default value of the '{@link #getIp_version() <em>Ip version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_version()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IP_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp_version() <em>Ip version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_version()
	 * @generated
	 * @ordered
	 */
	protected Integer ip_version = IP_VERSION_EDEFAULT;

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
	 * The default value of the '{@link #getTenant_id() <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_id()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenant_id() <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_id()
	 * @generated
	 * @ordered
	 */
	protected String tenant_id = TENANT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubnetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.SUBNET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.SUBNET__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.SUBNET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.SUBNET__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAdmin_state_up() {
		return admin_state_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmin_state_up(Boolean newAdmin_state_up) {
		Boolean oldAdmin_state_up = admin_state_up;
		admin_state_up = newAdmin_state_up;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.SUBNET__ADMIN_STATE_UP, oldAdmin_state_up, admin_state_up));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.SUBNET__CIDR, oldCidr, cidr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationPool> getAllocation_pools() {
		if (allocation_pools == null) {
			allocation_pools = new EObjectContainmentEList<AllocationPool>(AllocationPool.class, this, NeutronPackage.SUBNET__ALLOCATION_POOLS);
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
			dns_nameservers = new EDataTypeEList<String>(String.class, this, NeutronPackage.SUBNET__DNS_NAMESERVERS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.SUBNET__ENABLE_DHCP, oldEnable_dhcp, enable_dhcp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.SUBNET__GATEWAY_IP, oldGateway_ip, gateway_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHost_routes() {
		if (host_routes == null) {
			host_routes = new EDataTypeEList<String>(String.class, this, NeutronPackage.SUBNET__HOST_ROUTES);
		}
		return host_routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIp_version() {
		return ip_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp_version(Integer newIp_version) {
		Integer oldIp_version = ip_version;
		ip_version = newIp_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.SUBNET__IP_VERSION, oldIp_version, ip_version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.SUBNET__NETWORK_ID, oldNetwork_id, network_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenant_id() {
		return tenant_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenant_id(String newTenant_id) {
		String oldTenant_id = tenant_id;
		tenant_id = newTenant_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.SUBNET__TENANT_ID, oldTenant_id, tenant_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NeutronPackage.SUBNET__ALLOCATION_POOLS:
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
			case NeutronPackage.SUBNET__ID:
				return getId();
			case NeutronPackage.SUBNET__NAME:
				return getName();
			case NeutronPackage.SUBNET__STATUS:
				return getStatus();
			case NeutronPackage.SUBNET__ADMIN_STATE_UP:
				return getAdmin_state_up();
			case NeutronPackage.SUBNET__CIDR:
				return getCidr();
			case NeutronPackage.SUBNET__ALLOCATION_POOLS:
				return getAllocation_pools();
			case NeutronPackage.SUBNET__DNS_NAMESERVERS:
				return getDns_nameservers();
			case NeutronPackage.SUBNET__ENABLE_DHCP:
				return getEnable_dhcp();
			case NeutronPackage.SUBNET__GATEWAY_IP:
				return getGateway_ip();
			case NeutronPackage.SUBNET__HOST_ROUTES:
				return getHost_routes();
			case NeutronPackage.SUBNET__IP_VERSION:
				return getIp_version();
			case NeutronPackage.SUBNET__NETWORK_ID:
				return getNetwork_id();
			case NeutronPackage.SUBNET__TENANT_ID:
				return getTenant_id();
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
			case NeutronPackage.SUBNET__ID:
				setId((String)newValue);
				return;
			case NeutronPackage.SUBNET__NAME:
				setName((String)newValue);
				return;
			case NeutronPackage.SUBNET__STATUS:
				setStatus((String)newValue);
				return;
			case NeutronPackage.SUBNET__ADMIN_STATE_UP:
				setAdmin_state_up((Boolean)newValue);
				return;
			case NeutronPackage.SUBNET__CIDR:
				setCidr((String)newValue);
				return;
			case NeutronPackage.SUBNET__ALLOCATION_POOLS:
				getAllocation_pools().clear();
				getAllocation_pools().addAll((Collection<? extends AllocationPool>)newValue);
				return;
			case NeutronPackage.SUBNET__DNS_NAMESERVERS:
				getDns_nameservers().clear();
				getDns_nameservers().addAll((Collection<? extends String>)newValue);
				return;
			case NeutronPackage.SUBNET__ENABLE_DHCP:
				setEnable_dhcp((Boolean)newValue);
				return;
			case NeutronPackage.SUBNET__GATEWAY_IP:
				setGateway_ip((String)newValue);
				return;
			case NeutronPackage.SUBNET__HOST_ROUTES:
				getHost_routes().clear();
				getHost_routes().addAll((Collection<? extends String>)newValue);
				return;
			case NeutronPackage.SUBNET__IP_VERSION:
				setIp_version((Integer)newValue);
				return;
			case NeutronPackage.SUBNET__NETWORK_ID:
				setNetwork_id((String)newValue);
				return;
			case NeutronPackage.SUBNET__TENANT_ID:
				setTenant_id((String)newValue);
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
			case NeutronPackage.SUBNET__ID:
				setId(ID_EDEFAULT);
				return;
			case NeutronPackage.SUBNET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NeutronPackage.SUBNET__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case NeutronPackage.SUBNET__ADMIN_STATE_UP:
				setAdmin_state_up(ADMIN_STATE_UP_EDEFAULT);
				return;
			case NeutronPackage.SUBNET__CIDR:
				setCidr(CIDR_EDEFAULT);
				return;
			case NeutronPackage.SUBNET__ALLOCATION_POOLS:
				getAllocation_pools().clear();
				return;
			case NeutronPackage.SUBNET__DNS_NAMESERVERS:
				getDns_nameservers().clear();
				return;
			case NeutronPackage.SUBNET__ENABLE_DHCP:
				setEnable_dhcp(ENABLE_DHCP_EDEFAULT);
				return;
			case NeutronPackage.SUBNET__GATEWAY_IP:
				setGateway_ip(GATEWAY_IP_EDEFAULT);
				return;
			case NeutronPackage.SUBNET__HOST_ROUTES:
				getHost_routes().clear();
				return;
			case NeutronPackage.SUBNET__IP_VERSION:
				setIp_version(IP_VERSION_EDEFAULT);
				return;
			case NeutronPackage.SUBNET__NETWORK_ID:
				setNetwork_id(NETWORK_ID_EDEFAULT);
				return;
			case NeutronPackage.SUBNET__TENANT_ID:
				setTenant_id(TENANT_ID_EDEFAULT);
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
			case NeutronPackage.SUBNET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NeutronPackage.SUBNET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NeutronPackage.SUBNET__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case NeutronPackage.SUBNET__ADMIN_STATE_UP:
				return ADMIN_STATE_UP_EDEFAULT == null ? admin_state_up != null : !ADMIN_STATE_UP_EDEFAULT.equals(admin_state_up);
			case NeutronPackage.SUBNET__CIDR:
				return CIDR_EDEFAULT == null ? cidr != null : !CIDR_EDEFAULT.equals(cidr);
			case NeutronPackage.SUBNET__ALLOCATION_POOLS:
				return allocation_pools != null && !allocation_pools.isEmpty();
			case NeutronPackage.SUBNET__DNS_NAMESERVERS:
				return dns_nameservers != null && !dns_nameservers.isEmpty();
			case NeutronPackage.SUBNET__ENABLE_DHCP:
				return ENABLE_DHCP_EDEFAULT == null ? enable_dhcp != null : !ENABLE_DHCP_EDEFAULT.equals(enable_dhcp);
			case NeutronPackage.SUBNET__GATEWAY_IP:
				return GATEWAY_IP_EDEFAULT == null ? gateway_ip != null : !GATEWAY_IP_EDEFAULT.equals(gateway_ip);
			case NeutronPackage.SUBNET__HOST_ROUTES:
				return host_routes != null && !host_routes.isEmpty();
			case NeutronPackage.SUBNET__IP_VERSION:
				return IP_VERSION_EDEFAULT == null ? ip_version != null : !IP_VERSION_EDEFAULT.equals(ip_version);
			case NeutronPackage.SUBNET__NETWORK_ID:
				return NETWORK_ID_EDEFAULT == null ? network_id != null : !NETWORK_ID_EDEFAULT.equals(network_id);
			case NeutronPackage.SUBNET__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenant_id != null : !TENANT_ID_EDEFAULT.equals(tenant_id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(", admin_state_up: ");
		result.append(admin_state_up);
		result.append(", cidr: ");
		result.append(cidr);
		result.append(", dns_nameservers: ");
		result.append(dns_nameservers);
		result.append(", enable_dhcp: ");
		result.append(enable_dhcp);
		result.append(", gateway_ip: ");
		result.append(gateway_ip);
		result.append(", host_routes: ");
		result.append(host_routes);
		result.append(", ip_version: ");
		result.append(ip_version);
		result.append(", network_id: ");
		result.append(network_id);
		result.append(", tenant_id: ");
		result.append(tenant_id);
		result.append(')');
		return result.toString();
	}

} //SubnetImpl
