package com.emergetools.snapshots.shared

import androidx.annotation.VisibleForTesting

fun String.normalize(): String {
  return replace(Regex("[ .-]"), "_")
    //  lowercase the string
    .lowercase()
}

@VisibleForTesting
const val MAX_KEY_NAME_LENGTH = 128
