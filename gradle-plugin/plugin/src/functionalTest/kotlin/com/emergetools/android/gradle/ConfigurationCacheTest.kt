package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.MultiProjectProject
import com.emergetools.android.gradle.projects.SimpleGradleProject
import org.junit.jupiter.api.Test

class ConfigurationCacheTest : EmergePluginTest() {
  @Test
  fun simpleConfigurationCache() {
    val project = SimpleGradleProject.createWithVcsInExtension(this)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("tasks", "--configuration-cache")
      .build()

    assertThat(result).task(":tasks").succeeded()
  }

  @Test
  fun simpleConfigurationCacheUpload() {
    val project = SimpleGradleProject.createWithVcsInExtension(this)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseAab", "--configuration-cache")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(result).task(":app:emergeUploadReleaseAab").succeeded()
  }

  @Test
  fun multiProjectConfigurationCache() {
    val project = MultiProjectProject.create(this)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("tasks", "--configuration-cache")
      .build()

    assertThat(result).task(":tasks").succeeded()
  }

  @Test
  fun multiProjectConfigurationCachePerfBundle() {
    val project = MultiProjectProject.create(this)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleasePerfBundle", "--configuration-cache")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(result).task(":app:emergeUploadReleasePerfBundle").succeeded()
  }
}
