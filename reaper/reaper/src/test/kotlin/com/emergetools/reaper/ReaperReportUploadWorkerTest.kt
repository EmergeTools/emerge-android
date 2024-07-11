package com.emergetools.reaper

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ReaperReportUploadWorkerTest {
  @Test
  fun longToBase64() {
    Assertions.assertEquals("AAAAAAAAAAA=", longToBase64(0L))
    Assertions.assertEquals("//////////8=", longToBase64(-1L))
    Assertions.assertEquals("3NDsIm6WAzI=", longToBase64(0x3203966e22ecd0dcL))
  }
}
