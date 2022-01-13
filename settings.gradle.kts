rootProject.name = "slugstack-gradle-scratchpad"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "org.owasp") {
                useModule("org.owasp:dependency-check-gradle:${requested.version}")
            }
        }
    }

    repositories {
        gradlePluginPortal()
        mavenLocal()
        mavenCentral()
    }
}
