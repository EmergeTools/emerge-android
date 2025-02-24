package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner.Companion.LATEST_AGP_7_VERSION
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.SimpleGradleProject
import com.emergetools.android.gradle.tasks.base.ArtifactMetadata
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.gradle.util.GradleVersion
import org.junit.jupiter.api.Test

class SimpleEmergePluginTest : EmergePluginTest() {
  @Test
  fun simpleBundle() {
    val project = SimpleGradleProject.createWithVcsInExtension(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseAab")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(runner).task(":app:emergeUploadReleaseAab").succeeded()
  }

  @Test
  fun simpleBundleAgp7_3_0() {
    val project = SimpleGradleProject.createWithVcsInExtension(this, LATEST_AGP_7_VERSION)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir, GradleVersion.version("7.5.1"))
      .withArguments("emergeUploadReleaseAab")
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
      .buildAndFail()

    assertThat(runner).task(":app:emergeUploadReleaseAab").failed()
  }

  @Test
  fun simpleAssemble() {
    val project = SimpleGradleProject.createWithVcsInExtension(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseApk")
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
      .buildAndFail()

    assertThat(runner).task(":app:emergeUploadReleaseApk").failed()
  }

  @Test
  fun `Assert explicit sha overwrites GitHub convention sha`() {
    val project = SimpleGradleProject.createWithVcsInExtension(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("logExtension")
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

    val metadata =
      ArtifactMetadata(
        emergeGradlePluginVersion = "4.0",
        androidGradlePluginVersion = "8.0",
        targetArtifactZipPath = "foo",
        testArtifactZipPath = "bar",
      )
    val metaDataString = Json.encodeToString(metadata)

    println(metaDataString)
  }
}
