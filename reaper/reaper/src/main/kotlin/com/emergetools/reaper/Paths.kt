package com.emergetools.reaper

import android.content.Context
import android.util.Log
import java.io.File

private const val REAPER_DIR = "reaper"
private const val REAPER_CURRENT_DIR = "$REAPER_DIR/current"
private const val REAPER_PENDING_DIR = "$REAPER_DIR/pending"
private const val REAPER_DEBUG_DIR = "$REAPER_DIR/debug"

internal fun getPendingDir(context: Context) =
  File(context.applicationContext.cacheDir, REAPER_PENDING_DIR)

internal fun getCurrentDir(context: Context) =
  File(context.applicationContext.cacheDir, REAPER_CURRENT_DIR)

internal fun getDebugDir(context: Context) =
  File(context.applicationContext.cacheDir, REAPER_DEBUG_DIR)

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
