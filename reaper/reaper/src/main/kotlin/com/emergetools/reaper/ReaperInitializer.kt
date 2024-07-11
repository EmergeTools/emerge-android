package com.emergetools.reaper

import android.content.Context
import androidx.startup.Initializer
import androidx.work.WorkManagerInitializer

class ReaperInitializer : Initializer<Reaper> {
  override fun create(context: Context): Reaper {
    Reaper.init(context)
    return Reaper
  }

  override fun dependencies(): List<Class<out Initializer<*>>> {
    return listOf(WorkManagerInitializer::class.java)
  }
}
