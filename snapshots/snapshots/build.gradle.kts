import java.text.SimpleDateFormat
import java.util.Date

plugins {
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.android.library)
  alias(libs.plugins.grgit)
  `maven-publish`
  signing
}

group = "com.emergetools.snapshots"
version = libs.versions.emerge.snapshots.get()

var metaInfResDir = File(buildDir, "generated/emerge/")
var metaInfDestDir = File(metaInfResDir, "META-INF/com/emergetools/test/")

android {
  namespace = "com.emergetools.snapshots"
  compileSdk = 33

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }

  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_11.toString()
  }

  defaultConfig {
    minSdk = 23
  }
  composeOptions {
    kotlinCompilerExtensionVersion = "1.4.7"
  }
}

dependencies {
  implementation(libs.junit)
  implementation(libs.androidx.test.runner)
  implementation(libs.androidx.test.rules)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.runtime)
  implementation(libs.compose.ui)

  api(libs.androidx.test.core)
  api(libs.androidx.test.core.ktx)
  api(libs.androidx.test.ext.junit)
  api(libs.compose.ui.test.junit)
}

tasks.register("generateMetaInfVersion") {
  doLast {
    metaInfDestDir.mkdirs()
    File(metaInfDestDir, "version.txt").writeText(
      "version: $version" +
        "\nbuild time: ${SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z").format(Date())}" +
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

val ossrhUsername: String? by project
val ossrhPassword: String? by project

publishing {
  repositories {
    maven {
      name = "SonatypeStaging"
      url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
      credentials {
        username = ossrhUsername
        password = ossrhPassword
      }
    }

    maven {
      name = "SonatypeSnapshots"
      url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
      credentials {
        username = ossrhUsername
        password = ossrhPassword
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
        name.set("Emerge Tools Snapshots SDK")
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
  sign(publishing.publications["release"])
}
