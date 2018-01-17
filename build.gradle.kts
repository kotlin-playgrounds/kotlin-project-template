import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlinVersion by project
val junitJupiterVersion by project
val junitPlatformVersion by project
val myLibraryVersion by extra { "0.0.0" }

plugins {
    kotlin("jvm") version "1.2.20"
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
    testRuntime("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
    testRuntime("org.junit.platform:junit-platform-launcher:$junitPlatformVersion")
}
