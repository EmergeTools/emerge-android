package com.emergetools.snapshots.sample.ui

import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.emergetools.snapshots.runtime.annotations.EmergeAppStoreSnapshot

@Preview(showBackground = true, device = Devices.PIXEL_5, showSystemUi = true)
@Preview(showBackground = true, device = Devices.PIXEL_6_PRO, showSystemUi = true)
@Preview(showBackground = true, device = Devices.PIXEL_7, showSystemUi = true)
@Preview(showBackground = true, device = Devices.PIXEL_TABLET, showSystemUi = true)
@EmergeAppStoreSnapshot
annotation class AppStoreScreenshotPreviews
