package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth
import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.SimpleGradleProject
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SingleProjectPerfNotSetupEmergePluginTest : EmergePluginTest() {
  @Test
  fun singleProjectPerfNotSetupUpload() {
    val project = SimpleGradleProject.createWithExtension(this, extension = """
      emerge {
        apiToken = 'abcdef123'

        performance {
          projectPath = ':performance'
        }

        vcs {
          sha = 'testSha'
          baseSha = 'testBaseSha'
          previousSha = 'testPreviousSha'
          branchName = 'testBranchName'
          gitHub {
            repoOwner = 'repoOwner'
            repoName = 'repoName'
          }
        }
      }
    """.trimIndent())
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseAab")
      .build()

    assertSuccessfulUploadRequests(server)

    assertThat(result).task(":app:emergeUploadReleaseAab").succeeded()
  }

  @Test
  fun singleProjectPerfNotSetupGeneratePerformanceProjectSucceeds() {
    val project = SimpleGradleProject.createWithExtension(this, extension = """
      emerge {
        apiToken = 'abcdef123'

        performance {
          projectPath = ':performance'
        }

        vcs {
          sha = 'testSha'
          baseSha = 'testBaseSha'
          previousSha = 'testPreviousSha'
          branchName = 'testBranchName'
          gitHub {
            repoOwner = 'repoOwner'
            repoName = 'repoName'
          }
        }
      }
    """.trimIndent())
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeGeneratePerformanceProject", "--package", "com.test.performance")
      .build()

    assertThat(result).task(":app:emergeGeneratePerformanceProject").succeeded()
  }

  @Test
  fun singleProjectPerfNotSetupUploadPerfBundle() {
    EmergeGradleRunner.create("single-project-perf-not-setup")
      .withArguments("emergeUploadReleasePerfBundle")
      .withDefaultServer()
      .assert { result, _ ->
        assertTrue(
          result.output.contains("Task 'emergeUploadReleasePerfBundle' not found"),
        )
      }
      .buildAndFail()
  }

  @Test
  fun singleProjectPerfNotSetupGeneratePerformanceProjectFailsWithoutPackageName() {
    EmergeGradleRunner.create("single-project-perf-not-setup")
      .withArguments("emergeGeneratePerformanceProject")
      .withDefaultServer()
      .assert { result, _ ->
        println("result.output: ${result.output}")
        assertTrue(
          result.output.contains(
            "Package name is missing. Make sure to pass the --package command line argument.",
          ),
        )
      }
      .buildAndFail()
  }
}
