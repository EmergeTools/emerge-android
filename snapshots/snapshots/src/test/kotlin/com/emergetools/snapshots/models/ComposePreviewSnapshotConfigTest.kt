package com.emergetools.snapshots.models

import org.junit.Assert.assertEquals
import org.junit.Test

class ComposePreviewSnapshotConfigTest {

  @Test
  fun `test keyName with default configuration`() {
    val config = ComposePreviewSnapshotConfig(
      fullyQualifiedClassName = "com.example.MyClass",
      originalFqn = "com.example.MyClass.original"
    )
    val expectedKeyName = "com.example.MyClass.original"
    assertEquals(expectedKeyName, config.keyName())
  }

  @Test
  fun `test keyName with non-default uiMode`() {
    val config = ComposePreviewSnapshotConfig(
      fullyQualifiedClassName = "com.example.MyClass",
      originalFqn = "com.example.MyClass.original",
      uiMode = 2
    )
    val expectedKeyName = "com.example.MyClass.original_uim_2"
    assertEquals(expectedKeyName, config.keyName())
  }

  @Test
  fun `test keyName with multiple non-default configurations`() {
    val config = ComposePreviewSnapshotConfig(
      fullyQualifiedClassName = "com.example.MyClass",
      originalFqn = "com.example.MyClass.original",
      uiMode = 2,
      locale = "en-US",
      widthDp = 320
    )
    val expectedKeyName = "com.example.MyClass.original_uim_2_loc_en-US_wdp_320"
    assertEquals(expectedKeyName, config.keyName())
  }

  @Test
  fun `test keyName with baseKey override`() {
    val config = ComposePreviewSnapshotConfig(
      fullyQualifiedClassName = "com.example.MyClass",
      originalFqn = "com.example.MyClass.original",
      uiMode = 2
    )
    val baseKey = "baseKeyOverride"
    val expectedKeyName = "baseKeyOverride_uim_2"
    assertEquals(expectedKeyName, config.keyName(baseKey))
  }

  @Test
  fun `test keyName with all non-default configurations`() {
    val config = ComposePreviewSnapshotConfig(
      fullyQualifiedClassName = "com.example.MyClass",
      originalFqn = "com.example.MyClass.original",
      uiMode = 2,
      locale = "en-US",
      fontScale = 1.5f,
      widthDp = 320,
      heightDp = 480,
      showBackground = true,
      backgroundColor = 0xFFFFFF,
      showSystemUi = true,
      device = "deviceModel",
      apiLevel = 29,
      wallpaper = 101
    )
    val expectedKeyName = "com.example.MyClass.original_uim_2_loc_en-US_fsc_1.5" +
      "_wdp_320_hdp_480_bg_true_bgc_16777215_sysui_true_dev_deviceModel_api_29_wp_101"
    assertEquals(expectedKeyName, config.keyName())
  }
}
