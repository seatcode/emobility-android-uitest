import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.60"
}

group = "com.seat.mo"
version = "1.0-SNAPSHOT"

buildscript{
    repositories {
        mavenCentral()
        google()
        jcenter()
    }
    dependencies {
        classpath("net.serenity-bdd:serenity-gradle-plugin:1.1.1")
    }
}

dependencies {
    testCompile( "net.serenity-bdd:serenity-core:2.1.6")
    testCompile( "net.serenity-bdd:serenity-junit:2.1.6")
    testCompile("org.assertj:assertj-core:1.7.0")
    testCompile("org.slf4j:slf4j-simple:1.7.7")
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("junit:junit:4.13")
    testImplementation("net.serenity-bdd:serenity-cucumber:1.9.51")
    testImplementation("net.serenity-bdd:serenity-screenplay:2.1.6")

}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
repositories {
    mavenCentral()
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
