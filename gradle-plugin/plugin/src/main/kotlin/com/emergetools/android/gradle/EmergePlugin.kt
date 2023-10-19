package com.emergetools.android.gradle

import com.android.build.api.artifact.SingleArtifact
import com.android.build.api.dsl.TestExtension
import com.android.build.api.variant.AndroidTest
import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import com.android.build.api.variant.ApplicationVariant
import com.android.build.api.variant.TestAndroidComponentsExtension
import com.android.build.api.variant.TestVariant
import com.android.build.api.variant.Variant
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import com.android.build.gradle.internal.tasks.factory.dependsOn
import com.android.build.gradle.internal.utils.KOTLIN_ANDROID_PLUGIN_ID
import com.emergetools.android.gradle.tasks.internal.SaveExtensionConfigTask
import com.emergetools.android.gradle.tasks.perf.GeneratePerfProject
import com.emergetools.android.gradle.tasks.perf.LocalPerfTest
import com.emergetools.android.gradle.tasks.perf.UploadPerfBundle
import com.emergetools.android.gradle.tasks.size.UploadAAB
import com.emergetools.android.gradle.tasks.size.UploadAPK
import com.emergetools.android.gradle.tasks.snapshots.LocalSnapshots
import com.emergetools.android.gradle.tasks.snapshots.PackageSnapshotArtifacts
import com.emergetools.android.gradle.tasks.snapshots.UploadSnapshotBundle
import com.emergetools.android.gradle.tasks.upload.BaseUploadTask.Companion.setUploadTaskInputs
import com.emergetools.android.gradle.util.AgpVersions
import com.emergetools.android.gradle.util.capitalize
import com.emergetools.android.gradle.util.orEmpty
import com.google.devtools.ksp.gradle.KspExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.ProjectDependency
import org.gradle.api.provider.Property
import org.gradle.api.tasks.StopExecutionException
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

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
          registerGeneratePerfProjectTask(project, perfProjectPath)
        }
      }

      logExtension(project, emergeExtension)
    }
  }

  private fun applyToAppProject(
    appProject: Project,
    emergeExtension: EmergePluginExtension,
  ) {
    appProject.afterEvaluate {
      configureAppProjectSnapshots(appProject)
    }

    appProject.pluginManager.withPlugin(ANDROID_APPLICATION_PLUGIN_ID) { _ ->
      val androidComponents = appProject.extensions.getByType(
        ApplicationAndroidComponentsExtension::class.java
      )

      androidComponents.onVariants { variant ->
        appVariants.add(variant)

        registerSizeTasks(appProject, emergeExtension, variant)

        // Only register snapshot tasks for builds with androidTest source set
        val androidTest = variant.nestedComponents.filterIsInstance<AndroidTest>().firstOrNull()
          ?: return@onVariants

        registerSnapshotTasks(appProject, emergeExtension, variant, androidTest)

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
      it.buildType.set(extension.sizeOptions.buildType)
      it.artifactDir.set(variant.artifacts.get(SingleArtifact.APK))
      it.proguardMapping.set(variant.artifacts.get(SingleArtifact.OBFUSCATION_MAPPING_FILE))
      it.setUploadTaskInputs(extension, appProject)
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
      it.buildType.set(extension.sizeOptions.buildType)
      it.artifact.set(variant.artifacts.get(SingleArtifact.BUNDLE))
      it.setUploadTaskInputs(extension, appProject)
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
      it.buildType.set(extension.perfOptions.buildType)
      it.artifact.set(appVariant.artifacts.get(SingleArtifact.BUNDLE))
      it.perfArtifactDir.set(performanceVariant.artifacts.get(SingleArtifact.APK))
      it.setUploadTaskInputs(extension, appProject)
    }
  }

  private fun registerGeneratePerfProjectTask(
    appProject: Project,
    performanceProjectPath: Property<String>,
  ) {
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
      it.outputDirectory.set(appProject.layout.buildDirectory.dir("emerge/snapshots/artifacts"))
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

    val snapshotStorageDirectory = extension.snapshotOptions.snapshotsStorageDirectory.orElse(
      appProject.layout.buildDirectory.dir("emerge/snapshots/outputs")
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
      it.targetAppId.set(targetAppId)
      it.testAppId.set(testAppId)
      it.testInstrumentationRunner.set(testInstrumentationRunner)
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
      it.buildType.set(extension.snapshotOptions.buildType)
      it.packageDir.set(packageTask.flatMap { packageTask -> packageTask.outputDirectory })
      it.setUploadTaskInputs(extension, appProject)
      it.dependsOn(packageTask)
    }
  }

  private fun configureAppProjectSnapshots(appProject: Project) {
    applyMainSourceSetConfig(appProject, appProject)

    // Configure all dependent modules to apply the same configuration as the appProject so
    // generated snapshots don't run into compilation issues.
    appProject.configurations
      .flatMap { it.dependencies }
      .filterIsInstance<ProjectDependency>()
      .map { it.dependencyProject }
      .distinct()
      .filter { !it.state.executed }
      .forEach { subproject ->
        subproject.afterEvaluate { applyMainSourceSetConfig(it, appProject) }
      }
  }

  private fun applyMainSourceSetConfig(
    project: Project,
    appProject: Project,
    extension: EmergePluginExtension,
  ) {
    val errorMessages = mutableListOf<String>()
    if (!project.plugins.hasPlugin(KSP_PLUGIN_ID)) {
      errorMessages.add(
        "${project.name} does not have the KSP plugin applied. " +
          "Please apply the KSP plugin to the ${project.name} module " +
          "for Emerge snapshot test generation of composables in this module."
      )
    }

    if (!project.plugins.hasPlugin(KOTLIN_ANDROID_PLUGIN_ID)) {
      errorMessages.add(
        "${project.name} does not have the Kotlin Android plugin applied. " +
          "Please apply the Kotlin Android plugin to the ${project.name} module " +
          "for Emerge snapshot test generation of composables in this module."
      )
    }

    // Return early with an info-level log if the KSP/Kotlin Android plugin isn't applied.
    if (errorMessages.isNotEmpty()) {
      errorMessages.forEach(appProject.logger::info)
      return
    }

    // TODO: Ryan: Explore using variants API for finding proper ourput dir.
    val emergeSrcDir = "${project.buildDir}/$BUILD_OUTPUT_DIR_NAME/ksp/debugAndroidTest/kotlin"

    val internalSnapshotsEnabled =
      extension.snapshotOptions.experimentalInternalSnapshotsEnabled.getOrElse(false)
    val internalEnabledArg = if (internalSnapshotsEnabled) "true" else "false"

    appProject.logger.info(
      "Configuring ${project.name} for Emerge snapshot testing, outputting to $emergeSrcDir"
    )
    project.extensions.getByType(KspExtension::class.java).apply {
      arg(OUTPUT_SRC_DIR_OPTION_NAME, emergeSrcDir)
      arg(INTERNAL_ENABLED_OPTION_NAME, internalEnabledArg)
    }

    appProject.extensions.getByType(KotlinAndroidProjectExtension::class.java).apply {
      sourceSets.getByName("androidTest").kotlin.srcDir(emergeSrcDir)
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
          dryRun (optional):             ${extension.dryRun.orEmpty()}
          verbose (optional):            ${extension.verbose.orEmpty()}
          size
          └── buildType (optional):      ${extension.sizeOptions.buildType.orEmpty()}
          performance
          ├── projectPath:               ${extension.perfOptions.projectPath.orEmpty()}
          └── buildType (optional):      ${extension.perfOptions.buildType.orEmpty()}
          snapshots
          ├── snapshotsStorageDirectory: ${extension.snapshotOptions.snapshotsStorageDirectory.orEmpty()}
          └── buildType (optional):      ${extension.snapshotOptions.buildType.orEmpty()}
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
    private const val KSP_PLUGIN_ID = "com.google.devtools.ksp"
    const val EMERGE_JUNIT_RUNNER = "com.emergetools.test.EmergeJUnitRunner"

    private const val OUTPUT_SRC_DIR_OPTION_NAME = "emerge.outputDir"
    private const val INTERNAL_ENABLED_OPTION_NAME = "emerge.experimentalInternalEnabled"

    private const val GENERATE_PERF_PROJECT_TASK_NAME = "emergeGeneratePerformanceProject"

    private val PERFORMANCE_PROJECT_DEPENDENCIES = listOf(
      "androidx.test.ext:junit:1.1.3",
      "androidx.test.uiautomator:uiautomator:2.2.0",
      "io.ktor:ktor-network:2.1.1"
    )
  }
}
