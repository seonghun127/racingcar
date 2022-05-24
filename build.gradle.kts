import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.jpa") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
    kotlin("plugin.noarg") version "1.6.21"
}

repositories {
    mavenCentral()
}

subprojects {
    apply {
        plugin("kotlin-jpa")
        plugin("kotlin-spring")
        plugin("org.jetbrains.kotlin.plugin.noarg")
    }
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}