package com.emergetools.distribution

import android.content.Context
import androidx.startup.Initializer
import androidx.work.WorkManagerInitializer

@Suppress("Unused")
class DistributionInitializer : Initializer<Distribution> {
  override fun create(context: Context): Distribution {
    Distribution.init(context)
    return Distribution
  }

  override fun dependencies(): List<Class<out Initializer<*>>> {
    return listOf(WorkManagerInitializer::class.java)
  }
}
