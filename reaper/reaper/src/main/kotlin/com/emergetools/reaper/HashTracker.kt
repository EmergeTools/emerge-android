package com.emergetools.reaper

interface HashTracker {
  val name: String
  fun logMethodEntry(methodHash: Long)
  fun flush()
}
