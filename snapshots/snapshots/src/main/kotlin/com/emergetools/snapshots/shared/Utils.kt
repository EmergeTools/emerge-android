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
  // Android's default `Locale` class doesn't seem to play nicely with regions syntax, like `es-rES`
  // Instead, we can manually split the locale string ourselves and pass into the appropriate constructor
  // which seems to work better.
  // Android Studio has completely separate code for parsing locale codes.
  fun forLanguageCode(code: String): Locale {
    val split = code.split("-")
    if (split.size > 1) {
      return Locale(split[0], split[1])
    }
    return Locale.forLanguageTag(code)
  }
}

