import org.jetbrains.kotlin.gradle.dsl.Coroutines
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlinVersion: String by project
val myLibraryVersion by extra { "0.0.0" }

plugins {
    val kotlinVersion = "1.2.50"

    kotlin("jvm") version kotlinVersion
}

repositories {
    jcenter()
}

dependencies {
    compile(kotlin("stdlib", kotlinVersion))
    compile(kotlin("stdlib-jdk7", kotlinVersion))
    compile(kotlin("stdlib-jdk8", kotlinVersion))
    compile(kotlin("reflect", kotlinVersion))
}

dependencies {
    testCompile(kotlin("test", kotlinVersion))
    testCompile(kotlin("test-junit5", kotlinVersion))
}

kotlin {
    experimental.coroutines = Coroutines.ENABLE
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    "wrapper"(Wrapper::class) {
        gradleVersion = "4.8"
        distributionUrl = "https://services.gradle.org/distributions/gradle-$gradleVersion-all.zip"
    }
}
