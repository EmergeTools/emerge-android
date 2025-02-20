plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.benchmark)
  alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.emergetools.benchmark"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    defaultConfig {
      minSdk = 26
      // TODO(chromy): Should not be needed.
      manifestPlaceholders["emerge.reaper.enabled"] = false
      testInstrumentationRunner = "androidx.benchmark.junit4.AndroidBenchmarkRunner"
    }

    testBuildType = "release"
    buildTypes {
        debug {
            // Since isDebuggable can"t be modified by gradle for library modules,
            // it must be done in a manifest - see src/androidTest/AndroidManifest.xml
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "benchmark-proguard-rules.pro"
            )
        }
        release {
            isDefault = true
        }
    }
}

dependencies {
  androidTestImplementation(libs.androidx.test.runner)
  androidTestImplementation(libs.androidx.junit)
  androidTestImplementation(libs.junit4)
  androidTestImplementation(libs.androidx.benchmark.junit4)
  androidTestImplementation(projects.reaper.reaper)
}
