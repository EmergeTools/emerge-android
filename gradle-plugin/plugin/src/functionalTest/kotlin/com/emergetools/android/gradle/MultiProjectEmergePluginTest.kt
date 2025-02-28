package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.MultiProjectProject
import org.junit.jupiter.api.Test

class MultiProjectEmergePluginTest : EmergePluginTest() {
  @Test
  fun multiProjectUpload() {
    val project = MultiProjectProject.create(this)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseAab")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(result).task(":app:emergeUploadReleaseAab").succeeded()
  }

  @Test
  fun multiProjectUploadPerfBundle() {
    val project = MultiProjectProject.create(this)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleasePerfBundle")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(result).task(":app:emergeUploadReleasePerfBundle").succeeded()
  }

  @Test
  fun multiProjectGeneratePerformanceProjectMissing() {
    val project = MultiProjectProject.create(this)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments(":app:emergeGeneratePerformanceProject")
      .buildAndFail()

    assertThat(result).output().contains("task 'emergeGeneratePerformanceProject' not found in project ':app'")
  }
}
