buildscript {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }

    dependencies {
        // classpath("org.openrewrite:plugin:4.3.0-SNAPSHOT")
        classpath("org.openrewrite:plugin:latest.integration")
    }
}

plugins {
    id("org.springframework.boot") version "2.5.6"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"

    id("java")
    id("nebula.release") version "16.0.0"
    id("nebula.info") version "11.0.1"
    id("nebula.javadoc-jar") version "18.0.0"
    id("nebula.source-jar") version "18.0.0"
    id("nebula.maven-apache-license") version "18.0.0"

    // id("org.openrewrite.rewrite") version "4.2.1"
}
apply(plugin = "org.openrewrite.rewrite")

group = "io.slugstack.oss"
description = "For random testing with maven and gradle-based projects"

repositories {
    mavenLocal()
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots") }
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // rewrite("org.openrewrite.recipe:rewrite-testing-frameworks:1.4.0")
    implementation("org.openrewrite.recipe:rewrite-testing-frameworks:1.15.1")
}

configure<org.openrewrite.gradle.RewriteExtension> {
    activeRecipe("org.openrewrite.java.format.AutoFormat")
    activeRecipe("org.openrewrite.java.testing.junit5.JUnit5BestPractices")
    // setFailOnInvalidActiveRecipes(true)
    // setFailOnDryRunResults(true)
    // setDoDryRunOnCheck(true)
}
// rewrite {
//     activeRecipe("org.openrewrite.java.format.AutoFormat")
//     activeRecipe("org.openrewrite.java.testing.junit5.JUnit5BestPractices")
//     failOnInvalidActiveRecipes = false
//     failOnDryRunResults = false
//     doDryRunOnCheck = false
// }

configure<nebula.plugin.release.git.base.ReleasePluginExtension> {
    defaultVersionStrategy = nebula.plugin.release.NetflixOssStrategies.SNAPSHOT(project)
}

tasks.named<JavaCompile>("compileJava") {
    sourceCompatibility = JavaVersion.VERSION_1_8.toString()
    targetCompatibility = JavaVersion.VERSION_1_8.toString()

    options.isFork = true
    options.forkOptions.executable = "javac"
    options.compilerArgs.addAll(listOf("--release", "8"))
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}

// tasks.named<Test>("test") {
//     useJUnitPlatform()
//     jvmArgs = listOf("-XX:+UnlockDiagnosticVMOptions", "-XX:+ShowHiddenFrames")
// }
