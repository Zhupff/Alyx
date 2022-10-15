@file:Suppress("UNCHECKED_CAST")

package alyx.module.api

import alyx.module.common.instanceLoader
import zhupff.instances.load
import kotlin.reflect.KClass


@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class ApiImpl(val api: KClass<*>, val debug: Boolean = false)

interface NonNullApi

interface NullableApi

object Api {
    private val indices: HashMap<KClass<*>, Class<*>> = HashMap()

    private val instances: HashMap<KClass<*>, Any> = HashMap()

    fun init() {
        indices.putAll(
            instanceLoader.load<ApiImpl>()
                .let { classes ->
                    val tempIndices = HashMap<KClass<*>, Class<*>>()
                    for (cls in classes) {
                        val annotation = cls.getAnnotation(ApiImpl::class.java)!!
                        val api = annotation.api
                        val debug = annotation.debug
                        if (!tempIndices.containsKey(api) || !debug) {
                            tempIndices[api] = cls
                        }
                    }
                    tempIndices
                }
        )
    }

    fun <T : Any> getApi(api: KClass<T>): T? {
        var instance = instances[api]
        if (instance == null) {
            synchronized(instances) {
                instances[api] ?: newApi(api)?.let { instances[api] = it }
            }
            instance = instances[api]
        }
        return instance as? T
    }

    fun <T : Any> newApi(api: KClass<T>): T? = indices[api]?.newInstance() as? T
}



inline fun <reified T : NonNullApi> getNonNullApi(): T = Api.getApi(T::class)!!
inline fun <reified T : NullableApi> getNullableApi(): T? = Api.getApi(T::class)
inline fun <reified T : NonNullApi> newNonNullApi(): T = Api.newApi(T::class)!!
inline fun <reified T : NullableApi> newNullableApi(): T? = Api.newApi(T::class)