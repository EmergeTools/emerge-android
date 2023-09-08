package com.emergetools.test.utils.perfetto

import androidx.benchmark.perfetto.ExperimentalPerfettoTraceProcessorApi
import androidx.benchmark.perfetto.PerfettoTraceProcessor
import androidx.benchmark.perfetto.Row

/**
 * While these are available in PerfettoTraceProcessor, they're marked as internal to the library
 * group, preventing us from leveraging them.
 * These are simply a copy of those at 1.2.0-beta05, very slightly modified to avoid naming confusion:
 * https://github.com/androidx/androidx/blob/f6df7df4bb215d31187a32dea874edd43eb9506f/benchmark/benchmark-macro/src/main/java/androidx/benchmark/perfetto/PerfettoTraceProcessor.kt#L241
 */
@OptIn(ExperimentalPerfettoTraceProcessorApi::class)
fun PerfettoTraceProcessor.Session.querySpans(
  spanNames: List<String>,
  packageName: String?,
): List<Slice> {
  val whereClause = spanNames
    .joinToString(
      separator = " OR ",
      prefix = if (packageName == null) {
        "("
      } else {
        "(process.name LIKE \"$packageName\" OR process.name LIKE \"$packageName:%\") AND ("
      },
      postfix = ")"
    ) {
      "slice.name LIKE \"$it\""
    }
  val innerJoins = if (packageName != null) {
    """
      INNER JOIN thread_track on slice.track_id = thread_track.id
      INNER JOIN thread USING(utid)
      INNER JOIN process USING(upid)
    """.trimMargin()
  } else {
    ""
  }

  return query(
    query = """
      SELECT slice.name,ts,dur
      FROM slice
      $innerJoins
      WHERE $whereClause
      ORDER BY ts
    """.trimMargin()
  ).toSlices()
}

data class Slice(
  val name: String,
  val ts: Long,
  val dur: Long,
) {
  val durMs: Long = dur / NANOS_IN_MS

  companion object {
    const val NANOS_IN_MS = 1_000_000
  }
}

@OptIn(ExperimentalPerfettoTraceProcessorApi::class)
internal fun Sequence<Row>.toSlices(): List<Slice> = map {
  Slice(name = it.string("name"), ts = it.long("ts"), dur = it.long("dur"))
}.toList()
