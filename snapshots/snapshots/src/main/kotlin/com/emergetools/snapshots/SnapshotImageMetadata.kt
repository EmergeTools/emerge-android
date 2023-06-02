package com.emergetools.snapshots

enum class SnapshotType {
  COMPOSABLE,
  VIEW,
  ACTIVITY,
}

internal data class SnapshotImageMetadata(
  val keyName: String,
  val displayName: String,
  val filename: String,
  val fqn: String,
  val type: SnapshotType,
) {

  // Simple helper so we don't need a dependency on a JSON serializer for the time being.
  fun toJsonString(): String {
    return """
    {
      "keyName": "$keyName",
      "displayName": "$displayName",
      "filename": "$filename",
      "fqn": "$fqn",
      "type": "$type"
    }
    """.trimIndent()
  }
}
