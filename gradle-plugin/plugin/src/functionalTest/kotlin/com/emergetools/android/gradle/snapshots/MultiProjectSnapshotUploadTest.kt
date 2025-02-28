package com.emergetools.android.gradle.snapshots

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.EmergePluginTest
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.MultiProjectProject
import org.junit.jupiter.api.Test

class MultiProjectSnapshotUploadTest : EmergePluginTest() {
  @Test
  fun multiProjectUploadSnapshotBundle() {
    val project = MultiProjectProject.create(this)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadSnapshotBundleDebug")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(result).task(":app:emergeUploadSnapshotBundleDebug").succeeded()
  }
}
