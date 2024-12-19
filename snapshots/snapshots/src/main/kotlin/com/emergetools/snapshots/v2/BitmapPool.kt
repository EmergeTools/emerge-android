package com.emergetools.snapshots.v2

import android.graphics.Bitmap
import android.util.Log
import java.util.Collections
import java.util.concurrent.ConcurrentHashMap

class BitmapPool {
  private val semaphore = SuspendingSemaphore(MAX_RELEASED_BITMAPS)
  private val bitmaps = Collections.synchronizedList(ArrayList<Bitmap>())
  private val releasedBitmaps = ConcurrentHashMap<Bitmap, Bitmap>()

  @Synchronized
  fun clear() {
    bitmaps.clear()
  }

  @Synchronized
  fun acquire(width: Int, height: Int): Bitmap {
    if (width > 1000 || height > 1000) {
      Log.d(TAG, "Requesting a large bitmap for " + width + "x" + height)
    }

    val blockedStartTime = System.currentTimeMillis()
    semaphore.acquire()
    val waitingTimeMs = System.currentTimeMillis() - blockedStartTime
    if (waitingTimeMs > 100) {
      Log.d(TAG, "Waited ${waitingTimeMs}ms for a bitmap.")
    }

    val bitmap = synchronized(bitmaps) {
      bitmaps
        .firstOrNull { it.width >= width && it.height >= height }
        ?.also { bitmaps.remove(it) }
    } ?: createNewBitmap(width, height)

    val croppedBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height)
    releasedBitmaps[croppedBitmap] = bitmap

    return croppedBitmap
  }

  @Synchronized
  fun release(bitmap: Bitmap) {

    val originalBitmap = releasedBitmaps.remove(bitmap) ?: throw IllegalArgumentException("Unable to find original bitmap.")
    originalBitmap.eraseColor(0)

    bitmaps += originalBitmap
    semaphore.release()
  }

  private fun createNewBitmap(width: Int, height: Int): Bitmap {
    // Make the bitmap at least as large as the screen so we don't wind up with a fragmented pool of
    // bitmap sizes. We'll crop the right size out of it before returning it in acquire().
    return Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
  }

  companion object {
    // The maximum number of bitmaps that are allowed out at a time.
    // If this limit is reached a thread must wait for another bitmap to be returned.
    // Bitmaps are expensive, and if we aren't careful we can easily allocate too many bitmaps
    // since coroutines run parallelized.
    private const val MAX_RELEASED_BITMAPS = 4
    private const val TAG = "BitmapPool"
  }
}
