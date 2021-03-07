import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val gradleWrapperVersion: String by project
val kotlinVersion: String by project
val junitVersion: String by project
val myLibraryVersion by extra { "0.0.0" }

plugins {
    val kotlinVersion = "1.4.31"

    kotlin("jvm") version kotlinVersion
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib", kotlinVersion))
    implementation(kotlin("stdlib-jdk7", kotlinVersion))
    implementation(kotlin("stdlib-jdk8", kotlinVersion))
    implementation(kotlin("reflect", kotlinVersion))
}

dependencies {
    testImplementation(kotlin("test", kotlinVersion))
    testImplementation(kotlin("test-junit5", kotlinVersion))
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    withType<Wrapper> {
        gradleVersion = gradleWrapperVersion
        distributionType = Wrapper.DistributionType.ALL
    }
}
