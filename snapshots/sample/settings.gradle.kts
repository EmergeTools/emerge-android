pluginManagement {
  repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
  }
  includeBuild("../../gradle-plugin")
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(
  ":app"
)
