package com.emergetools.snapshots

internal data class SnapshotImageMetadata(
	val userSpecifiedName: String,
	val filename: String,
	val testClass: String,
	val testMethod: String,
) {

	// Simple helper so we don't need a dependency on a JSON serializer for the time being.
	fun toJsonString(): String {
		return """
			{
				"userSpecifiedName": "$userSpecifiedName",
				"filename": "$filename",
				"testClass": "$testClass",
				"testMethod": "$testMethod"
			}
			""".trimIndent()
	}
}
