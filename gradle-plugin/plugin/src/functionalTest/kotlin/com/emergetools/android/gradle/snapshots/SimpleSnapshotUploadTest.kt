package com.emergetools.android.gradle.snapshots

import com.emergetools.android.gradle.EmergePluginTest
import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.base.EmergeGradleRunner.Companion.LATEST_AGP_7_VERSION
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import org.junit.jupiter.api.Test

class SimpleSnapshotUploadTest : EmergePluginTest() {
  @Test
  fun simpleUploadSnapshotBundle() {
    EmergeGradleRunner.create("simple")
      .withArguments("emergeUploadSnapshotBundleDebug")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadSnapshotBundleDebug")
      }
      .build()
  }

  @Test
  fun simpleUploadSnapshotBundle_AGP_7_2_0() {
    EmergeGradleRunner.create("simple")
      .withAndroidGradlePluginVersion(LATEST_AGP_7_VERSION)
      .withGradleVersion("7.5.1")
      .withArguments("emergeUploadSnapshotBundleDebug")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadSnapshotBundleDebug")
      }
      .build()
  }
}
