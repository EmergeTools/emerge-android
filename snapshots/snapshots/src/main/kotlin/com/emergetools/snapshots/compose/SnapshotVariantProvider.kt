package com.emergetools.snapshots.compose

import android.content.Context
import android.content.ContextWrapper
import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_MASK
import android.content.res.Resources
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.emergetools.snapshots.shared.EMGLocale
import java.util.Locale

@Composable
fun SnapshotVariantProvider(
  config: ComposePreviewSnapshotConfig,
  content: @Composable () -> Unit,
) {
  val dimensionSpec = configToDimensionSpec(
    config.device,
    config,
  )

  val localDensity = Density(
    fontScale = dimensionSpec.fontScale ?: LocalDensity.current.fontScale,
    density = dimensionSpec.density ?: LocalDensity.current.density,
  )

  val locale = config.locale?.let { EMGLocale.forLanguageCode(it) } ?: Locale.getDefault()

  val wrappedContext = SnapshotVariantContextWrapper(
    LocalContext.current,
    newLocale = locale,
    newUiMode = config.uiMode,
  )

  val localConfiguration = Configuration(LocalConfiguration.current).apply {
    config.uiMode?.let { uiMode = it }
    setLocale(locale)
  }

  val providedValues = arrayOf(
    LocalInspectionMode provides true,
    LocalContext provides wrappedContext,
    LocalConfiguration provides localConfiguration,
    LocalDensity provides localDensity,
  )

  CompositionLocalProvider(
    values = providedValues.toList().toTypedArray(),
  ) {
    val modifier = Modifier
        .then(dimensionSpec.widthDp?.let { Modifier.width(it.dp) } ?: Modifier)
        .then(dimensionSpec.heightDp?.let { Modifier.height(it.dp) } ?: Modifier)
        .then(
            config.showBackground?.let {
                // By default, previews use White as the background color, so preserve behavior.
                val color = config.backgroundColor?.let { Color(it) } ?: Color.White
                Modifier.background(color)
            } ?: Modifier
        )

    Box(modifier = modifier) {
      content()
    }
  }
}

// It's important that we use a context wrapper to override values, it's less destructive than
// creating a new context from LocalContext which can unset some default values.
class SnapshotVariantContextWrapper(
  base: Context,
  private val newLocale: Locale?,
  private val newUiMode: Int?,
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
      overrideConfiguration.uiMode =
        it or (overrideConfiguration.uiMode and UI_MODE_NIGHT_MASK.inv())
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
