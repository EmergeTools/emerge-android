package com.emergetools.snapshots.processor.utils

// TODO: TEst
fun <K, V> MutableMap<K, List<V>>.putOrAppend(
  key: K,
  values: List<V>,
  appendOnlyDistinct: Boolean = true,
) = get(key)?.let { value ->
  val newList = value + values
  put(key, if (appendOnlyDistinct) newList.distinct() else newList)
} ?: put(key, values)

// TODO: Test
fun <K, V> MutableMap<K, List<V>>.putOrAppend(map: Map<K, List<V>>) {
  map.forEach(::putOrAppend)
}
