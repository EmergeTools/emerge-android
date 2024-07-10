package com.emergetools.snapshots.compose

import org.junit.Assert.assertEquals
import org.junit.Test

class DeviceUtilsTest {

  @Test
  fun `test properly gets closest density scaling factors`() {
    val testCases = listOf(
      120 to 0.75f,
      160 to 1f,
      240 to 1.5f,
      320 to 2f,
      480 to 3f,
      640 to 4f,
      100 to 0.75f,
      150 to 1f,
      220 to 1.5f,
      290 to 2f,
      500 to 3f,
      700 to 4f
    )

    for ((input, expected) in testCases) {
      val result = DeviceSpec.getClosestDensityScalingFactor(input)
      assertEquals(expected, result)
    }
  }

  @Test
  fun `test properly parses device preview strings`() {
    val testCases = listOf(
      "id:Nexus 7" to DevicePreviewString(type = "id", id = "Nexus 7"),
      "id:Nexus 7 2013" to DevicePreviewString(type = "id", id = "Nexus 7 2013"),
      "name:Nexus 10" to DevicePreviewString(type = "name", name = "Nexus 10"),
      "spec:id=reference_phone,shape=Normal,width=411,height=891,unit=dp,dpi=420" to DevicePreviewString(
        type = "spec",
        id = "reference_phone",
        widthDp = 411,
        heightDp = 891,
        dpi = 420
      ),
      null to null,
      "" to null,
      "invalid string" to null
    )

    for ((input, expected) in testCases) {
      val result = parseDevicePreviewString(input)
      assertEquals(expected, result)
    }
  }
}
