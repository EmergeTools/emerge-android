plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.ksp)
  id("com.emergetools.android")
}

emerge {
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))

  vcs {
    gitHub {
      repoName.set("emerge-android")
      repoOwner.set("EmergeTools")
    }
  }
}

android {
  namespace = "com.emergetools.snapshots.sample"
  compileSdk = 34

  defaultConfig {
    applicationId = "com.emergetools.snapshots.sample"
    minSdk = 23
    targetSdk = 33
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
      applicationIdSuffix = ".debug"
    }
  }

  sourceSets {
    // TODO: Ryan: See if we can workaround having to specify the sourceSets for submodule tests
    getByName("androidTest") {
      // Adds sources from submodules for including snapshot tests
      // kspAndroidTest(..) with the snapshots-processor dependency must be used for test generation
      kotlin.srcDir("../ui-module/src/androidTest/kotlin")
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

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.compose.compiler.extension.get()
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

  // This will generate snapshots from Composable Previews in the main source set
  ksp(projects.snapshots.snapshotsProcessor)
  // This will generate snapshots from Composable Previews in the androidTest source set.
  kspAndroidTest(projects.snapshots.snapshotsProcessor)

  androidTestImplementation(projects.snapshots.snapshots)
  androidTestImplementation(libs.compose.runtime)
  androidTestImplementation(libs.compose.ui)
  androidTestImplementation(libs.junit)
}
