package com.emergetools.snapshots

import android.util.Log
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runners.model.FrameworkMethod

internal class SnapshotsRunner(testClass: Class<*>) : AndroidJUnit4ClassRunner(testClass) {

	override fun computeTestMethods(): MutableList<FrameworkMethod> {
		testClass.getAnnotatedFields(Rule::class.java).joinToString("\n") {
			"Field: ${it.name} ${it.type}"
		}.also { Log.d("SnapshotsRunner", it) }

		val hasEmergeSnapshotTestRule = testClass.getAnnotatedFields(Rule::class.java)
			.filterIsInstance<EmergeSnapshots>()
			.isNotEmpty()

		return if (!hasEmergeSnapshotTestRule) {
			mutableListOf()
		} else {
			testClass.getAnnotatedMethods(Test::class.java)
		}
	}
}
