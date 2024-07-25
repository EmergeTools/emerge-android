@file:Suppress("MaxLineLength", "MaximumLineLength")

package com.emergetools.snapshots.compose

import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import kotlin.math.abs

data class DimensionSpec(
  val widthDp: Int? = null,
  val heightDp: Int? = null,
  val densityPpi: Int? = null,
  val scalingFactor: Float? = null,
  val fontScale: Float? = null,
)

data class DeviceSpec(
  val widthPixels: Int,
  val heightPixels: Int,
  val densityPpi: Int,
) {
  // https://m3.material.io/blog/device-metrics
  val dimensionSpec: DimensionSpec
    get() {
      val proportion = densityPpi / MDPI_THRESHOLD
      val widthDp = widthPixels / proportion
      val heightDp = heightPixels / proportion
      return DimensionSpec(
        widthDp = widthDp,
        heightDp = heightDp,
        densityPpi = densityPpi,
        scalingFactor = getClosestDensityScalingFactor(densityPpi),
      )
    }

  companion object {
    private const val LDPI_THRESHOLD = 120
    private const val MDPI_THRESHOLD = 160
    private const val HDPI_THRESHOLD = 240
    private const val XHDPI_THRESHOLD = 320
    private const val XXHDPI_THRESHOLD = 480
    private const val XXXHDPI_THRESHOLD = 640
    private const val LDPI_SCALE = 0.75f
    private const val MDPI_SCALE = 1f
    private const val HDPI_SCALE = 1.5f
    private const val XHDPI_SCALE = 2f
    private const val XXHDPI_SCALE = 3f
    private const val XXXHDPI_SCALE = 4f

    // https://m3.material.io/blog/device-metrics#finding-the-density-bucket
    fun getClosestDensityScalingFactor(dpi: Int): Float {
      val densityMap = mapOf(
        LDPI_THRESHOLD to LDPI_SCALE,
        MDPI_THRESHOLD to MDPI_SCALE,
        HDPI_THRESHOLD to HDPI_SCALE,
        XHDPI_THRESHOLD to XHDPI_SCALE,
        XXHDPI_THRESHOLD to XXHDPI_SCALE,
        XXXHDPI_THRESHOLD to XXXHDPI_SCALE,
      )

      var closestDensityScaling = MDPI_SCALE
      var smallestDifference = Int.MAX_VALUE

      for ((key, value) in densityMap.entries) {
        val difference = abs(dpi - key)
        if (difference < smallestDifference) {
          smallestDifference = difference
          closestDensityScaling = value
        }
      }

      return closestDensityScaling
    }
  }
}

val KNOWN_DEVICE_SPECS = mapOf<String, DeviceSpec>(
  // https://www.gsmarena.com/asus_google_nexus_7-4850.php
  "Nexus 7" to DeviceSpec(
    widthPixels = 800,
    heightPixels = 1280,
    densityPpi = 216,
  ),
  // https://www.gsmarena.com/asus_google_nexus_7_(2013)-5600.php
  "Nexus 7 2013" to DeviceSpec(
    widthPixels = 1200,
    heightPixels = 1920,
    densityPpi = 323,
  ),
  // https://www.gsmarena.com/lg_nexus_5-5705.php
  "Nexus 5" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 1920,
    densityPpi = 445,
  ),
  // https://www.gsmarena.com/motorola_nexus_6-6604.php,
  "Nexus 6" to DeviceSpec(
    widthPixels = 1440,
    heightPixels = 2560,
    densityPpi = 493,
  ),
  // https://www.gsmarena.com/lg_nexus_5-5705.php
  "Nexus 9" to DeviceSpec(
    widthPixels = 1440,
    heightPixels = 2560,
    densityPpi = 518,
  ),
  // https://www.gsmarena.com/samsung_google_nexus_10_p8110-5084.php
  "Nexus 10" to DeviceSpec(
    widthPixels = 2560,
    heightPixels = 1600,
    densityPpi = 299,
  ),
  // https://www.gsmarena.com/lg_nexus_5x-7556.php
  "Nexus 5X" to DeviceSpec(
    widthPixels = 2560,
    heightPixels = 1600,
    densityPpi = 299,
  ),
  // https://www.gsmarena.com/huawei_nexus_6p-7588.php
  "Nexus 6P" to DeviceSpec(
    widthPixels = 1440,
    heightPixels = 2560,
    densityPpi = 518,
  ),
  // https://www.gsmarena.com/google_pixel_c-7826.php
  "pixel_c" to DeviceSpec(
    widthPixels = 2560,
    heightPixels = 1800,
    densityPpi = 308,
  ),
  // https://www.gsmarena.com/google_pixel-8346.php
  "pixel" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 1920,
    densityPpi = 441,
  ),
  // https://www.gsmarena.com/google_pixel_xl-8345.php
  "pixel_xl" to DeviceSpec(
    widthPixels = 1440,
    heightPixels = 2560,
    densityPpi = 534,
  ),
  // https://www.gsmarena.com/google_pixel_2-8733.php
  "pixel_2" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 1920,
    densityPpi = 441,
  ),
  // https://www.gsmarena.com/google_pixel_2_xl-8720.php
  "pixel_2_xl" to DeviceSpec(
    widthPixels = 1440,
    heightPixels = 2880,
    densityPpi = 538,
  ),
  // https://www.gsmarena.com/google_pixel_3-9256.php
  "pixel_3" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 2160,
    densityPpi = 443,
  ),
  // https://www.gsmarena.com/google_pixel_3_xl-9257.php
  "pixel_3_xl" to DeviceSpec(
    widthPixels = 1440,
    heightPixels = 2960,
    densityPpi = 523,
  ),
  // https://www.gsmarena.com/google_pixel_3a-9408.php
  "pixel_3a" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 2220,
    densityPpi = 441,
  ),
  // https://www.gsmarena.com/google_pixel_3a_xl-9690.php
  "pixel_3a_xl" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 2160,
    densityPpi = 402,
  ),
  // https://www.gsmarena.com/google_pixel_4-9896.php
  "pixel_4" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 2280,
    densityPpi = 444,
  ),
  // https://www.gsmarena.com/google_pixel_4_xl-9895.php
  "pixel_4_xl" to DeviceSpec(
    widthPixels = 1440,
    heightPixels = 3040,
    densityPpi = 537,
  ),
  // https://www.gsmarena.com/google_pixel_4a-10123.php
  "pixel_4a" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 2340,
    densityPpi = 443,
  ),
  // https://www.gsmarena.com/google_pixel_5-10386.php
  "pixel_5" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 2340,
    densityPpi = 432,
  ),
  // https://www.gsmarena.com/google_pixel_6-11037.php
  "pixel_6" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 2400,
    densityPpi = 411,
  ),
  // https://www.gsmarena.com/google_pixel_6_pro-10918.php
  "pixel_6_pro" to DeviceSpec(
    widthPixels = 1440,
    heightPixels = 3120,
    densityPpi = 512,
  ),
  // https://www.gsmarena.com/google_pixel_6a-11229.php
  "pixel_6a" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 2400,
    densityPpi = 429,
  ),
  // https://www.gsmarena.com/google_pixel_7-11903.php
  "pixel_7" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 2400,
    densityPpi = 416,
  ),
  // https://www.gsmarena.com/google_pixel_7_pro-11908.php
  "pixel_7_pro" to DeviceSpec(
    widthPixels = 1440,
    heightPixels = 3120,
    densityPpi = 512,
  ),
  // https://www.gsmarena.com/google_pixel_7a-12170.php
  "pixel_7a" to DeviceSpec(
    widthPixels = 1080,
    heightPixels = 2400,
    densityPpi = 429,
  ),
  // https://www.gsmarena.com/google_pixel_fold-12265.php
  "pixel_fold" to DeviceSpec(
    widthPixels = 1840,
    heightPixels = 2208,
    densityPpi = 378,
  ),
  // https://www.gsmarena.com/google_pixel_tablet-11905.php
  "pixel_tablet" to DeviceSpec(
    widthPixels = 2560,
    heightPixels = 1600,
    densityPpi = 276,
  ),
)

fun configToDeviceSpec(config: ComposePreviewSnapshotConfig): DeviceSpec? {
  val devicePreviewString = parseDevicePreviewString(config.device)
  return when {
    devicePreviewString?.name != null -> KNOWN_DEVICE_SPECS[devicePreviewString.name]
    devicePreviewString?.id != null -> KNOWN_DEVICE_SPECS[devicePreviewString.id]
    else -> null
  }
}

fun configToDimensionSpec(
  config: ComposePreviewSnapshotConfig,
): DimensionSpec {
  val devicePreviewString = parseDevicePreviewString(config.device)
  val densityPpi = devicePreviewString?.dpi
  val dimensionSpec: DimensionSpec? = when {
    devicePreviewString?.name != null -> KNOWN_DEVICE_SPECS[devicePreviewString.name]?.dimensionSpec
    devicePreviewString?.id != null -> KNOWN_DEVICE_SPECS[devicePreviewString.id]?.dimensionSpec
    else -> DimensionSpec(
      widthDp = devicePreviewString?.widthDp,
      heightDp = devicePreviewString?.heightDp,
      densityPpi = densityPpi,
      scalingFactor = densityPpi?.let(DeviceSpec::getClosestDensityScalingFactor)
    )
  }

  // Override final values with those specified by user (width/height), and use the default values if not specified
  return DimensionSpec(
    widthDp = config.widthDp ?: dimensionSpec?.widthDp,
    heightDp = config.heightDp ?: dimensionSpec?.heightDp,
    fontScale = config.fontScale,
    densityPpi = dimensionSpec?.densityPpi,
    scalingFactor = dimensionSpec?.scalingFactor,
  )
}

data class DevicePreviewString(
  val type: String,
  val id: String? = null,
  val name: String? = null,
  val widthDp: Int? = null,
  val heightDp: Int? = null,
  val dpi: Int? = null
)

fun parseDevicePreviewString(deviceString: String?): DevicePreviewString? {
  if (deviceString.isNullOrEmpty()) return null

  // All formats of this string can be found at:
  // https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/ui/ui-tooling-preview/src/androidMain/kotlin/androidx/compose/ui/tooling/preview/Device.android.kt;bpv=0
  val devicePattern = Regex(
    """(id:(?<id>[a-zA-Z0-9_ ]+))|(name:(?<name>[a-zA-Z0-9_ ]+))|(spec:id=(?<specId>[a-zA-Z0-9_]+),shape=(?<shape>[a-zA-Z0-9_]+),width=(?<width>\d+),height=(?<height>\d+),unit=(?<unit>[a-zA-Z]+),dpi=(?<dpi>\d+))"""
  )

  val matchResult = devicePattern.matchEntire(deviceString)
  return matchResult?.let { result ->
    val groups = result.groups
    when {
      groups["id"]?.value != null -> DevicePreviewString(type = "id", id = groups["id"]?.value)
      groups["name"]?.value != null -> DevicePreviewString(
        type = "name",
        name = groups["name"]?.value
      )

      groups["specId"]?.value != null -> DevicePreviewString(
        type = "spec",
        id = groups["specId"]?.value,
        widthDp = groups["width"]?.value?.toInt(),
        heightDp = groups["height"]?.value?.toInt(),
        dpi = groups["dpi"]?.value?.toInt(),
      )

      else -> null
    }
  }
}
