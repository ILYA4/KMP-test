plugins {
    id("com.android.application")
    kotlin("android")
}

val materialVersion = "1.4.0"
val appCompatVersion = "1.3.1"
val constraintLayoutVersion = "2.1.1"

dependencies {
    implementation(project(":shared-domain"))
    implementation("com.google.android.material:material:$materialVersion")
    implementation("androidx.appcompat:appcompat:$appCompatVersion")
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")
}

android {
    compileSdk = 30
    defaultConfig {
        applicationId = "ru.chit.recyclemap.android"
        minSdk = 23
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}