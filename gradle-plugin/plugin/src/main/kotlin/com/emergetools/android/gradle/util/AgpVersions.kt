package com.emergetools.android.gradle.util

import com.android.builder.model.Version.ANDROID_GRADLE_PLUGIN_VERSION
import org.gradle.util.internal.VersionNumber

internal object AgpVersions {
  // Use baseVersion to avoid any qualifiers like `-alpha06`
  val CURRENT: VersionNumber = VersionNumber.parse(ANDROID_GRADLE_PLUGIN_VERSION).baseVersion
  val VERSION_7_0: VersionNumber = VersionNumber.parse("7.0.0")
  val VERSION_7_1: VersionNumber = VersionNumber.parse("7.1.0")
  val VERSION_7_2: VersionNumber = VersionNumber.parse("7.1.0")
  val VERSION_7_3: VersionNumber = VersionNumber.parse("7.3.0")
  val VERSION_8_0: VersionNumber = VersionNumber.parse("8.0.0")
}
