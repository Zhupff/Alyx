package zhupff.alyx.module.log

import android.util.Log
import zhupff.alyx.module.api.ApiImpl
import zhupff.alyx.module.api.LogApi
import zhupff.instances.InstanceOf
import kotlin.reflect.KClass

@ApiImpl(LogApi::class)
@InstanceOf(of = [ApiImpl::class])
class LogApiImpl : LogApi {

    override fun v(tag: Any, any: Any?) { log(Log.VERBOSE, tag, any) }
    override fun d(tag: Any, any: Any?) { log(Log.DEBUG  , tag, any) }
    override fun i(tag: Any, any: Any?) { log(Log.INFO   , tag, any) }
    override fun w(tag: Any, any: Any?) { log(Log.WARN   , tag, any) }
    override fun e(tag: Any, any: Any?) { log(Log.ERROR  , tag, any) }

    private fun log(level: Int, str: Any, any: Any?) {
        if (BuildConfig.DEBUG || level > Log.DEBUG) {
            val tag = if (BuildConfig.DEBUG)
                "Alyx-" + str.logTag
            else
                str.logTag
            val msg = if (any is Throwable)
                Log.getStackTraceString(any)
            else
                any.toString()
            Log.println(level, tag, msg)
        }
    }

    private val Any.logTag: String; get() = when (this) {
        is String -> this
        is KClass<*> -> java.simpleName
        is Class<*> -> simpleName
        else -> "${javaClass.simpleName}(${hashCode()})"
    }
}