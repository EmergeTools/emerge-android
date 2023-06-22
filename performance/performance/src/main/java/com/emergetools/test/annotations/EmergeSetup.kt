package com.emergetools.test.annotations

/**
 * Specifies the annotated function be run before each iteration of an [EmergeTest] annotated
 * method.
 */
@Target(AnnotationTarget.FUNCTION)
annotation class EmergeSetup
