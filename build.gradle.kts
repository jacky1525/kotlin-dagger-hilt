// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val kotlin_version = "1.7.10"
    repositories {
        google()
        mavenCentral()
    }
    dependencies {

        classpath ("com.android.tools.build:gradle:7.2.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.50")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}


plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
}