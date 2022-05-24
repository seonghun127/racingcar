plugins {
    kotlin("jvm")
    id("org.springframework.boot") version "2.6.7"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":_in-web-api-adapter"))
    implementation(project(":_out-persistence-adapter"))
    implementation("org.springframework.boot:spring-boot-starter")
}
