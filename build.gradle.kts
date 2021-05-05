buildscript {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }

    dependencies {
        // classpath("io.slugstack.oss:slugstack-publishing-plugin:latest.release")
        // classpath("org.openrewrite:plugin:4.3.0-SNAPSHOT")
        classpath("org.openrewrite:plugin:4.3.0-SNAPSHOT")
        // classpath("org.openrewrite:plugin:4.1.0")
    }
}

plugins {
    // id("org.springframework.boot") version "2.4.5"
    // id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("java")

    id("nebula.release") version "15.3.1"

    id("nebula.info") version "9.3.0"
    id("nebula.javadoc-jar") version "17.3.2"
    id("nebula.source-jar") version "17.3.2"
    id("nebula.maven-apache-license") version "17.3.2"

    // id("org.openrewrite.rewrite") version "4.1.0"
}

apply(plugin = "org.openrewrite.rewrite")

group = "io.slugstack.oss"
description = "for random testing with gradle-based projects"

repositories {
    mavenLocal()
    mavenCentral()
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots")
    }
}

dependencies {
    // implementation("org.springframework.boot:spring-boot-starter")
    // testImplementation("org.springframework.boot:spring-boot-starter-test")

    // for testing third-party recipe consumption
    // implementation("org.openrewrite.recipe:rewrite-testing-frameworks:1.1.0")
    implementation("org.openrewrite.recipe:rewrite-testing-frameworks:1.2.0")

    // when only compileOnly you maybe don't get recipes on the test sourceSet?
    // * What went wrong:
    // Execution failed for task ':rewriteRunTest'.
    // > org.openrewrite.RecipeException: Recipes not found: org.openrewrite.java.testing.junit5.JUnit5BestPractices
}

configure<org.openrewrite.gradle.RewriteExtension> {
    // activeRecipe("org.openrewrite.java.format.AutoFormat")
    activeRecipe("org.openrewrite.java.testing.junit5.JUnit5BestPractices")
    // setFailOnInvalidActiveRecipes(false)
    // setInteractive(true)
}

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

// // https://docs.gradle.org/current/userguide/dependency_management.html#sec:defining-custom-configurations
// tasks.register("list") {
//     dependsOn(configurations["compileClasspath"])
//     doLast {
//         println("classpath = ${configurations["compileClasspath"].map { file: File -> file.name }}")
//     }
// }
