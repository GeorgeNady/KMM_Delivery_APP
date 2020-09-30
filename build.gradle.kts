buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
        maven ("https://dl.bintray.com/kotlin/kotlin-eap")
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0")
        classpath("com.android.tools.build:gradle:4.0.1")
    }
}
group = "com.example.kmm_app"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
