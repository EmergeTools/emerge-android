package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.tasks.internal.SaveExtensionConfigTask.Companion.EmergePluginExtensionData
import com.emergetools.android.gradle.utils.EnvUtils.withGitHubPREvent
import com.emergetools.android.gradle.utils.EnvUtils.withGitHubPushEvent
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.jupiter.api.Test
import java.io.File

class NoVcsEmergePluginTest : EmergePluginTest() {
  @Test
  fun noVcsBundle() {
    EmergeGradleRunner.create("no-vcs-params")
      .withArguments("emergeUploadReleaseAab")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseAab")
      }
  }

  @Test
  fun noVcsAssemble() {
    EmergeGradleRunner.create("no-vcs-params")
      .withArguments("emergeUploadReleaseApk")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseApk")
      }
  }

  @Test
  fun twoBuildTypesBundle() {
    EmergeGradleRunner.create("no-vcs-params")
      .withArguments("emergeUploadReleaseAab")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseAab")
      }
  }

  @Test
  fun twoBuildTypesAssemble() {
    EmergeGradleRunner.create("no-vcs-params")
      .withArguments("emergeUploadReleaseApk")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseApk")
      }
  }

  @Test
  fun androidTasksRunBundle() {
    val result =
      EmergeGradleRunner.create("no-vcs-params")
        .withArguments("packageReleaseBundle", "signReleaseBundle")
        .build()
    result.assertSuccessfulTask(":packageReleaseBundle")
    result.assertSuccessfulTask(":signReleaseBundle")
  }

  @Test
  fun androidTasksRunAssemble() {
    val result =
      EmergeGradleRunner.create("no-vcs-params")
        .withArguments("packageRelease")
        .build()
    result.assertSuccessfulTask(":packageRelease")
  }

  @Test
  fun `Assert GitHub PR sha overwrites sha`() {
    val runner = EmergeGradleRunner.create("no-vcs-params")
    val configurationJson = File(runner.tempProjectDir, "emerge_config.json")

    runner
      .withArguments(
        "saveExtensionConfig",
        "--outputPath",
        configurationJson.path,
      )
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

    assertEquals("github_head_sha", configuration.vcsOptions!!.sha)
    assertEquals("github_base_sha", configuration.vcsOptions!!.baseSha)
    assertEquals(null, configuration.vcsOptions!!.previousSha)
    assertEquals("123", configuration.vcsOptions!!.prNumber)
  }

  @Test
  fun `Assert GitHub push env sha overwrites sha`() {
    val runner = EmergeGradleRunner.create("no-vcs-params")
    val configurationJson = File(runner.tempProjectDir, "emerge_config.json")

    runner
      .withArguments(
        "saveExtensionConfig",
        "--outputPath",
        configurationJson.path,
      )
      .withDebugTasks()
      .withGitHubPushEvent()
      .assert { result, _ ->
        result.assertSuccessfulTask(":saveExtensionConfig")
      }
      .build()

    val configuration =
      Json.decodeFromStream<EmergePluginExtensionData>(
        configurationJson.inputStream(),
      )

    assertEquals("github_env_sha", configuration.vcsOptions!!.sha)
    assertEquals("github_previous_sha", configuration.vcsOptions!!.previousSha)
    // BaseSha not set by default
    assertNull(configuration.vcsOptions!!.baseSha)
  }
}
