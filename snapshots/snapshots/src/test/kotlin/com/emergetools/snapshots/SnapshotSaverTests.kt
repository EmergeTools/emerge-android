package com.emergetools.snapshots

import com.emergetools.snapshots.SnapshotSaver.MAX_NAME_LENGTH
import com.emergetools.snapshots.SnapshotSaver.normalize
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import org.junit.Assert.assertEquals
import org.junit.Test

class SnapshotSaverTests {

  // keyName
  @Test
  fun `test keyName with null ComposePreviewSnapshotConfig`() {
    val displayName = "TestName"
    val expected = displayName.normalize().take(MAX_NAME_LENGTH)

    val actual = SnapshotSaver.keyName(displayName)

    assertEquals(expected, actual)
  }

  @Test
  fun `test keyName with non-default ComposePreviewSnapshotConfig with name and group set`() {
    val displayName = "TestName"
    val config = ComposePreviewSnapshotConfig(name = "Test", group = "Group")

    val expected = "${displayName.normalize().take(MAX_NAME_LENGTH)}_${config.hashCode()}"

    val actual = SnapshotSaver.keyName(displayName, config)

    assertEquals(expected, actual)
  }

  @Test
  fun `test keyName with non-default ComposePreviewSnapshotConfig with uiMode and fontScale set`() {
    val displayName = "TestName"
    val config = ComposePreviewSnapshotConfig(uiMode = 1, fontScale = 1.5f)

    val expected = "${displayName.normalize().take(MAX_NAME_LENGTH)}_${config.hashCode()}"

    val actual = SnapshotSaver.keyName(displayName, config)

    assertEquals(expected, actual)
  }

  @Test
  fun `test keyName with long displayName`() {
    val displayName = "TestName".repeat(15) // Assuming this is longer than MAX_NAME_LENGTH
    val expected = displayName.normalize().take(MAX_NAME_LENGTH)

    val actual = SnapshotSaver.keyName(displayName)

    assertEquals(expected, actual)
  }

  @Test
  fun `test keyName with default ComposePreviewSnapshotConfig`() {
    val displayName = "TestName"
    val config = ComposePreviewSnapshotConfig.DEFAULT

    val expected = displayName.normalize().take(MAX_NAME_LENGTH)

    val actual = SnapshotSaver.keyName(displayName, config)

    assertEquals(expected, actual)
  }

  // normalize

  @Test
  fun `test normalize with simple string`() {
    val input = "TestName"
    val expected = "testname" // lower case, no symbols to replace

    val actual = input.normalize()

    assertEquals(expected, actual)
  }

  @Test
  fun `test normalize with string containing symbols`() {
    val input = "Test Name-1.0"
    val expected = "test_name_1_0" // lower case, symbols replaced

    val actual = input.normalize()

    assertEquals(expected, actual)
  }

  @Test
  fun `test normalize with empty string`() {
    val input = ""
    val expected = "" // empty string remains the same

    val actual = input.normalize()

    assertEquals(expected, actual)
  }

  @Test
  fun `test normalize with string containing only symbols`() {
    val input = " .-"
    val expected = "___" // symbols replaced

    val actual = input.normalize()

    assertEquals(expected, actual)
  }
}
