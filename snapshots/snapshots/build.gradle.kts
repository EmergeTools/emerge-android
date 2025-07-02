import com.vanniktech.maven.publish.AndroidSingleVariantLibrary
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.compose.compiler)
  alias(libs.plugins.grgit)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.vanniktech.publish)
}

group = "com.emergetools.snapshots"
version = libs.versions.emerge.snapshots.get()

var metaInfResDir = File(buildDir, "generated/emerge/")
var metaInfDestDir = File(metaInfResDir, "META-INF/com/emergetools/snapshots/")

android {
  namespace = "com.emergetools.snapshots"

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

  // Ensures our version.txt is packaged in with release.
  // Will be pulled in automatically to test APK upon build
  sourceSets.getByName("main").resources.srcDir(metaInfResDir)
}

dependencies {

  implementation(libs.junit4)
  implementation(libs.moshi)
  implementation(libs.moshi.kotlin)
  implementation(libs.moshi.adapters)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.runtime)
  implementation(libs.compose.ui)
  implementation(libs.compose.ui.tooling)
  implementation(libs.compose.foundation.android)

  implementation(libs.androidx.test.core)
  implementation(libs.androidx.test.core.ktx)
  implementation(libs.androidx.test.ext.junit)
  implementation(libs.androidx.test.rules)
  implementation(libs.androidx.test.runner)
  implementation(libs.compose.ui.test.junit)

  implementation(projects.snapshots.snapshotsRuntime)

  testImplementation(libs.junit4)
}

tasks.register("generateMetaInfVersion") {
  doLast {
    metaInfDestDir.mkdirs()
    File(metaInfDestDir, "version.txt").writeText(
      "version: $version" +
        "\nrevision: ${grgit.head().id}"
    )
  }
}

afterEvaluate {
  tasks.filter { task ->
    task.name.startsWith("generate") && task.name.endsWith("Resources")
  }.forEach { task ->
    task.dependsOn(tasks.findByName("generateMetaInfVersion"))
  }
}

mavenPublishing {
  coordinates(group.toString(), "snapshots", version.toString())
  configure(
    AndroidSingleVariantLibrary(
      variant = "release",
      sourcesJar = true,
      publishJavadocJar = true,
    )
  )
  pom {
    name.set("Emerge Tools Snapshots Library")
    description.set("Snapshot Composables, views and activities.")
  }
}
