package com.emergetools.reaper

import android.content.Context
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

internal class ReaperLifecycleObserver(
  private val applicationContext: Context,
) : DefaultLifecycleObserver {

  override fun onStop(owner: LifecycleOwner) {
    super.onStop(owner)
    ReaperInternal.finalizeReport(applicationContext)
  }
}
