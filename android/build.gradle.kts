plugins {
    id("org.jetbrains.compose") version COMPOSE_VERSION
    id("com.android.application")
    kotlin("android")
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
}

android {
    compileSdk = ANDROID_COMPILE_SDK
    defaultConfig {
        applicationId = APPLICATION_GROUP
        minSdk = ANDROID_MIN_SDK
        versionName = APPLICATION_VERSION
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