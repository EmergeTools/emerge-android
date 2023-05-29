package com.emergetools.android.gradle.util

import org.codehaus.groovy.runtime.ProcessGroovyMethods

internal fun String.execute() = ProcessGroovyMethods.execute(this)

internal val Process.trimmedText: String? get() = ProcessGroovyMethods.getText(this)?.trimEnd()
