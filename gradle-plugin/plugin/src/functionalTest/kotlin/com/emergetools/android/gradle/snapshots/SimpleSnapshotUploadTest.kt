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
}
