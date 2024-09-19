package com.emergetools.tools

import java.io.File
import java.io.PrintWriter
import kotlin.math.min

private const val MAXIMUM_NUMBER = 10001

private const val NUMBERS_PER_FILE = 1000

fun rewriteFile(file: File, block: (PrintWriter) -> Unit) {
  if (file.exists()) {
    file.delete()
  }
  file.createNewFile()
  file.printWriter().use(block)
}

fun writeCommon(directory: String) {
  val path = "$directory/StressfulInteger.kt"
  val f = File(path)
  rewriteFile(f) { out ->
    out.println(
      """
      |package com.emergetools.reaper.sample.stress.numbers
      |
      |interface StressfulInteger {
      |  // Return k where k=this.
      |  fun value(): Int
      |
      |  // Return floor(k/2)
      |  fun half(): StressfulInteger
      |
      |  // Computes fib(k) instantiating ~1.6^k objects of k unique classes.
      |  // This stress tests many objects being allocated for a small number of classes.
      |  fun fib(): Int
      |
      |  // Sum the numbers i where k <= i < n instantiating n - k objects
      |  // using n - k unique classes.
      |  fun sumTo(limit: StressfulInteger): Int
      |}
      """.trimMargin()
    )
  }
}

fun writeNumbers(directory: String) {
  val fileCount = MAXIMUM_NUMBER / NUMBERS_PER_FILE
  for (i in 0..fileCount) {
    val firstNumber = i * NUMBERS_PER_FILE
    val lastNumber = min((i + 1) * NUMBERS_PER_FILE - 1, MAXIMUM_NUMBER)
    val name = "Numbers${firstNumber}To$lastNumber"
    val path = "$directory/$name.kt"
    val f = File(path)
    rewriteFile(f) { out ->
      val addBlock: (s: String, isLast: Boolean) -> Unit = { s, isLast ->
        out.print(s.trim().trimMargin())
        val newline = if (isLast) "\n" else "\n\n"
        out.print(newline)
      }
      out.println("package com.emergetools.reaper.sample.stress.numbers")
      out.println("")
      for (n in firstNumber..lastNumber) {
        out.println("@Suppress(\"MatchingDeclarationName\")")
        out.println("class Number$n : StressfulInteger {\n")

        addBlock(
          """
        |  companion object {
        |    private var VALUE = $n
        |  }""",
          false
        )

        addBlock(
          """
        |  override fun value(): Int {
        |    return VALUE
        |  }""",
          false
        )

        addBlock(
          """
        |  override fun half(): StressfulInteger {
        |    return Number${n / 2}()
        |  }""",
          false
        )

        addBlock(
          """
        |  override fun sumTo(limit: StressfulInteger): Int {
        |    if (value() >= limit.value()) {
        |      return 0
        |    } else {
        |      val left = Number${min(n * 2 + 1, MAXIMUM_NUMBER)}()
        |      val right = Number${min(n * 2 + 2, MAXIMUM_NUMBER)}()
        |      return value() + left.sumTo(limit) + right.sumTo(limit)
        |    }
        |  }""",
          false
        )

        if ((n == 0) or (n == 1)) {
          addBlock(
            """
          |  override fun fib(): Int {
          |    return $n
          |  }""",
            true,
          )
        } else {
          addBlock(
            """
          |  override fun fib(): Int {
          |    val a = Number${n - 1}()
          |    val b = Number${n - 2}()
          |    return a.fib() + b.fib()
          |  }""",
            true,
          )
        }

        out.println("}")
        if (lastNumber != n) {
          out.println()
        }
      }
    }
  }
}

fun main() {
  val root = System.getProperty("user.dir")
  val directory =
    "$root/../reaper/sample/stress/src/main/kotlin/com/emergetools/reaper/sample/stress/numbers"
  File(directory).mkdir()
  writeCommon(directory)
  writeNumbers(directory)
}
