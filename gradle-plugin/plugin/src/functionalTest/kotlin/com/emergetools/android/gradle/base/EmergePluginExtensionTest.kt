package com.emergetools.android.gradle.base

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.EmergePluginTest
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.SimpleGradleProject
import org.junit.jupiter.api.Test

class EmergePluginExtensionTest : EmergePluginTest() {
  @Test
  fun noApiTokenBundle() {
    val project = SimpleGradleProject.createWithExtension(this, extension = "")
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseAab")
      .buildAndFail()
    assertThat(result).task(":app:emergeUploadReleaseAab").failed()
  }

  @Test
  fun noApiTokenAssemble() {
    val project = SimpleGradleProject.createWithExtension(this, extension = "")
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseApk")
      .buildAndFail()
    assertThat(result).task(":app:emergeUploadReleaseApk").failed()
  }
}
