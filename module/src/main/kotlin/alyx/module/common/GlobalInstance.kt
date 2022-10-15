package alyx.module.common

import alyx.Alyx
import zhupff.instances.InstanceLoader

val instanceLoader: InstanceLoader = InstanceLoader(Alyx.application.classLoader)