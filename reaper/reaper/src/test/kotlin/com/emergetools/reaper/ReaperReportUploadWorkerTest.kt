package com.emergetools.reaper

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers.any
import org.mockito.ArgumentMatchers.anyInt
import org.mockito.Mockito.mockStatic
import org.mockito.kotlin.whenever
import android.util.Base64 as AndroidBase64
import java.util.Base64 as JavaBase64

class ReaperReportUploadWorkerTest {
  @Test
  fun longToBase64() {
    val m = mockStatic(AndroidBase64::class.java)
    whenever(AndroidBase64.encodeToString(any(), anyInt())).thenAnswer { invocation ->
      JavaBase64.getEncoder().encode(invocation.arguments[0] as ByteArray).toString(Charsets.UTF_8)
    }

    Assertions.assertEquals("AAAAAAAAAAA=", longToBase64(0L))
    Assertions.assertEquals("//////////8=", longToBase64(-1L))
    Assertions.assertEquals("3NDsIm6WAzI=", longToBase64(0x3203966e22ecd0dcL))

    m.close()
  }
}
