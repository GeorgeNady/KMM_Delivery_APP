import org.jetbrains.kotlin.gradle.internal.Kapt3GradleSubplugin

plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("kotlin-android")
}
group = "com.example.kmm_app"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}
dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.1")


    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.4.0")
    implementation ("androidx.core:core-ktx:1.3.1")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    val room_version = "2.2.1"
    val lifecycle_version = "2.2.0"
    val coroutines_version = "1.3.9"
    val navigation_version = "2.3.0"

    // Room
    implementation("androidx.room:room-runtime:$room_version")
    implementation("androidx.room:room-ktx:2.2.5")
    kapt("androidx.room:room-compiler:$room_version")

    // Architectural Components
    implementation("androidx.lifecycle:lifecycle-extensions:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.2.0")
    kapt("androidx.lifecycle:lifecycle-compiler:$lifecycle_version")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version")

    // Navigation Components
    implementation("androidx.navigation:navigation-fragment-ktx:$navigation_version")
    implementation("androidx.navigation:navigation-ui-ktx:$navigation_version")

}
android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.example.kmm_app.androidApp"
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    kapt {
        generateStubs = true
    }
}