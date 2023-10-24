package com.emergetools.snapshots.compose

import android.content.res.Configuration
import androidx.activity.compose.LocalActivityResultRegistryOwner
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
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

  val localConfiguration = Configuration(LocalConfiguration.current).apply {
    config.uiMode?.let { uiMode = it }
    val locale = config.locale?.let { Locale(it) } ?: Locale.getDefault()
    setLocale(locale)
  }

  val resultRegistryOwner = LocalActivityResultRegistryOwner.current

  val providedValues = arrayOf(
    LocalContext provides LocalContext.current.createConfigurationContext(localConfiguration),
    resultRegistryOwner?.let { LocalActivityResultRegistryOwner provides resultRegistryOwner },
    config.fontScale?.let { LocalDensity provides fontScaleDensity }
  )
  CompositionLocalProvider(
    values = providedValues.filterNotNull().toTypedArray(),
  ) {
    content()
  }
}
