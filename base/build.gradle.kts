plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.jetbrainsCompose)

    // alias(libs.plugins.androidLibrary) is replaced by a custom plugin
    id("org.anton.learncmp.android.library")
}

kotlin {
    // Register the Android target. Required before using any of the android {} configuration blocks
    androidTarget()

    jvm("desktop")

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "base"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
            implementation(compose.runtime)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        val desktopMain by getting
        desktopMain.dependencies {
            api(compose.desktop.currentOs)
        }
    }
}

android {
    namespace = "org.anton.learncmp.base"
    // minSdk, compileSdk, targetSdk are set in the AndroidLibraryConventionPlugin
    // which configures the parameters in build-logic/convention/src/main/kotlin/.../KotlinAndroid.kt
}