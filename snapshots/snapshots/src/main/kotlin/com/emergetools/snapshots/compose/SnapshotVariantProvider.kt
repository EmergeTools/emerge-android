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
    config.locale?.let {
      EMGLocale.forLanguageCode(it)
    } ?: Locale.getDefault(),
    config.uiMode,
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
  private var customResources: Resources? = null

  override fun getResources(): Resources {
    if (customResources == null) {
      val res = super.getResources()
      val newConfig = Configuration(res.configuration)
      newLocale?.let {
        newConfig.setLocale(it)
      }
      newUiMode?.let {
        newConfig.uiMode = it or (newConfig.uiMode and UI_MODE_NIGHT_MASK.inv())
      }
      customResources = super.createConfigurationContext(newConfig).resources
    }
    return customResources!!
  }

  override fun createConfigurationContext(overrideConfiguration: Configuration): Context {
    return SnapshotVariantContextWrapper(
      super.createConfigurationContext(overrideConfiguration),
      newLocale,
      newUiMode
    )
  }
}
