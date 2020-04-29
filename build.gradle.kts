// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
        maven ( url = "http://dl.bintray.com/kotlin/kotlin-eap" )
        maven ( url =  "https://kotlin.bintray.com/kotlinx" )
        
    }
    dependencies {
        classpath (BuildPlugins.androidGradlePlugin)
        classpath (BuildPlugins.kotlinGradlePlugin)
        classpath (BuildPlugins.kotlinSerializationPlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven ( url = "http://dl.bintray.com/kotlin/kotlin-eap" )
        maven ( url =  "https://kotlin.bintray.com/kotlinx" )
        
    }
}

tasks.register("clean").configure {
    delete("build")
}
