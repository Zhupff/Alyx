plugins {
    id("com.android.library")
    id("org.jetbrains.compose")
    kotlin("android")
}

dependencies {
    implementation(project(":common"))
    implementation(project(":common:common-ui"))
}

android {
    compileSdk = Alyx.Android.Version.COMPILE_SDK
    defaultConfig {
        minSdk = Alyx.Android.Version.MIN_SDK
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}