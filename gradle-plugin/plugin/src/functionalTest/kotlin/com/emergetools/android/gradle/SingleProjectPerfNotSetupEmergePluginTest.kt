package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.SimpleGradleProject
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import org.junit.jupiter.api.Test

class SingleProjectPerfNotSetupEmergePluginTest : EmergePluginTest() {

  val emergeExtensionWithPerf = """
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
  """.trimIndent()
  @Test
  fun singleProjectPerfNotSetupUpload() {
    val project = SimpleGradleProject.createWithExtension(this, extension = emergeExtensionWithPerf)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleaseAab")
      .build()

    assertSuccessfulUploadRequests(server)

    assertThat(result).task(":app:emergeUploadReleaseAab").succeeded()
  }

  @Test
  fun singleProjectPerfNotSetupGeneratePerformanceProjectSucceeds() {
    val project = SimpleGradleProject.createWithExtension(this, extension = emergeExtensionWithPerf)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeGeneratePerformanceProject", "--package", "com.test.performance")
      .build()

    assertThat(result).task(":app:emergeGeneratePerformanceProject").succeeded()
  }

  @Test
  fun singleProjectPerfNotSetupUploadPerfBundle() {
    val project = SimpleGradleProject.createWithExtension(this, extension = emergeExtensionWithPerf)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadReleasePerfBundle")
      .buildAndFail()

    assertThat(result).output().contains("Task 'emergeUploadReleasePerfBundle' not found")
  }

  @Test
  fun singleProjectPerfNotSetupGeneratePerformanceProjectFailsWithoutPackageName() {
    val project = SimpleGradleProject.createWithExtension(this, extension = emergeExtensionWithPerf)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeGeneratePerformanceProject")
      .buildAndFail()

    assertThat(result).apply {
      task(":app:emergeGeneratePerformanceProject")
      .failed()
      output().contains("Package name is missing. Make sure to pass the --package command line argument.")
    }
  }
}
