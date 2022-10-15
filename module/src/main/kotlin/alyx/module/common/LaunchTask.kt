package alyx.module.common

import zhupff.instances.load
import kotlin.reflect.KClass

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class LaunchTask(vararg val dependencies: KClass<*>) {
    companion object {
        @Suppress("CAST_NEVER_SUCCEEDS")
        fun launch() {
            val taskClasses = instanceLoader.load<LaunchTask>()
                .map { taskClass ->
                    val dependencies = taskClass.getAnnotation(LaunchTask::class.java)!!.dependencies
                    taskClass to dependencies.toMutableSet()
                }.toMutableSet()
            while (taskClasses.isNotEmpty()) {
                val taskClass = taskClasses.find { it.second.size == 0 }
                    ?: throw IllegalStateException("There is circular dependency in $taskClasses!")
                taskClasses.remove(taskClass)
                taskClasses.forEach { it.second.remove(taskClass.first.kotlin) }
                (taskClass.first.newInstance() as Runnable).run()
            }
        }
    }
}