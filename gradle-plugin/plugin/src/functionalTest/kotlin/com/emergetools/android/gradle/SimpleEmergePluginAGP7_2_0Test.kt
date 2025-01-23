package com.emergetools.android.gradle

import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.base.EmergeGradleRunner.Companion.LATEST_AGP_7_VERSION
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import org.junit.jupiter.api.Test

@Suppress("ClassName")
class SimpleEmergePluginAGP7_2_0Test : EmergePluginTest() {
  @Test
  fun simpleBundle() {
    EmergeGradleRunner.create("simple-agp-7.2.0")
      .withAndroidGradlePluginVersion(LATEST_AGP_7_VERSION)
      .withGradleVersion("7.5.1")
      .withArguments("emergeUploadReleaseAab")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseAab")
      }
      .build()
  }

  @Test
  fun simpleBundleTimeout() {
    val result =
      EmergeGradleRunner.create("simple-agp-7.2.0")
        .withAndroidGradlePluginVersion(LATEST_AGP_7_VERSION)
        .withGradleVersion("7.5.1")
        .withArguments("emergeUploadReleaseAab")
        .withDefaultServer(true)
        .buildAndFail()
    result.assertFailedTask(":emergeUploadReleaseAab")
  }

  @Test
  fun simpleAssemble() {
    EmergeGradleRunner.create("simple-agp-7.2.0")
      .withAndroidGradlePluginVersion(LATEST_AGP_7_VERSION)
      .withGradleVersion("7.5.1")
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
    val result =
      EmergeGradleRunner.create("simple-agp-7.2.0")
        .withAndroidGradlePluginVersion(LATEST_AGP_7_VERSION)
        .withGradleVersion("7.5.1")
        .withArguments("emergeUploadReleaseApk")
        .withDefaultServer(true)
        .buildAndFail()
    result.assertFailedTask(":emergeUploadReleaseApk")
  }

  @Test
  fun twoBuildTypesBundle() {
    EmergeGradleRunner.create("simple-agp-7.2.0")
      .withAndroidGradlePluginVersion(LATEST_AGP_7_VERSION)
      .withGradleVersion("7.5.1")
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
    EmergeGradleRunner.create("simple-agp-7.2.0")
      .withAndroidGradlePluginVersion(LATEST_AGP_7_VERSION)
      .withGradleVersion("7.5.1")
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
    val result =
      EmergeGradleRunner.create("simple-agp-7.2.0")
        .withAndroidGradlePluginVersion(LATEST_AGP_7_VERSION)
        .withGradleVersion("7.5.1")
        .withArguments("signReleaseBundle")
        .build()
    result.assertSuccessfulTask(":signReleaseBundle")
  }

  @Test
  fun androidTasksRunAssemble() {
    val result =
      EmergeGradleRunner.create("simple-agp-7.2.0")
        .withAndroidGradlePluginVersion(LATEST_AGP_7_VERSION)
        .withGradleVersion("7.5.1")
        .withArguments("packageRelease")
        .build()
    result.assertSuccessfulTask(":packageRelease")
  }
}
