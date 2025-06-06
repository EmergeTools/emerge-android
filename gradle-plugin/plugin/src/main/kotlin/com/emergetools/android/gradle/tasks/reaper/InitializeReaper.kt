package com.emergetools.android.gradle.tasks.reaper

import com.emergetools.android.gradle.BuildConfig
import com.emergetools.android.gradle.tasks.base.ArtifactMetadata
import com.emergetools.android.gradle.tasks.base.BaseUploadTask
import kotlinx.datetime.Clock
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.StopExecutionException
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

@DisableCachingByDefault(because = "Reaper initialization should not be cached.")
abstract class InitializeReaper : BaseUploadTask() {
  @get:InputFile
  @get:PathSensitive(PathSensitivity.NAME_ONLY)
  abstract val artifact: RegularFileProperty

  @get:Input
  abstract val publishableApiKey: Property<String>

  override fun includeFilesInUpload(zos: ZipOutputStream) {
    artifact.get().asFile.inputStream().use { inputStream ->
      zos.putNextEntry(ZipEntry(artifact.get().asFile.name))
      inputStream.copyTo(zos)
      zos.closeEntry()
    }
  }

  @TaskAction
  fun execute() {
    if (publishableApiKey.orNull == null) {
      throw StopExecutionException(
        "publishableApiKey must be set for Reaper to work properly. See " +
          "https://docs.emergetools.com/docs/reaper-setup-android#configure-the-sdk.",
      )
    }

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
      val url = "https://emergetools.com/reaper/${response.uploadId}"
      logger.lifecycle("Reaper initialized! View Reaper reports for this version at the following url:")
      logger.lifecycle(url)
      logger.lifecycle("Note: Initial Reaper processing can take up to 10 minutes.")
      buildScan.get().link("Emerge Tools Reaper Report", url)
    }
  }

  companion object {
    const val AAB_PROGUARD_PATH =
      "BUNDLE-METADATA/com.android.tools.build.obfuscation/proguard.map"
  }
}
