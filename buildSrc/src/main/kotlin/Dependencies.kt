const val kotlinVersion = "1.3.72"

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "3.6.2"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val kotlinSerializationPlugin = "org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val kotlinMultiPlatform = "org.jetbrains.kotlin.multiplatform"
    const val kotlinSerialization = "kotlinx-serialization"
    const val androidLibrary = "com.android.library"

}

object AndroidSdk {
    const val min = 16
    const val compile = 29
    const val buildVersion = "29.0.3"
    const val target = compile
}

private object Versions {
    const val jetpack = "1.1.0"
    const val constraintLayout = "1.1.3"
    const val ktx = "1.2.0"
    const val coroutine = "1.2.1"
    const val ktor = "1.2.5"
    const val serialization = "0.20.0"
}

object Libraries {

    const val kotlinStdLib     = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat        = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore          = "androidx.core:core-ktx:${Versions.ktx}"
    const val coroutineCore                 = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    const val coroutineAndroid              = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"

}

object LibraryCommon {
    const val coroutineCoreCommon           = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.coroutine}"
    const val coroutineCore                 = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    const val coroutineCoreNative           = "org.jetbrains.kotlinx:kotlinx-coroutines-core-native:${Versions.coroutine}"
    const val coroutineAndroid              = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"

    const val ktorCore                      = "io.ktor:ktor-client-core:${Versions.ktor}"
    const val ktorAndroid                   = "io.ktor:ktor-client-android:${Versions.ktor}"
    const val ktoriOS                       = "io.ktor:ktor-client-ios:${Versions.ktor}"

    const val serializationRuntimeCommon    = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.serialization}"
    const val serializationRuntime          = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serialization}"
    const val serializationRuntimeNative    = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:${Versions.serialization}"

    const val kotlinStdLibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:${kotlinVersion}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${kotlinVersion}"
}

object TestLibraries {
    private object TestVersions {
        const val junit4 = "4.12"
        const val testRunner = "1.1.1"
        const val espresso = "3.2.0"
    }
    const val junit4     = "junit:junit:${TestVersions.junit4}"
    const val testRunner = "androidx.test:runner:${TestVersions.testRunner}"
    const val espresso   = "androidx.test.espresso:espresso-core:${TestVersions.espresso}"
}