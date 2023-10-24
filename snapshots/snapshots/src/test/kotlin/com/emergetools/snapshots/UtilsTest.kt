package com.emergetools.snapshots

import com.emergetools.snapshots.SnapshotSaver.keyName
import com.emergetools.snapshots.shared.ComposePreviewSnapshotConfig
import com.emergetools.snapshots.shared.EMGLocale
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class UtilsTest {

  @Test
  fun `makes en locale`() {
    val locale = EMGLocale.forLanguageCode("en")
    assertEquals("en", locale.language)
    assertEquals("", locale.country)
  }

  @Test
  fun `makes en-US locale`() {
    val locale = EMGLocale.forLanguageCode("en-US")
    assertEquals("en", locale.language)
    assertEquals("US", locale.country)
  }

  @Test
  fun `makes es locale`() {
    val locale = EMGLocale.forLanguageCode("es")
    assertEquals("es", locale.language)
    assertEquals("", locale.country)
  }

  @Test
  fun `makes es-ES locale`() {
    val locale = EMGLocale.forLanguageCode("es-ES")
    assertEquals("es", locale.language)
    assertEquals("ES", locale.country)
  }

  @Test
  fun `makes es-rES locale`() {
    val locale = EMGLocale.forLanguageCode("es-rES")
    assertEquals("es", locale.language)
    assertEquals("RES", locale.country)
  }

  @Test
  fun `makes de locale`() {
    val locale = EMGLocale.forLanguageCode("de")
    assertEquals("de", locale.language)
    assertEquals("", locale.country)
  }

  @Test
  fun `makes de-DE locale`() {
    val locale = EMGLocale.forLanguageCode("de-DE")
    assertEquals("de", locale.language)
    assertEquals("DE", locale.country)
  }
}
