rootProject.name = "internal-emerge-android"

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
  ":reaper",
  ":reaper:reaper",
  ":reaper:sample",
  ":reaper:sample:app",
  ":reaper:sample:manuallyInitializedApp",
  ":snapshots",
  ":snapshots:snapshots",
  ":snapshots:snapshots-annotations",
  ":snapshots:snapshots-shared",
  ":snapshots:sample",
  ":snapshots:sample:app",
  ":snapshots:sample:ui-module",
  ":benchmark",
)
includeBuild("gradle-plugin")
