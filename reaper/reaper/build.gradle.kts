import java.text.SimpleDateFormat
import java.util.Date

plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.grgit)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.kotlin.serialization)
  alias(libs.plugins.buildconfig)
  `maven-publish`
  signing
}

group = "com.emergetools.reaper"
version = libs.versions.emerge.reaper.get()

var metaInfResDir = File(buildDir, "generated/emerge/")
var metaInfDestDir = File(metaInfResDir, "META-INF/com/emergetools/reaper/")

android {
  namespace = "com.emergetools.reaper"

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }

  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_11.toString()
    languageVersion = "1.7"
  }

  defaultConfig {
    minSdk = 21
  }

  // Ensures our version.txt is packaged in with release.
  // Will be pulled in automatically to test APK upon build
  sourceSets.getByName("main").resources.srcDir(metaInfResDir)
}

dependencies {
  implementation(libs.kotlinx.serialization)
  implementation(libs.okhttp)
  implementation(libs.androidx.lifecycle.process)
  implementation(libs.androidx.work.runtime.ktx)
  implementation(libs.kotlin.coroutines.android)
  implementation(libs.androidx.startup.runtime)

  testImplementation(libs.google.truth)

  testImplementation(libs.junit.jupiter.api)
  testImplementation(libs.junit.jupiter.params)
  testImplementation(libs.mockito)
  testImplementation(libs.mockito.kotlin)
  testRuntimeOnly(libs.junit.jupiter.engine)
}

tasks.withType<Test> {
  useJUnitPlatform()
}

val baseUrl = rootProject.properties["emergeBaseUrl"] ?: "https://reaper.emergetools.com"
buildConfig {
  className("ReaperConfig")
  packageName("com.emergetools.reaper")
  buildConfigField("String", "REAPER_VERSION", """"${project.version}"""")
  buildConfigField("String", "EMERGE_BASE_URL", """"$baseUrl"""")
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
      artifactId = "reaper"

      afterEvaluate {
        from(components["release"])
      }

      pom {
        name.set("Emerge Tools Reaper SDK")
        description.set("Detect dead code in production.")
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
          developer {
            id.set("hector")
            name.set("Hector Dearman")
            email.set("hector@emergetools.com")
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
