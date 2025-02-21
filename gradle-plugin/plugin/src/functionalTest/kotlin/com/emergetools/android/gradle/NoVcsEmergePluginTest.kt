package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.SimpleGradleProject
import org.junit.jupiter.api.Test

class NoVcsEmergePluginTest : EmergePluginTest() {
  @Test
  fun noVcsBundle() {
    EmergeGradleRunner.create("no-vcs-params")
      .withArguments("emergeUploadReleaseAab")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseAab")
      }
  }

  @Test
  fun noVcsAssemble() {
    EmergeGradleRunner.create("no-vcs-params")
      .withArguments("emergeUploadReleaseApk")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseApk")
      }
  }

  @Test
  fun twoBuildTypesBundle() {
    EmergeGradleRunner.create("no-vcs-params")
      .withArguments("emergeUploadReleaseAab")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseAab")
      }
  }

  @Test
  fun twoBuildTypesAssemble() {
    EmergeGradleRunner.create("no-vcs-params")
      .withArguments("emergeUploadReleaseApk")
      .withDefaultServer()
      .assert { result, server ->
        assertSuccessfulUploadRequests(server)
        result.assertSuccessfulTask(":emergeUploadReleaseApk")
      }
  }

  @Test
  fun androidTasksRunBundle() {
    val result =
      EmergeGradleRunner.create("no-vcs-params")
        .withArguments("packageReleaseBundle", "signReleaseBundle")
        .build()
    result.assertSuccessfulTask(":packageReleaseBundle")
    result.assertSuccessfulTask(":signReleaseBundle")
  }

  @Test
  fun androidTasksRunAssemble() {
    val result =
      EmergeGradleRunner.create("no-vcs-params")
        .withArguments("packageRelease")
        .build()
    result.assertSuccessfulTask(":packageRelease")
  }

  @Test
  fun `Assert GitHub PR sha overwrites sha`() {
    val project = SimpleGradleProject.createWithoutVcsInExtension(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("logExtension")
      .withGithubPR()
      .build()

    assertThat(runner).task(":app:logExtension").succeeded()

    assertThat(runner).output().contains("""
      ╔═══════════════════════════════════════════════╗
      ║ vcsOptions (optional, defaults to Git values) ║
      ╠═══════════════════════════════════════════════╝
      ╠═ sha: github_head_sha
      ╠═ baseSha: github_base_sha
      ╠═ previousSha:
      """.trimIndent())

    assertThat(runner).output().contains("""
      ╠═ prNumber: 123
    """.trimIndent())
  }

  @Test
  fun `Assert GitHub push env sha overwrites sha`() {
    val project = SimpleGradleProject.createWithoutVcsInExtension(this)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("logExtension")
      .withGitHubPushEvent()
      .build()

    assertThat(runner).apply {
      task(":app:logExtension").succeeded()
      output().contains("""
      ╔═══════════════════════════════════════════════╗
      ║ vcsOptions (optional, defaults to Git values) ║
      ╠═══════════════════════════════════════════════╝
      ╠═ sha: github_env_sha
      """.trimIndent())

      output().contains("╠═ baseSha: \n")

      output().contains("""
      ╠═ previousSha: github_previous_sha

    """.trimIndent())
    }
  }
}
