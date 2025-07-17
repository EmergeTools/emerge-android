import com.vanniktech.maven.publish.AndroidSingleVariantLibrary
import org.jetbrains.kotlin.gradle.internal.ensureParentDirsCreated

plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.kotlin.serialization)
  alias(libs.plugins.vanniktech.publish)
}

group = "com.emergetools.distribution"
version = libs.versions.emerge.distribution.get()

val generateMetaInf = tasks.register("generateMetaInfVersion", GenerateMetaInfVersion::class.java) {
  version = project.version.toString()
  baseUrl.set(rootProject.properties["emergeBaseUrl"]?.toString() ?: "https://api.emergetools.com")
}

abstract class GenerateMetaInfVersion : DefaultTask() {

  @get:Input
  abstract val version: Property<String>

  @get:Input
  abstract val baseUrl: Property<String>

  @get:OutputDirectory
  abstract val metaInfResDir: DirectoryProperty

  @TaskAction
  fun generate() {
    val metaInfDestDir = metaInfResDir.dir("META-INF/com/emergetools/distribution").get().asFile
    val metaInfDestFile = metaInfDestDir.resolve("version.txt")
    metaInfDestFile.ensureParentDirsCreated()
    metaInfDestFile.writeText(
      """version: ${version.get()}
        |baseUrl: ${baseUrl.get()}
      """.trimMargin()
    )
  }
}

android {
  namespace = "com.emergetools.distribution"

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }

  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_11.toString()
    languageVersion = "1.9"
  }

  defaultConfig {
    version = project.version
    minSdk = 21
  }
  androidComponents.onVariants { variant ->
    variant.sources.resources!!.addGeneratedSourceDirectory<GenerateMetaInfVersion>(
      taskProvider = generateMetaInf,
      wiredWith = GenerateMetaInfVersion::metaInfResDir
    )
  }
}

dependencies {
  implementation(libs.kotlinx.serialization)
  implementation(libs.okhttp)
  implementation(libs.androidx.work.runtime.ktx)
  implementation(libs.kotlin.coroutines.android)

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
mavenPublishing {
  coordinates(group.toString(), "distribution", version.toString())

  configure(
    AndroidSingleVariantLibrary(
      variant = "release",
      sourcesJar = true,
      publishJavadocJar = true,
    )
  )

  pom {
    name.set("Emerge Tools build distribution library")
    description.set("Distribution for alpha, beta, and test builds.")
  }
}
