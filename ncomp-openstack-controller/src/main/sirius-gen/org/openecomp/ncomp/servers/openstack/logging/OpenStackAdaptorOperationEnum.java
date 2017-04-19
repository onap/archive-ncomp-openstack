
package org.openecomp.ncomp.servers.openstack.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum OpenStackAdaptorOperationEnum implements EcompOperationEnum {

  POLLING("POLLING") ; 


	private String n;
	
	private OpenStackAdaptorOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
