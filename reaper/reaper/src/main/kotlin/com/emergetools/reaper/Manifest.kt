package com.emergetools.reaper

import android.os.Bundle

private const val MANIFEST_TAG_INSTRUMENTED = "com.emergetools.reaper.REAPER_INSTRUMENTED"
private const val MANIFEST_TAG_PUBLISHABLE_API_KEY = "com.emergetools.reaper.PUBLISHABLE_API_KEY"
private const val MANIFEST_TAG_OVERRIDE_BASE_URL = "com.emergetools.OVERRIDE_BASE_URL"
private const val MANIFEST_TAG_DEBUG = "com.emergetools.reaper.DEBUG"

internal fun isInstrumented(metadata: Bundle): Boolean {
  return metadata.getBoolean(MANIFEST_TAG_INSTRUMENTED, false)
}

internal fun getApiKey(metadata: Bundle): String {
  return metadata.getString(MANIFEST_TAG_PUBLISHABLE_API_KEY, "")
}

internal fun getBaseUrl(metadata: Bundle): String {
  return metadata.getString(MANIFEST_TAG_OVERRIDE_BASE_URL, ReaperConfig.EMERGE_BASE_URL)
}

internal fun isDebug(metadata: Bundle): Boolean {
  return metadata.getBoolean(MANIFEST_TAG_DEBUG, false)
}
