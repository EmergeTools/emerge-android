package com.emergetools.test.annotations

/**
 * Specifies the annotated function is an Emerge performance test.
 * Emerge performance tests are inherently different from [EmergeStartupTest] annotated methods in
 * that they measure the duration differently.
 * [EmergeTest] measures over the duration of the test, or span durations if present.
 * [EmergeStartupTest] measures from process start to first frame.
 */
@Target(AnnotationTarget.FUNCTION)
annotation class EmergeTest(val spans: Array<String> = [])
