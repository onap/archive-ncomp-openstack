
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
package org.openecomp.ncomp.openstack.location.impl;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerMeter;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerProject;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerResource;
import org.openecomp.ncomp.openstack.compute.FloatingIp;
import org.openecomp.ncomp.openstack.compute.KeyPair;
import org.openecomp.ncomp.openstack.compute.SecurityGroup;
import org.openecomp.ncomp.openstack.compute.Server;
import org.openecomp.ncomp.openstack.compute.Volume;

import org.openecomp.ncomp.openstack.location.LocationPackage;
import org.openecomp.ncomp.openstack.location.OpenStackProject;
import org.openecomp.ncomp.openstack.location.OpenStackUser;

import org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest;
import org.openecomp.ncomp.openstack.neutron.Network;
import org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp;
import org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup;
import org.openecomp.ncomp.openstack.neutron.Port;
import org.openecomp.ncomp.openstack.neutron.Router;
import org.openecomp.ncomp.openstack.neutron.Subnet;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Stack Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getAlarms <em>Alarms</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getMeters <em>Meters</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getAdminUser <em>Admin User</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getPrivateNetwork <em>Private Network</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getPublicNetwork <em>Public Network</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getServers <em>Servers</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getControllerUser <em>Controller User</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getIps <em>Ips</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getKeypairs <em>Keypairs</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getRouters <em>Routers</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getSecurity_groups <em>Security groups</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl#getFloatingips <em>Floatingips</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenStackProjectImpl extends NamedEntityImpl implements OpenStackProject {
	/**
	 * The cached value of the '{@link #getAlarms() <em>Alarms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarms()
	 * @generated
	 * @ordered
	 */
	protected EList<CeilometerAlarm> alarms;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<CeilometerResource> resources;

	/**
	 * The cached value of the '{@link #getMeters() <em>Meters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeters()
	 * @generated
	 * @ordered
	 */
	protected EList<CeilometerMeter> meters;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdminUser() <em>Admin User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUser()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIN_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdminUser() <em>Admin User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUser()
	 * @generated
	 * @ordered
	 */
	protected String adminUser = ADMIN_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenantId() <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenantId() <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected String tenantId = TENANT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateNetwork() <em>Private Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_NETWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateNetwork() <em>Private Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateNetwork()
	 * @generated
	 * @ordered
	 */
	protected String privateNetwork = PRIVATE_NETWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicNetwork() <em>Public Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_NETWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicNetwork() <em>Public Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicNetwork()
	 * @generated
	 * @ordered
	 */
	protected String publicNetwork = PUBLIC_NETWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected String apiKey = API_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServers()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> servers;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<OpenStackUser> users;

	/**
	 * The cached value of the '{@link #getControllerUser() <em>Controller User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerUser()
	 * @generated
	 * @ordered
	 */
	protected OpenStackUser controllerUser;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volumes;

	/**
	 * The cached value of the '{@link #getIps() <em>Ips</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIps()
	 * @generated
	 * @ordered
	 */
	protected EList<FloatingIp> ips;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroup> groups;

	/**
	 * The cached value of the '{@link #getKeypairs() <em>Keypairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypairs()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyPair> keypairs;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> networks;

	/**
	 * The cached value of the '{@link #getSubnets() <em>Subnets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets()
	 * @generated
	 * @ordered
	 */
	protected EList<Subnet> subnets;

	/**
	 * The cached value of the '{@link #getRouters() <em>Routers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouters()
	 * @generated
	 * @ordered
	 */
	protected EList<Router> routers;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getSecurity_groups() <em>Security groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_groups()
	 * @generated
	 * @ordered
	 */
	protected EList<NeutronSecurityGroup> security_groups;

	/**
	 * The cached value of the '{@link #getFloatingips() <em>Floatingips</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingips()
	 * @generated
	 * @ordered
	 */
	protected EList<NeutronFloatingIp> floatingips;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenStackProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.OPEN_STACK_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CeilometerAlarm> getAlarms() {
		if (alarms == null) {
			alarms = new EObjectContainmentEList<CeilometerAlarm>(CeilometerAlarm.class, this, LocationPackage.OPEN_STACK_PROJECT__ALARMS);
		}
		return alarms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CeilometerResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<CeilometerResource>(CeilometerResource.class, this, LocationPackage.OPEN_STACK_PROJECT__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CeilometerMeter> getMeters() {
		if (meters == null) {
			meters = new EObjectContainmentEList<CeilometerMeter>(CeilometerMeter.class, this, LocationPackage.OPEN_STACK_PROJECT__METERS);
		}
		return meters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_PROJECT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdminUser() {
		return adminUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminUser(String newAdminUser) {
		String oldAdminUser = adminUser;
		adminUser = newAdminUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_PROJECT__ADMIN_USER, oldAdminUser, adminUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenantId(String newTenantId) {
		String oldTenantId = tenantId;
		tenantId = newTenantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_PROJECT__TENANT_ID, oldTenantId, tenantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_PROJECT__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateNetwork() {
		return privateNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateNetwork(String newPrivateNetwork) {
		String oldPrivateNetwork = privateNetwork;
		privateNetwork = newPrivateNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_PROJECT__PRIVATE_NETWORK, oldPrivateNetwork, privateNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicNetwork() {
		return publicNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicNetwork(String newPublicNetwork) {
		String oldPublicNetwork = publicNetwork;
		publicNetwork = newPublicNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_PROJECT__PUBLIC_NETWORK, oldPublicNetwork, publicNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiKey() {
		return apiKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiKey(String newApiKey) {
		String oldApiKey = apiKey;
		apiKey = newApiKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_PROJECT__API_KEY, oldApiKey, apiKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Server> getServers() {
		if (servers == null) {
			servers = new EObjectContainmentEList<Server>(Server.class, this, LocationPackage.OPEN_STACK_PROJECT__SERVERS);
		}
		return servers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpenStackUser> getUsers() {
		if (users == null) {
			users = new EObjectResolvingEList<OpenStackUser>(OpenStackUser.class, this, LocationPackage.OPEN_STACK_PROJECT__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackUser getControllerUser() {
		if (controllerUser != null && controllerUser.eIsProxy()) {
			InternalEObject oldControllerUser = (InternalEObject)controllerUser;
			controllerUser = (OpenStackUser)eResolveProxy(oldControllerUser);
			if (controllerUser != oldControllerUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationPackage.OPEN_STACK_PROJECT__CONTROLLER_USER, oldControllerUser, controllerUser));
			}
		}
		return controllerUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackUser basicGetControllerUser() {
		return controllerUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerUser(OpenStackUser newControllerUser) {
		OpenStackUser oldControllerUser = controllerUser;
		controllerUser = newControllerUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_PROJECT__CONTROLLER_USER, oldControllerUser, controllerUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Volume> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectContainmentEList<Volume>(Volume.class, this, LocationPackage.OPEN_STACK_PROJECT__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FloatingIp> getIps() {
		if (ips == null) {
			ips = new EObjectContainmentEList<FloatingIp>(FloatingIp.class, this, LocationPackage.OPEN_STACK_PROJECT__IPS);
		}
		return ips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<SecurityGroup>(SecurityGroup.class, this, LocationPackage.OPEN_STACK_PROJECT__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyPair> getKeypairs() {
		if (keypairs == null) {
			keypairs = new EObjectContainmentEList<KeyPair>(KeyPair.class, this, LocationPackage.OPEN_STACK_PROJECT__KEYPAIRS);
		}
		return keypairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<Network>(Network.class, this, LocationPackage.OPEN_STACK_PROJECT__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subnet> getSubnets() {
		if (subnets == null) {
			subnets = new EObjectContainmentEList<Subnet>(Subnet.class, this, LocationPackage.OPEN_STACK_PROJECT__SUBNETS);
		}
		return subnets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Router> getRouters() {
		if (routers == null) {
			routers = new EObjectContainmentEList<Router>(Router.class, this, LocationPackage.OPEN_STACK_PROJECT__ROUTERS);
		}
		return routers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, LocationPackage.OPEN_STACK_PROJECT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NeutronSecurityGroup> getSecurity_groups() {
		if (security_groups == null) {
			security_groups = new EObjectContainmentEList<NeutronSecurityGroup>(NeutronSecurityGroup.class, this, LocationPackage.OPEN_STACK_PROJECT__SECURITY_GROUPS);
		}
		return security_groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NeutronFloatingIp> getFloatingips() {
		if (floatingips == null) {
			floatingips = new EObjectContainmentEList<NeutronFloatingIp>(NeutronFloatingIp.class, this, LocationPackage.OPEN_STACK_PROJECT__FLOATINGIPS);
		}
		return floatingips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateNovaState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork(CreateNetworkRequest r) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationPackage.OPEN_STACK_PROJECT__ALARMS:
				return ((InternalEList<?>)getAlarms()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__METERS:
				return ((InternalEList<?>)getMeters()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__SERVERS:
				return ((InternalEList<?>)getServers()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__VOLUMES:
				return ((InternalEList<?>)getVolumes()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__IPS:
				return ((InternalEList<?>)getIps()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__KEYPAIRS:
				return ((InternalEList<?>)getKeypairs()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__SUBNETS:
				return ((InternalEList<?>)getSubnets()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__ROUTERS:
				return ((InternalEList<?>)getRouters()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__SECURITY_GROUPS:
				return ((InternalEList<?>)getSecurity_groups()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_PROJECT__FLOATINGIPS:
				return ((InternalEList<?>)getFloatingips()).basicRemove(otherEnd, msgs);
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
			case LocationPackage.OPEN_STACK_PROJECT__ALARMS:
				return getAlarms();
			case LocationPackage.OPEN_STACK_PROJECT__RESOURCES:
				return getResources();
			case LocationPackage.OPEN_STACK_PROJECT__METERS:
				return getMeters();
			case LocationPackage.OPEN_STACK_PROJECT__ID:
				return getID();
			case LocationPackage.OPEN_STACK_PROJECT__ADMIN_USER:
				return getAdminUser();
			case LocationPackage.OPEN_STACK_PROJECT__TENANT_ID:
				return getTenantId();
			case LocationPackage.OPEN_STACK_PROJECT__REGION:
				return getRegion();
			case LocationPackage.OPEN_STACK_PROJECT__PRIVATE_NETWORK:
				return getPrivateNetwork();
			case LocationPackage.OPEN_STACK_PROJECT__PUBLIC_NETWORK:
				return getPublicNetwork();
			case LocationPackage.OPEN_STACK_PROJECT__API_KEY:
				return getApiKey();
			case LocationPackage.OPEN_STACK_PROJECT__SERVERS:
				return getServers();
			case LocationPackage.OPEN_STACK_PROJECT__USERS:
				return getUsers();
			case LocationPackage.OPEN_STACK_PROJECT__CONTROLLER_USER:
				if (resolve) return getControllerUser();
				return basicGetControllerUser();
			case LocationPackage.OPEN_STACK_PROJECT__VOLUMES:
				return getVolumes();
			case LocationPackage.OPEN_STACK_PROJECT__IPS:
				return getIps();
			case LocationPackage.OPEN_STACK_PROJECT__GROUPS:
				return getGroups();
			case LocationPackage.OPEN_STACK_PROJECT__KEYPAIRS:
				return getKeypairs();
			case LocationPackage.OPEN_STACK_PROJECT__NETWORKS:
				return getNetworks();
			case LocationPackage.OPEN_STACK_PROJECT__SUBNETS:
				return getSubnets();
			case LocationPackage.OPEN_STACK_PROJECT__ROUTERS:
				return getRouters();
			case LocationPackage.OPEN_STACK_PROJECT__PORTS:
				return getPorts();
			case LocationPackage.OPEN_STACK_PROJECT__SECURITY_GROUPS:
				return getSecurity_groups();
			case LocationPackage.OPEN_STACK_PROJECT__FLOATINGIPS:
				return getFloatingips();
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
			case LocationPackage.OPEN_STACK_PROJECT__ALARMS:
				getAlarms().clear();
				getAlarms().addAll((Collection<? extends CeilometerAlarm>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends CeilometerResource>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__METERS:
				getMeters().clear();
				getMeters().addAll((Collection<? extends CeilometerMeter>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__ID:
				setID((String)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__ADMIN_USER:
				setAdminUser((String)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__TENANT_ID:
				setTenantId((String)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__REGION:
				setRegion((String)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__PRIVATE_NETWORK:
				setPrivateNetwork((String)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__PUBLIC_NETWORK:
				setPublicNetwork((String)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__API_KEY:
				setApiKey((String)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__SERVERS:
				getServers().clear();
				getServers().addAll((Collection<? extends Server>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends OpenStackUser>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__CONTROLLER_USER:
				setControllerUser((OpenStackUser)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends Volume>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__IPS:
				getIps().clear();
				getIps().addAll((Collection<? extends FloatingIp>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends SecurityGroup>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__KEYPAIRS:
				getKeypairs().clear();
				getKeypairs().addAll((Collection<? extends KeyPair>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Network>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__SUBNETS:
				getSubnets().clear();
				getSubnets().addAll((Collection<? extends Subnet>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__ROUTERS:
				getRouters().clear();
				getRouters().addAll((Collection<? extends Router>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__SECURITY_GROUPS:
				getSecurity_groups().clear();
				getSecurity_groups().addAll((Collection<? extends NeutronSecurityGroup>)newValue);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__FLOATINGIPS:
				getFloatingips().clear();
				getFloatingips().addAll((Collection<? extends NeutronFloatingIp>)newValue);
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
			case LocationPackage.OPEN_STACK_PROJECT__ALARMS:
				getAlarms().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__RESOURCES:
				getResources().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__METERS:
				getMeters().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__ID:
				setID(ID_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__ADMIN_USER:
				setAdminUser(ADMIN_USER_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__TENANT_ID:
				setTenantId(TENANT_ID_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__PRIVATE_NETWORK:
				setPrivateNetwork(PRIVATE_NETWORK_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__PUBLIC_NETWORK:
				setPublicNetwork(PUBLIC_NETWORK_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__API_KEY:
				setApiKey(API_KEY_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__SERVERS:
				getServers().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__USERS:
				getUsers().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__CONTROLLER_USER:
				setControllerUser((OpenStackUser)null);
				return;
			case LocationPackage.OPEN_STACK_PROJECT__VOLUMES:
				getVolumes().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__IPS:
				getIps().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__GROUPS:
				getGroups().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__KEYPAIRS:
				getKeypairs().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__NETWORKS:
				getNetworks().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__SUBNETS:
				getSubnets().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__ROUTERS:
				getRouters().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__PORTS:
				getPorts().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__SECURITY_GROUPS:
				getSecurity_groups().clear();
				return;
			case LocationPackage.OPEN_STACK_PROJECT__FLOATINGIPS:
				getFloatingips().clear();
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
			case LocationPackage.OPEN_STACK_PROJECT__ALARMS:
				return alarms != null && !alarms.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__RESOURCES:
				return resources != null && !resources.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__METERS:
				return meters != null && !meters.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LocationPackage.OPEN_STACK_PROJECT__ADMIN_USER:
				return ADMIN_USER_EDEFAULT == null ? adminUser != null : !ADMIN_USER_EDEFAULT.equals(adminUser);
			case LocationPackage.OPEN_STACK_PROJECT__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenantId != null : !TENANT_ID_EDEFAULT.equals(tenantId);
			case LocationPackage.OPEN_STACK_PROJECT__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case LocationPackage.OPEN_STACK_PROJECT__PRIVATE_NETWORK:
				return PRIVATE_NETWORK_EDEFAULT == null ? privateNetwork != null : !PRIVATE_NETWORK_EDEFAULT.equals(privateNetwork);
			case LocationPackage.OPEN_STACK_PROJECT__PUBLIC_NETWORK:
				return PUBLIC_NETWORK_EDEFAULT == null ? publicNetwork != null : !PUBLIC_NETWORK_EDEFAULT.equals(publicNetwork);
			case LocationPackage.OPEN_STACK_PROJECT__API_KEY:
				return API_KEY_EDEFAULT == null ? apiKey != null : !API_KEY_EDEFAULT.equals(apiKey);
			case LocationPackage.OPEN_STACK_PROJECT__SERVERS:
				return servers != null && !servers.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__USERS:
				return users != null && !users.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__CONTROLLER_USER:
				return controllerUser != null;
			case LocationPackage.OPEN_STACK_PROJECT__VOLUMES:
				return volumes != null && !volumes.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__IPS:
				return ips != null && !ips.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__GROUPS:
				return groups != null && !groups.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__KEYPAIRS:
				return keypairs != null && !keypairs.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__NETWORKS:
				return networks != null && !networks.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__SUBNETS:
				return subnets != null && !subnets.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__ROUTERS:
				return routers != null && !routers.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__PORTS:
				return ports != null && !ports.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__SECURITY_GROUPS:
				return security_groups != null && !security_groups.isEmpty();
			case LocationPackage.OPEN_STACK_PROJECT__FLOATINGIPS:
				return floatingips != null && !floatingips.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CeilometerProject.class) {
			switch (derivedFeatureID) {
				case LocationPackage.OPEN_STACK_PROJECT__ALARMS: return CeilometerPackage.CEILOMETER_PROJECT__ALARMS;
				case LocationPackage.OPEN_STACK_PROJECT__RESOURCES: return CeilometerPackage.CEILOMETER_PROJECT__RESOURCES;
				case LocationPackage.OPEN_STACK_PROJECT__METERS: return CeilometerPackage.CEILOMETER_PROJECT__METERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CeilometerProject.class) {
			switch (baseFeatureID) {
				case CeilometerPackage.CEILOMETER_PROJECT__ALARMS: return LocationPackage.OPEN_STACK_PROJECT__ALARMS;
				case CeilometerPackage.CEILOMETER_PROJECT__RESOURCES: return LocationPackage.OPEN_STACK_PROJECT__RESOURCES;
				case CeilometerPackage.CEILOMETER_PROJECT__METERS: return LocationPackage.OPEN_STACK_PROJECT__METERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LocationPackage.OPEN_STACK_PROJECT___UPDATE_NOVA_STATE:
				updateNovaState();
				return null;
			case LocationPackage.OPEN_STACK_PROJECT___CREATE_NETWORK__CREATENETWORKREQUEST:
				return createNetwork((CreateNetworkRequest)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", adminUser: ");
		result.append(adminUser);
		result.append(", tenantId: ");
		result.append(tenantId);
		result.append(", region: ");
		result.append(region);
		result.append(", privateNetwork: ");
		result.append(privateNetwork);
		result.append(", publicNetwork: ");
		result.append(publicNetwork);
		result.append(", apiKey: ");
		result.append(apiKey);
		result.append(')');
		return result.toString();
	}

} //OpenStackProjectImpl
