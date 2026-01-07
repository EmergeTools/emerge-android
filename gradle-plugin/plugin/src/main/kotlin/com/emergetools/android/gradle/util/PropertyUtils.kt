package com.emergetools.android.gradle.util

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property

internal inline fun <reified T : Any> ObjectFactory.property(): Property<T> = property(T::class.javaObjectType)

internal fun <T> Property<T>.orEmpty() = orNull ?: ""
