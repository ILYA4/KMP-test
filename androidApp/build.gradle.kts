plugins {
    id("com.android.application")
    kotlin("android")
}

val materialVersion = "1.4.0"
val appCompatVersion = "1.3.1"
val constraintLayoutVersion = "2.1.1"
val viewModelVersion = "2.4.0"
val fragmentKtxVersion = "1.4.1"

dependencies {
    implementation(project(":shared-domain"))
    implementation("com.google.android.material:material:$materialVersion")
    implementation("androidx.appcompat:appcompat:$appCompatVersion")
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$viewModelVersion")
    implementation("androidx.fragment:fragment-ktx:$fragmentKtxVersion")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "ru.chit.recyclemap.android"
        minSdk = 23
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        viewBinding = true
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}