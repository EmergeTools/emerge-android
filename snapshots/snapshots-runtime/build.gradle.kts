import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.compose.compiler)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.vanniktech.publish)
}

group = "com.emergetools.snapshots"
version = libs.versions.emerge.snapshots.get()

android {
  namespace = "com.emergetools.snapshots.runtime"

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_17.toString()
    languageVersion = KotlinVersion.KOTLIN_1_9.version
  }

  defaultConfig {
    minSdk = 23
  }

  buildFeatures {
    compose = true
  }
}

dependencies {
  implementation(libs.kotlinx.serialization)
  implementation(libs.androidx.annotation.jvm)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.runtime)
}

mavenPublishing {
  coordinates(group.toString(), "snapshots-runtime", version.toString())
  pom {
    name.set("Emerge Tools Snapshots runtime dependencies.")
    description.set("Runtime dependencies for Emerge Composable Preview snapshots.")
  }
}
