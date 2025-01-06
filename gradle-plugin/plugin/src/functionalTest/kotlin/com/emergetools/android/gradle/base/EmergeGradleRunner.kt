package com.emergetools.android.gradle.base

import com.emergetools.android.gradle.EmergePluginTest
import okhttp3.HttpUrl
import okhttp3.mockwebserver.MockWebServer
import org.gradle.internal.impldep.com.google.common.io.Files
import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import org.gradle.util.internal.VersionNumber
import java.io.File

/**
 * One instance per build.
 */
class EmergeGradleRunner private constructor(
  private val projectDir: String,
  private val server: MockWebServer = MockWebServer(),
) {

  companion object {

    /** Must be kept in sync with the build.gradle list. */
    val SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSIONS = sortedSetOf(
      "7.0.0",
      "7.1.0",
      "7.2.0",
      "7.3.0",
      "8.0.0"
    )

    val SUPPORTED_KOTLIN_ANDROID_GRADLE_PLUGIN_VERSIONS = sortedSetOf(
      "1.8.21",
    )

    fun create(projectDir: String): EmergeGradleRunner = EmergeGradleRunner(projectDir)
  }

  private val gradleRunner = GradleRunner.create()

  private val baseUrl: HttpUrl
    get() = server.url("/") // Starts the server

  private var androidGradlePluginVersion = SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSIONS.last()

  private var kotlinAndroidGradlePluginVersion =
    SUPPORTED_KOTLIN_ANDROID_GRADLE_PLUGIN_VERSIONS.last()

  var tempProjectDir: File? = null

  private var arguments: List<String> = emptyList()

  private var assertions: ((BuildResult, MockWebServer) -> Unit)? = null

  private var environment: Map<String, String> = emptyMap()

  fun withArguments(vararg arguments: String) = apply {
    this.arguments = arguments.toList()
  }

  fun withDebugTasks() = apply {
    arguments = arguments + "-PemergeDebug"
  }

  fun withGradleVersion(version: String) = apply {
    gradleRunner.withGradleVersion(version)
  }

  fun withAndroidGradlePluginVersion(version: String) = apply {
    check(version in SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSIONS) {
      "This version of the Android Gradle Plugin is not currently supported."
    }
    androidGradlePluginVersion = version
  }

  private fun withJavaVersion(version: String) = apply {
    // Check if we are running on Github Actions and find appropriate JAVA_HOME accordingly
    if (System.getenv("GITHUB_ACTIONS") == "true") {
      val arch = if (System.getProperty("os.arch") == "aarch64") "aarch64" else "X64"
      val javaHomeEnvKey = "JAVA_HOME_${version}_$arch"
      arguments = arguments + "-Dorg.gradle.java.home=${System.getenv(javaHomeEnvKey)}"
    }
  }

  fun withServer(serverReceiver: MockWebServer.(HttpUrl) -> Unit) = apply {
    server.apply { serverReceiver(baseUrl) }
  }

  fun assert(assertions: (BuildResult, MockWebServer) -> Unit) = apply {
    this.assertions = assertions
  }

  fun withEnvironment(vararg pairs: Pair<String, String>) = apply {
    this.environment = mapOf(*pairs)
  }

  private fun preBuild() {
    @Suppress("DEPRECATION")
    tempProjectDir = Files.createTempDir()
    testProjectDir(projectDir).copyRecursively(tempProjectDir!!)

    // The plugin will use the mock webserver URL rather than the real API host
    arguments = arguments + "-PbaseUrl=$baseUrl"
    arguments = arguments + "-Pandroid.useAndroidX=true"
    arguments = arguments + "--stacktrace"

    if (VersionNumber.parse(androidGradlePluginVersion).major >= 8) {
      withJavaVersion("17")
    } else {
      withJavaVersion("11")
    }

    val customEnvironment = mapOf(
      *environment.toList().toTypedArray(),
      // Turns off repository discovery to test projects that don't use Git
      "GIT_DIR" to tempProjectDir!!.path,
    )
    gradleRunner
      .withProjectDir(tempProjectDir)
      .withArguments(arguments)
      .withEnvironment(System.getenv() + customEnvironment)
      // Must be called first in order to set the default plugin classpath.
      .withPluginClasspath()
      .withPluginClasspath(
        gradleRunner.pluginClasspath
          + androidGradlePluginClasspath(androidGradlePluginVersion)
          + kotlinAndroidGradlePluginClasspath(kotlinAndroidGradlePluginVersion)
      )
  }

  private fun androidGradlePluginClasspath(version: String): List<File> {
    val resource = EmergePluginTest::class.java.getResource("/agp-classpath-$version.txt")
    check(resource != null) {
      "There is no Android Gradle Plugin classpath resource for version $version"
    }
    return File(resource.file)
      .readLines()
      .map { File(it) }
  }

  private fun kotlinAndroidGradlePluginClasspath(version: String): List<File> {
    val resource = EmergePluginTest::class.java.getResource("/kgp-classpath-$version.txt")
    check(resource != null) {
      "There is no Kotlin Android Gradle Plugin classpath resource for version $version"
    }
    return File(resource.file)
      .readLines()
      .map { File(it) }
  }

  private fun testProjectDir(name: String): File {
    val resource = EmergePluginTest::class.java.getResource("/gradle-project-dirs/$name")
    check(resource != null) {
      "There is no Gradle project directory named \"$name\""
    }
    return File(resource.file)
  }

  private fun postBuild() {
    server.shutdown()

    tempProjectDir?.delete()
    tempProjectDir = null
  }

  private fun gradleRunnerBuild(buildReceiver: GradleRunner.() -> BuildResult): BuildResult {
    preBuild()
    val result = gradleRunner.buildReceiver()
    assertions?.invoke(result, server)
    postBuild()
    return result
  }

  fun build(): BuildResult {
    return gradleRunnerBuild { build() }
  }

  fun buildAndFail(): BuildResult {
    return gradleRunnerBuild { buildAndFail() }
  }
}
