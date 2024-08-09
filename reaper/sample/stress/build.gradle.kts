plugins {
  alias(libs.plugins.android.application)
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
    enabledVariants.set(listOf("releaseWithReaper"))
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
      isMinifyEnabled = true
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
}

buildConfig {
  className("ReaperConfig")
  packageName("com.emergetools.reaper.sample.stress")
}

dependencies {
  // Reaper SDK
  implementation(projects.reaper.reaper)
}
