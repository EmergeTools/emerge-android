package com.emergetools.snapshots

import android.app.Activity
import android.view.View
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.test.captureToImage
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onRoot
import androidx.test.runner.screenshot.Screenshot
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class EmergeSnapshots : TestRule {

	private lateinit var testClass: String
	private lateinit var testName: String

	override fun apply(
		base: Statement,
		description: Description,
	): Statement {
		testClass = description.className
		testName = description.methodName
		return base
	}

	fun take(
		name: String,
		view: View,
	) = SnapshotSaver.save(
		name = name,
		bitmap = Screenshot.capture(view).bitmap,
		testClass = testClass,
		testMethod = testName,
	)

	fun take(
		name: String,
		activity: Activity,
	) = SnapshotSaver.save(
		name = name,
		bitmap = Screenshot.capture(activity).bitmap,
		testClass = testClass,
		testMethod = testName,
	)

	fun take(
		name: String,
		composeTestRule: ComposeTestRule,
	) {
		composeTestRule.waitForIdle()
		SnapshotSaver.save(
			name = name,
			bitmap = composeTestRule.onRoot().captureToImage().asAndroidBitmap(),
			testClass = testClass,
			testMethod = testName,
		)
	}
}
