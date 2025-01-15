package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import org.junit.jupiter.api.Test

class VariantsEmergePluginTest : EmergePluginTest() {
  @Test
  fun customBuildTypeBundle() {
    EmergeGradleRunner.create("custom-build-type")
      .withArguments("emergeUploadStagingAab")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadStagingAab")
      }
      .build()
  }

  @Test
  fun customBuildTypeAssemble() {
    EmergeGradleRunner.create("custom-build-type")
      .withArguments("emergeUploadStagingApk")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadStagingApk")
      }
      .build()
  }

  @Test
  fun flavorsBundle() {
    EmergeGradleRunner.create("flavors")
      .withArguments("emergeUploadMinApi24FullDebugAab", "emergeUploadMinApi21DemoReleaseApk")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadMinApi24FullDebugAab")
        result.assertSuccessfulTask(":emergeUploadMinApi21DemoReleaseApk")
      }
      .build()
  }

  @Test
  fun flavorsAssemble() {
    EmergeGradleRunner.create("flavors")
      .withArguments("emergeUploadMinApi24FullDebugApk", "emergeUploadMinApi21DemoReleaseApk")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadMinApi24FullDebugApk")
        result.assertSuccessfulTask(":emergeUploadMinApi21DemoReleaseApk")
      }
      .build()
  }
}
