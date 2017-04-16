
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
package org.openecomp.ncomp.openstack.core;

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.core.SecurityRule#getPortRangeStart <em>Port Range Start</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.SecurityRule#getPortRangeEnd <em>Port Range End</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.SecurityRule#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.SecurityRule#getIpProtocol <em>Ip Protocol</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.core.CorePackage#getSecurityRule()
 * @model
 * @generated
 */
public interface SecurityRule extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Port Range Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Range Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Range Start</em>' attribute.
	 * @see #setPortRangeStart(Integer)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getSecurityRule_PortRangeStart()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPortRangeStart();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.SecurityRule#getPortRangeStart <em>Port Range Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Range Start</em>' attribute.
	 * @see #getPortRangeStart()
	 * @generated
	 */
	void setPortRangeStart(Integer value);

	/**
	 * Returns the value of the '<em><b>Port Range End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Range End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Range End</em>' attribute.
	 * @see #setPortRangeEnd(Integer)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getSecurityRule_PortRangeEnd()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPortRangeEnd();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.SecurityRule#getPortRangeEnd <em>Port Range End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Range End</em>' attribute.
	 * @see #getPortRangeEnd()
	 * @generated
	 */
	void setPortRangeEnd(Integer value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getSecurityRule_Prefix()
	 * @model unique="false"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.SecurityRule#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Ip Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.openstack.core.SecurityRuleProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Protocol</em>' attribute.
	 * @see org.openecomp.ncomp.openstack.core.SecurityRuleProtocol
	 * @see #setIpProtocol(SecurityRuleProtocol)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getSecurityRule_IpProtocol()
	 * @model unique="false"
	 * @generated
	 */
	SecurityRuleProtocol getIpProtocol();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.SecurityRule#getIpProtocol <em>Ip Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Protocol</em>' attribute.
	 * @see org.openecomp.ncomp.openstack.core.SecurityRuleProtocol
	 * @see #getIpProtocol()
	 * @generated
	 */
	void setIpProtocol(SecurityRuleProtocol value);

} // SecurityRule
