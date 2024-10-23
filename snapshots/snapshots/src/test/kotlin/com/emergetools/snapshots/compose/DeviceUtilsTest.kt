package com.emergetools.snapshots.compose

import org.junit.Assert.assertEquals
import org.junit.Test

class DeviceUtilsTest {

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
      "invalid string" to null,
      "spec:width=390dp,height=860dp" to DevicePreviewString(
        type = "spec",
        widthDp = 390,
        heightDp = 860
      ),
      "spec:width=673dp, height=841dp, orientation=portrait, dpi=480" to DevicePreviewString(
        type = "spec",
        widthDp = 673,
        heightDp = 841,
        orientation = "portrait",
        dpi = 480
      ),
    )

    for ((input, expected) in testCases) {
      val result = parseDevicePreviewString(input)
      assertEquals(expected, result)
    }
  }
}
