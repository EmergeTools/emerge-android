package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.base.EmergeGradleRunner.Companion.LATEST_AGP_7_VERSION
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.tasks.internal.SaveExtensionConfigTask.Companion.EmergePluginExtensionData
import com.emergetools.android.gradle.utils.EnvUtils.withGitHubPREvent
import junit.framework.TestCase.assertEquals
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import org.junit.jupiter.api.Test
import java.io.File

class SimpleEmergePluginTest : EmergePluginTest() {
  @Test
  fun simpleBundle() {
    EmergeGradleRunner.create("simple")
      .withArguments("emergeUploadReleaseAab")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseAab")
      }
      .build()
  }

  @Test
  fun simpleBundleAgp7_3_0() {
    EmergeGradleRunner.create("simple")
      .withArguments("emergeUploadReleaseAab")
      .withDefaultServer()
      .withAndroidGradlePluginVersion(LATEST_AGP_7_VERSION)
      .withGradleVersion("7.5.1")
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseAab")
      }
      .build()
  }

  @Test
  fun simpleBundleTimeout() {
    val result =
      EmergeGradleRunner.create("simple")
        .withArguments("emergeUploadReleaseAab")
        .withDefaultServer(true)
        .buildAndFail()
    result.assertFailedTask(":emergeUploadReleaseAab")
  }

  @Test
  fun simpleAssemble() {
    EmergeGradleRunner.create("simple")
      .withArguments("emergeUploadReleaseApk")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseApk")
      }
      .build()
  }

  @Test
  fun simpleAssembleTimeout() {
    val result =
      EmergeGradleRunner.create("simple")
        .withArguments("emergeUploadReleaseApk")
        .withDefaultServer(true)
        .buildAndFail()
    result.assertFailedTask(":emergeUploadReleaseApk")
  }

  @Test
  fun twoBuildTypesBundle() {
    EmergeGradleRunner.create("simple")
      .withArguments("emergeUploadReleaseAab")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseAab")
      }
      .build()
  }

  @Test
  fun twoBuildTypesAssemble() {
    EmergeGradleRunner.create("simple")
      .withArguments("emergeUploadReleaseApk")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseApk")
      }
      .build()
  }

  @Test
  fun androidTasksRunBundle() {
    val result =
      EmergeGradleRunner.create("simple")
        .withArguments("packageReleaseBundle", "signReleaseBundle")
        .build()
    result.assertSuccessfulTask(":packageReleaseBundle")
    result.assertSuccessfulTask(":signReleaseBundle")
  }

  @Test
  fun androidTasksRunAssemble() {
    val result =
      EmergeGradleRunner.create("simple")
        .withArguments("packageRelease")
        .build()
    result.assertSuccessfulTask(":packageRelease")
  }

  @Test
  fun `Assert explicit sha overwrites GitHub convention sha`() {
    val runner = EmergeGradleRunner.create("simple")
    val configurationJson = File(runner.tempProjectDir, "emerge_config.json")

    runner
      .withArguments("saveExtensionConfig", "--outputPath", configurationJson.path)
      .withDebugTasks()
      .withGitHubPREvent()
      .assert { result, _ ->
        result.assertSuccessfulTask(":saveExtensionConfig")
      }
      .build()

    val configuration =
      Json.decodeFromStream<EmergePluginExtensionData>(
        configurationJson.inputStream(),
      )

    assertEquals("testSha", configuration.vcsOptions!!.sha)
    assertEquals("testBaseSha", configuration.vcsOptions!!.baseSha)
    assertEquals("testPreviousSha", configuration.vcsOptions!!.previousSha)
  }
}
