package com.emergetools.snapshots.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.emergetools.snapshots.sample.ui.Greeting
import com.emergetools.snapshots.sample.ui.TextRowWithIcon

class MainActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		setContent {
			Column {
				Greeting("Snapshots sample")
				TextRowWithIcon(
					titleText = "TextRow title",
					subtitleText = "TextRow subtitle"
				)
			}
		}
	}
}
