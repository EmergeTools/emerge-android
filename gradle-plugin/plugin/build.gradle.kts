import com.gradleup.gr8.FilterTransform
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  alias(libs.plugins.gradle.publish)
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.kotlin.serialization)
  alias(libs.plugins.buildconfig)
  alias(libs.plugins.detekt)
  alias(libs.plugins.autonomousapps.testkit)
  alias(libs.plugins.gr8)
  alias(libs.plugins.vanniktech.publish)
  `java-gradle-plugin`
}

group = "com.emergetools"
version = libs.versions.emerge.gradle.plugin.get()


java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(17)
  }
  withJavadocJar()
  withSourcesJar()
}

tasks.withType<KotlinCompile>().configureEach {
  compilerOptions {
    jvmTarget.set(JvmTarget.JVM_17)
  }
}

tasks.check {
  dependsOn(tasks.validatePlugins)
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

gradleTestKitSupport {
  withSupportLibrary()
  withTruthLibrary()
}

val shadowedDependencies = configurations.create("shadowedDependencies")
val compileOnlyDependencies: Configuration = configurations.create("compileOnlyDependencies") {
  attributes {
    attribute(Usage.USAGE_ATTRIBUTE, project.objects.named<Usage>(Usage.JAVA_API))
  }
  attributes {
    attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, FilterTransform.artifactType)
  }
}

compileOnlyDependencies.extendsFrom(configurations.getByName("compileOnly"))

dependencies {
  compileOnly(gradleApi())
  compileOnly(libs.android.gradle.plugin)

  // Ideally we'd like to relocate asm but it causes errors with R8
  implementation(libs.asm)
  implementation(libs.asm.commons)

  add(shadowedDependencies.name, libs.develocity.agent.adapters)
  add(shadowedDependencies.name, libs.kotlinx.datetime)
  add(shadowedDependencies.name, libs.kotlinx.serialization)
  add(shadowedDependencies.name, libs.okhttp)

  testImplementation(platform(libs.junit5.bom))
  testImplementation(libs.google.truth)
  testImplementation(libs.junit5.jupiter)
  testRuntimeOnly(libs.junit5.platform.launcher)

  functionalTestImplementation(libs.okhttp.mockwebserver)
  functionalTestImplementation(platform(libs.junit5.bom))
  functionalTestImplementation(libs.junit5.jupiter)
  functionalTestImplementation(libs.google.truth)
  functionalTestRuntimeOnly(libs.junit5.platform.launcher)

  detektPlugins(libs.detekt.formatting)
}
val shadow = true // Disable for faster local build speeds
if (shadow) {
  gr8 {
    val shadowedJar = create("default") {
      addProgramJarsFrom(shadowedDependencies)
      addProgramJarsFrom(tasks.getByName("jar"))
      proguardFile("rules.pro")
      registerFilterTransform(listOf(".*/impldep/META-INF/versions/.*"))
      r8Version("9.0.28")
    }

    removeGradleApiFromApi()

    replaceOutgoingJar(shadowedJar)
  }
  configurations.getByName("compileOnly").extendsFrom(shadowedDependencies)
  configurations.getByName("testImplementation").extendsFrom(shadowedDependencies)
  configurations.getByName("functionalTestImplementation").extendsFrom(shadowedDependencies)
} else {
  configurations.getByName("implementation").extendsFrom(shadowedDependencies)
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
  testLogging {
    events("passed", "skipped", "failed")
  }
}

tasks.withType<ValidatePlugins>().configureEach {
  failOnWarning = true
  enableStricterValidation = true
}

mavenPublishing {
  pom {
    name.set("Emerge Gradle Plugin")
    description.set("Gradle plugin for building and uploading an Android AAB/APK to Emerge.")
  }
}

