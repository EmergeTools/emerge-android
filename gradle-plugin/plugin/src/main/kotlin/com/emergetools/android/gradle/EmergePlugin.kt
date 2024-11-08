package com.emergetools.android.gradle

import com.android.build.api.dsl.TestExtension
import com.android.build.api.instrumentation.FramesComputationMode
import com.android.build.api.instrumentation.InstrumentationScope
import com.android.build.api.variant.AndroidTest
import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import com.android.build.api.variant.ApplicationVariant
import com.android.build.api.variant.TestAndroidComponentsExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import com.emergetools.android.gradle.instrumentation.reaper.ReaperClassLoadClassVisitorFactory
import com.emergetools.android.gradle.tasks.internal.SaveExtensionConfigTask
import com.emergetools.android.gradle.tasks.perf.registerGeneratePerfProjectTask
import com.emergetools.android.gradle.tasks.perf.registerPerformanceTasks
import com.emergetools.android.gradle.tasks.reaper.registerReaperTasks
import com.emergetools.android.gradle.tasks.size.registerSizeTasks
import com.emergetools.android.gradle.tasks.snapshots.registerSnapshotTasks
import com.emergetools.android.gradle.util.AgpVersions
import com.emergetools.android.gradle.util.orEmpty
import com.emergetools.android.gradle.util.treePrinter
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.StopExecutionException

class EmergePlugin : Plugin<Project> {

  // Temporary storage for app variants, used to configure perf tasks
  private val appVariants = mutableListOf<ApplicationVariant>()

  override fun apply(project: Project) {
    if (AgpVersions.CURRENT < AgpVersions.VERSION_7_0) {
      throw StopExecutionException(
        "Version ${AgpVersions.CURRENT} of AGP is not supported with the " +
          "Emerge gradle plugin. Please use AGP 7.0+."
      )
    }

    val emergeExtension = project.extensions.create(
      EMERGE_EXTENSION_NAME,
      EmergePluginExtension::class.java
    )

    applyToAppProject(project, emergeExtension)

    if (emergeExtension.perfOptions.enabled.getOrElse(true)) {
      // Perf project must be configured after application as the configuration is reliant on
      // property values set from appProject.
      project.afterEvaluate { appProject ->
        val rootProject = appProject.rootProject
        val perfProjectPath = emergeExtension.perfOptions.projectPath
        val performanceProject = rootProject.subprojects.find { subProject ->
          appProject.logger.debug(
            "Checking subproject ${subProject.path} from rootProject ${rootProject.path}, resolving perfProjectPath: ${perfProjectPath.orNull}"
          )
          appProject.logger.debug(
            "Checking absoluteProjectPath ${
              rootProject.absoluteProjectPath(
                subProject.path
              )
            } from rootProject ${rootProject.path}, resolving perfProjectPath: ${perfProjectPath.orNull}"
          )
          rootProject.absoluteProjectPath(subProject.path) == perfProjectPath.orNull
        }
        performanceProject?.let { perfProject ->
          applyToPerformanceProject(appProject, perfProject, emergeExtension)
        } ?: run {
          // No perf project, but user has set the perfOptions.projectPath property
          // so register the generate task only
          if (perfProjectPath.isPresent) {
            appProject.logger.debug(
              "No performance project found for path ${perfProjectPath.get()}, " +
                "registering generate task only"
            )
            registerGeneratePerfProjectTask(project, perfProjectPath, appVariants)
          }
        }

        logExtension(project, emergeExtension)
      }
    }
  }

  private fun applyToAppProject(
    appProject: Project,
    emergeExtension: EmergePluginExtension,
  ) {
    appProject.pluginManager.withPlugin(ANDROID_APPLICATION_PLUGIN_ID) { _ ->
      val androidComponents = appProject.extensions.getByType(
        ApplicationAndroidComponentsExtension::class.java
      )

      androidComponents.onVariants { variant ->
        appVariants.add(variant)

        if (emergeExtension.sizeOptions.enabled.getOrElse(true)) {
          registerSizeTasks(appProject, emergeExtension, variant)
        }

        // Always register the Reaper initialization task even if Reaper is disabled since users use
        // it to help get Reaper setup for the first time.
        registerReaperTasks(appProject, emergeExtension, variant)

        registerReaperTransform(
          project = appProject,
          extension = emergeExtension,
          variant = variant,
        )

        // Only register snapshot tasks for builds with androidTest source set
        val androidTest = variant.nestedComponents.filterIsInstance<AndroidTest>().firstOrNull()
          ?: return@onVariants

        if (emergeExtension.snapshotOptions.enabled.getOrElse(true)) {
          registerSnapshotTasks(appProject, emergeExtension, variant, androidTest)
        }

        if (appProject.hasProperty(EMERGE_DEBUG_TASK_PROPERTY)) {
          registerDebugTasks(appProject, emergeExtension)
        }
      }
    }
  }

  private fun applyToPerformanceProject(
    appProject: Project,
    performanceProject: Project,
    emergeExtension: EmergePluginExtension,
  ) {
    performanceProject.pluginManager.apply(ANDROID_TEST_PLUGIN_ID)

    appProject.logger.debug(
      "Configuring performance project ${performanceProject.path} from appProject ${appProject.path}"
    )
    configurePerformanceProject(performanceProject, appProject)
    appProject.logger.debug(
      "Configuring performance project ${performanceProject.path} from appProject ${appProject.path} complete"
    )

    performanceProject.pluginManager.withPlugin(ANDROID_TEST_PLUGIN_ID) { _ ->
      appProject.logger.debug(
        "Registering performance project tasks for ${performanceProject.path} from appProject ${appProject.path} with android test plugin"
      )
      val androidTestComponents = performanceProject.extensions.getByType(
        TestAndroidComponentsExtension::class.java
      )

      // In practice, we configure only one variant (debug) for the perf project, so this should only run for that single variant
      androidTestComponents.onVariants { perfVariant ->
        appProject.logger.debug(
          "Registering performance project tasks for ${performanceProject.path} from appProject ${appProject.path} with android test plugin for variant ${perfVariant.name}"
        )
        registerPerformanceTasks(
          appProject,
          performanceProject,
          emergeExtension,
          perfVariant,
          appVariants
        )
      }
    }
  }

  @Suppress("UnstableApiUsage")
  private fun configurePerformanceProject(
    performanceProject: Project,
    appProject: Project,
  ) {
    val appExtension = appProject.extensions.getByType(BaseAppModuleExtension::class.java)
    val testExtension = performanceProject.extensions.getByType(TestExtension::class.java)

    // Must happen before the performance project is evaluated.
    // This is meant to set default values that can be overridden as needed.
    testExtension.apply {
      compileSdk = appExtension.compileSdk
      if (AgpVersions.CURRENT >= AgpVersions.VERSION_8_0) {
        namespace = "${appExtension.defaultConfig.applicationId}.${performanceProject.name}"
      }

      compileOptions {
        sourceCompatibility = appExtension.compileOptions.sourceCompatibility
        targetCompatibility = appExtension.compileOptions.targetCompatibility
      }

      defaultConfig {
        minSdk = appExtension.defaultConfig.minSdk
        targetSdk = appExtension.defaultConfig.targetSdk
        testInstrumentationRunner = EMERGE_JUNIT_RUNNER
      }

      buildTypes {
        debug {
          isDebuggable = true
          signingConfig = appExtension.signingConfigs.getByName("debug")
        }
      }

      targetProjectPath = appProject.path
      experimentalProperties["android.experimental.self-instrumenting"] = true
    }

    PERFORMANCE_PROJECT_DEPENDENCIES.forEach {
      performanceProject.dependencies.add("implementation", it)
    }
  }

  private fun registerDebugTasks(
    project: Project,
    extension: EmergePluginExtension,
  ) {
    registerSaveExtensionConfigTask(project, extension)
  }

  private fun registerSaveExtensionConfigTask(
    project: Project,
    extension: EmergePluginExtension,
  ) {
    project.tasks.register("saveExtensionConfig", SaveExtensionConfigTask::class.java) {
      it.group = "Emerge debug"
      it.description = "Saves the Emerge extension configuration to a local file for debugging."
      it.emergePluginExtension.set(extension)
    }
  }

  private fun registerReaperTransform(
    project: Project,
    extension: EmergePluginExtension,
    variant: ApplicationVariant,
  ) {
    val enabledVariants = extension.reaperOptions.enabledVariants.getOrElse(emptyList())

    val publishableApiKey = extension.reaperOptions.publishableApiKey.getOrElse("")
    val isVariantEnabled = enabledVariants.contains(variant.name)
    if (isVariantEnabled) {
      project.logger.info("Registering reaper transform for variant ${variant.name}")
      variant.instrumentation.let {
        it.setAsmFramesComputationMode(FramesComputationMode.COMPUTE_FRAMES_FOR_INSTRUMENTED_METHODS)
        it.transformClassesWith(
          ReaperClassLoadClassVisitorFactory::class.java,
          InstrumentationScope.ALL,
        ) { _ -> }
      }
    }

    // We must always set these to something make the manifest merger happy:
    variant.manifestPlaceholders.put(
      "emerge.reaper.instrumented",
      if (isVariantEnabled) "true" else "false"
    )
    variant.manifestPlaceholders.put("emerge.reaper.publishableApiKey", publishableApiKey)
  }

  private fun logExtension(
    project: Project,
    extension: EmergePluginExtension,
  ) {
    if (!project.logger.isInfoEnabled) return

    val extensionTree = treePrinter("Emerge configuration") {

      addItem("apiToken: ${if (extension.apiToken.isPresent) "*****" else "MISSING"}")
      addItem("includeDependencyInformation: ${extension.includeDependencyInformation.getOrElse(true)}")
      addItem("dryRun (optional): ${extension.dryRun.orEmpty()}")
      addItem("verbose (optional): ${extension.verbose.orEmpty()}")

      val sizeHeading = addHeading("size")
      addItem("tag (optional): ${extension.sizeOptions.tag.orEmpty()}", sizeHeading)
      addItem("enabled: ${extension.sizeOptions.enabled.getOrElse(true)}", sizeHeading)

      val snapshotsHeading = addHeading("snapshots")
      addItem(
        "snapshotsStorageDirectory: ${extension.snapshotOptions.snapshotsStorageDirectory.orEmpty()}",
        snapshotsHeading
      )
      addItem("apiVersion: ${extension.snapshotOptions.apiVersion.orEmpty()}", snapshotsHeading)
      addItem(
        "includePrivatePreviews: ${extension.snapshotOptions.includePrivatePreviews.orEmpty()}",
        snapshotsHeading
      )
      addItem(
        "includePreviewParamPreviews: ${extension.snapshotOptions.includePreviewParamPreviews.orEmpty()}",
        snapshotsHeading
      )
      addItem("tag (optional): ${extension.snapshotOptions.tag.orEmpty()}", snapshotsHeading)
      addItem("enabled: ${extension.snapshotOptions.enabled.getOrElse(true)}", snapshotsHeading)

      val reaperHeading = addHeading("reaper")
      addItem(
        "enabledVariants: ${extension.reaperOptions.enabledVariants.getOrElse(emptyList())}",
        reaperHeading
      )
      addItem(
        "publishableApiKey: ${if (extension.reaperOptions.publishableApiKey.isPresent) "*****" else "MISSING"}",
        reaperHeading
      )
      addItem("tag (optional): ${extension.reaperOptions.tag.orEmpty()}", reaperHeading)

      val performanceHeading = addHeading("performance")
      addItem("projectPath: ${extension.perfOptions.projectPath.orEmpty()}", performanceHeading)
      addItem("tag (optional): ${extension.perfOptions.tag.orEmpty()}", performanceHeading)
      addItem("enabled: ${extension.perfOptions.enabled.getOrElse(true)}", performanceHeading)

      val vcsOptionsHeading = addHeading("vcsOptions (optional, defaults to Git values)")
      addItem("sha: ${extension.vcsOptions.sha.orEmpty()}", vcsOptionsHeading)
      addItem("baseSha: ${extension.vcsOptions.baseSha.orEmpty()}", vcsOptionsHeading)
      addItem("previousSha: ${extension.vcsOptions.previousSha.orEmpty()}", vcsOptionsHeading)
      addItem("branchName: ${extension.vcsOptions.branchName.orEmpty()}", vcsOptionsHeading)
      addItem("prNumber: ${extension.vcsOptions.prNumber.orEmpty()}", vcsOptionsHeading)
      addItem("gitHubOptions", vcsOptionsHeading)
      addItem(
        "repoOwner: ${extension.vcsOptions.gitHubOptions.repoOwner.orEmpty()}",
        vcsOptionsHeading
      )
      addItem(
        "repoName: ${extension.vcsOptions.gitHubOptions.repoName.orEmpty()}",
        vcsOptionsHeading
      )
      addItem(
        "includeEventInformation: ${extension.vcsOptions.gitHubOptions.includeEventInformation.orEmpty()}",
        vcsOptionsHeading
      )
      addItem("gitLabOptions", vcsOptionsHeading)
      addItem(
        "projectId: ${extension.vcsOptions.gitLabOptions.projectId.orEmpty()}",
        vcsOptionsHeading
      )
    }

    project.logger.lifecycle(extensionTree)
  }

  companion object {
    const val BUILD_OUTPUT_DIR_NAME = "emergetools"

    private const val EMERGE_EXTENSION_NAME = "emerge"
    const val EMERGE_TASK_PREFIX = "emerge"

    private const val EMERGE_DEBUG_TASK_PROPERTY = "emergeDebug"

    private const val ANDROID_APPLICATION_PLUGIN_ID = "com.android.application"
    private const val ANDROID_TEST_PLUGIN_ID = "com.android.test"
    const val EMERGE_JUNIT_RUNNER = "com.emergetools.test.EmergeJUnitRunner"

    private val PERFORMANCE_PROJECT_DEPENDENCIES = listOf(
      "androidx.test.ext:junit:1.1.3",
      "androidx.test.uiautomator:uiautomator:2.2.0",
      "io.ktor:ktor-network:2.1.1"
    )
  }
}
