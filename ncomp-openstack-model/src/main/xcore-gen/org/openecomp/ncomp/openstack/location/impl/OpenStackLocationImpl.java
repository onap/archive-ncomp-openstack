
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

import org.openecomp.ncomp.core.User;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerSample;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerService;
import org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest;
import org.openecomp.ncomp.openstack.ceilometer.SampleRequest;
import org.openecomp.ncomp.openstack.compute.ComputePackage;
import org.openecomp.ncomp.openstack.compute.ComputeService;
import org.openecomp.ncomp.openstack.compute.Flavor;
import org.openecomp.ncomp.openstack.compute.Image;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction;
import org.openecomp.ncomp.openstack.core.OpenstackRequestDelete;
import org.openecomp.ncomp.openstack.location.Hypervisor;
import org.openecomp.ncomp.openstack.location.LocationPackage;
import org.openecomp.ncomp.openstack.location.OpenStackLocation;
import org.openecomp.ncomp.openstack.location.OpenStackProject;
import org.openecomp.ncomp.openstack.location.OpenStackUser;
import org.openecomp.ncomp.openstack.location.OpenStackVersion;
import org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest;
import org.openecomp.ncomp.openstack.neutron.CreatePortRequest;
import org.openecomp.ncomp.openstack.neutron.CreateRouterRequest;
import org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest;
import org.openecomp.ncomp.openstack.neutron.Network;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;
import org.openecomp.ncomp.openstack.neutron.NeutronService;
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
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Stack Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#getCeilometerAvailableCapabilites <em>Ceilometer Available Capabilites</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#getCeilometerUnavailableCapabilites <em>Ceilometer Unavailable Capabilites</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#isRemoteLocation <em>Remote Location</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#getRemoteLocationName <em>Remote Location Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#isAllowCreateFlavor <em>Allow Create Flavor</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#getKeystoneUrl <em>Keystone Url</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#getBypassIp <em>Bypass Ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#getFlavorId <em>Flavor Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#isSupportsSecurityGroups <em>Supports Security Groups</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#isSupportsFloatingIps <em>Supports Floating Ips</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#getImages <em>Images</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#getFlavors <em>Flavors</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl#getHypervisors <em>Hypervisors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenStackLocationImpl extends NamedEntityImpl implements OpenStackLocation {
	/**
	 * The cached value of the '{@link #getCeilometerAvailableCapabilites() <em>Ceilometer Available Capabilites</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeilometerAvailableCapabilites()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ceilometerAvailableCapabilites;

	/**
	 * The cached value of the '{@link #getCeilometerUnavailableCapabilites() <em>Ceilometer Unavailable Capabilites</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeilometerUnavailableCapabilites()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ceilometerUnavailableCapabilites;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final OpenStackVersion VERSION_EDEFAULT = OpenStackVersion.FOLSOM;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected OpenStackVersion version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoteLocation() <em>Remote Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteLocation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_LOCATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoteLocation() <em>Remote Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteLocation()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteLocation = REMOTE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteLocationName() <em>Remote Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteLocationName()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_LOCATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteLocationName() <em>Remote Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteLocationName()
	 * @generated
	 * @ordered
	 */
	protected String remoteLocationName = REMOTE_LOCATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowCreateFlavor() <em>Allow Create Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowCreateFlavor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_CREATE_FLAVOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowCreateFlavor() <em>Allow Create Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowCreateFlavor()
	 * @generated
	 * @ordered
	 */
	protected boolean allowCreateFlavor = ALLOW_CREATE_FLAVOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeystoneUrl() <em>Keystone Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystoneUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYSTONE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeystoneUrl() <em>Keystone Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystoneUrl()
	 * @generated
	 * @ordered
	 */
	protected String keystoneUrl = KEYSTONE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBypassIp() <em>Bypass Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBypassIp()
	 * @generated
	 * @ordered
	 */
	protected static final String BYPASS_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBypassIp() <em>Bypass Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBypassIp()
	 * @generated
	 * @ordered
	 */
	protected String bypassIp = BYPASS_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlavorId() <em>Flavor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavorId()
	 * @generated
	 * @ordered
	 */
	protected static final int FLAVOR_ID_EDEFAULT = 20000;

	/**
	 * The cached value of the '{@link #getFlavorId() <em>Flavor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavorId()
	 * @generated
	 * @ordered
	 */
	protected int flavorId = FLAVOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSupportsSecurityGroups() <em>Supports Security Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportsSecurityGroups()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORTS_SECURITY_GROUPS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSupportsSecurityGroups() <em>Supports Security Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportsSecurityGroups()
	 * @generated
	 * @ordered
	 */
	protected boolean supportsSecurityGroups = SUPPORTS_SECURITY_GROUPS_EDEFAULT;

	/**
	 * The default value of the '{@link #isSupportsFloatingIps() <em>Supports Floating Ips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportsFloatingIps()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORTS_FLOATING_IPS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSupportsFloatingIps() <em>Supports Floating Ips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportsFloatingIps()
	 * @generated
	 * @ordered
	 */
	protected boolean supportsFloatingIps = SUPPORTS_FLOATING_IPS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<OpenStackProject> projects;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<OpenStackUser> users;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> images;

	/**
	 * The cached value of the '{@link #getFlavors() <em>Flavors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavors()
	 * @generated
	 * @ordered
	 */
	protected EList<Flavor> flavors;

	/**
	 * The cached value of the '{@link #getHypervisors() <em>Hypervisors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisors()
	 * @generated
	 * @ordered
	 */
	protected EList<Hypervisor> hypervisors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenStackLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.OPEN_STACK_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCeilometerAvailableCapabilites() {
		if (ceilometerAvailableCapabilites == null) {
			ceilometerAvailableCapabilites = new EDataTypeEList<String>(String.class, this, LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_AVAILABLE_CAPABILITES);
		}
		return ceilometerAvailableCapabilites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCeilometerUnavailableCapabilites() {
		if (ceilometerUnavailableCapabilites == null) {
			ceilometerUnavailableCapabilites = new EDataTypeEList<String>(String.class, this, LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_UNAVAILABLE_CAPABILITES);
		}
		return ceilometerUnavailableCapabilites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackVersion getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(OpenStackVersion newVersion) {
		OpenStackVersion oldVersion = version;
		version = newVersion == null ? VERSION_EDEFAULT : newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_LOCATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoteLocation() {
		return remoteLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteLocation(boolean newRemoteLocation) {
		boolean oldRemoteLocation = remoteLocation;
		remoteLocation = newRemoteLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_LOCATION__REMOTE_LOCATION, oldRemoteLocation, remoteLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteLocationName() {
		return remoteLocationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteLocationName(String newRemoteLocationName) {
		String oldRemoteLocationName = remoteLocationName;
		remoteLocationName = newRemoteLocationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_LOCATION__REMOTE_LOCATION_NAME, oldRemoteLocationName, remoteLocationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowCreateFlavor() {
		return allowCreateFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowCreateFlavor(boolean newAllowCreateFlavor) {
		boolean oldAllowCreateFlavor = allowCreateFlavor;
		allowCreateFlavor = newAllowCreateFlavor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_LOCATION__ALLOW_CREATE_FLAVOR, oldAllowCreateFlavor, allowCreateFlavor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeystoneUrl() {
		return keystoneUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeystoneUrl(String newKeystoneUrl) {
		String oldKeystoneUrl = keystoneUrl;
		keystoneUrl = newKeystoneUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_LOCATION__KEYSTONE_URL, oldKeystoneUrl, keystoneUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBypassIp() {
		return bypassIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBypassIp(String newBypassIp) {
		String oldBypassIp = bypassIp;
		bypassIp = newBypassIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_LOCATION__BYPASS_IP, oldBypassIp, bypassIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFlavorId() {
		return flavorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlavorId(int newFlavorId) {
		int oldFlavorId = flavorId;
		flavorId = newFlavorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_LOCATION__FLAVOR_ID, oldFlavorId, flavorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSupportsSecurityGroups() {
		return supportsSecurityGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportsSecurityGroups(boolean newSupportsSecurityGroups) {
		boolean oldSupportsSecurityGroups = supportsSecurityGroups;
		supportsSecurityGroups = newSupportsSecurityGroups;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_LOCATION__SUPPORTS_SECURITY_GROUPS, oldSupportsSecurityGroups, supportsSecurityGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSupportsFloatingIps() {
		return supportsFloatingIps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportsFloatingIps(boolean newSupportsFloatingIps) {
		boolean oldSupportsFloatingIps = supportsFloatingIps;
		supportsFloatingIps = newSupportsFloatingIps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.OPEN_STACK_LOCATION__SUPPORTS_FLOATING_IPS, oldSupportsFloatingIps, supportsFloatingIps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpenStackProject> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentEList<OpenStackProject>(OpenStackProject.class, this, LocationPackage.OPEN_STACK_LOCATION__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpenStackUser> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<OpenStackUser>(OpenStackUser.class, this, LocationPackage.OPEN_STACK_LOCATION__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<Image>(Image.class, this, LocationPackage.OPEN_STACK_LOCATION__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flavor> getFlavors() {
		if (flavors == null) {
			flavors = new EObjectContainmentEList<Flavor>(Flavor.class, this, LocationPackage.OPEN_STACK_LOCATION__FLAVORS);
		}
		return flavors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hypervisor> getHypervisors() {
		if (hypervisors == null) {
			hypervisors = new EObjectContainmentEList<Hypervisor>(Hypervisor.class, this, LocationPackage.OPEN_STACK_LOCATION__HYPERVISORS);
		}
		return hypervisors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void poll() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void mergeLocation(OpenStackLocation loc) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerAlarm createAlarm(CreateAlarmRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteAlarm(String projectName, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CeilometerSample> createAlarm(SampleRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createServer(OpenstackRequestNewServer request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteServer(String projectName, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createKeyPair(OpenstackRequestKeyPair request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(OpenstackRequestDelete request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createFlavor(OpenstackRequestFlavor request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createSecurityGroup(OpenstackRequestSecurityGroup request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void serverAction(OpenstackRequestServerAction request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deployVmType(String vmTypeName, String projectName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void undeployVmType(String vmTypeName, String projectName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deployUser(User user, String projectName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void undeployUser(User user, String projectName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork(CreateNetworkRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subnet createSubnet(CreateSubnetRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort(CreatePortRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Router createRouter(CreateRouterRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteNetwork(String projectName, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteSubnet(String projectName, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deletePort(String projectName, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteRouter(String projectName, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void associateFloatingIp(String projectName, String ipId, String portId) {
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
			case LocationPackage.OPEN_STACK_LOCATION__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_LOCATION__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_LOCATION__IMAGES:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_LOCATION__FLAVORS:
				return ((InternalEList<?>)getFlavors()).basicRemove(otherEnd, msgs);
			case LocationPackage.OPEN_STACK_LOCATION__HYPERVISORS:
				return ((InternalEList<?>)getHypervisors()).basicRemove(otherEnd, msgs);
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
			case LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_AVAILABLE_CAPABILITES:
				return getCeilometerAvailableCapabilites();
			case LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_UNAVAILABLE_CAPABILITES:
				return getCeilometerUnavailableCapabilites();
			case LocationPackage.OPEN_STACK_LOCATION__VERSION:
				return getVersion();
			case LocationPackage.OPEN_STACK_LOCATION__REMOTE_LOCATION:
				return isRemoteLocation();
			case LocationPackage.OPEN_STACK_LOCATION__REMOTE_LOCATION_NAME:
				return getRemoteLocationName();
			case LocationPackage.OPEN_STACK_LOCATION__ALLOW_CREATE_FLAVOR:
				return isAllowCreateFlavor();
			case LocationPackage.OPEN_STACK_LOCATION__KEYSTONE_URL:
				return getKeystoneUrl();
			case LocationPackage.OPEN_STACK_LOCATION__BYPASS_IP:
				return getBypassIp();
			case LocationPackage.OPEN_STACK_LOCATION__FLAVOR_ID:
				return getFlavorId();
			case LocationPackage.OPEN_STACK_LOCATION__SUPPORTS_SECURITY_GROUPS:
				return isSupportsSecurityGroups();
			case LocationPackage.OPEN_STACK_LOCATION__SUPPORTS_FLOATING_IPS:
				return isSupportsFloatingIps();
			case LocationPackage.OPEN_STACK_LOCATION__PROJECTS:
				return getProjects();
			case LocationPackage.OPEN_STACK_LOCATION__USERS:
				return getUsers();
			case LocationPackage.OPEN_STACK_LOCATION__IMAGES:
				return getImages();
			case LocationPackage.OPEN_STACK_LOCATION__FLAVORS:
				return getFlavors();
			case LocationPackage.OPEN_STACK_LOCATION__HYPERVISORS:
				return getHypervisors();
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
			case LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_AVAILABLE_CAPABILITES:
				getCeilometerAvailableCapabilites().clear();
				getCeilometerAvailableCapabilites().addAll((Collection<? extends String>)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_UNAVAILABLE_CAPABILITES:
				getCeilometerUnavailableCapabilites().clear();
				getCeilometerUnavailableCapabilites().addAll((Collection<? extends String>)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__VERSION:
				setVersion((OpenStackVersion)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__REMOTE_LOCATION:
				setRemoteLocation((Boolean)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__REMOTE_LOCATION_NAME:
				setRemoteLocationName((String)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__ALLOW_CREATE_FLAVOR:
				setAllowCreateFlavor((Boolean)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__KEYSTONE_URL:
				setKeystoneUrl((String)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__BYPASS_IP:
				setBypassIp((String)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__FLAVOR_ID:
				setFlavorId((Integer)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__SUPPORTS_SECURITY_GROUPS:
				setSupportsSecurityGroups((Boolean)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__SUPPORTS_FLOATING_IPS:
				setSupportsFloatingIps((Boolean)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends OpenStackProject>)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends OpenStackUser>)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends Image>)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__FLAVORS:
				getFlavors().clear();
				getFlavors().addAll((Collection<? extends Flavor>)newValue);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__HYPERVISORS:
				getHypervisors().clear();
				getHypervisors().addAll((Collection<? extends Hypervisor>)newValue);
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
			case LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_AVAILABLE_CAPABILITES:
				getCeilometerAvailableCapabilites().clear();
				return;
			case LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_UNAVAILABLE_CAPABILITES:
				getCeilometerUnavailableCapabilites().clear();
				return;
			case LocationPackage.OPEN_STACK_LOCATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__REMOTE_LOCATION:
				setRemoteLocation(REMOTE_LOCATION_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__REMOTE_LOCATION_NAME:
				setRemoteLocationName(REMOTE_LOCATION_NAME_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__ALLOW_CREATE_FLAVOR:
				setAllowCreateFlavor(ALLOW_CREATE_FLAVOR_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__KEYSTONE_URL:
				setKeystoneUrl(KEYSTONE_URL_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__BYPASS_IP:
				setBypassIp(BYPASS_IP_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__FLAVOR_ID:
				setFlavorId(FLAVOR_ID_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__SUPPORTS_SECURITY_GROUPS:
				setSupportsSecurityGroups(SUPPORTS_SECURITY_GROUPS_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__SUPPORTS_FLOATING_IPS:
				setSupportsFloatingIps(SUPPORTS_FLOATING_IPS_EDEFAULT);
				return;
			case LocationPackage.OPEN_STACK_LOCATION__PROJECTS:
				getProjects().clear();
				return;
			case LocationPackage.OPEN_STACK_LOCATION__USERS:
				getUsers().clear();
				return;
			case LocationPackage.OPEN_STACK_LOCATION__IMAGES:
				getImages().clear();
				return;
			case LocationPackage.OPEN_STACK_LOCATION__FLAVORS:
				getFlavors().clear();
				return;
			case LocationPackage.OPEN_STACK_LOCATION__HYPERVISORS:
				getHypervisors().clear();
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
			case LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_AVAILABLE_CAPABILITES:
				return ceilometerAvailableCapabilites != null && !ceilometerAvailableCapabilites.isEmpty();
			case LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_UNAVAILABLE_CAPABILITES:
				return ceilometerUnavailableCapabilites != null && !ceilometerUnavailableCapabilites.isEmpty();
			case LocationPackage.OPEN_STACK_LOCATION__VERSION:
				return version != VERSION_EDEFAULT;
			case LocationPackage.OPEN_STACK_LOCATION__REMOTE_LOCATION:
				return remoteLocation != REMOTE_LOCATION_EDEFAULT;
			case LocationPackage.OPEN_STACK_LOCATION__REMOTE_LOCATION_NAME:
				return REMOTE_LOCATION_NAME_EDEFAULT == null ? remoteLocationName != null : !REMOTE_LOCATION_NAME_EDEFAULT.equals(remoteLocationName);
			case LocationPackage.OPEN_STACK_LOCATION__ALLOW_CREATE_FLAVOR:
				return allowCreateFlavor != ALLOW_CREATE_FLAVOR_EDEFAULT;
			case LocationPackage.OPEN_STACK_LOCATION__KEYSTONE_URL:
				return KEYSTONE_URL_EDEFAULT == null ? keystoneUrl != null : !KEYSTONE_URL_EDEFAULT.equals(keystoneUrl);
			case LocationPackage.OPEN_STACK_LOCATION__BYPASS_IP:
				return BYPASS_IP_EDEFAULT == null ? bypassIp != null : !BYPASS_IP_EDEFAULT.equals(bypassIp);
			case LocationPackage.OPEN_STACK_LOCATION__FLAVOR_ID:
				return flavorId != FLAVOR_ID_EDEFAULT;
			case LocationPackage.OPEN_STACK_LOCATION__SUPPORTS_SECURITY_GROUPS:
				return supportsSecurityGroups != SUPPORTS_SECURITY_GROUPS_EDEFAULT;
			case LocationPackage.OPEN_STACK_LOCATION__SUPPORTS_FLOATING_IPS:
				return supportsFloatingIps != SUPPORTS_FLOATING_IPS_EDEFAULT;
			case LocationPackage.OPEN_STACK_LOCATION__PROJECTS:
				return projects != null && !projects.isEmpty();
			case LocationPackage.OPEN_STACK_LOCATION__USERS:
				return users != null && !users.isEmpty();
			case LocationPackage.OPEN_STACK_LOCATION__IMAGES:
				return images != null && !images.isEmpty();
			case LocationPackage.OPEN_STACK_LOCATION__FLAVORS:
				return flavors != null && !flavors.isEmpty();
			case LocationPackage.OPEN_STACK_LOCATION__HYPERVISORS:
				return hypervisors != null && !hypervisors.isEmpty();
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
		if (baseClass == NeutronService.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ComputeService.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CeilometerService.class) {
			switch (derivedFeatureID) {
				case LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_AVAILABLE_CAPABILITES: return CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_AVAILABLE_CAPABILITES;
				case LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_UNAVAILABLE_CAPABILITES: return CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_UNAVAILABLE_CAPABILITES;
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
		if (baseClass == NeutronService.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ComputeService.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CeilometerService.class) {
			switch (baseFeatureID) {
				case CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_AVAILABLE_CAPABILITES: return LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_AVAILABLE_CAPABILITES;
				case CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_UNAVAILABLE_CAPABILITES: return LocationPackage.OPEN_STACK_LOCATION__CEILOMETER_UNAVAILABLE_CAPABILITES;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NeutronService.class) {
			switch (baseOperationID) {
				case NeutronPackage.NEUTRON_SERVICE___CREATE_NETWORK__CREATENETWORKREQUEST: return LocationPackage.OPEN_STACK_LOCATION___CREATE_NETWORK__CREATENETWORKREQUEST;
				case NeutronPackage.NEUTRON_SERVICE___CREATE_SUBNET__CREATESUBNETREQUEST: return LocationPackage.OPEN_STACK_LOCATION___CREATE_SUBNET__CREATESUBNETREQUEST;
				case NeutronPackage.NEUTRON_SERVICE___CREATE_PORT__CREATEPORTREQUEST: return LocationPackage.OPEN_STACK_LOCATION___CREATE_PORT__CREATEPORTREQUEST;
				case NeutronPackage.NEUTRON_SERVICE___CREATE_ROUTER__CREATEROUTERREQUEST: return LocationPackage.OPEN_STACK_LOCATION___CREATE_ROUTER__CREATEROUTERREQUEST;
				case NeutronPackage.NEUTRON_SERVICE___DELETE_NETWORK__STRING_STRING: return LocationPackage.OPEN_STACK_LOCATION___DELETE_NETWORK__STRING_STRING;
				case NeutronPackage.NEUTRON_SERVICE___DELETE_SUBNET__STRING_STRING: return LocationPackage.OPEN_STACK_LOCATION___DELETE_SUBNET__STRING_STRING;
				case NeutronPackage.NEUTRON_SERVICE___DELETE_PORT__STRING_STRING: return LocationPackage.OPEN_STACK_LOCATION___DELETE_PORT__STRING_STRING;
				case NeutronPackage.NEUTRON_SERVICE___DELETE_ROUTER__STRING_STRING: return LocationPackage.OPEN_STACK_LOCATION___DELETE_ROUTER__STRING_STRING;
				case NeutronPackage.NEUTRON_SERVICE___ASSOCIATE_FLOATING_IP__STRING_STRING_STRING: return LocationPackage.OPEN_STACK_LOCATION___ASSOCIATE_FLOATING_IP__STRING_STRING_STRING;
				default: return -1;
			}
		}
		if (baseClass == ComputeService.class) {
			switch (baseOperationID) {
				case ComputePackage.COMPUTE_SERVICE___CREATE_SERVER__OPENSTACKREQUESTNEWSERVER: return LocationPackage.OPEN_STACK_LOCATION___CREATE_SERVER__OPENSTACKREQUESTNEWSERVER;
				case ComputePackage.COMPUTE_SERVICE___DELETE_SERVER__STRING_STRING: return LocationPackage.OPEN_STACK_LOCATION___DELETE_SERVER__STRING_STRING;
				case ComputePackage.COMPUTE_SERVICE___CREATE_KEY_PAIR__OPENSTACKREQUESTKEYPAIR: return LocationPackage.OPEN_STACK_LOCATION___CREATE_KEY_PAIR__OPENSTACKREQUESTKEYPAIR;
				case ComputePackage.COMPUTE_SERVICE___DELETE__OPENSTACKREQUESTDELETE: return LocationPackage.OPEN_STACK_LOCATION___DELETE__OPENSTACKREQUESTDELETE;
				case ComputePackage.COMPUTE_SERVICE___CREATE_FLAVOR__OPENSTACKREQUESTFLAVOR: return LocationPackage.OPEN_STACK_LOCATION___CREATE_FLAVOR__OPENSTACKREQUESTFLAVOR;
				case ComputePackage.COMPUTE_SERVICE___CREATE_SECURITY_GROUP__OPENSTACKREQUESTSECURITYGROUP: return LocationPackage.OPEN_STACK_LOCATION___CREATE_SECURITY_GROUP__OPENSTACKREQUESTSECURITYGROUP;
				case ComputePackage.COMPUTE_SERVICE___SERVER_ACTION__OPENSTACKREQUESTSERVERACTION: return LocationPackage.OPEN_STACK_LOCATION___SERVER_ACTION__OPENSTACKREQUESTSERVERACTION;
				case ComputePackage.COMPUTE_SERVICE___DEPLOY_VM_TYPE__STRING_STRING: return LocationPackage.OPEN_STACK_LOCATION___DEPLOY_VM_TYPE__STRING_STRING;
				case ComputePackage.COMPUTE_SERVICE___UNDEPLOY_VM_TYPE__STRING_STRING: return LocationPackage.OPEN_STACK_LOCATION___UNDEPLOY_VM_TYPE__STRING_STRING;
				case ComputePackage.COMPUTE_SERVICE___DEPLOY_USER__USER_STRING: return LocationPackage.OPEN_STACK_LOCATION___DEPLOY_USER__USER_STRING;
				case ComputePackage.COMPUTE_SERVICE___UNDEPLOY_USER__USER_STRING: return LocationPackage.OPEN_STACK_LOCATION___UNDEPLOY_USER__USER_STRING;
				default: return -1;
			}
		}
		if (baseClass == CeilometerService.class) {
			switch (baseOperationID) {
				case CeilometerPackage.CEILOMETER_SERVICE___CREATE_ALARM__CREATEALARMREQUEST: return LocationPackage.OPEN_STACK_LOCATION___CREATE_ALARM__CREATEALARMREQUEST;
				case CeilometerPackage.CEILOMETER_SERVICE___DELETE_ALARM__STRING_STRING: return LocationPackage.OPEN_STACK_LOCATION___DELETE_ALARM__STRING_STRING;
				case CeilometerPackage.CEILOMETER_SERVICE___CREATE_ALARM__SAMPLEREQUEST: return LocationPackage.OPEN_STACK_LOCATION___CREATE_ALARM__SAMPLEREQUEST;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LocationPackage.OPEN_STACK_LOCATION___POLL:
				poll();
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___MERGE_LOCATION__OPENSTACKLOCATION:
				mergeLocation((OpenStackLocation)arguments.get(0));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___CREATE_ALARM__CREATEALARMREQUEST:
				return createAlarm((CreateAlarmRequest)arguments.get(0));
			case LocationPackage.OPEN_STACK_LOCATION___DELETE_ALARM__STRING_STRING:
				deleteAlarm((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___CREATE_ALARM__SAMPLEREQUEST:
				return createAlarm((SampleRequest)arguments.get(0));
			case LocationPackage.OPEN_STACK_LOCATION___CREATE_SERVER__OPENSTACKREQUESTNEWSERVER:
				createServer((OpenstackRequestNewServer)arguments.get(0));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___DELETE_SERVER__STRING_STRING:
				deleteServer((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___CREATE_KEY_PAIR__OPENSTACKREQUESTKEYPAIR:
				createKeyPair((OpenstackRequestKeyPair)arguments.get(0));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___DELETE__OPENSTACKREQUESTDELETE:
				delete((OpenstackRequestDelete)arguments.get(0));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___CREATE_FLAVOR__OPENSTACKREQUESTFLAVOR:
				createFlavor((OpenstackRequestFlavor)arguments.get(0));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___CREATE_SECURITY_GROUP__OPENSTACKREQUESTSECURITYGROUP:
				createSecurityGroup((OpenstackRequestSecurityGroup)arguments.get(0));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___SERVER_ACTION__OPENSTACKREQUESTSERVERACTION:
				serverAction((OpenstackRequestServerAction)arguments.get(0));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___DEPLOY_VM_TYPE__STRING_STRING:
				deployVmType((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___UNDEPLOY_VM_TYPE__STRING_STRING:
				undeployVmType((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___DEPLOY_USER__USER_STRING:
				deployUser((User)arguments.get(0), (String)arguments.get(1));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___UNDEPLOY_USER__USER_STRING:
				undeployUser((User)arguments.get(0), (String)arguments.get(1));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___CREATE_NETWORK__CREATENETWORKREQUEST:
				return createNetwork((CreateNetworkRequest)arguments.get(0));
			case LocationPackage.OPEN_STACK_LOCATION___CREATE_SUBNET__CREATESUBNETREQUEST:
				return createSubnet((CreateSubnetRequest)arguments.get(0));
			case LocationPackage.OPEN_STACK_LOCATION___CREATE_PORT__CREATEPORTREQUEST:
				return createPort((CreatePortRequest)arguments.get(0));
			case LocationPackage.OPEN_STACK_LOCATION___CREATE_ROUTER__CREATEROUTERREQUEST:
				return createRouter((CreateRouterRequest)arguments.get(0));
			case LocationPackage.OPEN_STACK_LOCATION___DELETE_NETWORK__STRING_STRING:
				deleteNetwork((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___DELETE_SUBNET__STRING_STRING:
				deleteSubnet((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___DELETE_PORT__STRING_STRING:
				deletePort((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___DELETE_ROUTER__STRING_STRING:
				deleteRouter((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case LocationPackage.OPEN_STACK_LOCATION___ASSOCIATE_FLOATING_IP__STRING_STRING_STRING:
				associateFloatingIp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
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
		result.append(" (ceilometerAvailableCapabilites: ");
		result.append(ceilometerAvailableCapabilites);
		result.append(", ceilometerUnavailableCapabilites: ");
		result.append(ceilometerUnavailableCapabilites);
		result.append(", version: ");
		result.append(version);
		result.append(", remoteLocation: ");
		result.append(remoteLocation);
		result.append(", remoteLocationName: ");
		result.append(remoteLocationName);
		result.append(", allowCreateFlavor: ");
		result.append(allowCreateFlavor);
		result.append(", keystoneUrl: ");
		result.append(keystoneUrl);
		result.append(", bypassIp: ");
		result.append(bypassIp);
		result.append(", flavorId: ");
		result.append(flavorId);
		result.append(", supportsSecurityGroups: ");
		result.append(supportsSecurityGroups);
		result.append(", supportsFloatingIps: ");
		result.append(supportsFloatingIps);
		result.append(')');
		return result.toString();
	}

} //OpenStackLocationImpl
