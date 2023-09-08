@file:OptIn(ExperimentalPerfettoCaptureApi::class, ExperimentalPerfettoTraceProcessorApi::class)

package com.emergetools.test

import androidx.benchmark.perfetto.ExperimentalPerfettoCaptureApi
import androidx.benchmark.perfetto.ExperimentalPerfettoTraceProcessorApi
import androidx.benchmark.perfetto.PerfettoTrace
import androidx.benchmark.perfetto.PerfettoTraceProcessor
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.emergetools.test.annotations.EmergeInit
import com.emergetools.test.annotations.EmergeSetup
import com.emergetools.test.annotations.EmergeStartupTest
import com.emergetools.test.annotations.EmergeTest
import com.emergetools.test.utils.clearTargetAppData
import com.emergetools.test.utils.maybeForceStopApp
import com.emergetools.test.utils.perfetto.querySpans
import hu.webarticum.treeprinter.Insets
import hu.webarticum.treeprinter.SimpleTreeNode
import hu.webarticum.treeprinter.decorator.BorderTreeNodeDecorator
import hu.webarticum.treeprinter.decorator.PadTreeNodeDecorator
import hu.webarticum.treeprinter.printer.listing.ListingTreePrinter
import hu.webarticum.treeprinter.text.AnsiFormat
import hu.webarticum.treeprinter.text.ConsoleText
import org.junit.internal.runners.model.ReflectiveCallable
import org.junit.internal.runners.statements.Fail
import org.junit.runner.notification.RunNotifier
import org.junit.runners.model.FrameworkMethod
import org.junit.runners.model.Statement

/**
 * Runs tests annotated with @EmergeTest as well as related @EmergeInit and @EmergeSetup functions.
 */
@OptIn(
  ExperimentalPerfettoTraceProcessorApi::class,
  ExperimentalPerfettoCaptureApi::class
)
class EmergeLocalJUnit4ClassRunner(testClass: Class<*>) : AndroidJUnit4ClassRunner(testClass) {

  private val initMethods = this.testClass.getAnnotatedMethods(EmergeInit::class.java)
  private val setupMethods = this.testClass.getAnnotatedMethods(EmergeSetup::class.java)
  private val testMethods = this.testClass.getAnnotatedMethods(EmergeTest::class.java)
  private val startupTestMethods = this.testClass.getAnnotatedMethods(EmergeStartupTest::class.java)

  private val summaries = mutableListOf<MethodSummary>()
  private var initCalled = false

  private val targetPackageName by lazy {
    checkNotNull(InstrumentationRegistry.getArguments().getString(ARG_PACKAGE_NAME)) {
      "Missing argument: $ARG_PACKAGE_NAME"
    }
  }

  override fun run(notifier: RunNotifier?) {
    super.run(notifier)

    initMethods.drop(1).forEach {
      addSummary(EmergeInit::class.java, it) {
        "Only one $EMERGE_INIT method per class is supported"
      }
    }

    setupMethods.drop(1).forEach {
      addSummary(EmergeSetup::class.java, it) {
        "Only one $EMERGE_SETUP method per class is supported"
      }
    }

    printResults()
  }

  override fun methodBlock(method: FrameworkMethod): Statement {
    val test: Any = try {
      object : ReflectiveCallable() {
        @Throws(Throwable::class)
        override fun runReflectiveCall(): Any {
          return createTest()
        }
      }.run()
    } catch (e: Throwable) {
      return Fail(e)
    }

    val emergeInit = if (!initCalled) {
      initCalled = true
      emergeInitInvoker(test)
    } else {
      null
    }

    val emergeSetup = emergeSetupInvoker(test)
    var statement = methodInvoker(method, test)
    statement = possiblyExpectingExceptions(method, test, statement)
    statement = withBefores(method, test, statement)
    statement = withAfters(method, test, statement)

    return object : Statement() {
      override fun evaluate() {
        UiDevice.getInstance(InstrumentationRegistry.getInstrumentation()).pressHome()

        emergeInit?.let {
          maybeForceStopApp()
          clearTargetAppData()
          it.evaluate()
        }
        maybeForceStopApp()
        emergeSetup.evaluate()
        statement.evaluate()
      }
    }
  }

  override fun computeTestMethods(): MutableList<FrameworkMethod> {
    val emergeTestMethods = testClass.getAnnotatedMethods(EmergeTest::class.java)
    val emergeStartupTestMethods = testClass.getAnnotatedMethods(EmergeStartupTest::class.java)

    return mutableListOf<FrameworkMethod>().apply {
      addAll(emergeTestMethods.union(emergeStartupTestMethods))
    }
  }

  private fun addSummary(
    annotation: Class<*>,
    method: FrameworkMethod,
    result: MethodResult = MethodResult.SKIPPED,
    message: (() -> String)? = null,
  ): MethodSummary = addSummary(
    listOf(annotation),
    method,
    result,
    message
  )

  private fun addSummary(
    annotations: List<Class<*>>,
    method: FrameworkMethod,
    result: MethodResult = MethodResult.SKIPPED,
    message: (() -> String)? = null,
  ): MethodSummary {
    val messages = mutableListOf<String>()
    if (message != null) messages.add(message())
    val summary = MethodSummary(annotations, method, result, messages)
    summaries.add(summary)
    return summary
  }

  private fun emergeInitInvoker(target: Any): Statement {
    val initMethod = initMethods.firstOrNull() ?: return EMPTY_STATEMENT
    val summary = addSummary(EmergeInit::class.java, initMethod)

    if (initMethod.getAnnotation(EmergeSetup::class.java) != null ||
      initMethod.getAnnotation(EmergeTest::class.java) != null ||
      initMethod.getAnnotation(EmergeStartupTest::class.java) != null
    ) {
      summary.result = MethodResult.FAILURE
      val duplicateMethodMessage =
        "${initMethod.name} cannot be annotated with multiple Emerge annotations"
      val existingSummary = summaries.find { it.method.name == initMethod.name }
      if (existingSummary != null && !existingSummary.messages.contains(duplicateMethodMessage)) {
        summary.messages.add(duplicateMethodMessage)
      }
    }

    return object : Statement() {
      override fun evaluate() {
        try {
          initMethod.invokeExplosively(target)
          // Don't mark method as success if it's already marked as failure
          if (summary.result !== MethodResult.FAILURE) {
            summary.result = MethodResult.SUCCESS
          }
        } catch (e: Throwable) {
          summary.result = MethodResult.FAILURE
          summary.messages.add("Failed with an exception: $e")
          throw e
        }
      }
    }
  }

  private fun emergeSetupInvoker(target: Any): Statement {
    val setupMethod = setupMethods.firstOrNull() ?: return EMPTY_STATEMENT
    val summary = addSummary(EmergeSetup::class.java, setupMethod)

    if (setupMethod.getAnnotation(EmergeInit::class.java) != null ||
      setupMethod.getAnnotation(EmergeTest::class.java) != null ||
      setupMethod.getAnnotation(EmergeStartupTest::class.java) != null
    ) {
      summary.result = MethodResult.FAILURE
      val duplicateMethodMessage =
        "${setupMethod.name} cannot be annotated with multiple Emerge annotations"
      val existingSummary = summaries.find { it.method.name == setupMethod.name }
      if (existingSummary != null && !existingSummary.messages.contains(duplicateMethodMessage)) {
        summary.messages.add(duplicateMethodMessage)
      }
    }

    return object : Statement() {
      override fun evaluate() {
        try {
          setupMethod.invokeExplosively(target)
          // Don't mark method as success if it's already marked as failure
          if (summary.result !== MethodResult.FAILURE) {
            summary.result = MethodResult.SUCCESS
          }
        } catch (e: Throwable) {
          summary.result = MethodResult.FAILURE
          summary.messages.add("Failed with an exception: $e")
          throw e
        }
      }
    }
  }

  override fun methodInvoker(
    method: FrameworkMethod,
    test: Any?,
  ): Statement {
    val superMethodInvoker = super.methodInvoker(method, test)

    val emergeTestAnnotation = method.getAnnotation(EmergeTest::class.java)
    val hasEmergeTestAnnotation = emergeTestAnnotation != null
    val hasEmergeStartupTestAnnotation = method.getAnnotation(EmergeStartupTest::class.java) != null

    val annotationSummary = if (hasEmergeTestAnnotation && hasEmergeStartupTestAnnotation) {
      val existingSummary = summaries.find { it.method.name == method.name }
      if (existingSummary != null) {
        if (!existingSummary.messages.contains(DUPLICATE_TEST_ANNOTATION_MESSAGE)) {
          existingSummary.messages.add(DUPLICATE_TEST_ANNOTATION_MESSAGE)
        }
        existingSummary
      } else {
        addSummary(
          annotations = listOf(EmergeTest::class.java, EmergeStartupTest::class.java),
          method = method,
          result = MethodResult.FAILURE,
        ) {
          "Method cannot have both @EmergeTest and @EmergeStartupTest annotations"
        }
      }
    } else {
      val summary = if (hasEmergeTestAnnotation) {
        addSummary(EmergeTest::class.java, method).also { methodSummary ->
          emergeTestAnnotation.spans.map { ExpectedSpan(it) }
            .let(methodSummary.expectedSpans::addAll)
        }
      } else {
        addSummary(EmergeStartupTest::class.java, method)
      }

      // Show error if they have Init or Setup annotations
      if (method.getAnnotation(EmergeInit::class.java) != null ||
        method.getAnnotation(EmergeSetup::class.java) != null
      ) {
        summary.result = MethodResult.FAILURE
        val duplicateMethodMessage =
          "${method.name} cannot be annotated with multiple Emerge annotations"
        val existingSummary = summaries.find { it.method.name == method.name }
        if (existingSummary != null && !existingSummary.messages.contains(duplicateMethodMessage)) {
          summary.messages.add(duplicateMethodMessage)
        }
      }

      summary
    }

    return object : Statement() {
      override fun evaluate() {
        try {
          // Only profile over the test if expected spans are present
          if (annotationSummary.expectedSpans.isNotEmpty()) {
            PerfettoTrace.record(
              method.name,
              appTagPackages = listOf(targetPackageName),
              traceCallback = { trace ->
                val foundSpans = PerfettoTraceProcessor.runServer {
                  loadTrace(trace) {
                    querySpans(
                      spanNames = annotationSummary.expectedSpans.map(ExpectedSpan::name),
                      packageName = targetPackageName,
                    )
                  }
                }

                annotationSummary.expectedSpans.forEach { expectedSpan ->
                  val foundSpan = foundSpans.find { it.name == expectedSpan.name }
                  expectedSpan.wasFound = foundSpan != null
                  if (foundSpan != null) {
                    expectedSpan.durationMs = foundSpan.durMs
                    val message = if (foundSpan.durMs < SHORT_SPAN_DURATION_MS) {
                      "Found span \'${foundSpan.name}\' with duration ${foundSpan.durMs}ms, " +
                        "short spans can lead to inconclusive results $WARN_CHAR"
                    } else {
                      "Found span \'${foundSpan.name}\' with duration ${foundSpan.durMs}ms " +
                        SUCCESS_CHAR
                    }
                    annotationSummary.messages.add(message)
                  } else {
                    annotationSummary.result = MethodResult.FAILURE
                    annotationSummary.messages.add(
                      "Did not find expected span \'${expectedSpan.name}\' $ERROR_CHAR"
                    )
                  }
                }
              }
            ) { superMethodInvoker.evaluate() }
          } else {
            superMethodInvoker.evaluate()
          }
          // Don't mark method as success if it's already marked as failure
          if (annotationSummary.result !== MethodResult.FAILURE) {
            annotationSummary.result = MethodResult.SUCCESS
          }
        } catch (e: Throwable) {
          annotationSummary.result = MethodResult.FAILURE
          annotationSummary.messages.add("Failed with an exception: $e")
        }
      }
    }
  }

  private fun printResults() {
    if (testMethods.isEmpty() && startupTestMethods.isEmpty()) {
      val classNode = SimpleTreeNode(this.testClass.name)
      classNode.addChild(
        SimpleTreeNode("No $EMERGE_TEST or $EMERGE_STARTUP_TEST methods $ERROR_CHAR")
      )

      val decoratedClassNode = BorderTreeNodeDecorator.builder().inherit(false).buildFor(
        PadTreeNodeDecorator(classNode, Insets(0, 1))
      )

      EmergeLocalInstrumentationResultPrinter.addSummary(
        "$testClass",
        ListingTreePrinter().stringify(decoratedClassNode)
      )
      return
    }

    if (testMethods.isNotEmpty()) {
      val classNode = SimpleTreeNode("${this.testClass.name} $EMERGE_TEST")

      if (initMethods.isEmpty()) {
        classNode.addChild(SimpleTreeNode("No $EMERGE_INIT method"))
      }

      if (setupMethods.isEmpty()) {
        classNode.addChild(SimpleTreeNode("No $EMERGE_SETUP method"))
      }

      summaries.forEach { summary ->
        summary.annotation.forEach { annotation ->
          if (!listOf(
              EmergeTest::class.java,
              EmergeInit::class.java,
              EmergeSetup::class.java
            ).contains(annotation)
          ) {
            return@forEach
          }

          classNode.addChild(
            SimpleTreeNode(
              ConsoleText.of("@${annotation.simpleName} ${summary.method.name}")
                .format(AnsiFormat.BOLD)
                .concat(ConsoleText.of(summary.suffix))
            ).apply {
              summary.messages.forEach {
                addChild(SimpleTreeNode(it))
              }
            }
          )
        }
      }

      val decoratedClassNode = BorderTreeNodeDecorator.builder().inherit(false).buildFor(
        PadTreeNodeDecorator(classNode, Insets(0, 1))
      )

      EmergeLocalInstrumentationResultPrinter.addSummary(
        "$testClass-$EMERGE_TEST",
        ListingTreePrinter().stringify(decoratedClassNode)
      )
    }

    if (startupTestMethods.isNotEmpty()) {
      val classNode = SimpleTreeNode("${this.testClass.name} $EMERGE_STARTUP_TEST")

      if (initMethods.isEmpty()) {
        classNode.addChild(SimpleTreeNode("No $EMERGE_INIT method"))
      }

      summaries.forEach { summary ->
        summary.annotation.forEach { annotation ->
          if (!listOf(
              EmergeStartupTest::class.java,
              EmergeInit::class.java,
            ).contains(annotation)
          ) {
            return@forEach
          }

          classNode.addChild(
            SimpleTreeNode(
              ConsoleText.of("@${annotation.simpleName} ${summary.method.name}")
                .format(AnsiFormat.BOLD)
                .concat(ConsoleText.of(summary.suffix))
            ).apply {
              summary.messages.forEach {
                addChild(SimpleTreeNode(it))
              }
            }
          )
        }
      }

      val decoratedClassNode = BorderTreeNodeDecorator.builder().inherit(false).buildFor(
        PadTreeNodeDecorator(classNode, Insets(0, 1))
      )

      EmergeLocalInstrumentationResultPrinter.addSummary(
        "$testClass-$EMERGE_STARTUP_TEST",
        ListingTreePrinter().stringify(decoratedClassNode)
      )
    }
  }

  companion object {
    private const val ARG_PACKAGE_NAME = "packageName"

    private const val SUCCESS_CHAR = "✅"
    private const val WARN_CHAR = "⚠️"
    private const val ERROR_CHAR = "❌"
    private const val SKIPPED_CHAR = "⏭️"

    private val EMERGE_INIT = "@${EmergeInit::class.java.simpleName}"
    private val EMERGE_SETUP = "@${EmergeSetup::class.java.simpleName}"
    private val EMERGE_TEST = "@${EmergeTest::class.java.simpleName}"
    private val EMERGE_STARTUP_TEST = "@${EmergeStartupTest::class.java.simpleName}"

    private const val DUPLICATE_TEST_ANNOTATION_MESSAGE =
      "Method cannot have both @EmergeTest and @EmergeStartupTest annotations"

    /**
     * Relatively arbitrary, taken from observations we've seen around short spans and inconclusive
     * perf results.
     */
    private const val SHORT_SPAN_DURATION_MS = 200L

    val EMPTY_STATEMENT = object : Statement() {
      override fun evaluate() {
        // Do nothing
      }
    }

    enum class MethodResult(val suffix: String) {
      SUCCESS(SUCCESS_CHAR),
      FAILURE(ERROR_CHAR),
      SKIPPED(SKIPPED_CHAR),
    }

    data class ExpectedSpan(
      val name: String,
      var wasFound: Boolean = false,
      var durationMs: Long? = null,
    )

    data class MethodSummary(
      val annotation: List<Class<*>>,
      val method: FrameworkMethod,
      var result: MethodResult,
      val messages: MutableList<String> = mutableListOf(),
      val expectedSpans: MutableList<ExpectedSpan> = mutableListOf(),
    ) {
      val suffix: String
        get() = " " + result.suffix
    }
  }
}
