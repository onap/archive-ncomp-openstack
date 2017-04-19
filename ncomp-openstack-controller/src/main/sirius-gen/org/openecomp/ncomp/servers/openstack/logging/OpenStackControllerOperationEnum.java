
package org.openecomp.ncomp.servers.openstack.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum OpenStackControllerOperationEnum implements EcompOperationEnum {

  OpenStackController_uploadOpenstackConfiguration("OpenStackController@uploadOpenstackConfiguration") ; 


	private String n;
	
	private OpenStackControllerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
