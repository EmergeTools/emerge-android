package com.emergetools.android.gradle.projects

import com.autonomousapps.kit.AbstractGradleProject
import com.autonomousapps.kit.GradleProject
import com.autonomousapps.kit.android.AndroidManifest
import com.autonomousapps.kit.gradle.BuildscriptBlock
import com.autonomousapps.kit.gradle.GradleProperties
import com.autonomousapps.kit.gradle.Plugin
import com.autonomousapps.kit.gradle.android.AndroidBlock

abstract class AbstractAndroidProject(private val baseUrl: String) : AbstractGradleProject() {
  companion object {
    val LOWEST_SUPPORTED_ANDROID_GRADLE_PLUGIN_VERSION = "8.0.0"
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


  protected fun newAppSubproject(agpVersion: String, extension: String): GradleProject.Builder {
    return newAndroidGradleProjectBuilder(agpVersion)
      .withAndroidSubproject("app") {
        withBuildScript {
          plugins(Plugin("com.android.application"), Plugin("com.emergetools.android", PLUGIN_UNDER_TEST_VERSION))
          android = AndroidBlock.defaultAndroidAppBlock(false, "com.example")
          additions = extension
        }
        manifest = AndroidManifest.simpleApp()
      }
  }
}
