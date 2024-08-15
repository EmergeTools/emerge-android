package com.emergetools.android.gradle.tasks.upload

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
  val dependencyMetadataZipPath: String? = null,
  val ciDebugData: CIDebugData? = null,
) {

  companion object {
    const val JSON_FILE_NAME = "emerge_metadata.json"
  }
}

@Serializable
data class CIDebugData(
  val gitHubEventDataPath: String? = null,
) {
  companion object {
    const val GITHUB_EVENT_DATA_FILE_NAME = "gh_event_data.json"
  }
}
