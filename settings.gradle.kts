pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
rootProject.name = "Alyx"
include(":android", ":android:module")
include(":desktop")
include(":common", ":common:common-ui")