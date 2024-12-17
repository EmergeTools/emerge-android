@file:Suppress("MaxLineLength", "MaximumLineLength")

package com.emergetools.snapshots.compose

import android.util.DisplayMetrics
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.emergetools.snapshots.util.Profiler
import kotlin.math.roundToInt

data class DeviceSpec(
  val widthDp: Int?,
  val heightDp: Int?,
  val dpi: Int,
) {
  // Calculate the density factor the same way Android does
  private val density: Float = dpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT

  // For pixel calculations, we need to use the actual density
  val widthPixels: Int
    get() = if (widthDp == null) 0 else (widthDp * density).roundToTen()

  val heightPixels: Int
    get() = if (heightDp == null) 0 else (heightDp * density).roundToTen()

  // This is used for the preview scaling factor
  val scalingFactor: Float
    get() = density

  // Restrict width/height to be multiples of 10
  @Suppress("MagicNumber")
  private fun Float.roundToTen(): Int {
    return (this / 10).roundToInt() * 10
  }
}

// https://m3.material.io/blog/device-metrics#putting-it-all-together
// Calculated by dimension / (ppi / 160)
val KNOWN_DEVICE_SPECS = mapOf(
  // https://www.gsmarena.com/asus_google_nexus_7-4850.php
  "Nexus 7" to DeviceSpec(
    widthDp = 593,
    heightDp = 948,
    dpi = 216,
  ),
  // https://www.gsmarena.com/asus_google_nexus_7_(2013)-5600.php
  "Nexus 7 2013" to DeviceSpec(
    widthDp = 594,
    heightDp = 951,
    dpi = 323,
  ),
  // https://www.gsmarena.com/lg_nexus_5-5705.php
  "Nexus 5" to DeviceSpec(
    widthDp = 388,
    heightDp = 690,
    dpi = 445,
  ),
  // https://www.gsmarena.com/motorola_nexus_6-6604.php,
  "Nexus 6" to DeviceSpec(
    widthDp = 467,
    heightDp = 831,
    dpi = 493,
  ),
  // https://www.gsmarena.com/htc_nexus_9-5823.php
  "Nexus 9" to DeviceSpec(
    widthDp = 875,
    heightDp = 1166,
    dpi = 281,
  ),
  // https://www.gsmarena.com/samsung_google_nexus_10_p8110-5084.php
  "Nexus 10" to DeviceSpec(
    widthDp = 1370,
    heightDp = 856,
    dpi = 299,
  ),
  // https://www.gsmarena.com/lg_nexus_5x-7556.php
  "Nexus 5X" to DeviceSpec(
    widthDp = 409,
    heightDp = 726,
    dpi = 423,
  ),
  // https://www.gsmarena.com/huawei_nexus_6p-7588.php
  "Nexus 6P" to DeviceSpec(
    widthDp = 445,
    heightDp = 791,
    dpi = 518,
  ),
  // https://www.gsmarena.com/google_pixel_c-7826.php
  "pixel_c" to DeviceSpec(
    widthDp = 1330,
    heightDp = 935,
    dpi = 308,
  ),
  // https://www.gsmarena.com/google_pixel-8346.php
  "pixel" to DeviceSpec(
    widthDp = 392,
    heightDp = 697,
    dpi = 441,
  ),
  // https://www.gsmarena.com/google_pixel_xl-8345.php
  "pixel_xl" to DeviceSpec(
    widthDp = 431,
    heightDp = 766,
    dpi = 534,
  ),
  // https://www.gsmarena.com/google_pixel_2-8733.php
  "pixel_2" to DeviceSpec(
    widthDp = 392,
    heightDp = 697,
    dpi = 441,
  ),
  // https://www.gsmarena.com/google_pixel_2_xl-8720.php
  "pixel_2_xl" to DeviceSpec(
    widthDp = 428,
    heightDp = 857,
    dpi = 538,
  ),
  // https://www.gsmarena.com/google_pixel_3-9256.php
  "pixel_3" to DeviceSpec(
    widthDp = 390,
    heightDp = 780,
    dpi = 443,
  ),
  // https://www.gsmarena.com/google_pixel_3_xl-9257.php
  "pixel_3_xl" to DeviceSpec(
    widthDp = 441,
    heightDp = 906,
    dpi = 523,
  ),
  // https://www.gsmarena.com/google_pixel_3a-9408.php
  "pixel_3a" to DeviceSpec(
    widthDp = 392,
    heightDp = 805,
    dpi = 441,
  ),
  // https://www.gsmarena.com/google_pixel_3a_xl-9690.php
  "pixel_3a_xl" to DeviceSpec(
    widthDp = 430,
    heightDp = 860,
    dpi = 402,
  ),
  // https://www.gsmarena.com/google_pixel_4-9896.php
  "pixel_4" to DeviceSpec(
    widthDp = 390,
    heightDp = 822,
    dpi = 444,
  ),
  // https://www.gsmarena.com/google_pixel_4_xl-9895.php
  "pixel_4_xl" to DeviceSpec(
    widthDp = 429,
    heightDp = 906,
    dpi = 537,
  ),
  // https://www.gsmarena.com/google_pixel_4a-10123.php
  "pixel_4a" to DeviceSpec(
    widthDp = 390,
    heightDp = 845,
    dpi = 443,
  ),
  // https://www.gsmarena.com/google_pixel_5-10386.php
  "pixel_5" to DeviceSpec(
    widthDp = 400,
    heightDp = 867,
    dpi = 432,
  ),
  // https://www.gsmarena.com/google_pixel_6-11037.php
  "pixel_6" to DeviceSpec(
    widthDp = 420,
    heightDp = 934,
    dpi = 411,
  ),
  // https://www.gsmarena.com/google_pixel_6_pro-10918.php
  "pixel_6_pro" to DeviceSpec(
    widthDp = 450,
    heightDp = 975,
    dpi = 512,
  ),
  // https://www.gsmarena.com/google_pixel_6a-11229.php
  "pixel_6a" to DeviceSpec(
    widthDp = 403,
    heightDp = 895,
    dpi = 429,
  ),
  // https://www.gsmarena.com/google_pixel_7-11903.php
  "pixel_7" to DeviceSpec(
    widthDp = 415,
    heightDp = 923,
    dpi = 416,
  ),
  // https://www.gsmarena.com/google_pixel_7_pro-11908.php
  "pixel_7_pro" to DeviceSpec(
    widthDp = 450,
    heightDp = 975,
    dpi = 512,
  ),
  // https://www.gsmarena.com/google_pixel_7a-12170.php
  "pixel_7a" to DeviceSpec(
    widthDp = 403,
    heightDp = 895,
    dpi = 429,
  ),
  // https://www.gsmarena.com/google_pixel_fold-12265.php
  "pixel_fold" to DeviceSpec(
    widthDp = 779,
    heightDp = 935,
    dpi = 378,
  ),
  // https://www.gsmarena.com/google_pixel_tablet-11905.php
  "pixel_tablet" to DeviceSpec(
    widthDp = 1484,
    heightDp = 928,
    dpi = 276,
  ),
)

fun configToDeviceSpec(config: ComposePreviewSnapshotConfig): DeviceSpec? =
  Profiler.trace("configToDeviceSpec") {
    val devicePreviewString = parseDevicePreviewString(config.device)
    return@trace when {
      devicePreviewString?.name != null -> KNOWN_DEVICE_SPECS[devicePreviewString.name]
      devicePreviewString?.id != null -> KNOWN_DEVICE_SPECS[devicePreviewString.id]
      else -> {
        var widthDp = config.widthDp ?: devicePreviewString?.widthDp
        var heightDp = config.heightDp ?: devicePreviewString?.heightDp

        if (devicePreviewString?.orientation == "landscape") {
          val height = heightDp
          heightDp = widthDp
          widthDp = height
        }

        DeviceSpec(
          heightDp = heightDp,
          widthDp = widthDp,
          // https://cs.android.com/android-studio/platform/tools/adt/idea/+/mirror-goog-studio-main:preview-elements/src/com/android/tools/preview/config/Constants.kt;l=80
          dpi = devicePreviewString?.dpi ?: DisplayMetrics.DENSITY_420,
        )
      }
    }
  }

data class DevicePreviewString(
  val type: String,
  val id: String? = null,
  val name: String? = null,
  val widthDp: Int? = null,
  val heightDp: Int? = null,
  val dpi: Int? = null,
  val orientation: String? = null,
  // Intentionally not supporting `shape`
)

fun parseDevicePreviewString(deviceString: String?): DevicePreviewString? =
  Profiler.trace("parseDevicePreviewString") {
    if (deviceString.isNullOrEmpty()) return@trace null

    val idPattern = Regex("""id:(?<id>[a-zA-Z0-9_ ]+)""")
    val namePattern = Regex("""name:(?<name>[a-zA-Z0-9_ ]+)""")
    val specPattern = Regex("""spec:(?<spec>.+)""")

    return@trace when {
      idPattern.matchEntire(deviceString) != null -> {
        val match = idPattern.matchEntire(deviceString)!!
        DevicePreviewString(type = "id", id = match.groups["id"]?.value)
      }

      namePattern.matchEntire(deviceString) != null -> {
        val match = namePattern.matchEntire(deviceString)!!
        DevicePreviewString(type = "name", name = match.groups["name"]?.value)
      }

      specPattern.matchEntire(deviceString) != null -> {
        val match = specPattern.matchEntire(deviceString)!!
        val specContent = match.groups["spec"]?.value ?: return@trace null
        parseSpecContent(specContent)
      }

      else -> null
    }
  }

private fun parseSpecContent(specContent: String): DevicePreviewString =
  Profiler.trace("parseSpecContent") {
    val paramPattern = Regex("""([^,:\s]\w+)=([^,]+)""")
    val params = paramPattern.findAll(specContent)
      .associate { it.groupValues[1].trim() to it.groupValues[2].trim() }

    return@trace DevicePreviewString(
      type = "spec",
      id = params["id"],
      // Currently assuming dp, add support later if needed for other values
      widthDp = params["width"]?.removeSuffix("dp")?.toIntOrNull(),
      heightDp = params["height"]?.removeSuffix("dp")?.toIntOrNull(),
      dpi = params["dpi"]?.toIntOrNull(),
      orientation = params["orientation"]?.lowercase()
    )
  }
