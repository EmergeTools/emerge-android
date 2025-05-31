package com.emergetools.android.gradle.score

import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import com.emergetools.android.gradle.EmergePlugin.Companion.EMERGE_EXTENSION_NAME
import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.score.ScoreUpload.Companion.registerScoreTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class ScorePlugin : Plugin<Project> {
  override fun apply(project: Project) {
    project.pluginManager.withPlugin("com.android.application") {
      val emergeExtension =
        project.extensions.findByType(EmergePluginExtension::class.java)
          ?: project.extensions.create(
            EMERGE_EXTENSION_NAME, EmergePluginExtension::class.java
          )
      val androidComponents =
        project.extensions.getByType(
          ApplicationAndroidComponentsExtension::class.java,
        )

      androidComponents.onVariants { variant ->
        project.registerScoreTask(variant, emergeExtension)
      }
    }
  }
}
