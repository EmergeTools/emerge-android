package com.emergetools.reaper

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class ReaperReport(
  val apiKey: String,
  val seen: List<String>,
  val platform: String = "android",
  val metadata: Metadata,
  @SerialName("appId")
  val packageName: String,
  @SerialName("shortVersionString")
  val version: String,
)

@Serializable
internal data class ReaperError(
  val apiKey: String,
  val message: String,
  val platform: String = "android",
  val metadata: Metadata,
  @SerialName("appId")
  val packageName: String,
  @SerialName("shortVersionString")
  val version: String,
)

@Serializable
internal data class Metadata(
  val manufacturer: String,
  val model: String,
  val osVersion: String,
  val reaperVersion: String = ReaperConfig.REAPER_VERSION,
)
