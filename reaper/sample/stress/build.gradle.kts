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
    enabledVariants.set(listOf("releaseWithReaper", "debug"))
    publishableApiKey.set(System.getenv("EMERGE_REAPER_API_KEY") ?: "<key>")
  }
}

android {
  namespace = "com.emergetools.reaper.sample.stress"
  compileSdk = 34

  defaultConfig {
    applicationId = "com.emergetools.reaper.sample.stress"
    minSdk = 21
    targetSdk = 33
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    vectorDrawables {
      useSupportLibrary = true
    }
  }

  buildTypes {
    getByName("debug") {
      applicationIdSuffix = ".debug"
      isDebuggable = true
    }
    getByName("release") {
      isMinifyEnabled = true
    }
    create("releaseWithReaper") {
      initWith(getByName("release"))
      // Don't minify androidTest application
      if (project.hasProperty("isAndroidTest")) {
        isMinifyEnabled = false
      } else {
        isMinifyEnabled = true
      }

      matchingFallbacks += listOf("release")
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

buildConfig {
  className("ReaperConfig")
  packageName("com.emergetools.reaper.sample.stress")
}

dependencies {
  implementation(libs.androidx.activity)
  implementation(libs.androidx.activity.compose)
  implementation(libs.androidx.navigation.compose)
  implementation(libs.androidx.navigation.ui.ktx)
  implementation(libs.kotlinx.serialization)

  // Reaper SDK
  implementation(projects.reaper.reaper)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.ui)
  implementation(libs.compose.ui.tooling)
  implementation(libs.compose.ui.tooling.preview)
  implementation(libs.compose.material)
  implementation(libs.androidx.test.core.ktx)

  androidTestImplementation(libs.compose.runtime)
  androidTestImplementation(libs.compose.ui)
  androidTestImplementation(libs.junit)
  androidTestImplementation(libs.androidx.test.core)
  androidTestImplementation(libs.androidx.test.runner)
  androidTestImplementation(libs.androidx.test.uiautomator)
}
