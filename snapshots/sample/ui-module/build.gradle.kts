plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.screenshot)
}

android {
  namespace = "com.emergetools.snapshots.sample.ui"
  compileSdk = 34

  defaultConfig {
    minSdk = 23
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_17.toString()
  }

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.compose.compiler.extension.get()
  }

  experimentalProperties["android.experimental.enableScreenshotTest"] = true
}

dependencies {
  implementation(libs.androidx.activity.compose)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.ui)
  implementation(libs.compose.ui.tooling.preview)
  implementation(libs.compose.material)

  androidTestImplementation(libs.compose.runtime)
  androidTestImplementation(libs.junit)

  screenshotTestImplementation(libs.compose.ui.tooling)
}
