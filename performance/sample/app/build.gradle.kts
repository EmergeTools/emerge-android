plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.compose.compiler)
  alias(libs.plugins.kotlin.android)
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
      isDefault = true
      applicationIdSuffix = ".debug"
    }
  }

  flavorDimensions.add("api")
  flavorDimensions.add("mode")

  productFlavors {
    create("demo") {
      dimension = "mode"
      applicationIdSuffix = ".demo"
      versionNameSuffix = "-demo"
    }

    create("full") {
      dimension = "mode"
      applicationIdSuffix = ".full"
      versionNameSuffix = "-full"
    }

    create("minApi24") {
      dimension = "api"
      minSdk = 24
    }

    create("minApi21") {
      dimension = "api"
      minSdk = 21
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

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.ui)
  implementation(libs.compose.ui.tooling)
  implementation(libs.compose.ui.tooling.preview)
  implementation(libs.compose.material)
}
