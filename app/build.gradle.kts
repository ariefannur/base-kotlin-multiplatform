plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
}
android {
    compileSdkVersion(AndroidSdk.compile)
    buildToolsVersion(AndroidSdk.buildVersion)

    defaultConfig {
        applicationId = "com.github.ariefannur.base.mpp"
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.compile)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

}

    dependencies {
        implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
        implementation (Libraries.kotlinStdLib)
        implementation (Libraries.appCompat)
        implementation (Libraries.ktxCore)
        implementation (Libraries.constraintLayout)
        testImplementation (TestLibraries.junit4)
        androidTestImplementation (TestLibraries.testRunner)
        androidTestImplementation (TestLibraries.espresso)
    }

