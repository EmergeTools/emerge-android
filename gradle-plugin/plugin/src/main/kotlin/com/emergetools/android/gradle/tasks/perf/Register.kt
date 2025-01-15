package com.emergetools.android.gradle.tasks.perf

import com.android.build.api.artifact.SingleArtifact
import com.android.build.api.variant.ApplicationVariant
import com.android.build.api.variant.TestVariant
import com.android.build.api.variant.Variant
import com.android.build.gradle.internal.tasks.factory.dependsOn
import com.emergetools.android.gradle.EmergePlugin.Companion.EMERGE_TASK_PREFIX
import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.tasks.base.BaseUploadTask.Companion.setTagFromProductOptions
import com.emergetools.android.gradle.tasks.base.BaseUploadTask.Companion.setUploadTaskInputs
import com.emergetools.android.gradle.util.capitalize
import org.gradle.api.Project
import org.gradle.api.provider.Property

const val EMERGE_PERFORMANCE_TASK_GROUP = "Emerge performance"

fun registerPerformanceTasks(
  appProject: Project,
  performanceProject: Project,
  extension: EmergePluginExtension,
  perfVariant: TestVariant,
  appVariants: List<ApplicationVariant>,
) {
  appProject.logger.debug(
    "Registering performance tasks for variant ${perfVariant.name} in project ${appProject.path}",
  )

  // We're not concerned with the variants of the performance project, rather the app variants,
  // generate a perf task for each app variant for the single debug variant of the perf project.
  appVariants.forEach { appVariant ->
    registerEmergeLocalTestTask(appProject, performanceProject, appVariant, perfVariant)
    registerUploadPerfBundleTask(
      appProject,
      performanceProject,
      appVariant,
      perfVariant,
      extension,
    )
  }
}

private fun registerUploadPerfBundleTask(
  appProject: Project,
  performanceProject: Project,
  appVariant: Variant,
  performanceVariant: TestVariant,
  extension: EmergePluginExtension,
) {
  val taskName = "${EMERGE_TASK_PREFIX}Upload${appVariant.name.capitalize()}PerfBundle"
  appProject.tasks.register(taskName, UploadPerfBundle::class.java) {
    it.group = EMERGE_PERFORMANCE_TASK_GROUP
    it.description = "Builds & uploads an AAB for variant ${appVariant.name} to " +
      "Emerge with ${performanceProject.name} test APK."
    it.artifact.set(appVariant.artifacts.get(SingleArtifact.BUNDLE))
    it.perfArtifactDir.set(performanceVariant.artifacts.get(SingleArtifact.APK))
    it.setUploadTaskInputs(extension, appProject, appVariant)
    it.setTagFromProductOptions(extension.perfOptions, appVariant)
  }
}

private fun registerEmergeLocalTestTask(
  appProject: Project,
  performanceProject: Project,
  appVariant: ApplicationVariant,
  performanceVariant: TestVariant,
) {
  val appVariantName = appVariant.name.capitalize()
  val perfVariantName = performanceVariant.name.capitalize()

  val taskName = "emergeLocal${appVariantName}Test"
  val task =
    appProject.tasks.register(taskName, LocalPerfTest::class.java) {
      it.group = EMERGE_PERFORMANCE_TASK_GROUP
      it.description = "Installs and runs tests for ${performanceVariant.name} on" +
        " connected devices. For testing and debugging."
      it.appPackageName.set(appVariant.applicationId)
      it.testPackageName.set(performanceVariant.namespace)
    }

  val uninstallAppTaskPath = "${appProject.path}:uninstall$appVariantName"
  val installAppTaskPath = "${appProject.path}:install$appVariantName"

  // We need the uninstall task to run first but don't want to enforce that
  // order unless the local test task is actually being run
  if (appProject.project.gradle.startParameter.taskNames.any { it.contains(taskName) }) {
    appProject.tasks.all {
      if (it.path == installAppTaskPath) {
        it.shouldRunAfter(uninstallAppTaskPath)
      }
    }
  }

  task.dependsOn(uninstallAppTaskPath)
  task.dependsOn(installAppTaskPath)
  task.dependsOn("${performanceProject.path}:install$perfVariantName")
}

fun registerGeneratePerfProjectTask(
  appProject: Project,
  performanceProjectPath: Property<String>,
  appVariants: List<ApplicationVariant>,
) {
  appProject.logger.debug(
    "Registering generate perf project tasks in project ${appProject.path}",
  )

  val rootDir = appProject.rootDir
  appProject.tasks.register("emergeGeneratePerformanceProject", GeneratePerfProject::class.java) {
    it.group = EMERGE_PERFORMANCE_TASK_GROUP
    it.description = "Generates a new performance testing project."
    it.appPackageName.set(
      appProject.provider {
        if (appVariants.isEmpty()) return@provider null
        val appVariant =
          appVariants.find { appVariant -> appVariant.name == "release" } ?: appVariants.first()
        appVariant.applicationId.get()
      },
    )
    it.performanceProjectPath.set(performanceProjectPath)
    it.rootDir.set(rootDir)
    rootDir.resolve("settings.gradle.kts").let { settingsKtsFile ->
      if (settingsKtsFile.exists()) {
        it.gradleSettingsFile.set(settingsKtsFile)
      }
    }
    rootDir.resolve("settings.gradle").let { settingsFile ->
      if (settingsFile.exists()) {
        it.gradleSettingsFile.set(settingsFile)
      }
    }
  }
}
