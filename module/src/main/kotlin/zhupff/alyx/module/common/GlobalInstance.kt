package zhupff.alyx.module.common

import zhupff.alyx.module.framework.Alyx
import zhupff.instances.InstanceLoader

val instanceLoader: InstanceLoader = InstanceLoader(Alyx.application.classLoader)