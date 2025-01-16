plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.compose.compiler)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.kotlin.serialization)
  alias(libs.plugins.buildconfig)
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

  reaper {
    enabledVariants.set(listOf("release"))
    publishableApiKey.set(System.getenv("EMERGE_REAPER_API_KEY") ?: "<key>")
  }
}

android {
  namespace = "com.emergetools.reaper.sample.manuallyInitialized"

  defaultConfig {
    applicationId = "com.emergetools.reaper.sample.manuallyInitialized"
    minSdk = 21
    targetSdk = 33
    versionCode = 1
    versionName = "1.0"

    vectorDrawables {
      useSupportLibrary = true
    }
  }

  buildTypes {
    release {
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
      isMinifyEnabled = true
    }
    debug {
      applicationIdSuffix = ".debug"
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

buildConfig {
  className("ReaperConfig")
  packageName("com.emergetools.reaper.sample.manuallyInitialized")
}

dependencies {
  implementation(libs.androidx.activity)
  implementation(libs.androidx.activity.compose)
  implementation(libs.androidx.navigation.compose)
  implementation(libs.androidx.navigation.ui.ktx)
  implementation(libs.kotlinx.serialization)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.ui)
  implementation(libs.compose.ui.tooling)
  implementation(libs.compose.ui.tooling.preview)
  implementation(libs.compose.material)
  implementation(libs.androidx.test.core.ktx)

  // Reaper SDK
  implementation(libs.androidx.startup.runtime)
  implementation(projects.reaper.reaper)
}
