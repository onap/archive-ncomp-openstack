
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

import org.openecomp.ncomp.openstack.neutron.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeutronFactoryImpl extends EFactoryImpl implements NeutronFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NeutronFactory init() {
		try {
			NeutronFactory theNeutronFactory = (NeutronFactory)EPackage.Registry.INSTANCE.getEFactory(NeutronPackage.eNS_URI);
			if (theNeutronFactory != null) {
				return theNeutronFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NeutronFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeutronFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NeutronPackage.NETWORK: return createNetwork();
			case NeutronPackage.SUBNET: return createSubnet();
			case NeutronPackage.ALLOCATION_POOL: return createAllocationPool();
			case NeutronPackage.ROUTER: return createRouter();
			case NeutronPackage.PORT: return createPort();
			case NeutronPackage.NEUTRON_SECURITY_GROUP: return createNeutronSecurityGroup();
			case NeutronPackage.NEUTRON_SECURITY_RULE: return createNeutronSecurityRule();
			case NeutronPackage.NEUTRON_FLOATING_IP: return createNeutronFloatingIp();
			case NeutronPackage.BINDING_PROFILE: return createBindingProfile();
			case NeutronPackage.BINDING_VIF_DETAIL: return createBindingVifDetail();
			case NeutronPackage.FIXED_IP: return createFixedIp();
			case NeutronPackage.EXTERNAL_GATEWAY: return createExternalGateway();
			case NeutronPackage.CREATE_NETWORK_REQUEST: return createCreateNetworkRequest();
			case NeutronPackage.CREATE_SUBNET_REQUEST: return createCreateSubnetRequest();
			case NeutronPackage.CREATE_ROUTER_REQUEST: return createCreateRouterRequest();
			case NeutronPackage.CREATE_PORT_REQUEST: return createCreatePortRequest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subnet createSubnet() {
		SubnetImpl subnet = new SubnetImpl();
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationPool createAllocationPool() {
		AllocationPoolImpl allocationPool = new AllocationPoolImpl();
		return allocationPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Router createRouter() {
		RouterImpl router = new RouterImpl();
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeutronSecurityGroup createNeutronSecurityGroup() {
		NeutronSecurityGroupImpl neutronSecurityGroup = new NeutronSecurityGroupImpl();
		return neutronSecurityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeutronSecurityRule createNeutronSecurityRule() {
		NeutronSecurityRuleImpl neutronSecurityRule = new NeutronSecurityRuleImpl();
		return neutronSecurityRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeutronFloatingIp createNeutronFloatingIp() {
		NeutronFloatingIpImpl neutronFloatingIp = new NeutronFloatingIpImpl();
		return neutronFloatingIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingProfile createBindingProfile() {
		BindingProfileImpl bindingProfile = new BindingProfileImpl();
		return bindingProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingVifDetail createBindingVifDetail() {
		BindingVifDetailImpl bindingVifDetail = new BindingVifDetailImpl();
		return bindingVifDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedIp createFixedIp() {
		FixedIpImpl fixedIp = new FixedIpImpl();
		return fixedIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalGateway createExternalGateway() {
		ExternalGatewayImpl externalGateway = new ExternalGatewayImpl();
		return externalGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateNetworkRequest createCreateNetworkRequest() {
		CreateNetworkRequestImpl createNetworkRequest = new CreateNetworkRequestImpl();
		return createNetworkRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSubnetRequest createCreateSubnetRequest() {
		CreateSubnetRequestImpl createSubnetRequest = new CreateSubnetRequestImpl();
		return createSubnetRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateRouterRequest createCreateRouterRequest() {
		CreateRouterRequestImpl createRouterRequest = new CreateRouterRequestImpl();
		return createRouterRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatePortRequest createCreatePortRequest() {
		CreatePortRequestImpl createPortRequest = new CreatePortRequestImpl();
		return createPortRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeutronPackage getNeutronPackage() {
		return (NeutronPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NeutronPackage getPackage() {
		return NeutronPackage.eINSTANCE;
	}

} //NeutronFactoryImpl
