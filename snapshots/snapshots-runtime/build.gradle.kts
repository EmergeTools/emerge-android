import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.vanniktech.publish)
}

group = "com.emergetools.snapshots"
version = libs.versions.emerge.snapshots.get()

java {
  sourceCompatibility = JavaVersion.VERSION_21
  targetCompatibility = JavaVersion.VERSION_21
}

kotlin {
  compilerOptions {
    jvmTarget = JvmTarget.JVM_21
    languageVersion.set(KotlinVersion.KOTLIN_1_9)
  }
}

dependencies {
  implementation(libs.kotlinx.serialization)
  implementation(libs.androidx.annotation.jvm)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.runtime)
}

tasks.withType<Jar> {
  manifest {
    attributes["Implementation-Version"] = version
  }
}

mavenPublishing {
  coordinates(group.toString(), "snapshots-runtime", version.toString())

  pom {
    name.set("Emerge Tools Snapshots runtime dependencies.")
    description.set("Runtime dependencies for Emerge Composable Preview snapshots.")
  }
}
