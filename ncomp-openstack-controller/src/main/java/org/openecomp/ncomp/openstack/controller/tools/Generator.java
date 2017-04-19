
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
	
package org.openecomp.ncomp.openstack.controller.tools;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.openecomp.utils.YamlToJava;
import org.openecomp.ncomp.openstack.OpenstackFactory;
import org.openecomp.ncomp.openstack.location.LocationFactory;
import org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel;
import org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelFactory;
import org.openecomp.ncomp.sirius.manager.generator.ControllerGenerator;
//import org.openecomp.ncomp.sirius.manager.gui.GuiFactory;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;


public class Generator { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ServerPackage f = ServerPackage.eINSTANCE;
		EObject o = OpenstackFactory.eINSTANCE.createOpenStackController();
		EPackage p = o.eClass().getEPackage();
		String dir = p.getNsURI().replace(p.getNsPrefix(),"") + "servers." + p.getNsPrefix();
		dir= "src/main/sirius-gen/" + dir.replace('.', '/');
		ControllerModel m = ControllermodelFactory.eINSTANCE.createControllerModel();
		m.setTemplateDirectory("../../ncomp.sirius.manager/ncomp-sirius-manager-generator/src/main/templates");
		m.setPrefix("Os");
		m.setPluginName(p.getNsURI());
		m.setName("OpenStackController");
		m.setTitle("OpenStack Controller");
		ControllerGenerator g = new ControllerGenerator(o,m); 
		g.setVersion("ONAP-R2");
		EObject loc =LocationFactory.eINSTANCE.createOpenStackLocation();
		g.addObject("loc",loc,m);
		g.setEnableIRequestHandler(false);
		//EObject gui = GuiFactory.eINSTANCE.createGuiClientApi();
		//g.addObject("gui",gui,m);
		//EObject e = OpenstackFactory.eINSTANCE.createVpnEnterprise();
		//g.addApi("e",e,m);
		//g.addFactory("org.openecomp.ncomp.sirius.servers.openstack.OsOpenstackFactory");
		g.generate(dir);
		g.generateScripts("src/main/server-gen/bin","openstack-controller"); 
		String pName = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix() +".logging";
		YamlToJava.convert("src/main/resources/OpenStackAdaptor.yaml", dir + "/logging", pName);
		YamlToJava.convert("src/main/sirius-gen/OpenStackController.yaml", dir + "/logging", pName);
		String pName1 = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix() +".loc.logging";
		YamlToJava.convert("src/main/sirius-gen/OpenStackLocation.yaml", dir + "/loc/logging", pName1);

	}


}
