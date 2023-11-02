package com.emergetools.snapshots.compose

import android.content.Context
import android.content.ContextWrapper
import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_MASK
import android.content.res.Resources
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.emergetools.snapshots.shared.EMGLocale
import java.util.Locale

@Composable
fun SnapshotVariantProvider(
  config: ComposePreviewSnapshotConfig,
  content: @Composable () -> Unit,
) {
  val fontScale = config.fontScale ?: 1.0f
  val fontScaleDensity = Density(fontScale = fontScale, density = LocalDensity.current.density)

  val wrappedContext = SnapshotVariantContextWrapper(
    LocalContext.current,
    newLocale = config.locale?.let {
      EMGLocale.forLanguageCode(it)
    } ?: Locale.getDefault(),
    newUiMode = config.uiMode,
  )

  val providedValues = arrayOf(
    LocalContext provides wrappedContext,
    config.fontScale?.let { LocalDensity provides fontScaleDensity }
  )
  CompositionLocalProvider(
    values = providedValues.filterNotNull().toTypedArray(),
  ) {
    content()
  }
}

// It's important that we use a context wrapper to override values, it's less destructive than
// creating a new context from LocalContext which can unset some default values.
class SnapshotVariantContextWrapper(
  base: Context,
  private val newLocale: Locale?,
  private val newUiMode: Int?
) : ContextWrapper(base) {

  private var wrappedContext: Context? = null

  override fun getResources(): Resources {
    if (wrappedContext == null) {
      wrappedContext = updateContext()
    }
    return wrappedContext!!.resources
  }

  override fun createConfigurationContext(overrideConfiguration: Configuration): Context {
    val context = super.createConfigurationContext(overrideConfiguration)
    newLocale?.let {
      overrideConfiguration.setLocale(it)
    }
    newUiMode?.let {
      overrideConfiguration.uiMode = it or (overrideConfiguration.uiMode and UI_MODE_NIGHT_MASK.inv())
    }
    return context
  }

  private fun updateContext(): Context {
    val res = super.getResources()
    val config = Configuration(res.configuration)

    newLocale?.let {
      config.setLocale(it)
    }

    newUiMode?.let {
      config.uiMode = it or (config.uiMode and UI_MODE_NIGHT_MASK.inv())
    }

    return createConfigurationContext(config)
  }
}
