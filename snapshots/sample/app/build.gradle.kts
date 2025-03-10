plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.compose.compiler)
  alias(libs.plugins.kotlin.android)
  id("com.emergetools.android")
}

emerge {
  snapshots {
    tag.setFromVariant()

    profile.set(true)
  }
}

android {
  namespace = "com.emergetools.snapshots.sample"

  defaultConfig {
    applicationId = "com.emergetools.snapshots.sample"
    minSdk = 23
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    vectorDrawables {
      useSupportLibrary = true
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
    debug {
      applicationIdSuffix =
        if (providers.gradleProperty("emerge.experimental.firstPartySnapshots").getOrElse("false").toBoolean()) {
          ".firstParty"
        } else {
          ".debug"
        }
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
  implementation(libs.androidx.activity)
  implementation(libs.androidx.activity.compose)

  implementation(projects.snapshots.sample.uiModule)
  implementation(projects.snapshots.snapshotsAnnotations)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.ui)
  implementation(libs.compose.ui.tooling)
  implementation(libs.compose.ui.tooling.preview)
  implementation(libs.compose.material)
  implementation(libs.compose.wear.ui.tooling.preview)

  // The only required snapshots dependency
  androidTestImplementation(projects.snapshots.snapshots)
  androidTestImplementation(libs.compose.runtime)
  androidTestImplementation(libs.compose.ui)
  androidTestImplementation(libs.junit4)
}
