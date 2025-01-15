package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

@Suppress("ClassName")
class MultiProjectEmergePluginAGP7_2_0Test : EmergePluginTest() {
  @Test
  fun multiProjectUpload() {
    EmergeGradleRunner.create("multi-project-agp-7.2.0")
      .withAndroidGradlePluginVersion("7.2.0")
      .withGradleVersion("7.5.1")
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
    EmergeGradleRunner.create("multi-project-agp-7.2.0")
      .withAndroidGradlePluginVersion("7.2.0")
      .withGradleVersion("7.5.1")
      .withArguments("emergeUploadReleasePerfBundle")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":app:emergeUploadReleasePerfBundle")
      }
      .build()
  }

  @Test
  fun multiProjectGeneratePerformanceProjectMissing() {
    EmergeGradleRunner.create("multi-project-agp-7.2.0")
      .withAndroidGradlePluginVersion("7.2.0")
      .withGradleVersion("7.5.1")
      .withArguments(":app:emergeGeneratePerformanceProject")
      .withDefaultServer()
      .assert { result, _ ->
        assertTrue(
          result.output.contains(
            "Task 'emergeGeneratePerformanceProject' not found in project ':app'",
          ),
        )
      }
      .buildAndFail()
  }
}
