package com.emergetools.snapshots

import com.emergetools.snapshots.SnapshotSaver.keyName
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class KeyNameTest {

  @Test
  fun `keyName for COMPOSABLE snapshot without ComposePreviewSnapshotConfig throws exception`() {
    assertThrows(IllegalStateException::class.java) {
      keyName(SnapshotType.COMPOSABLE, null)
    }
  }

  @Test
  fun `keyName for non-COMPOSABLE snapshot without displayName throws exception`() {
    assertThrows(IllegalStateException::class.java) {
      keyName(SnapshotType.VIEW, null)
    }
  }

  @Test
  fun `keyName for COMPOSABLE snapshot with default ComposePreviewSnapshotConfig returns originalFqn`() {
    val config = ComposePreviewSnapshotConfig("com.example.test.Composable")
    val result = keyName(SnapshotType.COMPOSABLE, null, config)
    assertEquals("com.example.test.Composable", result)
  }

  @Test
  fun `keyName for COMPOSABLE snapshot with non-default ComposePreviewSnapshotConfig returns concatenated name`() {
    val config = ComposePreviewSnapshotConfig(
      "com.example.test.Composable",
      uiMode = 1,
      locale = "en_US",
      fontScale = 1.5f
    )
    val result = keyName(SnapshotType.COMPOSABLE, null, config)
    assertEquals("com.example.test.Composable_uim_1_loc_en_US_fsc_1.5", result)
  }

  @Test
  fun `keyName for non-COMPOSABLE snapshot returns normalized displayName`() {
    val result = keyName(SnapshotType.VIEW, "testDisplayName")
    // Assuming normalization doesn't alter "testDisplayName" and MAX_KEY_NAME_LENGTH is large enough
    assertEquals("testdisplayname", result)
  }
}
