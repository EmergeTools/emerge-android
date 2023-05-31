plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.ksp)
}

android {
  namespace = "com.emergetools.snapshots.sample.ui"
  compileSdk = 33

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_17.toString()
  }

  defaultConfig {
    minSdk = 23
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = "1.4.7"
  }
}

dependencies {
  implementation(libs.androidx.activity.compose)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.ui)
  implementation(libs.compose.ui.tooling.preview)
  implementation(libs.compose.material)

  kspAndroidTest(projects.snapshots.snapshotsProcessor)
  androidTestImplementation(projects.snapshots.snapshots)
  androidTestImplementation(libs.compose.runtime)
  androidTestImplementation(libs.junit)
}
