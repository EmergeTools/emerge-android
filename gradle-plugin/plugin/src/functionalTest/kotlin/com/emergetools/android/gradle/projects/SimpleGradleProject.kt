package com.emergetools.android.gradle.projects

import com.autonomousapps.kit.GradleProject
import com.emergetools.android.gradle.EmergePluginTest

class SimpleGradleProject(
  agpVersion: String,
  baseUrl: String,
  pluginId: String,
  private val extension: String,
) : AbstractAndroidProject(baseUrl, pluginId) {

  companion object {
    fun createWithVcsInExtension(
      test: EmergePluginTest,
      agpVersion: String = LOWEST_SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSION,
      pluginId: String = "com.emergetools.android",
    ): SimpleGradleProject = createWithExtension(
      test, agpVersion, pluginId = pluginId, extension = """
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
            }""".trimMargin()
    )

    fun createWithoutVcsInExtension(
      test: EmergePluginTest,
      agpVersion: String = LOWEST_SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSION,
    ): SimpleGradleProject = createWithExtension(
      test, agpVersion, extension = """
            emerge {
              apiToken = 'abcdef123'
            }""".trimMargin()
    )

    fun createWithExtension(
      test: EmergePluginTest,
      agpVersion: String = LOWEST_SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSION,
      extension: String,
      pluginId: String = "com.emergetools.android",
    ): SimpleGradleProject {
      return SimpleGradleProject(agpVersion, test.baseUrl.toString(), pluginId, extension)
    }
  }

  val gradleProject: GradleProject = build(agpVersion)

  private fun build(agpVersion: String): GradleProject {
    return newAppSubproject(agpVersion, extension).build()
        .write()
  }
}
