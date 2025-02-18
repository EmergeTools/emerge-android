package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth
import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import org.junit.jupiter.api.Test

class ConfigurationCacheTest : EmergePluginTest() {
  @Test
  fun simpleConfigurationCache() {
    EmergeGradleRunner.create("simple")
      .withArguments("tasks", "--configuration-cache")
      .assert { result, _ ->
        result.assertSuccessfulTask(":tasks")
      }
      .build()
  }

  @Test
  fun simpleConfigurationCacheUpload() {
    EmergeGradleRunner.create("simple")
      .withArguments("emergeUploadReleaseAab", "--configuration-cache")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseAab")
      }
      .build()
  }

  @Test
  fun multiProjectConfigurationCache() {
    EmergeGradleRunner.create("multi-project")
      .withArguments(":app:tasks", "--configuration-cache")
      .assert { result, _ ->
        result.assertSuccessfulTask(":app:tasks")
      }
      .build()
  }

  @Test
  fun multiProjectConfigurationCachePerfBundle() {
    EmergeGradleRunner.create("multi-project")
      .withArguments("emergeUploadReleasePerfBundle", "--configuration-cache")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":app:emergeUploadReleasePerfBundle")
      }
      .build()
  }
}
