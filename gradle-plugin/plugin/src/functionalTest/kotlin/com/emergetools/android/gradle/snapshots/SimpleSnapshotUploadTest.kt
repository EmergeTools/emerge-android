package com.emergetools.android.gradle.snapshots

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.EmergePluginTest
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.SimpleGradleProject
import org.junit.jupiter.api.Test

class SimpleSnapshotUploadTest : EmergePluginTest() {
  @Test
  fun simpleUploadSnapshotBundle() {
    val project = SimpleGradleProject.createWithVcsInExtension(this)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadSnapshotBundleDebug")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(result).task(":app:emergeUploadSnapshotBundleDebug").succeeded()
  }
}
