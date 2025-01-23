import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  alias(libs.plugins.gradle.publish)
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.kotlin.serialization)
  alias(libs.plugins.buildconfig)
  alias(libs.plugins.detekt)

  `java-gradle-plugin`
  `maven-publish`
}

group = "com.emergetools"
version = libs.versions.emerge.gradle.plugin.get()


java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<KotlinCompile>().configureEach {
  compilerOptions {
    jvmTarget.set(JvmTarget.JVM_11)
  }
}

// This directory will contain one file per version of the Android Gradle Plugin that we wish to test against.
val agpClasspathDir = project.layout.buildDirectory.dir("agp-classpath")

val kgpClasspathDir = project.layout.buildDirectory.dir("kgp-classpath")

// Versions prior to 7.0.0 do not have an official API, supporting them would require considerably more work.
// ATTENTION: Must be kept in sync with the EmergeGradleRunner list.
val supportedAgpVersions =
  setOf(
    "7.0.0",
    "7.1.0",
    "7.2.0",
    "7.3.0",
    "7.4.2",
    "8.0.0",
  )

val supportedKotlinVersions =
  setOf(
    "1.8.21",
  )
val writeSupportedVersionsFiles = tasks.register("writeSupportedVersionsFiles") {
  inputs.property("supportedAgpVersions", supportedAgpVersions)
  inputs.property("supportedKotlinVersion", supportedKotlinVersions)
  outputs.dirs(agpClasspathDir, kgpClasspathDir)
  // Creates a classpath file for each version of AGP we wish to test against. This allows the
  // functional tests to target a particular version using the GradleRunner.
  doLast {
    supportedAgpVersions.forEach { version ->
      val configuration = configurations.create("agp$version")
      dependencies.add(configuration.name, "com.android.tools.build:gradle:$version")
      val classpathFile =
        agpClasspathDir.get().asFile.resolve("agp-classpath-$version.txt")
      classpathFile.writeText(configuration.joinToString(separator = "\n"))
    }

    supportedKotlinVersions.forEach { version ->
      val configuration = configurations.create("kgp$version")
      dependencies.add(configuration.name, "org.jetbrains.kotlin:kotlin-gradle-plugin:$version")
      val classpathFile =
        kgpClasspathDir.get().asFile.resolve("kgp-classpath-$version.txt")
      classpathFile.writeText(configuration.joinToString(separator = "\n"))
    }
  }
}

val functionalTest: SourceSet by sourceSets.creating {
  // The classpath files are added as resources so that the test code can access them.
  resources {
    srcDir(writeSupportedVersionsFiles)
  }
}

val functionalTestTask =
  tasks.register<Test>("functionalTest") {
    description = "Runs the functional tests."
    group = "verification"
    testClassesDirs = functionalTest.output.classesDirs
    classpath = functionalTest.runtimeClasspath
  }

tasks.check {
  dependsOn(functionalTestTask, tasks.validatePlugins)
}

val perfProjectTemplateResDir = project.layout.buildDirectory.dir("generated/performance-project-template/")

val packagePerformanceProjectTemplateTask =
  tasks.register<Zip>("packagePerformanceProjectTemplate") {
    archiveFileName.set("performance-project-template.zip")
    from(project.layout.projectDirectory.dir("performance-project-template"))
    destinationDirectory.set(perfProjectTemplateResDir.map { it.dir("emergetools") })
  }

java.sourceSets.main {
  resources.srcDir(packagePerformanceProjectTemplateTask.map { it.destinationDirectory.get().asFile.parentFile })
}

detekt {
  buildUponDefaultConfig = true
  config.setFrom(rootProject.layout.projectDirectory.file("../detekt/detekt.yml"))
  baseline = rootProject.layout.projectDirectory.file("detekt/baseline.xml").asFile
}

dependencies {
  compileOnly(gradleApi())
  compileOnly(libs.android.gradle.plugin)
  compileOnly(libs.kotlin.gradle.plugin)

  implementation(libs.asm)
  implementation(libs.asm.commons)
  implementation(libs.dexlib2)
  // Needed for the GradleRunner in the functional tests. We've had issues with the version of Guava
  // from one dependency conflicting with that of dexlib2, so we'll use the same version here.
  implementation(libs.guava)
  implementation(libs.kotlinx.datetime)
  implementation(libs.kotlinx.serialization)
  implementation(libs.okhttp)

  testImplementation(libs.google.truth)
  testImplementation(libs.junit)
  testImplementation(libs.junit.jupiter)
  testImplementation(libs.junit.jupiter.api)
  testRuntimeOnly(libs.junit.jupiter.engine)
  testRuntimeOnly(libs.junit.platform.launcher)

  "functionalTestImplementation"(project(":plugin"))
  "functionalTestImplementation"(libs.junit.jupiter.api)
  "functionalTestImplementation"(libs.okhttp.mockwebserver)
  "functionalTestImplementation"(libs.kotlinx.serialization)
  "functionalTestRuntimeOnly"(libs.junit.jupiter.engine)

  detektPlugins(libs.detekt.formatting)
}

gradlePlugin {
  website = "https://docs.emergetools.com/docs/gradle-plugin"
  vcsUrl = "https://github.com/EmergeTools/emerge-android"
  plugins {
    register("com.emergetools.android") {
      id = "com.emergetools.android"
      displayName = "Emerge Gradle Plugin"
      description = "Gradle plugin for building and uploading an Android AAB/APK to Emerge."
      implementationClass = "com.emergetools.android.gradle.EmergePlugin"
      tags = listOf("emerge", "emergetools", "android", "upload")
    }
  }
  testSourceSets(functionalTest)
}

val emergeBaseUrl: String? by project

val baseUrl = emergeBaseUrl ?: "https://api.emergetools.com"
buildConfig {
  packageName("com.emergetools.android.gradle")
  useKotlinOutput()
  buildConfigField("String", "VERSION", """"${project.version}"""")
  buildConfigField("String", "EMERGE_BASE_URL", """"$baseUrl"""")
}

tasks.withType<Test> {
  useJUnitPlatform()
}

tasks.withType<ValidatePlugins>().configureEach {
  failOnWarning = true
  enableStricterValidation = true
}
