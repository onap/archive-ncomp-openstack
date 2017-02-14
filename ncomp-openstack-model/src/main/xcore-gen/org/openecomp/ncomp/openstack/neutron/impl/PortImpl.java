
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

import org.openecomp.ncomp.openstack.neutron.BindingProfile;
import org.openecomp.ncomp.openstack.neutron.BindingVifDetail;
import org.openecomp.ncomp.openstack.neutron.ExternalGateway;
import org.openecomp.ncomp.openstack.neutron.FixedIp;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;
import org.openecomp.ncomp.openstack.neutron.Port;

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
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getExternal_gateway_info <em>External gateway info</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getAllowed_address_pairs <em>Allowed address pairs</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getBinding_host_id <em>Binding host id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getBinding_profile <em>Binding profile</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getBinding_vif_details <em>Binding vif details</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getBinding_vif_type <em>Binding vif type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getBinding_vnic_type <em>Binding vnic type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getDevice_id <em>Device id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getDevice_owner <em>Device owner</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getExtra_dhcp_opts <em>Extra dhcp opts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getFixed_ips <em>Fixed ips</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getMac_address <em>Mac address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getNetwork_id <em>Network id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl#getSecurity_groups <em>Security groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends NeutronObjectImpl implements Port {
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
	 * The cached value of the '{@link #getExternal_gateway_info() <em>External gateway info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternal_gateway_info()
	 * @generated
	 * @ordered
	 */
	protected ExternalGateway external_gateway_info;

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
	 * The cached value of the '{@link #getAllowed_address_pairs() <em>Allowed address pairs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowed_address_pairs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> allowed_address_pairs;

	/**
	 * The default value of the '{@link #getBinding_host_id() <em>Binding host id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding_host_id()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_HOST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinding_host_id() <em>Binding host id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding_host_id()
	 * @generated
	 * @ordered
	 */
	protected String binding_host_id = BINDING_HOST_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBinding_profile() <em>Binding profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding_profile()
	 * @generated
	 * @ordered
	 */
	protected BindingProfile binding_profile;

	/**
	 * The cached value of the '{@link #getBinding_vif_details() <em>Binding vif details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding_vif_details()
	 * @generated
	 * @ordered
	 */
	protected BindingVifDetail binding_vif_details;

	/**
	 * The default value of the '{@link #getBinding_vif_type() <em>Binding vif type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding_vif_type()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_VIF_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinding_vif_type() <em>Binding vif type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding_vif_type()
	 * @generated
	 * @ordered
	 */
	protected String binding_vif_type = BINDING_VIF_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinding_vnic_type() <em>Binding vnic type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding_vnic_type()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_VNIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinding_vnic_type() <em>Binding vnic type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding_vnic_type()
	 * @generated
	 * @ordered
	 */
	protected String binding_vnic_type = BINDING_VNIC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevice_id() <em>Device id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice_id()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevice_id() <em>Device id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice_id()
	 * @generated
	 * @ordered
	 */
	protected String device_id = DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevice_owner() <em>Device owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice_owner()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevice_owner() <em>Device owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice_owner()
	 * @generated
	 * @ordered
	 */
	protected String device_owner = DEVICE_OWNER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtra_dhcp_opts() <em>Extra dhcp opts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtra_dhcp_opts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> extra_dhcp_opts;

	/**
	 * The cached value of the '{@link #getFixed_ips() <em>Fixed ips</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed_ips()
	 * @generated
	 * @ordered
	 */
	protected EList<FixedIp> fixed_ips;

	/**
	 * The default value of the '{@link #getMac_address() <em>Mac address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac_address()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMac_address() <em>Mac address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac_address()
	 * @generated
	 * @ordered
	 */
	protected String mac_address = MAC_ADDRESS_EDEFAULT;

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
	 * The cached value of the '{@link #getSecurity_groups() <em>Security groups</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_groups()
	 * @generated
	 * @ordered
	 */
	protected EList<String> security_groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__ADMIN_STATE_UP, oldAdmin_state_up, admin_state_up));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalGateway getExternal_gateway_info() {
		return external_gateway_info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternal_gateway_info(ExternalGateway newExternal_gateway_info, NotificationChain msgs) {
		ExternalGateway oldExternal_gateway_info = external_gateway_info;
		external_gateway_info = newExternal_gateway_info;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__EXTERNAL_GATEWAY_INFO, oldExternal_gateway_info, newExternal_gateway_info);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternal_gateway_info(ExternalGateway newExternal_gateway_info) {
		if (newExternal_gateway_info != external_gateway_info) {
			NotificationChain msgs = null;
			if (external_gateway_info != null)
				msgs = ((InternalEObject)external_gateway_info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NeutronPackage.PORT__EXTERNAL_GATEWAY_INFO, null, msgs);
			if (newExternal_gateway_info != null)
				msgs = ((InternalEObject)newExternal_gateway_info).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NeutronPackage.PORT__EXTERNAL_GATEWAY_INFO, null, msgs);
			msgs = basicSetExternal_gateway_info(newExternal_gateway_info, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__EXTERNAL_GATEWAY_INFO, newExternal_gateway_info, newExternal_gateway_info));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__TENANT_ID, oldTenant_id, tenant_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllowed_address_pairs() {
		if (allowed_address_pairs == null) {
			allowed_address_pairs = new EDataTypeEList<String>(String.class, this, NeutronPackage.PORT__ALLOWED_ADDRESS_PAIRS);
		}
		return allowed_address_pairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBinding_host_id() {
		return binding_host_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding_host_id(String newBinding_host_id) {
		String oldBinding_host_id = binding_host_id;
		binding_host_id = newBinding_host_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__BINDING_HOST_ID, oldBinding_host_id, binding_host_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingProfile getBinding_profile() {
		return binding_profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding_profile(BindingProfile newBinding_profile, NotificationChain msgs) {
		BindingProfile oldBinding_profile = binding_profile;
		binding_profile = newBinding_profile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__BINDING_PROFILE, oldBinding_profile, newBinding_profile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding_profile(BindingProfile newBinding_profile) {
		if (newBinding_profile != binding_profile) {
			NotificationChain msgs = null;
			if (binding_profile != null)
				msgs = ((InternalEObject)binding_profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NeutronPackage.PORT__BINDING_PROFILE, null, msgs);
			if (newBinding_profile != null)
				msgs = ((InternalEObject)newBinding_profile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NeutronPackage.PORT__BINDING_PROFILE, null, msgs);
			msgs = basicSetBinding_profile(newBinding_profile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__BINDING_PROFILE, newBinding_profile, newBinding_profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingVifDetail getBinding_vif_details() {
		return binding_vif_details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding_vif_details(BindingVifDetail newBinding_vif_details, NotificationChain msgs) {
		BindingVifDetail oldBinding_vif_details = binding_vif_details;
		binding_vif_details = newBinding_vif_details;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__BINDING_VIF_DETAILS, oldBinding_vif_details, newBinding_vif_details);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding_vif_details(BindingVifDetail newBinding_vif_details) {
		if (newBinding_vif_details != binding_vif_details) {
			NotificationChain msgs = null;
			if (binding_vif_details != null)
				msgs = ((InternalEObject)binding_vif_details).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NeutronPackage.PORT__BINDING_VIF_DETAILS, null, msgs);
			if (newBinding_vif_details != null)
				msgs = ((InternalEObject)newBinding_vif_details).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NeutronPackage.PORT__BINDING_VIF_DETAILS, null, msgs);
			msgs = basicSetBinding_vif_details(newBinding_vif_details, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__BINDING_VIF_DETAILS, newBinding_vif_details, newBinding_vif_details));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBinding_vif_type() {
		return binding_vif_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding_vif_type(String newBinding_vif_type) {
		String oldBinding_vif_type = binding_vif_type;
		binding_vif_type = newBinding_vif_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__BINDING_VIF_TYPE, oldBinding_vif_type, binding_vif_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBinding_vnic_type() {
		return binding_vnic_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding_vnic_type(String newBinding_vnic_type) {
		String oldBinding_vnic_type = binding_vnic_type;
		binding_vnic_type = newBinding_vnic_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__BINDING_VNIC_TYPE, oldBinding_vnic_type, binding_vnic_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDevice_id() {
		return device_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice_id(String newDevice_id) {
		String oldDevice_id = device_id;
		device_id = newDevice_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__DEVICE_ID, oldDevice_id, device_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDevice_owner() {
		return device_owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice_owner(String newDevice_owner) {
		String oldDevice_owner = device_owner;
		device_owner = newDevice_owner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__DEVICE_OWNER, oldDevice_owner, device_owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExtra_dhcp_opts() {
		if (extra_dhcp_opts == null) {
			extra_dhcp_opts = new EDataTypeEList<String>(String.class, this, NeutronPackage.PORT__EXTRA_DHCP_OPTS);
		}
		return extra_dhcp_opts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FixedIp> getFixed_ips() {
		if (fixed_ips == null) {
			fixed_ips = new EObjectContainmentEList<FixedIp>(FixedIp.class, this, NeutronPackage.PORT__FIXED_IPS);
		}
		return fixed_ips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMac_address() {
		return mac_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac_address(String newMac_address) {
		String oldMac_address = mac_address;
		mac_address = newMac_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__MAC_ADDRESS, oldMac_address, mac_address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.PORT__NETWORK_ID, oldNetwork_id, network_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSecurity_groups() {
		if (security_groups == null) {
			security_groups = new EDataTypeEList<String>(String.class, this, NeutronPackage.PORT__SECURITY_GROUPS);
		}
		return security_groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NeutronPackage.PORT__EXTERNAL_GATEWAY_INFO:
				return basicSetExternal_gateway_info(null, msgs);
			case NeutronPackage.PORT__BINDING_PROFILE:
				return basicSetBinding_profile(null, msgs);
			case NeutronPackage.PORT__BINDING_VIF_DETAILS:
				return basicSetBinding_vif_details(null, msgs);
			case NeutronPackage.PORT__FIXED_IPS:
				return ((InternalEList<?>)getFixed_ips()).basicRemove(otherEnd, msgs);
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
			case NeutronPackage.PORT__ID:
				return getId();
			case NeutronPackage.PORT__NAME:
				return getName();
			case NeutronPackage.PORT__STATUS:
				return getStatus();
			case NeutronPackage.PORT__ADMIN_STATE_UP:
				return getAdmin_state_up();
			case NeutronPackage.PORT__EXTERNAL_GATEWAY_INFO:
				return getExternal_gateway_info();
			case NeutronPackage.PORT__TENANT_ID:
				return getTenant_id();
			case NeutronPackage.PORT__ALLOWED_ADDRESS_PAIRS:
				return getAllowed_address_pairs();
			case NeutronPackage.PORT__BINDING_HOST_ID:
				return getBinding_host_id();
			case NeutronPackage.PORT__BINDING_PROFILE:
				return getBinding_profile();
			case NeutronPackage.PORT__BINDING_VIF_DETAILS:
				return getBinding_vif_details();
			case NeutronPackage.PORT__BINDING_VIF_TYPE:
				return getBinding_vif_type();
			case NeutronPackage.PORT__BINDING_VNIC_TYPE:
				return getBinding_vnic_type();
			case NeutronPackage.PORT__DEVICE_ID:
				return getDevice_id();
			case NeutronPackage.PORT__DEVICE_OWNER:
				return getDevice_owner();
			case NeutronPackage.PORT__EXTRA_DHCP_OPTS:
				return getExtra_dhcp_opts();
			case NeutronPackage.PORT__FIXED_IPS:
				return getFixed_ips();
			case NeutronPackage.PORT__MAC_ADDRESS:
				return getMac_address();
			case NeutronPackage.PORT__NETWORK_ID:
				return getNetwork_id();
			case NeutronPackage.PORT__SECURITY_GROUPS:
				return getSecurity_groups();
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
			case NeutronPackage.PORT__ID:
				setId((String)newValue);
				return;
			case NeutronPackage.PORT__NAME:
				setName((String)newValue);
				return;
			case NeutronPackage.PORT__STATUS:
				setStatus((String)newValue);
				return;
			case NeutronPackage.PORT__ADMIN_STATE_UP:
				setAdmin_state_up((Boolean)newValue);
				return;
			case NeutronPackage.PORT__EXTERNAL_GATEWAY_INFO:
				setExternal_gateway_info((ExternalGateway)newValue);
				return;
			case NeutronPackage.PORT__TENANT_ID:
				setTenant_id((String)newValue);
				return;
			case NeutronPackage.PORT__ALLOWED_ADDRESS_PAIRS:
				getAllowed_address_pairs().clear();
				getAllowed_address_pairs().addAll((Collection<? extends String>)newValue);
				return;
			case NeutronPackage.PORT__BINDING_HOST_ID:
				setBinding_host_id((String)newValue);
				return;
			case NeutronPackage.PORT__BINDING_PROFILE:
				setBinding_profile((BindingProfile)newValue);
				return;
			case NeutronPackage.PORT__BINDING_VIF_DETAILS:
				setBinding_vif_details((BindingVifDetail)newValue);
				return;
			case NeutronPackage.PORT__BINDING_VIF_TYPE:
				setBinding_vif_type((String)newValue);
				return;
			case NeutronPackage.PORT__BINDING_VNIC_TYPE:
				setBinding_vnic_type((String)newValue);
				return;
			case NeutronPackage.PORT__DEVICE_ID:
				setDevice_id((String)newValue);
				return;
			case NeutronPackage.PORT__DEVICE_OWNER:
				setDevice_owner((String)newValue);
				return;
			case NeutronPackage.PORT__EXTRA_DHCP_OPTS:
				getExtra_dhcp_opts().clear();
				getExtra_dhcp_opts().addAll((Collection<? extends String>)newValue);
				return;
			case NeutronPackage.PORT__FIXED_IPS:
				getFixed_ips().clear();
				getFixed_ips().addAll((Collection<? extends FixedIp>)newValue);
				return;
			case NeutronPackage.PORT__MAC_ADDRESS:
				setMac_address((String)newValue);
				return;
			case NeutronPackage.PORT__NETWORK_ID:
				setNetwork_id((String)newValue);
				return;
			case NeutronPackage.PORT__SECURITY_GROUPS:
				getSecurity_groups().clear();
				getSecurity_groups().addAll((Collection<? extends String>)newValue);
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
			case NeutronPackage.PORT__ID:
				setId(ID_EDEFAULT);
				return;
			case NeutronPackage.PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NeutronPackage.PORT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case NeutronPackage.PORT__ADMIN_STATE_UP:
				setAdmin_state_up(ADMIN_STATE_UP_EDEFAULT);
				return;
			case NeutronPackage.PORT__EXTERNAL_GATEWAY_INFO:
				setExternal_gateway_info((ExternalGateway)null);
				return;
			case NeutronPackage.PORT__TENANT_ID:
				setTenant_id(TENANT_ID_EDEFAULT);
				return;
			case NeutronPackage.PORT__ALLOWED_ADDRESS_PAIRS:
				getAllowed_address_pairs().clear();
				return;
			case NeutronPackage.PORT__BINDING_HOST_ID:
				setBinding_host_id(BINDING_HOST_ID_EDEFAULT);
				return;
			case NeutronPackage.PORT__BINDING_PROFILE:
				setBinding_profile((BindingProfile)null);
				return;
			case NeutronPackage.PORT__BINDING_VIF_DETAILS:
				setBinding_vif_details((BindingVifDetail)null);
				return;
			case NeutronPackage.PORT__BINDING_VIF_TYPE:
				setBinding_vif_type(BINDING_VIF_TYPE_EDEFAULT);
				return;
			case NeutronPackage.PORT__BINDING_VNIC_TYPE:
				setBinding_vnic_type(BINDING_VNIC_TYPE_EDEFAULT);
				return;
			case NeutronPackage.PORT__DEVICE_ID:
				setDevice_id(DEVICE_ID_EDEFAULT);
				return;
			case NeutronPackage.PORT__DEVICE_OWNER:
				setDevice_owner(DEVICE_OWNER_EDEFAULT);
				return;
			case NeutronPackage.PORT__EXTRA_DHCP_OPTS:
				getExtra_dhcp_opts().clear();
				return;
			case NeutronPackage.PORT__FIXED_IPS:
				getFixed_ips().clear();
				return;
			case NeutronPackage.PORT__MAC_ADDRESS:
				setMac_address(MAC_ADDRESS_EDEFAULT);
				return;
			case NeutronPackage.PORT__NETWORK_ID:
				setNetwork_id(NETWORK_ID_EDEFAULT);
				return;
			case NeutronPackage.PORT__SECURITY_GROUPS:
				getSecurity_groups().clear();
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
			case NeutronPackage.PORT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NeutronPackage.PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NeutronPackage.PORT__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case NeutronPackage.PORT__ADMIN_STATE_UP:
				return ADMIN_STATE_UP_EDEFAULT == null ? admin_state_up != null : !ADMIN_STATE_UP_EDEFAULT.equals(admin_state_up);
			case NeutronPackage.PORT__EXTERNAL_GATEWAY_INFO:
				return external_gateway_info != null;
			case NeutronPackage.PORT__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenant_id != null : !TENANT_ID_EDEFAULT.equals(tenant_id);
			case NeutronPackage.PORT__ALLOWED_ADDRESS_PAIRS:
				return allowed_address_pairs != null && !allowed_address_pairs.isEmpty();
			case NeutronPackage.PORT__BINDING_HOST_ID:
				return BINDING_HOST_ID_EDEFAULT == null ? binding_host_id != null : !BINDING_HOST_ID_EDEFAULT.equals(binding_host_id);
			case NeutronPackage.PORT__BINDING_PROFILE:
				return binding_profile != null;
			case NeutronPackage.PORT__BINDING_VIF_DETAILS:
				return binding_vif_details != null;
			case NeutronPackage.PORT__BINDING_VIF_TYPE:
				return BINDING_VIF_TYPE_EDEFAULT == null ? binding_vif_type != null : !BINDING_VIF_TYPE_EDEFAULT.equals(binding_vif_type);
			case NeutronPackage.PORT__BINDING_VNIC_TYPE:
				return BINDING_VNIC_TYPE_EDEFAULT == null ? binding_vnic_type != null : !BINDING_VNIC_TYPE_EDEFAULT.equals(binding_vnic_type);
			case NeutronPackage.PORT__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? device_id != null : !DEVICE_ID_EDEFAULT.equals(device_id);
			case NeutronPackage.PORT__DEVICE_OWNER:
				return DEVICE_OWNER_EDEFAULT == null ? device_owner != null : !DEVICE_OWNER_EDEFAULT.equals(device_owner);
			case NeutronPackage.PORT__EXTRA_DHCP_OPTS:
				return extra_dhcp_opts != null && !extra_dhcp_opts.isEmpty();
			case NeutronPackage.PORT__FIXED_IPS:
				return fixed_ips != null && !fixed_ips.isEmpty();
			case NeutronPackage.PORT__MAC_ADDRESS:
				return MAC_ADDRESS_EDEFAULT == null ? mac_address != null : !MAC_ADDRESS_EDEFAULT.equals(mac_address);
			case NeutronPackage.PORT__NETWORK_ID:
				return NETWORK_ID_EDEFAULT == null ? network_id != null : !NETWORK_ID_EDEFAULT.equals(network_id);
			case NeutronPackage.PORT__SECURITY_GROUPS:
				return security_groups != null && !security_groups.isEmpty();
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
		result.append(", tenant_id: ");
		result.append(tenant_id);
		result.append(", allowed_address_pairs: ");
		result.append(allowed_address_pairs);
		result.append(", binding_host_id: ");
		result.append(binding_host_id);
		result.append(", binding_vif_type: ");
		result.append(binding_vif_type);
		result.append(", binding_vnic_type: ");
		result.append(binding_vnic_type);
		result.append(", device_id: ");
		result.append(device_id);
		result.append(", device_owner: ");
		result.append(device_owner);
		result.append(", extra_dhcp_opts: ");
		result.append(extra_dhcp_opts);
		result.append(", mac_address: ");
		result.append(mac_address);
		result.append(", network_id: ");
		result.append(network_id);
		result.append(", security_groups: ");
		result.append(security_groups);
		result.append(')');
		return result.toString();
	}

} //PortImpl
