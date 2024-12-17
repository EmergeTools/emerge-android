package com.emergetools.snapshots.util

class Profiler {

  private val stack = object : ThreadLocal<MutableList<String>>() {
    override fun initialValue(): MutableList<String> {
      return mutableListOf()
    }
  }
  private val foldedStacks = object : ThreadLocal<MutableList<String>>() {
    override fun initialValue(): MutableList<String> {
      return mutableListOf()
    }
  }

  private val startTime = object : ThreadLocal<Long>() {
    override fun initialValue(): Long {
      return 0L
    }
  }

  companion object {
    private val INSTANCE = Profiler()

    fun <T> trace(name: String, block: () -> T): T {
      return INSTANCE.traceInternal(name, block)
    }

    fun startSpan(name: String) {
      return INSTANCE.startSpanInternal(name)
    }

    fun stopSpan() {
      return INSTANCE.stopSpanInternal()
    }

    fun export(): String? {
      return INSTANCE.export()
    }
  }

  private fun <T> traceInternal(name: String, block: () -> T): T {
    startSpanInternal(name)
    return try {
      block()
    } finally {
      stopSpanInternal()
    }
  }

  private fun startSpanInternal(name: String) {
    val localStack = stack.get()
    if (localStack.isEmpty()) {
      startTime.set(System.currentTimeMillis())
    }
    localStack.add(name)
  }

  private fun stopSpanInternal() {
    val localStack = stack.get()
    val localFoldedStacks = foldedStacks.get()
    val localStartTime = startTime.get()

    if (localStack.isNotEmpty()) {
      val endTime = System.currentTimeMillis()
      val spanName = localStack.removeAt(localStack.size - 1)
      var foldedStack = localStack.joinToString(";")
      if (foldedStack.isNotEmpty()) {
        foldedStack = "$foldedStack;"
      }
      val duration = endTime - localStartTime
      localFoldedStacks.add("$foldedStack$spanName $duration")
    }
  }

  fun export(): String? {
    val localStack = stack.get()
    val localFoldedStacks = foldedStacks.get()

    while (localStack.isNotEmpty()) {
      stopSpanInternal()
    }
    return if (localFoldedStacks.isNotEmpty()) {
      localFoldedStacks.joinToString("\n")
    } else {
      null
    }
  }
}
