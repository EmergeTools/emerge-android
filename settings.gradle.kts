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
  ":reaper",
  ":reaper:reaper",
  ":reaper:sample",
  ":reaper:sample:app",
  ":reaper:sample:manuallyInitializedApp",
  ":reaper:sample:stress",
  ":snapshots",
  ":snapshots:snapshots",
  ":snapshots:snapshots-annotations",
  ":snapshots:snapshots-shared",
  ":snapshots:sample",
  ":snapshots:sample:app",
  ":snapshots:sample:ui-module",
  ":tools",
  ":benchmark",
  ":distribution:distribution",
  ":distribution:sample",
  ":distribution:sample:app",
)
includeBuild("gradle-plugin")
