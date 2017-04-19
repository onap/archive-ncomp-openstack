
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

import org.openecomp.ncomp.openstack.ceilometer.CeilometerService;
import org.openecomp.ncomp.openstack.compute.ComputeService;
import org.openecomp.ncomp.openstack.compute.Flavor;
import org.openecomp.ncomp.openstack.compute.Image;

import org.openecomp.ncomp.openstack.neutron.NeutronService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Stack Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#isRemoteLocation <em>Remote Location</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getRemoteLocationName <em>Remote Location Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#isAllowCreateFlavor <em>Allow Create Flavor</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getKeystoneUrl <em>Keystone Url</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getBypassIp <em>Bypass Ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getFlavorId <em>Flavor Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#isSupportsSecurityGroups <em>Supports Security Groups</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#isSupportsFloatingIps <em>Supports Floating Ips</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getUsers <em>Users</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getImages <em>Images</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getFlavors <em>Flavors</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getHypervisors <em>Hypervisors</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation()
 * @model
 * @generated
 */
public interface OpenStackLocation extends NamedEntity, NeutronService, ComputeService, CeilometerService {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.openstack.location.OpenStackVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackVersion
	 * @see #setVersion(OpenStackVersion)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_Version()
	 * @model unique="false"
	 * @generated
	 */
	OpenStackVersion getVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackVersion
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(OpenStackVersion value);

	/**
	 * Returns the value of the '<em><b>Remote Location</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Location</em>' attribute.
	 * @see #setRemoteLocation(boolean)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_RemoteLocation()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isRemoteLocation();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#isRemoteLocation <em>Remote Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Location</em>' attribute.
	 * @see #isRemoteLocation()
	 * @generated
	 */
	void setRemoteLocation(boolean value);

	/**
	 * Returns the value of the '<em><b>Remote Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Location Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Location Name</em>' attribute.
	 * @see #setRemoteLocationName(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_RemoteLocationName()
	 * @model unique="false"
	 * @generated
	 */
	String getRemoteLocationName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getRemoteLocationName <em>Remote Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Location Name</em>' attribute.
	 * @see #getRemoteLocationName()
	 * @generated
	 */
	void setRemoteLocationName(String value);

	/**
	 * Returns the value of the '<em><b>Allow Create Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Create Flavor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Create Flavor</em>' attribute.
	 * @see #setAllowCreateFlavor(boolean)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_AllowCreateFlavor()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllowCreateFlavor();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#isAllowCreateFlavor <em>Allow Create Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Create Flavor</em>' attribute.
	 * @see #isAllowCreateFlavor()
	 * @generated
	 */
	void setAllowCreateFlavor(boolean value);

	/**
	 * Returns the value of the '<em><b>Keystone Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keystone Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keystone Url</em>' attribute.
	 * @see #setKeystoneUrl(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_KeystoneUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getKeystoneUrl();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getKeystoneUrl <em>Keystone Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keystone Url</em>' attribute.
	 * @see #getKeystoneUrl()
	 * @generated
	 */
	void setKeystoneUrl(String value);

	/**
	 * Returns the value of the '<em><b>Bypass Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bypass Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bypass Ip</em>' attribute.
	 * @see #setBypassIp(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_BypassIp()
	 * @model unique="false"
	 * @generated
	 */
	String getBypassIp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getBypassIp <em>Bypass Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bypass Ip</em>' attribute.
	 * @see #getBypassIp()
	 * @generated
	 */
	void setBypassIp(String value);

	/**
	 * Returns the value of the '<em><b>Flavor Id</b></em>' attribute.
	 * The default value is <code>"20000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flavor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flavor Id</em>' attribute.
	 * @see #setFlavorId(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_FlavorId()
	 * @model default="20000" unique="false"
	 * @generated
	 */
	int getFlavorId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getFlavorId <em>Flavor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor Id</em>' attribute.
	 * @see #getFlavorId()
	 * @generated
	 */
	void setFlavorId(int value);

	/**
	 * Returns the value of the '<em><b>Supports Security Groups</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports Security Groups</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports Security Groups</em>' attribute.
	 * @see #setSupportsSecurityGroups(boolean)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_SupportsSecurityGroups()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isSupportsSecurityGroups();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#isSupportsSecurityGroups <em>Supports Security Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Security Groups</em>' attribute.
	 * @see #isSupportsSecurityGroups()
	 * @generated
	 */
	void setSupportsSecurityGroups(boolean value);

	/**
	 * Returns the value of the '<em><b>Supports Floating Ips</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports Floating Ips</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports Floating Ips</em>' attribute.
	 * @see #setSupportsFloatingIps(boolean)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_SupportsFloatingIps()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isSupportsFloatingIps();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#isSupportsFloatingIps <em>Supports Floating Ips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Floating Ips</em>' attribute.
	 * @see #isSupportsFloatingIps()
	 * @generated
	 */
	void setSupportsFloatingIps(boolean value);

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.location.OpenStackProject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_Projects()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OpenStackProject> getProjects();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.location.OpenStackUser}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_Users()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OpenStackUser> getUsers();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.Image}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_Images()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Image> getImages();

	/**
	 * Returns the value of the '<em><b>Flavors</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.Flavor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flavors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flavors</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_Flavors()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Flavor> getFlavors();

	/**
	 * Returns the value of the '<em><b>Hypervisors</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.location.Hypervisor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypervisors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypervisors</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackLocation_Hypervisors()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Hypervisor> getHypervisors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void poll();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model locUnique="false"
	 * @generated
	 */
	void mergeLocation(OpenStackLocation loc);

} // OpenStackLocation
