buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    val gradleVersion = "7.0.3"

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
        classpath("com.android.tools.build:gradle:$gradleVersion")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}