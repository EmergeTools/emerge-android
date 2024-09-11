package com.emergetools.reaper

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

internal class OnStopLifecycleObserver(
  private val onStop: () -> Unit
) : DefaultLifecycleObserver {

  override fun onStop(owner: LifecycleOwner) {
    super.onStop(owner)
    onStop()
  }
}
