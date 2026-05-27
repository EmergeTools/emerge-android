package com.emergetools.android.gradle.projects

import com.autonomousapps.kit.GradleProject
import com.emergetools.android.gradle.EmergePluginTest

class SimpleGradleProject(
  agpVersion: String,
  baseUrl: String,
  private val emergeExtension: String,
  private val develocityVersion: String?,
) : AbstractAndroidProject(baseUrl) {

  companion object {
    fun createWithVcsInExtension(
      test: EmergePluginTest,
      agpVersion: String = LOWEST_SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSION,
      develocityVersion: String? = null,
    ): SimpleGradleProject = createWithExtension(
      test, agpVersion, """
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
            }""".trimMargin(),
      develocityVersion = develocityVersion,
    )

    fun createWithoutVcsInExtension(
      test: EmergePluginTest,
      agpVersion: String = LOWEST_SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSION,
    ): SimpleGradleProject = createWithExtension(
      test, agpVersion, """
            emerge {
              apiToken = 'abcdef123'
            }""".trimMargin()
    )

    fun createWithExtension(
      test: EmergePluginTest,
      agpVersion: String = LOWEST_SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSION,
      extension: String,
      develocityVersion: String? = null,
    ): SimpleGradleProject {
      return SimpleGradleProject(agpVersion, test.baseUrl.toString(), extension, develocityVersion)
    }
  }

  val gradleProject: GradleProject = build(agpVersion)

  private fun build(agpVersion: String): GradleProject {
    return newAppSubproject(agpVersion, emergeExtension, develocityVersion).build()
        .write()
  }
}
