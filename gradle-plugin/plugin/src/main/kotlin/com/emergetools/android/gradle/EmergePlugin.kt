package com.emergetools.android.gradle

import com.android.build.api.artifact.SingleArtifact
import com.android.build.api.dsl.TestExtension
import com.android.build.api.instrumentation.FramesComputationMode
import com.android.build.api.instrumentation.InstrumentationScope
import com.android.build.api.variant.AndroidTest
import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import com.android.build.api.variant.ApplicationVariant
import com.android.build.api.variant.TestAndroidComponentsExtension
import com.android.build.api.variant.TestVariant
import com.android.build.api.variant.Variant
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import com.android.build.gradle.internal.tasks.factory.dependsOn
import com.emergetools.android.gradle.instrumentation.reaper.ReaperClassLoadClassVisitorFactory
import com.emergetools.android.gradle.instrumentation.snapshots.SnapshotsPreviewRuntimeRetentionTransformFactory
import com.emergetools.android.gradle.tasks.internal.SaveExtensionConfigTask
import com.emergetools.android.gradle.tasks.perf.GeneratePerfProject
import com.emergetools.android.gradle.tasks.perf.LocalPerfTest
import com.emergetools.android.gradle.tasks.perf.UploadPerfBundle
import com.emergetools.android.gradle.tasks.reaper.InitializeReaper
import com.emergetools.android.gradle.tasks.reaper.PreflightReaper
import com.emergetools.android.gradle.tasks.size.UploadAAB
import com.emergetools.android.gradle.tasks.size.UploadAPK
import com.emergetools.android.gradle.tasks.snapshots.LocalSnapshots
import com.emergetools.android.gradle.tasks.snapshots.PackageSnapshotArtifacts
import com.emergetools.android.gradle.tasks.snapshots.UploadSnapshotBundle
import com.emergetools.android.gradle.tasks.upload.ArtifactMetadata
import com.emergetools.android.gradle.tasks.upload.BaseUploadTask.Companion.setTagFromProductOptions
import com.emergetools.android.gradle.tasks.upload.BaseUploadTask.Companion.setUploadTaskInputs
import com.emergetools.android.gradle.util.AgpVersions
import com.emergetools.android.gradle.util.capitalize
import com.emergetools.android.gradle.util.orEmpty
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.tasks.StopExecutionException
import org.gradle.api.tasks.TaskProvider

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
            registerGeneratePerfProjectTask(project, perfProjectPath)
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
          appProject.logger.debug(
            "Registering size tasks for variant ${variant.name} in project ${appProject.path}"
          )
          registerSizeTasks(appProject, emergeExtension, variant)
        }

        // Always register the Reaper initialization task even if Reaper is disabled since users use
        // it to help get Reaper setup for the first time.
        registerInitializeReaperTask(appProject, emergeExtension, variant)

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
          perfVariant
        )
      }
    }
  }

  private fun registerSizeTasks(
    appProject: Project,
    extension: EmergePluginExtension,
    variant: Variant,
  ) {
    registerUploadAPKTask(appProject, extension, variant)
    registerUploadAABTask(appProject, extension, variant)
  }

  private fun registerUploadAPKTask(
    appProject: Project,
    extension: EmergePluginExtension,
    variant: Variant,
  ) {
    val taskName = "${EMERGE_TASK_PREFIX}Upload${variant.name.capitalize()}Apk"

    appProject.tasks.register(taskName, UploadAPK::class.java) {
      it.group = EMERGE_TASK_GROUP
      it.description = "Builds and uploads an APK for variant ${variant.name} to Emerge."
      it.artifactDir.set(variant.artifacts.get(SingleArtifact.APK))
      it.proguardMapping.set(variant.artifacts.get(SingleArtifact.OBFUSCATION_MAPPING_FILE))
      it.setUploadTaskInputs(extension, appProject, variant)
      it.setTagFromProductOptions(extension.sizeOptions, variant)
    }
  }

  private fun registerUploadAABTask(
    appProject: Project,
    extension: EmergePluginExtension,
    variant: Variant,
  ) {
    val taskName = "${EMERGE_TASK_PREFIX}Upload${variant.name.capitalize()}Aab"

    appProject.tasks.register(taskName, UploadAAB::class.java) {
      it.group = EMERGE_TASK_GROUP
      it.description = "Builds and uploads an AAB for variant ${variant.name} to Emerge."
      it.artifact.set(variant.artifacts.get(SingleArtifact.BUNDLE))
      it.setUploadTaskInputs(extension, it.project, variant)
      it.setTagFromProductOptions(extension.sizeOptions, variant)
    }
  }

  private fun registerInitializeReaperTask(
    appProject: Project,
    extension: EmergePluginExtension,
    variant: Variant,
  ) {
    val preflightTaskName = "${EMERGE_TASK_PREFIX}PreflightReaper${variant.name.capitalize()}"
    val taskName = "${EMERGE_TASK_PREFIX}InitializeReaper${variant.name.capitalize()}"

    val preflightTask = appProject.tasks.register(preflightTaskName, PreflightReaper::class.java) {
      it.reaperEnabled.set(extension.reaperOptions.enabled)
      it.reaperPublishableApiKey.set(extension.reaperOptions.publishableApiKey)
      it.mergedManifestFile.set(variant.artifacts.get(SingleArtifact.MERGED_MANIFEST))

      // We want preflight to happen pretty early so we can detect error conditions and give them
      // nice messages. Specifically we need it to occur prior to 'linking' steps which we detect
      // that the Reaper added instrumentation calls methods in the SDK to avoid confusing error
      // messages.
      val bundleTaskName = "minify${variant.name.capitalize()}WithR8"
      val bundleTasks = appProject.getTasksByName(bundleTaskName, false)
      if (bundleTasks.size != 0) {
        bundleTasks.forEach { bundleTask -> bundleTask.dependsOn(it) }
      }
    }

    appProject.tasks.register(taskName, InitializeReaper::class.java) {
      it.group = EMERGE_TASK_GROUP
      it.description = "Confirms Reaper is initialized and uploads an AAB for variant ${variant.name} to Emerge."
      it.artifact.set(variant.artifacts.get(SingleArtifact.BUNDLE))
      it.setUploadTaskInputs(extension, appProject, variant)
      it.setTagFromProductOptions(extension.reaperOptions, variant)
      it.dependsOn(preflightTask)
    }
  }

  private fun registerPerformanceTasks(
    appProject: Project,
    performanceProject: Project,
    extension: EmergePluginExtension,
    perfVariant: TestVariant,
  ) {
    // We're not concerned with the variants of the performance project, rather the app variants,
    // generate a perf task for each app variant for the single debug variant of the perf project.
    appVariants.forEach { appVariant ->
      registerEmergeLocalTestTask(appProject, performanceProject, appVariant, perfVariant)
      registerUploadPerfBundleTask(
        appProject, performanceProject, appVariant, perfVariant, extension
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
      it.group = EMERGE_TASK_GROUP
      it.description = "Builds & uploads an AAB for variant ${appVariant.name} to " +
        "Emerge with ${performanceProject.name} test APK."
      it.artifact.set(appVariant.artifacts.get(SingleArtifact.BUNDLE))
      it.perfArtifactDir.set(performanceVariant.artifacts.get(SingleArtifact.APK))
      it.setUploadTaskInputs(extension, appProject, appVariant)
      it.setTagFromProductOptions(extension.perfOptions, appVariant)
    }
  }

  private fun registerGeneratePerfProjectTask(
    appProject: Project,
    performanceProjectPath: Property<String>,
  ) {
    val rootDir = appProject.rootDir
    appProject.tasks.register(GENERATE_PERF_PROJECT_TASK_NAME, GeneratePerfProject::class.java) {
      it.group = EMERGE_TASK_GROUP
      it.description = "Generates a new performance testing project."
      it.appPackageName.set(
        appProject.provider {
          if (appVariants.isEmpty()) return@provider null
          val appVariant =
            appVariants.find { appVariant -> appVariant.name == "release" } ?: appVariants.first()
          appVariant.applicationId.get()
        }
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

  private fun registerEmergeLocalTestTask(
    appProject: Project,
    performanceProject: Project,
    appVariant: ApplicationVariant,
    performanceVariant: TestVariant,
  ) {
    val appVariantName = appVariant.name.capitalize()
    val perfVariantName = performanceVariant.name.capitalize()

    val taskName = "emergeLocal${appVariantName}Test"
    val task = appProject.tasks.register(taskName, LocalPerfTest::class.java) {
      it.group = EMERGE_TASK_GROUP
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

  private fun registerSnapshotTasks(
    appProject: Project,
    extension: EmergePluginExtension,
    variant: ApplicationVariant,
    androidTest: AndroidTest,
  ) {
    variant.instrumentation.let { instrumentation ->
      instrumentation.transformClassesWith(
        SnapshotsPreviewRuntimeRetentionTransformFactory::class.java,
        InstrumentationScope.ALL,
      ) { params ->
        // Force invalidate/reinstrument classes if debug option is set
        if (extension.debugOptions.forceInstrumentation.getOrElse(false)) {
          params.invalidate.set(System.currentTimeMillis())
        }
      }
    }

    val snapshotPackageTask = registerSnapshotPackageTask(appProject, variant, androidTest)
    registerSnapshotLocalTask(appProject, extension, variant, androidTest, snapshotPackageTask)
    registerSnapshotUploadTask(appProject, extension, variant, snapshotPackageTask)
  }

  private fun registerSnapshotPackageTask(
    appProject: Project,
    variant: ApplicationVariant,
    androidTest: AndroidTest,
  ): TaskProvider<PackageSnapshotArtifacts> {
    val variantName = variant.name.capitalize()

    val taskName = "${EMERGE_TASK_PREFIX}Package${variantName}SnapshotArtifacts"
    return appProject.tasks.register(taskName, PackageSnapshotArtifacts::class.java) {
      it.artifactDir.set(variant.artifacts.get(SingleArtifact.APK))
      it.testArtifactDir.set(androidTest.artifacts.get(SingleArtifact.APK))
      it.outputDirectory.set(
        appProject.layout.buildDirectory.dir("${BUILD_OUTPUT_DIR_NAME}/snapshots/artifacts")
      )
      it.artifactMetadataPath.set(
        appProject.layout.buildDirectory.file(
          "${BUILD_OUTPUT_DIR_NAME}/snapshots/artifacts/${ArtifactMetadata.JSON_FILE_NAME}"
        )
      )
      it.agpVersion.set(AgpVersions.CURRENT.toString())
    }
  }

  private fun registerSnapshotLocalTask(
    appProject: Project,
    extension: EmergePluginExtension,
    variant: ApplicationVariant,
    androidTest: AndroidTest,
    packageTask: TaskProvider<PackageSnapshotArtifacts>,
  ) {
    val variantName = variant.name.capitalize()

    val buildDirectory = appProject.layout.buildDirectory
    val snapshotStorageDirectory = extension.snapshotOptions.snapshotsStorageDirectory.orElse(
      buildDirectory.dir("${BUILD_OUTPUT_DIR_NAME}/snapshots/outputs")
    )

    val targetAppId = variant.applicationId
    val testAppId = androidTest.applicationId
    val testInstrumentationRunner = androidTest.instrumentationRunner

    val taskName = "${EMERGE_TASK_PREFIX}LocalSnapshots$variantName"
    appProject.tasks.register(taskName, LocalSnapshots::class.java) {
      it.group = EMERGE_TASK_GROUP
      it.description = "Generate snapshots locally for variant $variantName." +
        " Requires a device or emulator connected."
      it.packageDir.set(packageTask.flatMap { packageTask -> packageTask.outputDirectory })
      it.snapshotStorageDirectory.set(snapshotStorageDirectory)
      it.previewExtractDir.set(buildDirectory.dir("${BUILD_OUTPUT_DIR_NAME}/previews"))
      it.targetAppId.set(targetAppId)
      it.testAppId.set(testAppId)
      it.testInstrumentationRunner.set(testInstrumentationRunner)
      it.includePrivatePreviews.set(extension.snapshotOptions.includePrivatePreviews)
      it.dependsOn(packageTask)
    }
  }

  private fun registerSnapshotUploadTask(
    appProject: Project,
    extension: EmergePluginExtension,
    variant: ApplicationVariant,
    packageTask: TaskProvider<PackageSnapshotArtifacts>,
  ) {
    val variantName = variant.name.capitalize()

    val taskName = "${EMERGE_TASK_PREFIX}UploadSnapshotBundle${variantName}"
    appProject.tasks.register(taskName, UploadSnapshotBundle::class.java) {
      it.group = EMERGE_TASK_GROUP
      it.description = "Builds and uploads a snapshot bundle to Emerge. Snapshots will be" +
        " generated on Emerge's cloud infrastructure and diffed based on the vcs params set" +
        " in the Emerge plugin extension."
      it.packageDir.set(packageTask.flatMap { packageTask -> packageTask.outputDirectory })
      it.artifactMetadataPath.set(
        packageTask.flatMap { packageTask -> packageTask.artifactMetadataPath })
      it.apiVersion.set(extension.snapshotOptions.apiVersion)
      it.includePrivatePreviews.set(extension.snapshotOptions.includePrivatePreviews)
      it.setUploadTaskInputs(extension, appProject, variant)
      it.setTagFromProductOptions(extension.snapshotOptions, variant)
      it.dependsOn(packageTask)
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
      it.group = EMERGE_TASK_GROUP
      it.description = "Saves the Emerge extension configuration to a local file for debugging."
      it.emergePluginExtension.set(extension)
    }
  }

  private fun registerReaperTransform(
    project: Project,
    extension: EmergePluginExtension,
    variant: ApplicationVariant,
  ) {
    val enabled = extension.reaperOptions.enabled.getOrElse(false)

    val publishableApiKey = extension.reaperOptions.publishableApiKey.orNull ?: ""
    if (enabled) {
      if (publishableApiKey == "") {
        throw StopExecutionException("If Reaper is enabled publishableApiKey must be set. See https://docs.emergetools.com/docs/reaper-setup-android#configure-the-sdk.")
      }
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
    variant.manifestPlaceholders.put("emerge.reaper.instrumented", if (enabled) "true" else "false")
    variant.manifestPlaceholders.put("emerge.reaper.publishableApiKey", publishableApiKey)
  }

  private fun logExtension(
    project: Project,
    extension: EmergePluginExtension,
  ) {
    if (!project.logger.isInfoEnabled) return

    project.logger.lifecycle(
      """
          ========================
          = Emerge configuration =
          ========================
          apiToken:                      ${if (extension.apiToken.isPresent) "*****" else "MISSING"}
          includeDependencyInformation:  ${extension.includeDependencyInformation.orElse(true)}
          dryRun (optional):             ${extension.dryRun.orEmpty()}
          verbose (optional):            ${extension.verbose.orEmpty()}
          size
          ├── tag (optional):            ${extension.sizeOptions.tag.orEmpty()}
          └── enabled:                   ${extension.sizeOptions.enabled.getOrElse(true)}
          snapshots
          ├── snapshotsStorageDirectory: ${extension.snapshotOptions.snapshotsStorageDirectory.orEmpty()}
          ├── apiVersion:                ${extension.snapshotOptions.apiVersion.orEmpty()}
          ├── includePrivatePreviews:    ${extension.snapshotOptions.includePrivatePreviews.orEmpty()}
          ├── tag (optional):            ${extension.snapshotOptions.tag.orEmpty()}
          └── enabled:                   ${extension.snapshotOptions.enabled.getOrElse(true)}
          reaper
          ├── publishableApiKey:         ${if (extension.reaperOptions.publishableApiKey.isPresent) "*****" else "MISSING"}
          ├── tag (optional):            ${extension.reaperOptions.tag.orEmpty()}
          └── enabled:                   ${extension.reaperOptions.enabled.getOrElse(false)}
          performance
          ├── projectPath:               ${extension.perfOptions.projectPath.orEmpty()}
          ├── tag (optional):            ${extension.perfOptions.tag.orEmpty()}
          └── enabled:                   ${extension.perfOptions.enabled.getOrElse(true)}
          vcsOptions (optional, defaults to Git values)
          ├── sha:                       ${extension.vcsOptions.sha.orEmpty()}
          ├── baseSha:                   ${extension.vcsOptions.baseSha.orEmpty()}
          ├── branchName:                ${extension.vcsOptions.branchName.orEmpty()}
          ├── prNumber:                  ${extension.vcsOptions.prNumber.orEmpty()}
          ├── gitHubOptions
          │   ├── repoOwner:             ${extension.vcsOptions.gitHubOptions.repoOwner.orEmpty()}
          │   └── repoName:              ${extension.vcsOptions.gitHubOptions.repoName.orEmpty()}
          └── gitLabOptions
              └── projectId:             ${extension.vcsOptions.gitLabOptions.projectId.orEmpty()}
      """.trimIndent()
    )
  }

  companion object {
    const val BUILD_OUTPUT_DIR_NAME = "emergetools"

    private const val EMERGE_EXTENSION_NAME = "emerge"
    private const val EMERGE_TASK_PREFIX = "emerge"
    private const val EMERGE_TASK_GROUP = "Emerge"

    private const val EMERGE_DEBUG_TASK_PROPERTY = "emergeDebug"

    private const val ANDROID_APPLICATION_PLUGIN_ID = "com.android.application"
    private const val ANDROID_TEST_PLUGIN_ID = "com.android.test"
    const val EMERGE_JUNIT_RUNNER = "com.emergetools.test.EmergeJUnitRunner"

    private const val GENERATE_PERF_PROJECT_TASK_NAME = "emergeGeneratePerformanceProject"

    private val PERFORMANCE_PROJECT_DEPENDENCIES = listOf(
      "androidx.test.ext:junit:1.1.3",
      "androidx.test.uiautomator:uiautomator:2.2.0",
      "io.ktor:ktor-network:2.1.1"
    )
  }
}
