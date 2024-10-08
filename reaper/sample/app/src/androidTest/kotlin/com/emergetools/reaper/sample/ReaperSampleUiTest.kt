package com.emergetools.reaper.sample

import android.content.Context
import android.content.Intent
import androidx.test.core.app.ApplicationProvider
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ReaperSampleUiTest {

  @Test
  fun navigateToDetailScreen() {
    val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    device.pressHome()

    val launcherPackage: String = device.launcherPackageName
    assertNotNull(launcherPackage)
    device.wait(
      Until.hasObject(By.pkg(launcherPackage).depth(0)),
      5000,
    )

    val context = ApplicationProvider.getApplicationContext<Context>()

    val intent = context.packageManager.getLaunchIntentForPackage(
      context.packageName
    )?.apply {
      // Clear out any previous instances
      addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
    }
    context.startActivity(intent)

    // Wait for the app to appear
    device.wait(
      Until.hasObject(By.pkg(context.packageName).depth(0)),
      5000
    )

    // Click on the first item in the list
    device.findObject(By.text("Story 1")).click()

    // Give time to land on next screen
    Thread.sleep(1000)

    // Background app for reaper report to post
    device.pressHome()

    // Give reaper report time to post
    Thread.sleep(5000)
  }
}
