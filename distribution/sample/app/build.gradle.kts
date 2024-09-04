plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.kotlin.android)
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
}

android {
  namespace = "com.emergetools.distribution.sample"
  compileSdk = 34

  defaultConfig {
    applicationId = "com.emergetools.distribution.sample"
    minSdk = 21
    targetSdk = 33
    versionCode = 1
    versionName = "1.0"
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
}

buildConfig {
  className("DistributionConfig")
  packageName("com.emergetools.distribution.sample")
}

dependencies {
  // Distribution SDK
  implementation(projects.distribution.distribution)
}
