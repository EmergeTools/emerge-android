package com.emergetools.android.gradle.tasks.snapshots

import com.android.build.api.artifact.SingleArtifact
import com.android.build.api.instrumentation.InstrumentationScope
import com.android.build.api.variant.AndroidTest
import com.android.build.api.variant.ApplicationVariant
import com.emergetools.android.gradle.EmergePlugin.Companion.BUILD_OUTPUT_DIR_NAME
import com.emergetools.android.gradle.EmergePlugin.Companion.EMERGE_TASK_PREFIX
import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.instrumentation.snapshots.SnapshotsPreviewRuntimeRetentionTransformFactory
import com.emergetools.android.gradle.tasks.base.ArtifactMetadata
import com.emergetools.android.gradle.tasks.base.BasePreflightTask.Companion.setPreflightTaskInputs
import com.emergetools.android.gradle.tasks.base.BaseUploadTask.Companion.setTagFromProductOptions
import com.emergetools.android.gradle.tasks.base.BaseUploadTask.Companion.setUploadTaskInputs
import com.emergetools.android.gradle.util.AgpVersions
import com.emergetools.android.gradle.util.capitalize
import com.emergetools.android.gradle.util.hasDependency
import org.gradle.api.Project
import org.gradle.api.tasks.TaskProvider

const val EMERGE_SNAPSHOTS_TASK_GROUP = "Emerge snapshots"
const val SNAPSHOTS_DEP_GROUP = "com.emergetools.snapshots"
const val SNAPSHOTS_DEP_NAME = "snapshots"

fun registerSnapshotTasks(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: ApplicationVariant,
  androidTest: AndroidTest,
) {
  appProject.logger.debug(
    "Registering snapshot tasks for variant ${variant.name} in project ${appProject.path}"
  )

  registerSnapshotPreflightTask(appProject, extension, variant)

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
      appProject.layout.buildDirectory.dir("$BUILD_OUTPUT_DIR_NAME/snapshots/artifacts")
    )
    it.artifactMetadataPath.set(
      appProject.layout.buildDirectory.file(
        "$BUILD_OUTPUT_DIR_NAME/snapshots/artifacts/${ArtifactMetadata.JSON_FILE_NAME}"
      )
    )
    it.agpVersion.set(AgpVersions.CURRENT.toString())
  }
}

private fun registerSnapshotPreflightTask(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: ApplicationVariant,
) {
  val preflightTaskName = "${EMERGE_TASK_PREFIX}SnapshotsPreflight${variant.name.capitalize()}"
  appProject.tasks.register(preflightTaskName, SnapshotsPreflight::class.java) {
    it.group = EMERGE_SNAPSHOTS_TASK_GROUP
    it.description = "Validate Snapshots is properly set up for variant ${variant.name}"
    it.variantName.set(variant.name)
    it.appProjectPath.set(appProject.path)
    it.hasEmergeApiToken.set(!extension.apiToken.orNull.isNullOrBlank())
    it.snapshotsEnabled.set(extension.snapshotOptions.enabled.getOrElse(true))
    it.hasSnapshotsAndroidTestImplementationDependency.set(
      hasDependency(appProject, variant, SNAPSHOTS_DEP_GROUP, SNAPSHOTS_DEP_NAME)
    )
    it.setPreflightTaskInputs(extension)
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
    buildDirectory.dir("$BUILD_OUTPUT_DIR_NAME/snapshots/outputs")
  )

  val targetAppId = variant.applicationId
  val testAppId = androidTest.applicationId
  val testInstrumentationRunner = androidTest.instrumentationRunner

  appProject.tasks.register(
    getSnapshotLocalTaskName(variant.name),
    LocalSnapshots::class.java
  ) {
    it.group = EMERGE_SNAPSHOTS_TASK_GROUP
    it.description = "Generate snapshots locally for variant $variantName." +
      " Requires a device or emulator connected."
    it.packageDir.set(packageTask.flatMap { packageTask -> packageTask.outputDirectory })
    it.snapshotStorageDirectory.set(snapshotStorageDirectory)
    it.previewExtractDir.set(buildDirectory.dir("$BUILD_OUTPUT_DIR_NAME/previews"))
    it.targetAppId.set(targetAppId)
    it.testAppId.set(testAppId)
    it.testInstrumentationRunner.set(testInstrumentationRunner)
    it.includePrivatePreviews.set(extension.snapshotOptions.includePrivatePreviews)
    it.dependsOn(packageTask)
  }
}

fun getSnapshotLocalTaskName(variantName: String): String {
  return "${EMERGE_TASK_PREFIX}LocalSnapshots${variantName.capitalize()}"
}

private fun registerSnapshotUploadTask(
  appProject: Project,
  extension: EmergePluginExtension,
  variant: ApplicationVariant,
  packageTask: TaskProvider<PackageSnapshotArtifacts>,
) {
  appProject.tasks.register(
    getSnapshotUploadTaskName(variant.name),
    UploadSnapshotBundle::class.java
  ) {
    it.group = EMERGE_SNAPSHOTS_TASK_GROUP
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

fun getSnapshotUploadTaskName(variantName: String): String {
  return "${EMERGE_TASK_PREFIX}UploadSnapshotBundle${variantName.capitalize()}"
}
