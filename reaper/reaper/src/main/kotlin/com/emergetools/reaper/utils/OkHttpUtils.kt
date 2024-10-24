package com.emergetools.reaper.utils

import java.io.Closeable

@Suppress("TooGenericExceptionCaught")
internal object OkHttpUtils {

  // OkHttp moved this extension function in 5.x of the OkHttp library
  // To avoid resolution issues, we'll implement this extension internally.
  fun Closeable.closeQuietly() {
    try {
      close()
    } catch (rethrown: RuntimeException) {
      throw rethrown
    } catch (ignored: Exception) {
      // Ignored
    }
  }
}
