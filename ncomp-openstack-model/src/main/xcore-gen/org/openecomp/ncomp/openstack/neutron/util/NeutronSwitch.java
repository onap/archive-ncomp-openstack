
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
package org.openecomp.ncomp.openstack.neutron.util;

import org.openecomp.ncomp.openstack.core.OpenStackRequest;

import org.openecomp.ncomp.openstack.neutron.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage
 * @generated
 */
public class NeutronSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NeutronPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeutronSwitch() {
		if (modelPackage == null) {
			modelPackage = NeutronPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NeutronPackage.NEUTRON_SERVICE: {
				NeutronService neutronService = (NeutronService)theEObject;
				T result = caseNeutronService(neutronService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.NEUTRON_OBJECT: {
				NeutronObject neutronObject = (NeutronObject)theEObject;
				T result = caseNeutronObject(neutronObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseNeutronObject(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.SUBNET: {
				Subnet subnet = (Subnet)theEObject;
				T result = caseSubnet(subnet);
				if (result == null) result = caseNeutronObject(subnet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.ALLOCATION_POOL: {
				AllocationPool allocationPool = (AllocationPool)theEObject;
				T result = caseAllocationPool(allocationPool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.ROUTER: {
				Router router = (Router)theEObject;
				T result = caseRouter(router);
				if (result == null) result = caseNeutronObject(router);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseNeutronObject(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.NEUTRON_SECURITY_GROUP: {
				NeutronSecurityGroup neutronSecurityGroup = (NeutronSecurityGroup)theEObject;
				T result = caseNeutronSecurityGroup(neutronSecurityGroup);
				if (result == null) result = caseNeutronObject(neutronSecurityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.NEUTRON_SECURITY_RULE: {
				NeutronSecurityRule neutronSecurityRule = (NeutronSecurityRule)theEObject;
				T result = caseNeutronSecurityRule(neutronSecurityRule);
				if (result == null) result = caseNeutronObject(neutronSecurityRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.NEUTRON_FLOATING_IP: {
				NeutronFloatingIp neutronFloatingIp = (NeutronFloatingIp)theEObject;
				T result = caseNeutronFloatingIp(neutronFloatingIp);
				if (result == null) result = caseNeutronObject(neutronFloatingIp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.BINDING_PROFILE: {
				BindingProfile bindingProfile = (BindingProfile)theEObject;
				T result = caseBindingProfile(bindingProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.BINDING_VIF_DETAIL: {
				BindingVifDetail bindingVifDetail = (BindingVifDetail)theEObject;
				T result = caseBindingVifDetail(bindingVifDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.FIXED_IP: {
				FixedIp fixedIp = (FixedIp)theEObject;
				T result = caseFixedIp(fixedIp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.EXTERNAL_GATEWAY: {
				ExternalGateway externalGateway = (ExternalGateway)theEObject;
				T result = caseExternalGateway(externalGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.NEUTRON_REQUEST: {
				NeutronRequest neutronRequest = (NeutronRequest)theEObject;
				T result = caseNeutronRequest(neutronRequest);
				if (result == null) result = caseOpenStackRequest(neutronRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.CREATE_NETWORK_REQUEST: {
				CreateNetworkRequest createNetworkRequest = (CreateNetworkRequest)theEObject;
				T result = caseCreateNetworkRequest(createNetworkRequest);
				if (result == null) result = caseNeutronRequest(createNetworkRequest);
				if (result == null) result = caseOpenStackRequest(createNetworkRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.CREATE_SUBNET_REQUEST: {
				CreateSubnetRequest createSubnetRequest = (CreateSubnetRequest)theEObject;
				T result = caseCreateSubnetRequest(createSubnetRequest);
				if (result == null) result = caseNeutronRequest(createSubnetRequest);
				if (result == null) result = caseOpenStackRequest(createSubnetRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.CREATE_ROUTER_REQUEST: {
				CreateRouterRequest createRouterRequest = (CreateRouterRequest)theEObject;
				T result = caseCreateRouterRequest(createRouterRequest);
				if (result == null) result = caseNeutronRequest(createRouterRequest);
				if (result == null) result = caseOpenStackRequest(createRouterRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeutronPackage.CREATE_PORT_REQUEST: {
				CreatePortRequest createPortRequest = (CreatePortRequest)theEObject;
				T result = caseCreatePortRequest(createPortRequest);
				if (result == null) result = caseNeutronRequest(createPortRequest);
				if (result == null) result = caseOpenStackRequest(createPortRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeutronService(NeutronService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeutronObject(NeutronObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnet(Subnet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationPool(AllocationPool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Router</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Router</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouter(Router object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeutronSecurityGroup(NeutronSecurityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeutronSecurityRule(NeutronSecurityRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floating Ip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floating Ip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeutronFloatingIp(NeutronFloatingIp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingProfile(BindingProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Vif Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Vif Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingVifDetail(BindingVifDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Ip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Ip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedIp(FixedIp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalGateway(ExternalGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeutronRequest(NeutronRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Network Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Network Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateNetworkRequest(CreateNetworkRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Subnet Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Subnet Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateSubnetRequest(CreateSubnetRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Router Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Router Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateRouterRequest(CreateRouterRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Port Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Port Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreatePortRequest(CreatePortRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Stack Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Stack Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenStackRequest(OpenStackRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NeutronSwitch
