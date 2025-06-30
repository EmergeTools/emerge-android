import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.compose.compiler)
  alias(libs.plugins.grgit)
  alias(libs.plugins.kotlin.android)
  `maven-publish`
  signing
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
  publishing {
    singleVariant("release") {
      withSourcesJar()
      withJavadocJar()
    }
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

publishing {
  repositories {
    maven {
      name = "SonatypeStaging"
      url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
      credentials {
        username = System.getenv("OSSRH_USERNAME")
        password = System.getenv("OSSRH_PASSWORD")
      }
    }

    maven {
      name = "SonatypeSnapshots"
      url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
      credentials {
        username = System.getenv("OSSRH_USERNAME")
        password = System.getenv("OSSRH_PASSWORD")
      }
    }
  }

  publications {
    register<MavenPublication>("release") {
      artifactId = "snapshots"

      afterEvaluate {
        from(components["release"])
      }

      pom {
        name.set("Emerge Tools Snapshots Library")
        description.set("Snapshot Composables, views and activities.")
        url.set("https://www.emergetools.com")
        licenses {
          license {
            name.set("The Apache License, Version 2.0")
            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
          }
        }
        scm {
          url.set("https://github.com/EmergeTools/emerge-android")
        }
        developers {
          developer {
            id.set("ryan")
            name.set("Ryan Brooks")
            email.set("ryan@emergetools.com")
          }
        }
      }
    }
  }
}

signing {
  val signingKey: String? by project
  val signingPassword: String? by project
  useInMemoryPgpKeys(signingKey, signingPassword)
  sign(publishing.publications["release"])
}
