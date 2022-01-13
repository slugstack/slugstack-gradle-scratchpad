plugins {
    `java-library`
    id("nebula.maven-publish") version "18.1.0"
    id("nebula.contacts") version "6.0.0"
    id("nebula.info") version "9.3.0"

    id("nebula.release") version "16.0.0"
    id("nebula.javadoc-jar") version "17.3.2"
    id("nebula.source-jar") version "17.3.2"
    id("nebula.maven-apache-license") version "18.1.0"
    id("org.owasp.dependencycheck") version "6.5.4-SNAPSHOT"
//    id("org.owasp:dependency-check-gradle") version "6.5.4-SNAPSHOT"
}

configure<nebula.plugin.release.git.base.ReleasePluginExtension> {
    defaultVersionStrategy = nebula.plugin.release.NetflixOssStrategies.SNAPSHOT(project)
}

configure<org.owasp.dependencycheck.gradle.extension.DependencyCheckExtension> {
    format = org.owasp.dependencycheck.reporting.ReportGenerator.Format.ALL
    // failBuildOnCVSS = 9F
}

group = "io.slugstack.oss"
description = "For random testing with gradle-based projects"

repositories {
    mavenLocal()
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots")
    }
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation("org.assertj:assertj-core:3.22.0")
    implementation("log4j:log4j:1.2.7")
    // testImplementation("org.apache.logging.log4j:log4j-core:2.13.0") does not appear to trigger dependency-check
    implementation("org.apache.logging.log4j:log4j-core:2.13.0") // triggers dependency-check
    implementation("junit:junit:4.12")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
    jvmArgs = listOf("-XX:+UnlockDiagnosticVMOptions", "-XX:+ShowHiddenFrames")
}
