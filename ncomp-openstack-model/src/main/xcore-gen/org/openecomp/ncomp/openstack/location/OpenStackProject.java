
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

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.openstack.ceilometer.CeilometerProject;
import org.openecomp.ncomp.openstack.compute.FloatingIp;
import org.openecomp.ncomp.openstack.compute.KeyPair;
import org.openecomp.ncomp.openstack.compute.SecurityGroup;
import org.openecomp.ncomp.openstack.compute.Server;
import org.openecomp.ncomp.openstack.compute.Volume;

import org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest;
import org.openecomp.ncomp.openstack.neutron.Network;
import org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp;
import org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup;
import org.openecomp.ncomp.openstack.neutron.Port;
import org.openecomp.ncomp.openstack.neutron.Router;
import org.openecomp.ncomp.openstack.neutron.Subnet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Stack Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getID <em>ID</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getAdminUser <em>Admin User</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getRegion <em>Region</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getPrivateNetwork <em>Private Network</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getPublicNetwork <em>Public Network</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getServers <em>Servers</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getUsers <em>Users</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getControllerUser <em>Controller User</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getIps <em>Ips</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getKeypairs <em>Keypairs</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getRouters <em>Routers</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getSecurity_groups <em>Security groups</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getFloatingips <em>Floatingips</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject()
 * @model
 * @generated
 */
public interface OpenStackProject extends NamedEntity, CeilometerProject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_ID()
	 * @model unique="false"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Admin User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin User</em>' attribute.
	 * @see #setAdminUser(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_AdminUser()
	 * @model unique="false"
	 * @generated
	 */
	String getAdminUser();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getAdminUser <em>Admin User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin User</em>' attribute.
	 * @see #getAdminUser()
	 * @generated
	 */
	void setAdminUser(String value);

	/**
	 * Returns the value of the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Id</em>' attribute.
	 * @see #setTenantId(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_TenantId()
	 * @model unique="false"
	 * @generated
	 */
	String getTenantId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getTenantId <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant Id</em>' attribute.
	 * @see #getTenantId()
	 * @generated
	 */
	void setTenantId(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Region()
	 * @model unique="false"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Private Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Network</em>' attribute.
	 * @see #setPrivateNetwork(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_PrivateNetwork()
	 * @model unique="false"
	 * @generated
	 */
	String getPrivateNetwork();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getPrivateNetwork <em>Private Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Network</em>' attribute.
	 * @see #getPrivateNetwork()
	 * @generated
	 */
	void setPrivateNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Public Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Network</em>' attribute.
	 * @see #setPublicNetwork(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_PublicNetwork()
	 * @model unique="false"
	 * @generated
	 */
	String getPublicNetwork();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getPublicNetwork <em>Public Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Network</em>' attribute.
	 * @see #getPublicNetwork()
	 * @generated
	 */
	void setPublicNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Key</em>' attribute.
	 * @see #setApiKey(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_ApiKey()
	 * @model unique="false"
	 * @generated
	 */
	String getApiKey();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getApiKey <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key</em>' attribute.
	 * @see #getApiKey()
	 * @generated
	 */
	void setApiKey(String value);

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.Server}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Servers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Server> getServers();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.location.OpenStackUser}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Users()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OpenStackUser> getUsers();

	/**
	 * Returns the value of the '<em><b>Controller User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller User</em>' reference.
	 * @see #setControllerUser(OpenStackUser)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_ControllerUser()
	 * @model
	 * @generated
	 */
	OpenStackUser getControllerUser();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getControllerUser <em>Controller User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller User</em>' reference.
	 * @see #getControllerUser()
	 * @generated
	 */
	void setControllerUser(OpenStackUser value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.Volume}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volumes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Volumes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Ips</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.FloatingIp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ips</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ips</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Ips()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FloatingIp> getIps();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.SecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Groups()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SecurityGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Keypairs</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.KeyPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keypairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keypairs</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Keypairs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<KeyPair> getKeypairs();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.neutron.Network}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Networks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Network> getNetworks();

	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.neutron.Subnet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Subnets()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Subnet> getSubnets();

	/**
	 * Returns the value of the '<em><b>Routers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.neutron.Router}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routers</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Routers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Router> getRouters();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.neutron.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Ports()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Security groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security groups</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Security_groups()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<NeutronSecurityGroup> getSecurity_groups();

	/**
	 * Returns the value of the '<em><b>Floatingips</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floatingips</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floatingips</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackProject_Floatingips()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<NeutronFloatingIp> getFloatingips();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateNovaState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rUnique="false"
	 * @generated
	 */
	Network createNetwork(CreateNetworkRequest r);

} // OpenStackProject
