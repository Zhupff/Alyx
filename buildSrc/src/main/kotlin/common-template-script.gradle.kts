import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin
import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("com.android.library")
}

kotlin {
    android()
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
            }
        }
        val androidMain by getting {
            dependencies {
                api(Alyx.Android.Dependency.APPCOMPAT)
                api(Alyx.Android.Dependency.CORE_KTX)
                api(Alyx.Android.Dependency.ACTIVITY_COMPOSE)
            }
        }
        val desktopMain by getting {
            dependencies {
                api(compose.preview)
            }
        }
    }
}

android {
    compileSdk  = Alyx.Android.Version.COMPILE_SDK
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = Alyx.Android.Version.MIN_SDK
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}