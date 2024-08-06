package com.emergetools.reaper

import android.content.Context
import android.util.Log
import java.io.File

private const val REAPER_DIR_SUFFIX = "reaper"
private const val REAPER_CURRENT_DIR_SUFFIX = "$REAPER_DIR_SUFFIX/current"
private const val REAPER_PENDING_DIR_SUFFIX = "$REAPER_DIR_SUFFIX/pending"
private const val REAPER_DEBUG_DIR_SUFFIX = "$REAPER_DIR_SUFFIX/debug"

internal fun getPendingDir(context: Context) =
  File(context.applicationContext.cacheDir, REAPER_PENDING_DIR_SUFFIX)

internal fun getCurrentDir(context: Context) =
  File(context.applicationContext.cacheDir, REAPER_CURRENT_DIR_SUFFIX)

internal fun getDebugDir(context: Context) =
  File(context.applicationContext.cacheDir, REAPER_DEBUG_DIR_SUFFIX)

internal fun ensureDirectories(context: Context): Boolean {
  var success = true

  val current = getCurrentDir(context)
  if (!current.mkdirs() && !current.isDirectory()) {
    Log.e(TAG, "mkdirs ${current.absolutePath} failed")
    success = false
  }

  val pending = getPendingDir(context)
  if (!pending.mkdirs() && !pending.isDirectory()) {
    Log.e(TAG, "mkdirs ${pending.absolutePath} failed")
    success = false
  }

  val debug = getDebugDir(context)
  if (!debug.mkdirs() && !debug.isDirectory()) {
    Log.e(TAG, "mkdirs ${pending.absolutePath} failed")
    success = false
  }

  return success
}
