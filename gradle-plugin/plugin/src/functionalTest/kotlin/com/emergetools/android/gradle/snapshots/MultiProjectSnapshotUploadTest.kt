package com.emergetools.android.gradle.snapshots

import com.emergetools.android.gradle.EmergePluginTest
import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import org.junit.jupiter.api.Test

class MultiProjectSnapshotUploadTest : EmergePluginTest() {

  @Test
  fun multiProjectUploadSnapshotBundle() {
    EmergeGradleRunner.create("multi-project")
      .withArguments("emergeUploadSnapshotBundleDebug")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":app:emergeUploadSnapshotBundleDebug")
      }
      .build()
  }

  @Test
  fun multiProjectUploadSnapshotBundle_AGP_7_2_0() {
    EmergeGradleRunner.create("multi-project-agp-7.2.0")
      .withAndroidGradlePluginVersion("7.2.0")
      .withGradleVersion("7.5.1")
      .withArguments("emergeUploadSnapshotBundleDebug")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":app:emergeUploadSnapshotBundleDebug")
      }
      .build()
  }
}
