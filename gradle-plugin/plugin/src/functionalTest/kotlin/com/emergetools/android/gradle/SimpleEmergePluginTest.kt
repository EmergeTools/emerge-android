package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner.Companion.LATEST_AGP_7_VERSION
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.SimpleGradleProject
import com.google.common.truth.Truth.assertThat
import org.gradle.util.GradleVersion
import org.junit.jupiter.api.Test
import java.io.File

class SimpleEmergePluginTest : EmergePluginTest() {
  @Test
  fun simpleBundle() {
    val project = SimpleGradleProject.create(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseAab")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(runner).task(":app:emergeUploadReleaseAab").succeeded()
  }

  @Test
  fun simpleBundleAgp7_3_0() {
    val project = SimpleGradleProject.create(this, LATEST_AGP_7_VERSION)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir, GradleVersion.version("7.5.1"))
      .withArguments("emergeUploadReleaseAab")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(runner).task(":app:emergeUploadReleaseAab").succeeded()
  }

  @Test
  fun simpleBundleTimeout() {
    enableServerTimeout()
    val project = SimpleGradleProject.create(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseAab")
      .buildAndFail()

    assertThat(runner).task(":app:emergeUploadReleaseAab").failed()
  }

  @Test
  fun simpleAssemble() {
    val project = SimpleGradleProject.create(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseApk")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(runner).task(":app:emergeUploadReleaseApk").succeeded()
  }

  @Test
  fun simpleAssembleTimeout() {
    enableServerTimeout()
    val project = SimpleGradleProject.create(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseApk")
      .buildAndFail()

    assertThat(runner).task(":app:emergeUploadReleaseApk").failed()
  }

  @Test
  fun `Assert explicit sha overwrites GitHub convention sha`() {
    val project = SimpleGradleProject.create(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("logExtension")
      .withGithubPR()
      .build()

    assertThat(runner).task(":app:logExtension").succeeded()

    assertThat(runner.output).contains("""
      ╔═══════════════════════════════════════════════╗
      ║ vcsOptions (optional, defaults to Git values) ║
      ╠═══════════════════════════════════════════════╝
      ╠═ sha: github_head_sha
      ╠═ baseSha: github_base_sha
      ╠═ previousSha:
      """.trimIndent())
  }

  fun EmergeGradleRunner2.withGithubPR() : EmergeGradleRunner2 {
    val resource = this.javaClass.getResource("/github-event-mocks/mock_pr_event.json")!!
    val jsonFile = File(resource.toURI())

     runner.withEnvironment(mapOf(
      "GITHUB_EVENT_NAME" to "pull_request",
      "GITHUB_EVENT_PATH" to jsonFile.path,
    ))
    return this
  }
}
