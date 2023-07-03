package com.emergetools.snapshots.compose

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import java.util.Locale

@Composable
fun SnapshotVariantProvider(
  config: ComposePreviewSnapshotConfig,
  content: @Composable () -> Unit,
) {
  val fontScale = config.fontScale ?: 1.0f
  val fontScaleDensity = Density(fontScale = fontScale, density = LocalDensity.current.density)

  val resolvedUiMode = config.uiMode ?: Configuration.UI_MODE_NIGHT_NO
  val resolvedLocale: Locale = config.locale?.let {
    Locale(it)
  } ?: LocalConfiguration.current.locales[0]
  val uiModeConfiguration = Configuration(LocalConfiguration.current).apply {
    uiMode = resolvedUiMode
    setLocale(resolvedLocale)
  }

  CompositionLocalProvider(
    LocalDensity provides fontScaleDensity,
    LocalConfiguration provides uiModeConfiguration,
  ) {
    content()
  }
}
