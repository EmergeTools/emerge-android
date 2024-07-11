package com.emergetools.android.gradle.instrumentation.reaper

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.Base64

class ReaperClassLoadTest {

  fun byteArrayOf(vararg elements: Int): ByteArray {
    return elements.map { it.toByte() }.toByteArray()
  }

  @Test
  fun toBase64Sha256() {
    val hash = toSha256("Lcom/example/ExampleKt;")
    val base64 = Base64.getEncoder().encode(hash).toString(Charsets.UTF_8)
    Assertions.assertEquals(
        "eJstGDKanIhi3JzCGQ2w3x5We26SD1B1TPzVsups6fY=",
        base64
    )
  }

  @Test
  fun topLong() {
    Assertions.assertEquals(0, topLong(byteArrayOf(0, 0, 0, 0, 0, 0, 0, 0)))
    Assertions.assertEquals(1, topLong(byteArrayOf(1, 0, 0, 0, 0, 0, 0, 0)))
    Assertions.assertEquals(42, topLong(byteArrayOf(42, 0, 0, 0, 0, 0, 0, 0)))
    Assertions.assertEquals(0x0fffffffffffffffL, topLong(byteArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x0f)))
    Assertions.assertEquals(0x0fcdab8967452301L, topLong(byteArrayOf(0x01, 0x23, 0x45, 0x67, 0x89, 0xab, 0xcd, 0x0f)))
    Assertions.assertEquals(-1167088121787636991L, topLong(byteArrayOf(0x01, 0x23, 0x45, 0x67, 0x89, 0xab, 0xcd, 0xef)))
    Assertions.assertEquals(-1167088121787636991L, topLong(byteArrayOf(0x01, 0x23, 0x45, 0x67, 0x89, 0xab, 0xcd, 0xef, 0xff, 0xff)))
  }

}
