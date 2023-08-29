plugins {
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.android.library)
}

android {
  namespace = "com.emergetools.snapshots.snapshots_processor_test"
  compileSdk = 33

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }

  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_11.toString()
  }

  defaultConfig {
    minSdk = 23
  }

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.compose.compiler.extension.get()
  }
}

dependencies {
  testImplementation(projects.snapshots.snapshotsProcessor)

  testImplementation(platform(libs.compose.bom))
  testImplementation(libs.compose.runtime)
  testImplementation(libs.compose.ui.tooling)

  testImplementation(libs.assertj)
  testImplementation(libs.compile.testing)
  testImplementation(libs.compile.testing.ksp)
  testImplementation(libs.junit)
  testImplementation(libs.guava)
  testImplementation(libs.google.truth)
}
