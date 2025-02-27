package com.emergetools.android.gradle

import com.autonomousapps.kit.truth.TestKitTruth.Companion.assertThat
import com.emergetools.android.gradle.base.EmergeGradleRunner2
import com.emergetools.android.gradle.mocks.assertSuccessfulUploadRequests
import com.emergetools.android.gradle.projects.SimpleGradleProject
import org.junit.jupiter.api.Test

class VariantsEmergePluginTest : EmergePluginTest() {

  val extensionWithVariants = """
        emerge {
          apiToken = 'abcdef123'
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
        }
  """.trimIndent()

  @Test
  fun customBuildTypeBundle() {
    val project = SimpleGradleProject.createWithExtension(this, extension = extensionWithVariants)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
        .withArguments("emergeUploadStagingAab")
        .build()

    assertSuccessfulUploadRequests(server)
    assertThat(runner).task(":app:emergeUploadStagingAab").succeeded()
  }

  @Test
  fun customBuildTypeAssemble() {
    val project = SimpleGradleProject.createWithExtension(this, extension = extensionWithVariants)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadStagingApk")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(runner).task(":app:emergeUploadStagingApk").succeeded()
  }

  val extensionWithFlavors = """
            emerge {
              apiToken = 'abcdef123'
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
  """.trimIndent()

  @Test
  fun flavorsBundle() {
    val project = SimpleGradleProject.createWithExtension(this, extension = extensionWithFlavors)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadMinApi24FullDebugAab", "emergeUploadMinApi21DemoReleaseAab")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(runner).apply {
      task(":app:emergeUploadMinApi24FullDebugAab").succeeded()
      task(":app:emergeUploadMinApi21DemoReleaseAab").succeeded()
    }
  }

  @Test
  fun flavorsAssemble() {
    val project = SimpleGradleProject.createWithExtension(this, extension = extensionWithFlavors)
    val runner = EmergeGradleRunner2(project.gradleProject.rootDir)
      .withArguments("emergeUploadMinApi24FullDebugApk", "emergeUploadMinApi21DemoReleaseApk")
      .build()

    assertSuccessfulUploadRequests(server)
    assertThat(runner).apply {
      task(":app:emergeUploadMinApi24FullDebugApk").succeeded()
      task(":app:emergeUploadMinApi21DemoReleaseApk").succeeded()
    }
  }
}
