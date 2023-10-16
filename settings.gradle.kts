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
  ":performance",
  ":performance:performance",
  ":performance:sample",
  ":performance:sample:app",
  ":performance:sample:perftesting",
  ":snapshots",
  ":snapshots:snapshots",
  ":snapshots:snapshots-annotations",
  ":snapshots:snapshots-processor",
  ":snapshots:snapshots-processor-test",
  ":snapshots:snapshots-shared",
  ":snapshots:sample",
  ":snapshots:sample:app",
  ":snapshots:sample:ui-module",
  ":snapshots:sample:feature-a-module",
)
includeBuild("gradle-plugin")
