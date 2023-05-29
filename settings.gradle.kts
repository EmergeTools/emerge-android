rootProject.name = "emerge-android"

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

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")

include(
  ":snapshots",
  ":snapshots:snapshots",
  ":snapshots:snapshots-processor",
  ":snapshots:sample",
  ":snapshots:sample:app",
  ":snapshots:sample:ui-module",
)
includeBuild("gradle-plugin")