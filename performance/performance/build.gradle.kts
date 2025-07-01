import com.vanniktech.maven.publish.AndroidSingleVariantLibrary

plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.kotlin.serialization)
  alias(libs.plugins.grgit)
  alias(libs.plugins.vanniktech.publish)
}

group = "com.emergetools.test"
version = libs.versions.emerge.performance.get()

var metaInfResDir = File(buildDir, "generated/emerge/")
var metaInfDestDir = File(metaInfResDir, "META-INF/com/emergetools/test/")

android {
  namespace = "com.emergetools.test"

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
}

dependencies {
  implementation(libs.junit4)

  // Only use for local debugging & testing leveraging their Perfetto utils
  implementation(libs.androidx.benchmark.common)
  implementation(libs.androidx.benchmark.macro)

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
  coordinates(group.toString(), "performance", version.toString())

  configure(
    AndroidSingleVariantLibrary(
      variant = "release",
      sourcesJar = true,
      publishJavadocJar = true,
    )
  )
  pom {
    name.set("Emerge Tools Performance Testing Library")
    description.set("Monitor your app's performance")
  }
}
