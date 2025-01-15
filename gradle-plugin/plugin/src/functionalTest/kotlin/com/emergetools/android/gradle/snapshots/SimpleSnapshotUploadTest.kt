package com.emergetools.android.gradle.snapshots

import com.emergetools.android.gradle.EmergePluginTest
import com.emergetools.android.gradle.base.EmergeGradleRunner
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
    EmergeGradleRunner.create("simple-agp-7.2.0")
      .withAndroidGradlePluginVersion("7.2.0")
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
