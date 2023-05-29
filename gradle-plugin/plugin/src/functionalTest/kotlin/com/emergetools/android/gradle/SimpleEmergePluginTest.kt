package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import org.junit.jupiter.api.Test

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
      .withAndroidGradlePluginVersion("7.3.0")
      .withGradleVersion("7.5.1")
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseAab")
      }
      .build()
  }

  @Test
  fun simpleBundleTimeout() {
    val result = EmergeGradleRunner.create("simple")
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
    val result = EmergeGradleRunner.create("simple")
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
    val result = EmergeGradleRunner.create("simple")
      .withArguments("packageReleaseBundle", "signReleaseBundle")
      .build()
    result.assertSuccessfulTask(":packageReleaseBundle")
    result.assertSuccessfulTask(":signReleaseBundle")
  }

  @Test
  fun androidTasksRunAssemble() {
    val result = EmergeGradleRunner.create("simple")
      .withArguments("packageRelease")
      .build()
    result.assertSuccessfulTask(":packageRelease")
  }
}
