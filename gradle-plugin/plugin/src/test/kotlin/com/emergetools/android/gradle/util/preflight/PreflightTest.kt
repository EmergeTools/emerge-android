package com.emergetools.android.gradle.util.preflight

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PreflightTest {
  @Test
  fun `marks successful checks as succeeded`() {
    val preflight = Preflight("Douglas Adams")
    preflight.add("Always succeeds") {}
    assertTrue(preflight.isSuccessful())
  }

  @Test
  fun `marks failed checks as failed`() {
    val preflight = Preflight("Douglas Adams")
    preflight.add("Always fails") {
      throw PreflightFailure("failure")
    }
    assertFalse(preflight.isSuccessful())
  }

  @Test
  fun `mixed checks are failures`() {
    val preflight = Preflight("Douglas Adams")
    preflight.add("Always succeeds") {}
    preflight.add("Always fails") {
      throw PreflightFailure("failure")
    }
    assertFalse(preflight.isSuccessful())
  }

  @Test
  fun `renders successful preflight nicely`() {
    val preflight = Preflight("Douglas Adams")
    preflight.add("HHGTTG open to page 42") {}
    preflight.add("Towel on person") {}
    preflight.add("Tea hot") {}
    assertEquals(
      """
      ╔════════════════════════════════════╗
      ║ Douglas Adams was successful (3/3) ║
      ╠════════════════════════════════════╝
      ╠═ ✅ HHGTTG open to page 42
      ╠═ ✅ Towel on person
      ╚═ ✅ Tea hot
      """.trimIndent(),
      preflight.render(),
    )
  }

  @Test
  fun `renders unsuccessful preflight nicely`() {
    val preflight = Preflight("Douglas Adams")
    preflight.add("HHGTTG open to page 42") {}
    preflight.add("Towel on person") {
      throw PreflightFailure("Towel missing!")
    }
    preflight.add("Tea hot") {}
    assertEquals(
      """
      ╔════════════════════════════╗
      ║ Douglas Adams failed (2/3) ║
      ╠════════════════════════════╝
      ╠═ ✅ HHGTTG open to page 42
      ╠═ ❌ Towel on person
      ╚═ ✅ Tea hot
      """.trimIndent(),
      preflight.render(),
    )
  }

  @Test
  fun `renders errors nicely`() {
    val preflight = Preflight("Douglas Adams")
    preflight.add("HHGTTG open to page 42") {}
    preflight.add("Towel on person") {
      throw PreflightFailure("Towel missing!")
    }
    preflight.add("Tea hot") {
      throw PreflightFailure(
        """
        Tea cold!
        Expected:
          boiling
        was
          lukewarm
        """.trimIndent(),
      )
    }
    assertEquals(
      """
      Errors:
        ❌ Towel missing!
        ❌ Tea cold!
      Expected:
        boiling
      was
        lukewarm
      """.trimIndent(),
      preflight.renderErrors(),
    )
  }
}
