package com.emergetools.android.gradle.projects

import com.autonomousapps.kit.AbstractGradleProject
import com.autonomousapps.kit.GradleProject
import com.autonomousapps.kit.android.AndroidManifest
import com.autonomousapps.kit.gradle.GradleProperties
import com.autonomousapps.kit.gradle.BuildscriptBlock
import com.autonomousapps.kit.gradle.Plugin
import com.autonomousapps.kit.gradle.android.AndroidBlock
import com.autonomousapps.kit.render.Element
import com.autonomousapps.kit.render.Scribe
import com.emergetools.android.gradle.EmergePluginTest
import com.emergetools.android.gradle.base.EmergeGradleRunner

class SimpleGradleProject(
  agpVersion: String,
  private val baseUrl: String,
  private val emergeExtension: String
) : AbstractGradleProject() {

  companion object {
    fun createWithVcsInExtension(
      test: EmergePluginTest,
      agpVersion: String = EmergeGradleRunner.SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSIONS.last()
    ): SimpleGradleProject {
      return SimpleGradleProject(agpVersion, test.baseUrl.toString(), """
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
            }""".trimMargin())
    }

    fun createWithoutVcsInExtension(
      test: EmergePluginTest,
      agpVersion: String = EmergeGradleRunner.SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSIONS.last()
    ): SimpleGradleProject {
      return SimpleGradleProject(agpVersion, test.baseUrl.toString(), """
            emerge {
              apiToken = 'abcdef123'
            }""".trimMargin())
    }
  }

  val gradleProject: GradleProject = build(agpVersion)

  private fun build(agpVersion: String): GradleProject {
    return newAndroidGradleProjectBuilder(agpVersion)
      .withAndroidSubproject("app") {
        withBuildScript {
          plugins(Plugin("com.android.application"), Plugin("com.emergetools.android", PLUGIN_UNDER_TEST_VERSION))
          android = AndroidBlock.defaultAndroidAppBlock(false, "com.example")
          additions = emergeExtension
        }
        manifest = AndroidManifest.simpleApp()
      }
        .write()
  }

  protected fun newAndroidGradleProjectBuilder(agpVersion: String) : GradleProject.Builder{
    return newGradleProjectBuilder()
      .withRootProject {
        gradleProperties += GradleProperties.minimalAndroidProperties()
        gradleProperties += "baseUrl=${baseUrl}"
        withBuildScript {
          buildscript = BuildscriptBlock.defaultAndroidBuildscriptBlock(agpVersion)
        }
      }
  }
}
