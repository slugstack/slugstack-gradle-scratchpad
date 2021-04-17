plugins {
	id("org.springframework.boot") version "2.4.5"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("java")
}

group = "io.slugstack.oss"
version = "0.0.1-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
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

tasks.named<Test>("test") {
    useJUnitPlatform()
    jvmArgs = listOf("-XX:+UnlockDiagnosticVMOptions", "-XX:+ShowHiddenFrames")
}
