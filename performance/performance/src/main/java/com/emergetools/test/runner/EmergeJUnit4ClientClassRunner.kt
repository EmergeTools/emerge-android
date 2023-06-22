package com.emergetools.test.runner

import android.util.Log
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.tracing.trace
import com.emergetools.test.annotations.EmergeInit
import com.emergetools.test.annotations.EmergeSetup
import com.emergetools.test.annotations.EmergeStartupTest
import com.emergetools.test.annotations.EmergeTest
import com.emergetools.test.utils.IsolationActivity
import org.json.JSONObject
import org.junit.internal.runners.model.ReflectiveCallable
import org.junit.internal.runners.statements.Fail
import org.junit.runners.model.FrameworkMethod
import org.junit.runners.model.Statement

/**
 * Receives instructions from an orchestrating test server. See [EmergeTestClient] for server impl.
 */
internal class EmergeJUnit4ClientClassRunner(
  private val client: EmergeTestClient,
  testClass: Class<*>,
) : AndroidJUnit4ClassRunner(testClass) {

  override fun computeTestMethods(): MutableList<FrameworkMethod> {
    return mutableListOf<FrameworkMethod>().apply {
      addAll(testClass.getAnnotatedMethods(EmergeTest::class.java))
      addAll(testClass.getAnnotatedMethods(EmergeStartupTest::class.java))
    }
  }

  private fun launchIsolationActivity(message: String?) =
    client.trace("$TAG.launchIsolationActivity") {
      IsolationActivity.launchSingleton(message)
    }

  private fun finishIsolationActivity() = client.trace("$TAG.finishIsolationActivity") {
    IsolationActivity.finishSingleton()
  }

  /**
   * Runs once on first iteration (iteration 0) to set global device/app state for
   * all subsequent tests.
   *
   * Conceptually, this should run in an @BeforeClass annotated method, but BeforeClass implementations
   * are required to be static, resulting in us not being able to get a reference to the instrumentation
   * so we can run a real UI test to setup the app. Adding a custom @EmergeInitialSetup annotated
   * function allows the best of both worlds, we just need to control when it's run from firstBefore
   */
  private fun emergeInit(target: Any) = client.trace("$TAG.emergeInit") {
    Log.i(TAG, "Running any @EmergeInit methods for test ${testClass.name}")

    client.trace("@EmergeInit") {
      testClass.getAnnotatedMethods(EmergeInit::class.java)
        .firstOrNull()
        ?.invokeExplosively(target)
    }
  }

  /**
   * Runs before @Before functions for each test.
   */
  private fun firstBefore(target: Any) = client.trace("$TAG.firstBefore") {
    Log.i(TAG, "Running any @Before methods for test ${testClass.name}")
  }

  private fun emergeSetup(target: Any) = client.trace("$TAG.emergeSetup") {
    testClass.getAnnotatedMethods(EmergeSetup::class.java)
      .firstOrNull()
      ?.invokeExplosively(target)
  }

  override fun methodInvoker(
    method: FrameworkMethod,
    test: Any,
  ): Statement {
    return object : Statement() {
      override fun evaluate() {
        client.trace("emerge_perf_test") {
          trace("emerge_perf_test") {
            method.invokeExplosively(test)
          }
        }
      }
    }
  }

  /**
   * Runs before @After functions for each test.
   */
  private fun firstAfter() = client.trace("$TAG.firstAfter") {
    // Intentionally wait to log until after profiling stopped, as we don't want to interfere with any
    // app activity that is currently occurring.
    Log.i(TAG, "Ended test ${testClass.name}")
  }

  override fun withBefores(
    method: FrameworkMethod,
    target: Any,
    statement: Statement,
  ): Statement {
    val withAnnotatedBefores = super.withBefores(method, target, statement)
    // Prepend first before
    return object : Statement() {
      override fun evaluate() {
        firstBefore(target)
        withAnnotatedBefores.evaluate()
      }
    }
  }

  override fun withAfters(
    method: FrameworkMethod,
    target: Any,
    statement: Statement,
  ): Statement {
    // Append first after
    val withFirstAfter = object : Statement() {
      override fun evaluate() {
        statement.evaluate()
        firstAfter()
      }
    }
    return super.withAfters(method, target, withFirstAfter)
  }

  override fun methodBlock(method: FrameworkMethod): Statement {
    val test: Any = try {
      object : ReflectiveCallable() {
        @Throws(Throwable::class)
        override fun runReflectiveCall(): Any {
          // Incompatible with JUnit 4.12, can uncomment once SDK is published but is
          // functionally the same at the moment anyway.
          // return createTest(method)
          return createTest()
        }
      }.run()
    } catch (e: Throwable) {
      return Fail(e)
    }

    val emptyStatement = object : Statement() {
      override fun evaluate() {
        // Do nothing
      }
    }

    var testStatement: Statement = methodInvoker(method, test)
    testStatement = possiblyExpectingExceptions(method, test, testStatement)
    // Timeout and rules not supported.
    // statement = withPotentialTimeout(method, test, statement)
    // statement = withRules(method, test, statement)

    val beforesStatement = withBefores(method, test, emptyStatement)
    val aftersStatement = withAfters(method, test, emptyStatement)

    // TODO Figure out what to do with this
    // statement = withInterruptIsolation(statement)

    val statement = object : Statement() {
      override fun evaluate() {
        client.sendAsync(JSONObject().apply {
          put("type", "command_ready")
        })

        client.loop { json ->
          process(test, json, aftersStatement, beforesStatement, testStatement)
        }
      }
    }
    return statement
  }

  private fun process(
    test: Any,
    json: JSONObject,
    aftersStatement: Statement,
    beforesStatement: Statement,
    testStatement: Statement,
  ): Boolean {
    val type = json.optString("type")
    if (type.isEmpty()) {
      client.sendErrorAsync("No type specified in $json")
      return true // keep going
    }

    return when (type) {
      "command" -> command(test, json, aftersStatement, beforesStatement, testStatement)
      else -> {
        client.sendErrorAsync("Unsupported type \"$type\" in $json")
        return true // keep going
      }
    }
  }

  private fun command(
    test: Any,
    json: JSONObject,
    aftersStatement: Statement,
    beforesStatement: Statement,
    testStatement: Statement,
  ): Boolean {
    val name = json.optString("name")
    if (name.isEmpty()) {
      client.sendErrorAsync("No command name specified in $json")
      return true // keep going
    }

    when (name) {
      "launch_isolation_activity" -> {
        val message = json.optString("message")
        launchIsolationActivity(message)
      }

      "finish_isolation_activity" -> finishIsolationActivity()
      "run_emerge_init" -> emergeInit(test)
      "run_emerge_setup" -> emergeSetup(test)
      "run_junit_afters" -> aftersStatement.evaluate()
      "run_junit_befores" -> beforesStatement.evaluate()
      "run_emerge_test" -> testStatement.evaluate()
      "wait_for_idle" -> {
        UiDevice.getInstance(InstrumentationRegistry.getInstrumentation()).waitForIdle()
      }

      "exit" -> return false
      else -> {
        client.sendAsync(JSONObject().apply {
          put("type", "command_result")
          put("name", name)
          put("result", "error")
          put("error", "Unsupported command name \"$name\" in $json")
        })
        return true // keep going
      }
    }

    val commandResult = JSONObject()
    commandResult.put("type", "command_result")
    commandResult.put("name", name)
    commandResult.put("result", "success")
    client.sendAsync(commandResult)

    return true // keep going
  }

  companion object {
    const val TAG = "EmergeJUnit4ClassRunner"
  }
}
