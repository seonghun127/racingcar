plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":_in-console-adapter"))
    implementation(project(":_out-in-memory-adapter"))
}
