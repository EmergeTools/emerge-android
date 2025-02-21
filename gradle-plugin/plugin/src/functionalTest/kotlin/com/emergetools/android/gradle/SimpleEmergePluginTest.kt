package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner.Companion.LATEST_AGP_7_VERSION
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.SimpleGradleProject
import org.gradle.util.GradleVersion
import org.junit.jupiter.api.Test

class SimpleEmergePluginTest : EmergePluginTest() {
  @Test
  fun simpleBundle() {
    val project = SimpleGradleProject.createWithVcsInExtension(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseAab")
      .withJavaVersionFromAgp(project.agpVersion)
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(runner).task(":app:emergeUploadReleaseAab").succeeded()
  }

  @Test
  fun simpleBundleAgp7_3_0() {
    val project = SimpleGradleProject.createWithVcsInExtension(this, LATEST_AGP_7_VERSION)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir, GradleVersion.version("7.5.1"))
      .withArguments("emergeUploadReleaseAab")
      .withJavaVersionFromAgp(LATEST_AGP_7_VERSION)
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(runner).task(":app:emergeUploadReleaseAab").succeeded()
  }

  @Test
  fun simpleBundleTimeout() {
    enableServerTimeout()
    val project = SimpleGradleProject.createWithVcsInExtension(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseAab")
      .withJavaVersionFromAgp(project.agpVersion)
      .buildAndFail()

    assertThat(runner).task(":app:emergeUploadReleaseAab").failed()
  }

  @Test
  fun simpleAssemble() {
    val project = SimpleGradleProject.createWithVcsInExtension(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseApk")
      .withJavaVersionFromAgp(project.agpVersion)
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(runner).task(":app:emergeUploadReleaseApk").succeeded()
  }

  @Test
  fun simpleAssembleTimeout() {
    enableServerTimeout()
    val project = SimpleGradleProject.createWithVcsInExtension(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseApk")
      .withJavaVersionFromAgp(project.agpVersion)
      .buildAndFail()

    assertThat(runner).task(":app:emergeUploadReleaseApk").failed()
  }

  @Test
  fun `Assert explicit sha overwrites GitHub convention sha`() {
    val project = SimpleGradleProject.createWithVcsInExtension(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("logExtension")
      .withJavaVersionFromAgp(project.agpVersion)
      .withGithubPR()
      .build()

    assertThat(runner).task(":app:logExtension").succeeded()

    assertThat(runner).output().contains("""
      ╔═══════════════════════════════════════════════╗
      ║ vcsOptions (optional, defaults to Git values) ║
      ╠═══════════════════════════════════════════════╝
      ╠═ sha: testSha
      ╠═ baseSha: testBaseSha
      ╠═ previousSha: testPreviousSha
      """.trimIndent())
  }
}
