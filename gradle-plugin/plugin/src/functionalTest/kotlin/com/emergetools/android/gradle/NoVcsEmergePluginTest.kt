package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import org.junit.jupiter.api.Test

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
    val result = EmergeGradleRunner.create("no-vcs-params")
      .withArguments("packageReleaseBundle", "signReleaseBundle")
      .build()
    result.assertSuccessfulTask(":packageReleaseBundle")
    result.assertSuccessfulTask(":signReleaseBundle")
  }

  @Test
  fun androidTasksRunAssemble() {
    val result = EmergeGradleRunner.create("no-vcs-params")
      .withArguments("packageRelease")
      .build()
    result.assertSuccessfulTask(":packageRelease")
  }
}
