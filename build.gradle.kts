import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlinVersion by project
val junitJupiterVersion by project
val junitPlatformVersion by project
val myLibraryVersion by extra { "0.0.0" }

plugins {
    kotlin("jvm") version "1.2.20"
//    id("org.junit.platform") version "1.0.2"
}

buildscript {
    repositories {
        jcenter()
    }

    dependencies {
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.20")
        classpath("org.junit.platform:junit-platform-gradle-plugin:1.0.2")
    }
}

apply {
//    plugin("org.jetbrains.kotlin.jvm")
    plugin("org.junit.platform.gradle.plugin")
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions.jvmTarget = "1.8"

repositories {
    jcenter()
}

dependencies {
    compile(kotlin("stdlib", "$kotlinVersion"))
    compile(kotlin("stdlib-jdk7", "$kotlinVersion"))
    compile(kotlin("stdlib-jdk8", "$kotlinVersion"))
    compile(kotlin("reflect", "$kotlinVersion"))
}

dependencies {
    testCompile(kotlin("test", "$kotlinVersion"))
    testCompile("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
    testCompile("org.junit.platform:junit-platform-runner:$junitPlatformVersion")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
    testRuntime("org.junit.platform:junit-platform-launcher:$junitPlatformVersion")
}
