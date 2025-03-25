package com.emergetools.android.gradle.score

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.EmergePluginTest
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.projects.SimpleGradleProject
import org.junit.jupiter.api.Test

class EmergeScoreTest : EmergePluginTest() {

  @Test
  fun emergeScoreTestWithEmergeGradlePlugin() {
    val simpleProject = SimpleGradleProject.createWithVcsInExtension(this)
    val result = EmergeGradleRunner2(simpleProject.gradleProject.rootDir)
      .withArguments("emergeScoreRelease")
      .build()

    assertThat(result).task(":app:emergeScoreRelease").succeeded()
  }

  @Test
  fun emergeScoreTestWithScorePlugin() {
    val simpleProject = SimpleGradleProject.createWithVcsInExtension(this, pluginId = "com.emergetools.score")
    val result = EmergeGradleRunner2(simpleProject.gradleProject.rootDir)
      .withArguments("emergeScoreRelease")
      .build()

    assertThat(result).task(":app:emergeScoreRelease").succeeded()
  }
}
