object Alyx {

    object Application {
        const val NAME: String = "Alyx"
        const val GROUP: String = "the.alyx"
        const val VERSION: String = "1.0.0"
    }

    object Android {
        object Version {
            const val COMPILE_SDK: Int = 32
            const val MIN_SDK: Int = 24
        }
        object Dependency {
            const val APPCOMPAT: String = "androidx.appcompat:appcompat:1.5.1"
            const val ACTIVITY_COMPOSE: String = "androidx.activity:activity-compose:1.5.1"
            const val CORE_KTX: String = "androidx.core:core-ktx:1.8.0"
        }
    }

    object Desktop {
    }
}