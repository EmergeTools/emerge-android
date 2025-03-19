package com.emergetools.distribution.internal

class VersionTxtReader {

  private fun readVersionFile(): String {
    javaClass.classLoader?.getResourceAsStream("META-INF/com/emergetools/distribution/version.txt")
      ?.use { inputStream ->
        return inputStream.bufferedReader().use { it.readText() }
      }
    error("Could not find META-INF/com/emergetools/distribution/version.txt")
  }

  private val properties: Map<String, String>
    get() {
      val version = readVersionFile()
      val lines = version.split("\n")
      val properties = mutableMapOf<String, String>()
      for (line in lines) {
        val keyValue = line.split(": ", limit = 2)
        check(keyValue.size == 2) { "Invalid line in version.txt: $line" }
        properties[keyValue[0]] = keyValue[1]
      }
      return properties
    }

  val version = properties["version"]!!
  val baseUrl = properties["baseUrl"]!!
}
