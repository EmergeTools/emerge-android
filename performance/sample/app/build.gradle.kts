plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.ksp)
  id("com.emergetools.android")
}

emerge {
  performance {
    // Note that this is the relative path from the rootProject
    projectPath.set(":performance:sample:perftesting")
  }
}

android {
  namespace = "com.emergetools.performance.sample"
  compileSdk = 34

  defaultConfig {
    applicationId = "com.emergetools.performance.sample"
    minSdk = 23
    targetSdk = 34
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
      signingConfig = signingConfigs.getByName("debug")
    }
    debug {
      applicationIdSuffix = ".debug"
    }
  }

  flavorDimensions.add("store")
  flavorDimensions.add("distribution")

  productFlavors {
    create("play") {
      dimension = "store"
      signingConfig = signingConfigs.getByName("debug")
      isDefault = true
    }
    create("playstore") {
      dimension = "distribution"
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

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.compose.compiler.extension.get()
  }
}

dependencies {
  implementation(libs.androidx.activity.activity)
  implementation(libs.androidx.activity.compose)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.ui)
  implementation(libs.compose.ui.tooling)
  implementation(libs.compose.ui.tooling.preview)
  implementation(libs.compose.material)
}
