rootProject.name = "emerge-android"

pluginManagement {
  repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
  }
}

plugins {
  id("com.gradle.develocity") version "4.0.2"
  id("com.gradle.common-custom-user-data-gradle-plugin") version "2.3"
  id("com.android.settings") version "8.10.1" // Keep in sync with agp in libs.versions.toml
}

val isCI = System.getenv("CI") != null

develocity {
  buildScan {
    termsOfUseUrl.set("https://gradle.com/help/legal-terms-of-use")
    termsOfUseAgree.set("yes")
    uploadInBackground = !isCI
  }
}

android {
  compileSdk = 35
  targetSdk = 35
}

dependencyResolutionManagement {
  repositories {
    google()
    mavenCentral()
  }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

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
  ":snapshots:snapshots-runtime",
  ":snapshots:snapshots-universal-invoker",
  ":snapshots:sample",
  ":snapshots:sample:app",
  ":snapshots:sample:ui-module",
  ":tools",
  ":benchmark",
  ":distribution:distribution",
  ":distribution:sample",
  ":distribution:integration",
  ":distribution:sample:app",
)
includeBuild("gradle-plugin")
