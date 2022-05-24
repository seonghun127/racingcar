plugins {
    kotlin("jvm")
    id("org.springframework.boot") version "2.6.7"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":_application-core"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}
