package com.emergetools.android.gradle.tasks.upload

import com.emergetools.android.gradle.util.dependencies.Dependencies
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

/**
 * Metadata about the app being uploaded providing more contextual knowledge for
 * Emerge's analysis.
 */
@Serializable
data class ArtifactMetadata(
  var created: Instant? = null,
  val emergeGradlePluginVersion: String,
  val androidGradlePluginVersion: String,
  val targetArtifactZipPath: String,
  val testArtifactZipPath: String? = null,
  val proguardMappingsZipPath: String? = null,
  val dependencyMetadataZipPath: String = Dependencies.JSON_FILE_NAME,
) {

  companion object {
    const val JSON_FILE_NAME = "emerge_metadata.json"
  }
}
