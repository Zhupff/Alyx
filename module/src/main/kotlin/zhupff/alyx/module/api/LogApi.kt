package zhupff.alyx.module.api

interface LogApi : NonNullApi {
    companion object : LogApi by getNonNullApi()

    fun v(tag: Any, any: Any?)
    fun d(tag: Any, any: Any?)
    fun i(tag: Any, any: Any?)
    fun w(tag: Any, any: Any?)
    fun e(tag: Any, any: Any?)
}

fun Any.logV(any: Any?) = apply { LogApi.v(this, any) }
fun Any.logD(any: Any?) = apply { LogApi.d(this, any) }
fun Any.logI(any: Any?) = apply { LogApi.i(this, any) }
fun Any.logW(any: Any?) = apply { LogApi.w(this, any) }
fun Any.logE(any: Any?) = apply { LogApi.e(this, any) }