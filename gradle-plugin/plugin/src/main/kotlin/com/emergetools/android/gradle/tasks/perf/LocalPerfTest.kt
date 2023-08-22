package com.emergetools.android.gradle.tasks.perf

import com.emergetools.android.gradle.EmergePlugin
import com.emergetools.android.gradle.util.adb.AdbHelper
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option
import org.gradle.process.ExecOperations
import javax.inject.Inject

abstract class LocalPerfTest : DefaultTask() {

  private val arguments = mutableMapOf<String, String>()

  @Option(
    option = "class",
    description = "A single class, a single method or a comma-separated list of classes"
  )
  fun setClazz(clazz: String) {
    arguments["class"] = clazz
  }

  @Option(
    option = "notClass",
    description = "A single class, a single method or a comma-separated list of classes"
  )
  fun setNotClass(notClass: String) {
    arguments["notClass"] = notClass
  }

  @Option(
    option = "annotation",
    description = "A single annotation or a comma-separated list of annotations"
  )
  fun setAnnotation(annotation: String) {
    arguments["annotation"] = annotation
  }

  @Option(
    option = "notAnnotation",
    description = "A single annotation or a comma-separated list of annotations"
  )
  fun setNotAnnotation(notAnnotation: String) {
    arguments["notAnnotation"] = notAnnotation
  }

  @get:Inject
  abstract val execOperations: ExecOperations

  /**
   * Enables the local runner to force-stop the app and more closely mimic real testing behavior
   */
  @get:Input
  @get:Optional
  abstract val appPackageName: Property<String>

  @get:Input
  abstract val testPackageName: Property<String>

  @TaskAction
  fun execute() {
    val adbHelper = AdbHelper(execOperations, logger)

    adbHelper.apply {
      shell("am", "force-stop", appPackageName.get())

      val instrumentationArgs = mutableListOf("am", "instrument", "-w").also {
        arguments.forEach { (key, value) ->
          it.add("-e")
          it.add(key)
          it.add(value)
        }
        if (appPackageName.isPresent) {
          it.add("-e")
          it.add("packageName")
          it.add(appPackageName.get())
        }
        it.add("${testPackageName.get()}/${EmergePlugin.EMERGE_JUNIT_RUNNER}")
      }
      val output = shell(instrumentationArgs)
      logger.lifecycle(output)
    }
  }
}
