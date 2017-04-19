
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
package org.openecomp.ncomp.openstack.compute;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getFrom_port <em>From port</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getIp_protocol <em>Ip protocol</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getTo_port <em>To port</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getParent_group_id <em>Parent group id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getIp_range <em>Ip range</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityRule()
 * @model
 * @generated
 */
public interface SecurityRule extends EObject {
	/**
	 * Returns the value of the '<em><b>From port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From port</em>' attribute.
	 * @see #setFrom_port(Integer)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityRule_From_port()
	 * @model unique="false"
	 * @generated
	 */
	Integer getFrom_port();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getFrom_port <em>From port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From port</em>' attribute.
	 * @see #getFrom_port()
	 * @generated
	 */
	void setFrom_port(Integer value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(SecurityGroup)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityRule_Group()
	 * @model containment="true"
	 * @generated
	 */
	SecurityGroup getGroup();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(SecurityGroup value);

	/**
	 * Returns the value of the '<em><b>Ip protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip protocol</em>' attribute.
	 * @see #setIp_protocol(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityRule_Ip_protocol()
	 * @model unique="false"
	 * @generated
	 */
	String getIp_protocol();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getIp_protocol <em>Ip protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip protocol</em>' attribute.
	 * @see #getIp_protocol()
	 * @generated
	 */
	void setIp_protocol(String value);

	/**
	 * Returns the value of the '<em><b>To port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To port</em>' attribute.
	 * @see #setTo_port(Integer)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityRule_To_port()
	 * @model unique="false"
	 * @generated
	 */
	Integer getTo_port();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getTo_port <em>To port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To port</em>' attribute.
	 * @see #getTo_port()
	 * @generated
	 */
	void setTo_port(Integer value);

	/**
	 * Returns the value of the '<em><b>Parent group id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent group id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent group id</em>' attribute.
	 * @see #setParent_group_id(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityRule_Parent_group_id()
	 * @model unique="false"
	 * @generated
	 */
	String getParent_group_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getParent_group_id <em>Parent group id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent group id</em>' attribute.
	 * @see #getParent_group_id()
	 * @generated
	 */
	void setParent_group_id(String value);

	/**
	 * Returns the value of the '<em><b>Ip range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip range</em>' containment reference.
	 * @see #setIp_range(SecurityRange)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityRule_Ip_range()
	 * @model containment="true"
	 * @generated
	 */
	SecurityRange getIp_range();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getIp_range <em>Ip range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip range</em>' containment reference.
	 * @see #getIp_range()
	 * @generated
	 */
	void setIp_range(SecurityRange value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityRule_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SecurityRule
