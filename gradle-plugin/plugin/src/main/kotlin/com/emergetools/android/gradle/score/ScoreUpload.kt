package com.emergetools.android.gradle.score

import com.android.build.api.artifact.SingleArtifact
import com.android.build.api.variant.Variant
import com.emergetools.android.gradle.BuildConfig
import com.emergetools.android.gradle.EmergePlugin.Companion.EMERGE_TASK_PREFIX
import com.emergetools.android.gradle.EmergePluginExtension
import com.emergetools.android.gradle.dv.getBuildScan
import com.emergetools.android.gradle.tasks.base.ArtifactMetadata
import com.emergetools.android.gradle.tasks.base.BaseUploadTask
import com.emergetools.android.gradle.tasks.size.UploadAAB.Companion.AAB_PROGUARD_PATH
import com.emergetools.android.gradle.util.capitalize
import kotlinx.datetime.Clock
import org.gradle.api.Project
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

@DisableCachingByDefault
abstract class ScoreUpload : BaseUploadTask() {

  override fun getGroup(): String? {
    return "Emerge score analysis"
  }

  override fun getDescription(): String? {
    return "Upload a build artifact to generate an Emerge Score"
  }

  @get:InputFile
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val artifact: RegularFileProperty

  override fun includeFilesInUpload(zos: ZipOutputStream) {
    artifact.get().asFile.inputStream().use { inputStream ->
      zos.putNextEntry(ZipEntry(artifact.get().asFile.name))
      inputStream.copyTo(zos)
      zos.closeEntry()
    }
  }

  @TaskAction
  fun performUpload() {
    val artifactName = artifact.get().asFile.name
    val artifactMetadata =
      ArtifactMetadata(
        created = Clock.System.now(),
        emergeGradlePluginVersion = BuildConfig.VERSION,
        androidGradlePluginVersion = agpVersion.get(),
        targetArtifactZipPath = artifactName,
        proguardMappingsZipPath = "$artifactName/$AAB_PROGUARD_PATH",
      )

    upload(artifactMetadata) { response ->
      val url = "https://emergetools.com/score/${response.uploadId}"
      logger.lifecycle("Upload successful! View Emerge Score at the following url:")
      logger.lifecycle(url)
      logger.lifecycle("Score processing can take up to 10 minutes.")
      buildScan.get().link("Emerge Score", url)
    }
  }

  companion object {
    fun Project.registerScoreTask(variant: Variant, extension: EmergePluginExtension) {
      tasks.register(variant.name.scoreTaskName, ScoreUpload::class.java) { task ->
        task.artifact.set(variant.artifacts.get(SingleArtifact.BUNDLE))
        task.setUploadTaskInputs(extension, project, variant)
        task.setTagFromProductOptions(extension.sizeOptions, variant)
        task.buildScan.set(project.getBuildScan())
      }
    }

    private val String.scoreTaskName
      get() = "${EMERGE_TASK_PREFIX}Score${capitalize()}"
  }
}
