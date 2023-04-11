pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BugProducer"
include(":core:http:common")
include(":core:http:client")
include(":core:monitoring:common")
