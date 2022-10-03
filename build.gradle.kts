buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath("com.android.tools.build:gradle:7.1.1")
        classpath("org.jetbrains.compose:compose-gradle-plugin:1.2.0-beta01")
    }
}

allprojects {
    group = Alyx.Application.GROUP
    version = Alyx.Application.VERSION
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}