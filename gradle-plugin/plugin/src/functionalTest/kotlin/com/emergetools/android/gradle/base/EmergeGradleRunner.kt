package com.emergetools.android.gradle.base

import com.autonomousapps.kit.GradleBuilder
import com.emergetools.android.gradle.EmergePluginTest
import okhttp3.HttpUrl
import okhttp3.mockwebserver.MockWebServer
import org.gradle.internal.impldep.com.google.common.io.Files
import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import org.gradle.util.GradleVersion
import java.io.File

/**
 * One instance per build.
 */
@Deprecated("Use EmergeGradleRunner2 instead")
class EmergeGradleRunner private constructor(
  private val projectDir: String,
) {
  companion object {
    /** Must be kept in sync with the build.gradle list. */
    val SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSIONS =
      sortedSetOf(
        "8.0.0",
      )


    val SUPPORTED_KOTLIN_ANDROID_GRADLE_PLUGIN_VERSIONS =
      sortedSetOf(
        "1.8.21",
      )

    fun create(projectDir: String): EmergeGradleRunner = EmergeGradleRunner(projectDir)
  }

  private val server: MockWebServer = MockWebServer()

  private val baseUrl: HttpUrl
    get() = server.url("/") // Starts the server

  private var androidGradlePluginVersion = SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSIONS.last()

  private var kotlinAndroidGradlePluginVersion =
    SUPPORTED_KOTLIN_ANDROID_GRADLE_PLUGIN_VERSIONS.last()

  var tempProjectDir: File? = null

  private var arguments: List<String> = emptyList()

  private var assertions: ((BuildResult, MockWebServer) -> Unit)? = null

  private var environment: Map<String, String> = emptyMap()

  private var gradleVersion: GradleVersion? = null

  private var withDebug = false

  fun withArguments(vararg arguments: String) =
    apply {
      this.arguments = arguments.toList()
    }

  fun withServer(serverReceiver: MockWebServer.(HttpUrl) -> Unit) =
    apply {
      server.apply { serverReceiver(baseUrl) }
    }

  fun assert(assertions: (BuildResult, MockWebServer) -> Unit) =
    apply {
      this.assertions = assertions
    }

  private fun preBuild(): GradleRunner {
    @Suppress("DEPRECATION")
    tempProjectDir = Files.createTempDir()
    testProjectDir(projectDir).copyRecursively(tempProjectDir!!)

    // The plugin will use the mock webserver URL rather than the real API host
    arguments = arguments + "-PbaseUrl=$baseUrl"
    arguments = arguments + "-Pandroid.useAndroidX=true"
    arguments = arguments + "--stacktrace"

    val customEnvironment =
      mapOf(
        *environment.toList().toTypedArray(),
        // Turns off repository discovery to test projects that don't use Git
        "GIT_DIR" to tempProjectDir!!.path,
      )
    if (gradleVersion == null) {
      gradleVersion = GradleVersion.current()
    }
    val runner = GradleBuilder.runner(gradleVersion!!, tempProjectDir!!)
    return runner
      .withDebug(withDebug)
      .withArguments(arguments)
      .withEnvironment(System.getenv() + customEnvironment)
      // Must be called first in order to set the default plugin classpath.
      .withPluginClasspath()
      .withPluginClasspath(
        runner.pluginClasspath +
          androidGradlePluginClasspath(androidGradlePluginVersion) +
          kotlinAndroidGradlePluginClasspath(kotlinAndroidGradlePluginVersion),
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
    // TODO we need to shutdown the server and delete the temp dir even if the test fails
    server.shutdown()

    tempProjectDir?.delete()
    tempProjectDir = null
  }

  private fun gradleRunnerBuild(buildReceiver: GradleRunner.() -> BuildResult): BuildResult {
    val result = preBuild().buildReceiver()
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
