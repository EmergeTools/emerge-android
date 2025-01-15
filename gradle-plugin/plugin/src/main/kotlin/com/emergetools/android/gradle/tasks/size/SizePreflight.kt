package com.emergetools.android.gradle.tasks.size

import com.emergetools.android.gradle.tasks.base.BasePreflightTask
import com.emergetools.android.gradle.util.preflight.Preflight
import com.emergetools.android.gradle.util.preflight.PreflightFailure
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction

abstract class SizePreflight : BasePreflightTask() {
  @get:Input
  @get:Optional
  abstract val sizeEnabled: Property<Boolean>

  @get:Input
  @get:Optional
  abstract val hasEmergeApiToken: Property<Boolean>

  @get:Input
  abstract val appProjectPath: Property<String>

  @get:Input
  abstract val variantName: Property<String>

  @TaskAction
  fun execute() {
    val preflight = Preflight("Size analysis preflight check")

    val hasEmergeApiToken = hasEmergeApiToken.getOrElse(false)
    preflight.add("Emerge API token set") {
      if (!hasEmergeApiToken) {
        throw PreflightFailure("Emerge API token not set. See https://docs.emergetools.com/docs/uploading-basics#obtain-an-api-key")
      }
    }

    val sizeEnabled = sizeEnabled.getOrElse(false)
    preflight.add("Size analysis enabled") {
      if (!sizeEnabled) {
        throw PreflightFailure("Size analysis not enabled. Make sure `size.enabled` is set to true in the emerge configuration block.")
      }
    }

    preflight.addSubPreflight(buildVcsPreflight())

    preflight.logOutput(
      logger,
      additionalSuccessLogging = {
        val uploadTaskName = getUploadAabTaskName(variantName.get())
        val uploadTaskInstructions =
          "Upload & run size analysis on Emerge with ./gradlew ${appProjectPath.get()}:$uploadTaskName"

        buildString {
          append("Size analysis preflight was successful!")
          append("\n")
          append(uploadTaskInstructions)
          append("\n")
        }
      },
    )
  }
}
