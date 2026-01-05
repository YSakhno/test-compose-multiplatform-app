pluginManagement {
    repositories {
        google {
            @Suppress("UnstableApiUsage") // includeGroupAndSubgroups is 'incubating' in Gradle 9.2.1
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

@Suppress("UnstableApiUsage") // repositories and repositoriesMode are 'incubating' in Gradle 9.2.1
dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "test-compose-multiplatform-app"
include(":composeApp")
