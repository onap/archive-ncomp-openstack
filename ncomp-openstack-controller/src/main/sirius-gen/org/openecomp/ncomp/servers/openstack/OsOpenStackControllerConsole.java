
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
	
// Autogenerated
// Do not edit but extend this class as needed
package org.openecomp.ncomp.servers.openstack;


import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import org.openecomp.ncomp.sirius.manager.console.Console;
import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.ManagementServerError;

    

import org.openecomp.ncomp.servers.openstack.loc.OsOpenStackLocationConsole;   


public class OsOpenStackControllerConsole extends Console {
	public static final Logger logger = Logger.getLogger(OsOpenStackControllerConsole.class);
    protected OsOpenStackControllerClient controller;
    
    
        OsOpenStackLocationConsole loc;   


    public OsOpenStackControllerConsole(String filename, String name) {
            super(filename, name);
            controller = new OsOpenStackControllerClient(filename,name);
            client = controller.client;
    
            loc = new  OsOpenStackLocationConsole(filename,name);   
    }
    
	public OsOpenStackControllerConsole(AbstractClient c) {
        controller = new OsOpenStackControllerClient(c);
        client = controller.client;
    }


	public void uploadOpenstackConfiguration(org.openecomp.ncomp.openstack.location.OpenStackLocation loc) {
		
		try {
			 controller.uploadOpenstackConfiguration(null,loc);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

}
