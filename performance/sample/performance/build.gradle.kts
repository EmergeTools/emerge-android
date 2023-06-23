// This is a com.android.test project which is automatically configured by the Emerge Tools Gradle plugin:
//
// - The SDK version targets are automatically set to be identical to the app project.
// - The same build types as your app project are automatically created.
// - Test libraries like UI Automator and the Emerge SDK are automatically added as dependencies.
//
// The configuration can be modified in this file as needed.

plugins {
  id("org.jetbrains.kotlin.android")
}

dependencies {
  // We're depending on the local project here
  // In real-world impl, you'd use the Maven dependency
  implementation(projects.performance.performance)
  // Emerge's UIAutomator helper library (Optional): https://github.com/EmergeTools/relax
  implementation("com.emergetools.test:relax:0.1.0")
}

/**
 * Example code to disable build types other than "release"
 */
androidComponents {
  beforeVariants(selector().all()) {
    it.enable = it.buildType == "release"
  }
}
