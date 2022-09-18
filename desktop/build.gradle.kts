import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version COMPOSE_VERSION
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":common"))
                implementation(compose.desktop.currentOs)
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(
                TargetFormat.AppImage,
                TargetFormat.Deb,
                TargetFormat.Rpm,
                TargetFormat.Dmg,
//                TargetFormat.Pkg,
                TargetFormat.Exe,
                TargetFormat.Msi,
            )
            packageName = APPLICATION_NAME
            packageVersion = APPLICATION_VERSION
        }
    }
}