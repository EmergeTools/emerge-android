package com.emergetools.reaper

import android.content.Context
import java.io.File

private const val REAPER_DIR_SUFFIX = "reaper"
private const val REAPER_CURRENT_DIR_SUFFIX = "$REAPER_DIR_SUFFIX/current"
private const val REAPER_PENDING_DIR_SUFFIX = "$REAPER_DIR_SUFFIX/pending"

internal fun getPendingDir(context: Context) =
  File(context.applicationContext.cacheDir, REAPER_PENDING_DIR_SUFFIX)

internal fun getCurrentDir(context: Context) =
  File(context.applicationContext.cacheDir, REAPER_CURRENT_DIR_SUFFIX)
