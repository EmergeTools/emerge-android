package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SingleProjectPerfNotSetupEmergePluginTest : EmergePluginTest() {

  @Test
  fun singleProjectPerfNotSetupUpload() {
    EmergeGradleRunner.create("single-project-perf-not-setup")
      .withArguments("emergeUploadReleaseAab")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":app:emergeUploadReleaseAab")
      }
      .build()
  }

  @Test
  fun singleProjectPerfNotSetupGeneratePerformanceProjectSucceeds() {
    EmergeGradleRunner.create("single-project-perf-not-setup")
      .withArguments("emergeGeneratePerformanceProject", "--package", "com.test.performance")
      .withDefaultServer()
      .assert { result, _ ->
        result.assertSuccessfulTask(":emergeGeneratePerformanceProject")
      }
      .build()
  }

  @Test
  fun singleProjectPerfNotSetupUploadPerfBundle() {
    EmergeGradleRunner.create("single-project-perf-not-setup")
      .withArguments("emergeUploadReleasePerfBundle")
      .withDefaultServer()
      .assert { result, _ ->
        assertTrue(
          result.output.contains("Task 'emergeUploadReleasePerfBundle' not found")
        )
      }
      .buildAndFail()
  }

  @Test
  fun singleProjectPerfNotSetupGeneratePerformanceProjectFailsWithoutPackageName() {
    EmergeGradleRunner.create("single-project-perf-not-setup")
      .withArguments("emergeGeneratePerformanceProject")
      .withDefaultServer()
      .assert { result, _ ->
        println("result.output: ${result.output}")
        assertTrue(
          result.output.contains(
            "Package name is missing. Make sure to pass the --package command line argument."
          )
        )
      }
      .buildAndFail()
  }
}
