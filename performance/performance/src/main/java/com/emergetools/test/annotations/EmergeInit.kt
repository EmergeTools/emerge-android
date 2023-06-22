package com.emergetools.test.annotations

/**
 * Specifies the annotated function be run exactly once to setup overall application state.
 */
@Target(AnnotationTarget.FUNCTION)
annotation class EmergeInit
