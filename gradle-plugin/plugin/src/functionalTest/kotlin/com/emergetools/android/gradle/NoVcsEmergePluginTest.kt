package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.SimpleGradleProject
import org.junit.jupiter.api.Test

class NoVcsEmergePluginTest : EmergePluginTest() {
  @Test
  fun noVcsBundle() {
    val project = SimpleGradleProject.createWithoutVcsInExtension(this)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseAab")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(result).task(":app:emergeUploadReleaseAab").succeeded()
  }

  @Test
  fun noVcsAssemble() {
    val project = SimpleGradleProject.createWithoutVcsInExtension(this)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseApk")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(result).task(":app:emergeUploadReleaseApk").succeeded()
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
