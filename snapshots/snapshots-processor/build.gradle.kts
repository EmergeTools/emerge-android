import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.text.SimpleDateFormat
import java.util.Date

plugins {
  `java-library`
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.grgit)
  `maven-publish`
  signing
}

group = "com.emergetools.snapshots"
version = "0.1.1"

var metaInfResDir = File(buildDir, "generated/emerge/")
var metaInfDestDir = File(metaInfResDir, "META-INF/com/emergetools/test/")

java {
  withJavadocJar()
  withSourcesJar()

  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_11.toString()
  }
}

dependencies {
  implementation(libs.kotlinpoet)
  implementation(libs.kotlinpoet.ksp)
  implementation(libs.ksp)

  implementation(libs.junit)
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
    create<MavenPublication>("release") {
      artifactId = "snapshots-processor"

      afterEvaluate {
        from(components["java"])
      }

      pom {
        name.set("Emerge Tools Snapshots Annotation Processor")
        description.set("Annotation processor for Emerge Composable Preview snapshots.")
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
