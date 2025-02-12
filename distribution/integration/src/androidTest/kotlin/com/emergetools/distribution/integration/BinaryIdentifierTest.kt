package com.emergetools.distribution.integration

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.emergetools.distribution.internal.getBinaryIdentifier
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BinaryIdentifierTest {
  @Test
  fun hasBinaryIdentifier() {
    val appContext = InstrumentationRegistry.getInstrumentation().targetContext
    val identifier = getBinaryIdentifier(appContext)
    assertThat(identifier).isNotNull()
  }
}