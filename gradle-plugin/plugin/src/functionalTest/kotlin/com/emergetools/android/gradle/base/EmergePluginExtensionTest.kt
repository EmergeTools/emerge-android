package com.emergetools.android.gradle.base

import com.emergetools.android.gradle.EmergePluginTest
import org.junit.jupiter.api.Test

class EmergePluginExtensionTest : EmergePluginTest() {
  @Test
  fun noApiTokenBundle() {
    EmergeGradleRunner.create("no-api-token")
      .withArguments("emergeUploadReleaseAab")
      .withDefaultServer()
      .buildAndFail()
      .assertFailedTask(":emergeUploadReleaseAab")
  }

  @Test
  fun noApiTokenAssemble() {
    EmergeGradleRunner.create("no-api-token")
      .withArguments("emergeUploadReleaseApk")
      .withDefaultServer()
      .buildAndFail()
      .assertFailedTask(":emergeUploadReleaseApk")
  }
}
