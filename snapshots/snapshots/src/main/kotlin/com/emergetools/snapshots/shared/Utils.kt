package com.emergetools.snapshots.shared

import androidx.annotation.VisibleForTesting
import java.util.Locale

fun String.normalize(): String {
  return replace(Regex("[ .-]"), "_")
    //  lowercase the string
    .lowercase()
}

@VisibleForTesting
const val MAX_KEY_NAME_LENGTH = 128

object EMGLocale {
  fun forLanguageCode(code: String): Locale {
    val split = code.split("-")
    if (split.size > 1) {
      return Locale(split[0], split[1])
    }
    return Locale.forLanguageTag(code)
  }
}

