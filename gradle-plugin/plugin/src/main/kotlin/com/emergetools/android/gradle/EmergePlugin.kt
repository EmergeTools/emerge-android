package com.emergetools.android.gradle

import com.android.build.api.artifact.SingleArtifact
import com.android.build.api.dsl.TestExtension
import com.android.build.api.variant.AndroidTest
import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import com.android.build.api.variant.ApplicationVariant
import com.android.build.api.variant.TestAndroidComponentsExtension
import com.android.build.api.variant.Variant
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import com.android.build.gradle.internal.tasks.factory.dependsOn
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

    // Emerge supports top-level vs single module configuration. Top-level support is primarily
    // used with performance testing, as perf is reliant on a separate test module for building
    // self-targeting instrumentation tests.
    // If subprojects are present, we can assume we're configured at the top level.
    if (project.subprojects.isNotEmpty()) {
      project.afterEvaluate { rootProject ->
        check(emergeExtension.appProjectPath.isPresent) {
          "Multi-project usage requires setting the \"appProjectPath\" property"
        }

        val appProjectPath = emergeExtension.appProjectPath
        val appProject = checkNotNull(
          project.subprojects.find { subProject ->
            subProject.path.substringAfter(rootProject.path) == appProjectPath.get()
          }
        ) {
          "Did not find appProjectPath \"${emergeExtension.appProjectPath.get()}\""
        }

        applyToAppProject(appProject, emergeExtension)

        val perfProjectPath = emergeExtension.perfOptions.perfProjectPath
        val performanceProject = project.subprojects.find { subProject ->
          subProject.path == perfProjectPath.orNull
        }

        performanceProject?.let {
          applyToPerformanceProject(rootProject, appProject, it, emergeExtension)
        } ?: run {
          // No perf project, but user has set the perfProjectPath,
          // so register the generate task only
          if (perfProjectPath.isPresent) {
            registerGeneratePerfProjectTask(project, appProjectPath, perfProjectPath)
          }
        }
      }
    } else {
      // Configured at the application module level, only register size & snapshot tasks
      applyToAppProject(project, emergeExtension)
    }

    project.afterEvaluate { logExtension(it, emergeExtension) }
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

        registerSizeTasks(appProject, emergeExtension, variant)

        // Only register snapshot tasks for builds with androidTest sourceSet
        val androidTest = variant.nestedComponents.filterIsInstance<AndroidTest>().firstOrNull()
          ?: return@onVariants

        registerSnapshotTasks(appProject, emergeExtension, variant, androidTest)
      }
    }
  }

  private fun applyToPerformanceProject(
    rootProject: Project,
    appProject: Project,
    performanceProject: Project,
    emergeExtension: EmergePluginExtension,
  ) {
    performanceProject.pluginManager.apply(ANDROID_TEST_PLUGIN_ID)

    appProject.afterEvaluate {
      configurePerformanceProject(performanceProject, appProject)
    }

    // Make sure the app project is evaluated first since we rely on it to set default values
    performanceProject.evaluationDependsOn(appProject.path)

    performanceProject.pluginManager.withPlugin(ANDROID_TEST_PLUGIN_ID) { _ ->
      val androidTestComponents = performanceProject.extensions.getByType(
        TestAndroidComponentsExtension::class.java
      )

      androidTestComponents.onVariants { perfVariant ->
        registerPerformanceTasks(
          rootProject,
          appProject,
          performanceProject,
          emergeExtension,
          perfVariant
        )
      }
    }
  }

  private fun registerSizeTasks(
    project: Project,
    extension: EmergePluginExtension,
    variant: Variant,
  ) {
    registerUploadAPKTask(project, extension, variant)
    registerUploadAABTask(project, extension, variant)
  }

  private fun registerUploadAPKTask(
    project: Project,
    extension: EmergePluginExtension,
    variant: Variant,
  ) {
    val taskName = "${EMERGE_TASK_PREFIX}Upload${variant.name.capitalize()}Apk"

    project.tasks.register(taskName, UploadAPK::class.java) {
      it.group = EMERGE_TASK_GROUP
      it.description = "Builds and uploads an APK for variant ${variant.name} to Emerge."
      it.buildType.set(extension.sizeOptions.buildType)
      it.artifactDir.set(variant.artifacts.get(SingleArtifact.APK))
      it.proguardMapping.set(variant.artifacts.get(SingleArtifact.OBFUSCATION_MAPPING_FILE))
      it.setUploadTaskInputs(extension, project)
    }
  }

  private fun registerUploadAABTask(
    project: Project,
    extension: EmergePluginExtension,
    variant: Variant,
  ) {
    val taskName = "${EMERGE_TASK_PREFIX}Upload${variant.name.capitalize()}Aab"

    project.tasks.register(taskName, UploadAAB::class.java) {
      it.group = EMERGE_TASK_GROUP
      it.description = "Builds and uploads an AAB for variant ${variant.name} to Emerge."
      it.buildType.set(extension.sizeOptions.buildType)
      it.artifact.set(variant.artifacts.get(SingleArtifact.BUNDLE))
      it.setUploadTaskInputs(extension, project)
    }
  }

  private fun registerPerformanceTasks(
    rootProject: Project,
    appProject: Project,
    performanceProject: Project,
    extension: EmergePluginExtension,
    perfVariant: Variant,
  ) {
    registerUploadPerfBundleTask(rootProject, performanceProject, extension, perfVariant)
    registerEmergeLocalTestTask(appProject, performanceProject, perfVariant)
  }

  private fun registerUploadPerfBundleTask(
    rootProject: Project,
    performanceProject: Project,
    extension: EmergePluginExtension,
    performanceVariant: Variant,
  ) {
    val taskName = "${EMERGE_TASK_PREFIX}Upload${performanceVariant.name.capitalize()}PerfBundle"
    val appVariant = appVariants.find { it.name == performanceVariant.name }
    checkNotNull(appVariant) {
      "Could not find app variant matching performance variant ${performanceVariant.name}"
    }

    rootProject.tasks.register(taskName, UploadPerfBundle::class.java) {
      it.group = EMERGE_TASK_GROUP
      it.description = "Builds & uploads an AAB for variant ${appVariant.name} to " +
        "Emerge with ${performanceProject.name} test APK."
      it.buildType.set(extension.perfOptions.buildType)
      it.artifact.set(appVariant.artifacts.get(SingleArtifact.BUNDLE))
      it.perfArtifactDir.set(performanceVariant.artifacts.get(SingleArtifact.APK))
      it.setUploadTaskInputs(extension, rootProject)
    }
  }

  private fun registerGeneratePerfProjectTask(
    rootProject: Project,
    appProjectPath: Property<String>,
    performanceProjectPath: Property<String>,
  ) {
    rootProject.tasks.register(GENERATE_PERF_PROJECT_TASK_NAME, GeneratePerfProject::class.java) {
      it.group = EMERGE_TASK_GROUP
      it.description = "Generates a new performance testing project."
      it.appPackageName.set(
        rootProject.provider {
          if (appVariants.isEmpty()) return@provider null
          val appVariant =
            appVariants.find { appVariant -> appVariant.name == "release" } ?: appVariants.first()
          appVariant.applicationId.get()
        }
      )
      it.appProjectPath.set(appProjectPath)
      it.performanceProjectPath.set(performanceProjectPath)
    }
  }

  private fun registerEmergeLocalTestTask(
    appProject: Project,
    performanceProject: Project,
    performanceVariant: Variant,
  ) {
    val appVariant = appVariants.find { it.name == performanceVariant.name }
    val perfVariantName = performanceVariant.name.capitalize()

    val taskName = "emergeLocal${perfVariantName}Test"
    val task = performanceProject.tasks.register(taskName, LocalPerfTest::class.java) {
      it.group = EMERGE_TASK_GROUP
      it.description = "Installs and runs tests for ${performanceVariant.name} on" +
        " connected devices. For testing and debugging."
      // If possible get the application ID from the variant of the same name
      appVariant?.let { appVariant -> it.appPackageName.set(appVariant.applicationId) }
      it.testPackageName.set(performanceVariant.namespace)
    }

    val uninstallAppTaskPath = "${appProject.path}:uninstall$perfVariantName"
    val installAppTaskPath = "${appProject.path}:install$perfVariantName"

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
        val debugSigningConfig = getByName("debug").signingConfig
        appExtension.buildTypes.forEach { appBuildType ->
          maybeCreate(appBuildType.name).apply {
            isDebuggable = false
            signingConfig = debugSigningConfig
          }
        }
      }

      targetProjectPath = appProject.path
      experimentalProperties["android.experimental.self-instrumenting"] = true
    }

    PERFORMANCE_PROJECT_DEPENDENCIES.forEach {
      performanceProject.dependencies.add("implementation", it)
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
          appProjectPath:                ${extension.appProjectPath.orEmpty()}
          dryRun (optional):             ${extension.dryRun.orEmpty()}
          verbose (optional):            ${extension.verbose.orEmpty()}
          size
          └── buildType (optional):      ${extension.sizeOptions.buildType.orEmpty()}
          performance
          ├── perfProjectPath:           ${extension.perfOptions.perfProjectPath.orEmpty()}
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
    const val OUTPUT_DIR_NAME = "/emerge/plugin"

    private const val EMERGE_EXTENSION_NAME = "emerge"
    private const val EMERGE_TASK_PREFIX = "emerge"
    private const val EMERGE_TASK_GROUP = "Emerge"
    // TODO: Size/perf/snapshot tasks should be in their own group.

    private const val ANDROID_APPLICATION_PLUGIN_ID = "com.android.application"
    private const val ANDROID_TEST_PLUGIN_ID = "com.android.test"
    const val EMERGE_JUNIT_RUNNER = "com.emergetools.test.EmergeJUnitRunner"

    private const val GENERATE_PERF_PROJECT_TASK_NAME = "emergeGeneratePerformanceProject"

    private val PERFORMANCE_PROJECT_DEPENDENCIES = listOf(
      "androidx.test.ext:junit:1.1.3",
      "androidx.test.uiautomator:uiautomator:2.2.0",
      "com.emergetools.test:performance:1.0.0"
    )
  }
}
