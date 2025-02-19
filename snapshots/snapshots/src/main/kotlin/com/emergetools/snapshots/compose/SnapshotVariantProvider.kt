package com.emergetools.snapshots.compose

import android.content.Context
import android.content.ContextWrapper
import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_MASK
import android.content.res.Resources
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import java.util.Locale

private val RTL_LANGUAGES = setOf(
  "ar", // Arabic
  "he", "iw", // Hebrew (iw is legacy code)
)

@Composable
fun SnapshotVariantProvider(
  config: ComposePreviewSnapshotConfig,
  deviceSpec: DeviceSpec?,
  content: @Composable () -> Unit,
) {
  val localDensity = Density(
    fontScale = config.fontScale ?: LocalDensity.current.fontScale,
    density = deviceSpec?.scalingFactor ?: LocalDensity.current.density,
  )

  val locale = config.locale?.let(::localeForLanguageCode) ?: Locale.getDefault()

  val wrappedContext = SnapshotVariantContextWrapper(
    LocalContext.current,
    newLocale = locale,
    newUiMode = config.uiMode,
  )

  val localConfiguration = Configuration(LocalConfiguration.current).apply {
    config.uiMode?.let { uiMode = it }
    setLocale(locale)
    setLayoutDirection(locale)
    parseDevicePreviewString(config.device)?.orientation?.let {
      orientation = when (it) {
        "landscape" -> Configuration.ORIENTATION_LANDSCAPE
        "portrait" -> Configuration.ORIENTATION_PORTRAIT
        else -> Configuration.ORIENTATION_UNDEFINED
      }
    }
  }

  val layoutDirection = if (locale.language in RTL_LANGUAGES) LayoutDirection.Rtl else LayoutDirection.Ltr

  val providedValues = arrayOf(
    LocalInspectionMode provides true,
    LocalContext provides wrappedContext,
    LocalConfiguration provides localConfiguration,
    LocalDensity provides localDensity,
    LocalLayoutDirection provides layoutDirection,
  )

  CompositionLocalProvider(
    values = providedValues.toList().toTypedArray(),
  ) {
    val modifier = Modifier
      .then(
        config.showBackground?.let {
          // By default, previews use White as the background color, so preserve behavior.
          val color = config.backgroundColor?.let { Color(it) } ?: Color.White
          Modifier.background(color)
        } ?: Modifier
      ).clip(deviceSpec?.shape ?: RectangleShape)

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
      overrideConfiguration.setLayoutDirection(it)
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
      config.setLayoutDirection(it)
    }

    newUiMode?.let {
      config.uiMode = it or (config.uiMode and UI_MODE_NIGHT_MASK.inv())
    }

    return createConfigurationContext(config)
  }
}

// Android's default `Locale` class doesn't seem to play nicely with regions syntax, like `es-rES`
// Instead, we can manually split the locale string ourselves and pass into the appropriate constructor
// which seems to work better.
// Android Studio has completely separate code for parsing locale codes.
fun localeForLanguageCode(code: String): Locale {
  val normalizedCode = code.replace("_", "-")
  val split = normalizedCode.split("-")

  return when {
    split.size > 1 -> {
      if (split[1].startsWith("r") && split[1].length == 3) {
        // Handle Android resource-style region codes (e.g., es-rES)
        Locale(split[0], split[1].substring(1))
      } else {
        // Standard BCP 47 language tags (e.g., ar-EG)
        Locale(split[0], split[1])
      }
    }
    else -> Locale.forLanguageTag(normalizedCode)
  }
}
