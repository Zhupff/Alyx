plugins {
    id("com.android.application")
    id("org.jetbrains.compose")
    kotlin("android")
}

dependencies {
    implementation(project(":common"))
}

android {
    compileSdk = Alyx.Android.Version.COMPILE_SDK
    defaultConfig {
        applicationId = Alyx.Application.GROUP
        versionName = Alyx.Application.VERSION
        minSdk = Alyx.Android.Version.MIN_SDK
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildTypes {
//        getByName("debug") {
//            isShrinkResources = true
//            isMinifyEnabled = true
//        }
        getByName("release") {
            isShrinkResources = true
            isMinifyEnabled = true
        }
    }
}