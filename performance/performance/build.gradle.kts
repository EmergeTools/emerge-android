import java.text.SimpleDateFormat
import java.util.Date

plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.grgit)
  `maven-publish`
  signing
}

group = "com.emergetools.test"
version = libs.versions.emerge.peformance.get()

var metaInfResDir = File(buildDir, "generated/emerge/")
var metaInfDestDir = File(metaInfResDir, "META-INF/com/emergetools/test/")

android {
  namespace = "com.emergetools.test"

  compileSdk = 33

  defaultConfig {
    minSdk = 23

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    consumerProguardFiles("consumer-rules.pro")
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_1_8.toString()
  }

  sourceSets.getByName("main").resources.srcDir(metaInfResDir)

  publishing {
    singleVariant("release") {
      withJavadocJar()
      withSourcesJar()
    }
  }
}

dependencies {
  implementation(libs.junit)

  implementation(libs.androidx.test.ext.junit)
  implementation(libs.androidx.test.runner)
  implementation(libs.androidx.test.uiautomator)
  implementation(libs.androidx.tracing.ktx)

  implementation(libs.tree.printer)

  implementation(libs.ktor.network)
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
      artifactId = "performance"

      afterEvaluate {
        from(components["release"])
      }

      pom {
        name.set("Emerge Tools Performance Testing SDK")
        description.set("Monitor your app's performance")
        url.set("https://www.emergetools.com")
        licenses {
          license {
            name.set("The Apache License, Version 2.0")
            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
          }
        }
        scm {
          url.set("https://github.com/EmergeTools")
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
