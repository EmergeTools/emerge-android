package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.MultiProjectProject
import org.junit.jupiter.api.Test

class MultiProjectFlavorsBuildTypesEmergePluginTest : EmergePluginTest() {

  val extension = """
      emerge {
          apiToken = 'abcdef123'

          performance {
            projectPath = ':lib'
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

      android.buildTypes {
        staging {
          initWith debug
          applicationIdSuffix ".debugStaging"
        }
        release {
          initWith release
          applicationIdSuffix ".release"
        }
      }

      android.flavorDimensions "api", "mode"

      android.productFlavors {
        demo {
          dimension "mode"
          applicationIdSuffix ".demo"
          versionNameSuffix "-demo"
        }

        full {
          dimension "mode"
          applicationIdSuffix ".full"
          versionNameSuffix "-full"
        }

        minApi24 {
          dimension "api"
          minSdkVersion 24
        }

        minApi21 {
          dimension "api"
          minSdkVersion 21
        }
      }
  """

  @Test
  fun multiProjectUpload() {
    val project = MultiProjectProject.create(this, extension = extension)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadMinApi24DemoStagingAab")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(result).task(":app:emergeUploadMinApi24DemoStagingAab").succeeded()
  }

  @Test
  fun multiProjectUploadPerfBundle() {
    val project = MultiProjectProject.create(this, extension = extension)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadMinApi21FullReleasePerfBundle")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(result).task(":app:emergeUploadMinApi21FullReleasePerfBundle").succeeded()
  }

  @Test
  fun multiProjectGeneratePerformanceProjectMissing() {
    val project = MultiProjectProject.create(this, extension = extension)
    val result = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments(":app:emergeGeneratePerformanceProject")
      .buildAndFail()

    assertThat(result).output().contains("task 'emergeGeneratePerformanceProject' not found in project ':app'")
  }
}
