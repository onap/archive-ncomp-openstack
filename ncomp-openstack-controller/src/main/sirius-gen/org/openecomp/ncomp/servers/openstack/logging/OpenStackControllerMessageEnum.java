
package org.openecomp.ncomp.servers.openstack.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum OpenStackControllerMessageEnum implements EcompMessageEnum {

  dummy,
  REQUEST_FAILED_uploadOpenstackConfiguration,
  REMOTE_CALL_FAILED_uploadOpenstackConfiguration;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/ncomp/servers/openstack/logging/OpenStackController");
	}
}
