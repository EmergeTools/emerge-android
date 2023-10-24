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
import com.emergetools.snapshots.google.AndroidStudioLocale
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
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
      getLocale(it)
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

fun getLocale(code: String): Locale {
  val split = code.split("-")
  if (split.size > 1) {
    return Locale(split[0], split[1])
  }
  return Locale.forLanguageTag(code)
}

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
