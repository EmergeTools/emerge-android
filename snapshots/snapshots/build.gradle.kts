plugins {
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.android.library)
}

version = "0.1.0"

android {
  namespace = "com.emergetools.snapshots"
  compileSdk = 33

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  kotlinOptions {
    jvmTarget = "17"
  }

  defaultConfig {
    minSdk = 26
  }
  composeOptions {
    kotlinCompilerExtensionVersion = "1.4.7"
  }
}

dependencies {
  implementation(libs.junit)
  implementation(libs.androidx.test.runner)
  implementation(libs.androidx.test.rules)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.runtime)
  implementation(libs.compose.ui)

  api(libs.androidx.test.core)
  api(libs.androidx.test.core.ktx)
  api(libs.androidx.test.ext.junit)
  api(libs.compose.ui.test.junit)
}
