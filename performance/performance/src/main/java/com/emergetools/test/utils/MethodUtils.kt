package com.emergetools.test.utils

import com.emergetools.test.annotations.EmergeStartupTest
import com.emergetools.test.annotations.EmergeTest

inline fun <reified T : Annotation> hasAnnotatedMethod(testClass: Class<*>): Boolean {
  @Suppress("SwallowedException")
  try {
    for (testMethod in testClass.methods) {
      if (testMethod.isAnnotationPresent(T::class.java)) {
        return true
      }
    }
  } catch (t: Throwable) {
    return false
  }
  return false
}

fun hasEmergeTestMethods(testClass: Class<*>): Boolean =
  hasAnnotatedMethod<EmergeTest>(testClass)

fun hasEmergeStartupTestMethods(testClass: Class<*>): Boolean =
  hasAnnotatedMethod<EmergeStartupTest>(testClass)
