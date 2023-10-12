package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MultiProjectFlavorsBuildTypesEmergePluginTest : EmergePluginTest() {

  @Test
  fun multiProjectUpload() {
    EmergeGradleRunner.create("multi-project-with-flavors-buildtypes")
      .withArguments("emergeUploadMinApi24DemoStagingAab")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":app:emergeUploadMinApi24DemoStagingAab")
      }
      .build()
  }

  @Test
  fun multiProjectUploadPerfBundle() {
    EmergeGradleRunner.create("multi-project-with-flavors-buildtypes")
      .withArguments("emergeUploadMinApi21FullReleasePerfBundle")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":app:emergeUploadMinApi21FullReleasePerfBundle")
      }
      .build()
  }

  @Test
  fun multiProjectGeneratePerformanceProjectMissing() {
    EmergeGradleRunner.create("multi-project-with-flavors-buildtypes")
      .withArguments(":app:emergeGeneratePerformanceProject")
      .withDefaultServer()
      .assert { result, _ ->
        assertTrue(
          result.output.contains(
            "task 'emergeGeneratePerformanceProject' not found in project ':app'"
          )
        )
      }
      .buildAndFail()
  }
}
