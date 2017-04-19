
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

import org.openecomp.ncomp.openstack.neutron.NeutronPackage;
import org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup;
import org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityGroupImpl#getSecurity_group_rules <em>Security group rules</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityGroupImpl#getTenant_id <em>Tenant id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeutronSecurityGroupImpl extends NeutronObjectImpl implements NeutronSecurityGroup {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecurity_group_rules() <em>Security group rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_group_rules()
	 * @generated
	 * @ordered
	 */
	protected EList<NeutronSecurityRule> security_group_rules;

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
	protected NeutronSecurityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.NEUTRON_SECURITY_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_GROUP__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_GROUP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NeutronSecurityRule> getSecurity_group_rules() {
		if (security_group_rules == null) {
			security_group_rules = new EObjectContainmentEList<NeutronSecurityRule>(NeutronSecurityRule.class, this, NeutronPackage.NEUTRON_SECURITY_GROUP__SECURITY_GROUP_RULES);
		}
		return security_group_rules;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_GROUP__TENANT_ID, oldTenant_id, tenant_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NeutronPackage.NEUTRON_SECURITY_GROUP__SECURITY_GROUP_RULES:
				return ((InternalEList<?>)getSecurity_group_rules()).basicRemove(otherEnd, msgs);
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
			case NeutronPackage.NEUTRON_SECURITY_GROUP__ID:
				return getId();
			case NeutronPackage.NEUTRON_SECURITY_GROUP__NAME:
				return getName();
			case NeutronPackage.NEUTRON_SECURITY_GROUP__DESCRIPTION:
				return getDescription();
			case NeutronPackage.NEUTRON_SECURITY_GROUP__SECURITY_GROUP_RULES:
				return getSecurity_group_rules();
			case NeutronPackage.NEUTRON_SECURITY_GROUP__TENANT_ID:
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
			case NeutronPackage.NEUTRON_SECURITY_GROUP__ID:
				setId((String)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_GROUP__NAME:
				setName((String)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_GROUP__SECURITY_GROUP_RULES:
				getSecurity_group_rules().clear();
				getSecurity_group_rules().addAll((Collection<? extends NeutronSecurityRule>)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_GROUP__TENANT_ID:
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
			case NeutronPackage.NEUTRON_SECURITY_GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_SECURITY_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_SECURITY_GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_SECURITY_GROUP__SECURITY_GROUP_RULES:
				getSecurity_group_rules().clear();
				return;
			case NeutronPackage.NEUTRON_SECURITY_GROUP__TENANT_ID:
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
			case NeutronPackage.NEUTRON_SECURITY_GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NeutronPackage.NEUTRON_SECURITY_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NeutronPackage.NEUTRON_SECURITY_GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case NeutronPackage.NEUTRON_SECURITY_GROUP__SECURITY_GROUP_RULES:
				return security_group_rules != null && !security_group_rules.isEmpty();
			case NeutronPackage.NEUTRON_SECURITY_GROUP__TENANT_ID:
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
		result.append(", description: ");
		result.append(description);
		result.append(", tenant_id: ");
		result.append(tenant_id);
		result.append(')');
		return result.toString();
	}

} //NeutronSecurityGroupImpl
