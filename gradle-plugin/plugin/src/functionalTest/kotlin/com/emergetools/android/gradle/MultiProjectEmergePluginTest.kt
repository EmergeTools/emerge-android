package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MultiProjectEmergePluginTest : EmergePluginTest() {

  @Test
  fun multiProjectUpload() {
    EmergeGradleRunner.create("multi-project")
      .withArguments("emergeUploadReleaseAab")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":app:emergeUploadReleaseAab")
      }
      .build()
  }

  @Test
  fun multiProjectUploadPerfBundle() {
    EmergeGradleRunner.create("multi-project")
      .withArguments("emergeUploadReleasePerfBundle")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleasePerfBundle")
      }
      .build()
  }

  @Test
  fun multiProjectGeneratePerformanceProjectMissing() {
    EmergeGradleRunner.create("multi-project")
      .withArguments("emergeGeneratePerformanceProject")
      .withDefaultServer()
      .assert { result, _ ->
        assertTrue(
          result.output.contains(
            "Task 'emergeGeneratePerformanceProject' not found in root project 'Test'"
          )
        )
      }
      .buildAndFail()
  }
}
