
package org.openecomp.ncomp.servers.openstack.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum OpenStackAdaptorMessageEnum implements EcompMessageEnum {

  POLLING_FAILED;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/ncomp/servers/openstack/logging/OpenStackAdaptor");
	}
}
