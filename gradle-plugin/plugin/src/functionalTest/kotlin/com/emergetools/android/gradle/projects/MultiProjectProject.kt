package com.emergetools.android.gradle.projects

import com.autonomousapps.kit.GradleProject
import com.autonomousapps.kit.gradle.Plugin
import com.autonomousapps.kit.gradle.android.AndroidBlock
import com.emergetools.android.gradle.EmergePluginTest
import com.emergetools.android.gradle.base.EmergeGradleRunner

class MultiProjectProject(
  baseUrl: String,
  private val agpVersion: String,
  private val extension: String
) : AbstractAndroidProject(baseUrl) {
  companion object {
    fun create(test: EmergePluginTest,
      agpVersion: String = EmergeGradleRunner.SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSIONS.last(),
      extension: String = """
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
      """.trimIndent()
    ): MultiProjectProject {
      return MultiProjectProject(test.baseUrl.toString(), agpVersion, extension)
    }
  }

  val gradleProject: GradleProject = build()

  private fun build(): GradleProject {
    return newAppSubproject(agpVersion, extension)
      .withAndroidLibProject("lib", "com.example.lib") {
        withBuildScript {
          android = AndroidBlock.defaultAndroidLibBlock(false)
        }
      }
      .write()
  }
}
