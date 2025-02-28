package com.emergetools.android.gradle.projects

import com.autonomousapps.kit.GradleProject
import com.autonomousapps.kit.android.AndroidManifest
import com.autonomousapps.kit.gradle.Plugin
import com.autonomousapps.kit.gradle.android.AndroidBlock
import com.emergetools.android.gradle.EmergePluginTest
import com.emergetools.android.gradle.base.EmergeGradleRunner

class SimpleGradleProject(
  agpVersion: String,
  baseUrl: String,
  private val emergeExtension: String
) : AbstractAndroidProject(baseUrl) {

  companion object {
    fun createWithVcsInExtension(
      test: EmergePluginTest,
      agpVersion: String = EmergeGradleRunner.SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSIONS.last()
    ): SimpleGradleProject = createWithExtension(test, agpVersion, """
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

    fun createWithoutVcsInExtension(
      test: EmergePluginTest,
      agpVersion: String = EmergeGradleRunner.SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSIONS.last()
    ): SimpleGradleProject = createWithExtension(test, agpVersion, """
            emerge {
              apiToken = 'abcdef123'
            }""".trimMargin())

    fun createWithExtension(
      test: EmergePluginTest,
      agpVersion: String = EmergeGradleRunner.SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSIONS.last(),
      extension: String
    ): SimpleGradleProject {
      return SimpleGradleProject(agpVersion, test.baseUrl.toString(), extension)
    }
  }

  val gradleProject: GradleProject = build(agpVersion)

  private fun build(agpVersion: String): GradleProject {
    return newAppSubproject(agpVersion, emergeExtension).build()
        .write()
  }
}
