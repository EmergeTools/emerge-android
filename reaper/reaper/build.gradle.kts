import com.vanniktech.maven.publish.AndroidSingleVariantLibrary
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.grgit)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.kotlin.serialization)
  alias(libs.plugins.buildconfig)
  alias(libs.plugins.vanniktech.publish)
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

  defaultConfig {
    minSdk = 21
  }
  // Ensures our version.txt is packaged in with release.
  // Will be pulled in automatically to test APK upon build
  sourceSets.getByName("main").resources.srcDir(metaInfResDir)
}

kotlin.compilerOptions {
  jvmTarget = JvmTarget.JVM_11
  languageVersion = KotlinVersion.KOTLIN_1_9
}

dependencies {
  implementation(libs.kotlinx.serialization)
  implementation(libs.okhttp)
  implementation(libs.androidx.lifecycle.process)
  implementation(libs.androidx.work.runtime.ktx)
  implementation(libs.kotlin.coroutines.android)
  implementation(libs.androidx.startup.runtime)

  testImplementation(platform(libs.junit5.bom))
  testImplementation(libs.google.truth)
  testImplementation(libs.junit5.jupiter)
  testImplementation(libs.mockito)
  testImplementation(libs.mockito.kotlin)
  testRuntimeOnly(libs.junit5.platform.launcher)
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
  coordinates(group.toString(), "reaper", version.toString())
  configure(
    AndroidSingleVariantLibrary(
      variant = "release",
      sourcesJar = true,
      publishJavadocJar = true,
    )
  )

  pom {
    name.set("Emerge Tools Reaper Library")
    description.set("Detect dead code in production.")
  }
}

