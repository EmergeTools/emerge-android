package com.emergetools.snapshots

import com.emergetools.snapshots.compose.localeForLanguageCode
import org.junit.Assert.assertEquals
import org.junit.Test

class UtilsTest {

  @Test
  fun `makes en locale`() {
    val locale = localeForLanguageCode("en")
    assertEquals("en", locale.language)
    assertEquals("", locale.country)
  }

  @Test
  fun `makes en-US locale`() {
    val locale = localeForLanguageCode("en-US")
    assertEquals("en", locale.language)
    assertEquals("US", locale.country)
  }

  @Test
  fun `makes es locale`() {
    val locale = localeForLanguageCode("es")
    assertEquals("es", locale.language)
    assertEquals("", locale.country)
  }

  @Test
  fun `makes es-ES locale`() {
    val locale = localeForLanguageCode("es-ES")
    assertEquals("es", locale.language)
    assertEquals("ES", locale.country)
  }

  @Test
  fun `makes es-rES locale`() {
    val locale = localeForLanguageCode("es-rES")
    assertEquals("es", locale.language)
    assertEquals("RES", locale.country)
  }

  @Test
  fun `makes de locale`() {
    val locale = localeForLanguageCode("de")
    assertEquals("de", locale.language)
    assertEquals("", locale.country)
  }

  @Test
  fun `makes de-DE locale`() {
    val locale = localeForLanguageCode("de-DE")
    assertEquals("de", locale.language)
    assertEquals("DE", locale.country)
  }
}
