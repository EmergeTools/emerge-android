plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.compose.compiler)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.kotlin.serialization)
}

android {
  namespace = "com.emergetools.snapshots.universalinvoker"
  compileSdk = 35

  defaultConfig {
    minSdk = 29
    targetSdk = 35

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
      signingConfig = signingConfigs.getByName("debug")
    }
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
}

dependencies {

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.runtime)
  implementation(libs.compose.ui)
  implementation(libs.compose.foundation.android)

  implementation(projects.snapshots.snapshots)
  implementation(libs.androidx.test.ext.junit)
  implementation(libs.kotlinx.serialization)
}
