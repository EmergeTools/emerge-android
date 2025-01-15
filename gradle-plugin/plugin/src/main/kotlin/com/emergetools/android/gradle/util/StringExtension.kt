package com.emergetools.android.gradle.util

import java.util.Locale

internal fun String.capitalize(): String {
  return this.replaceFirstChar {
    if (it.isLowerCase()) {
      it.titlecase(
        Locale.getDefault(),
      )
    } else {
      it.toString()
    }
  }
}
