package com.emergetools.android.gradle.tasks.perf

import com.emergetools.android.gradle.util.property
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option
import org.gradle.work.DisableCachingByDefault
import java.io.File
import java.util.zip.ZipInputStream

@DisableCachingByDefault(because = "Generating the performance project should not be cached")
abstract class GeneratePerfProject : DefaultTask() {
  private var packageName: String? = null

  @Option(option = "package", description = "Package name for the performance project")
  fun setPackageName(packageName: String) {
    check(packageName.matches("[A-Za-z0-9_\\.]+".toRegex())) {
      "Illegal package name $packageName"
    }
    this.packageName = packageName
  }

  @get:Input
  val appPackageName: Property<String> =
    project.objects.property<String>()
      .convention("<REPLACE WITH APP PACKAGE NAME>")

  @get:Input
  abstract val performanceProjectPath: Property<String>

  @get:InputDirectory
  @get:PathSensitive(PathSensitivity.RELATIVE)
  abstract val rootDir: DirectoryProperty

  @get:InputFile
  @get:PathSensitive(PathSensitivity.RELATIVE)
  abstract val gradleSettingsFile: RegularFileProperty

  @TaskAction
  fun execute() {
    val projectName = performanceProjectPath.get().removePrefix(":")
    val packageName =
      checkNotNull(packageName) {
        "Package name is missing. Make sure to pass the --package command line argument."
      }

    generateProject(projectName, packageName)
    addProjectToRootProject(projectName)
  }

  private fun generateProject(
    projectName: String,
    packageName: String,
  ) {
    val projectDir = rootDir.asFile.get().resolve(projectName)
    check(!projectDir.exists()) {
      "Project $projectName already exists at location $projectDir"
    }

    val stream =
      checkNotNull(javaClass.getResourceAsStream("/emergetools/performance-project-template.zip")) {
        "Project template is missing"
      }

    val replacements =
      mapOf(
        "package_name" to packageName,
        "app_package_name" to appPackageName.get(),
      )

    ZipInputStream(stream).use { zipStream ->
      generateSequence { zipStream.nextEntry }
        .filterNot { it.isDirectory }
        .forEach {
          val name = it.name.replace("__package_name__", packageName.replace('.', '/'))
          val file = File("$projectDir/$name")
          file.ensureParentDirsCreated()
          file.createNewFile()
          var contents = zipStream.reader().readText()
          replacements.forEach { (id, value) ->
            contents = contents.replace("__${id}__", value)
          }
          file.writeText(contents)
        }
    }
  }

  private fun File.ensureParentDirsCreated() {
    parentFile.mkdirs()
  }

  private fun addProjectToRootProject(projectName: String) {
    val settingsFile = gradleSettingsFile.asFile.get()

    if (!settingsFile.exists()) {
      logger.warn("Could not find ${settingsFile.name} file to add performance project")
    }

    if (settingsFile.extension == "kts") {
      settingsFile.appendText("\ninclude(\":$projectName\")\n")
    } else {
      settingsFile.appendText("\ninclude '$projectName'\n")
    }
  }

  fun File.ensureParentDirsCreated() {
    val parentFile = parentFile
    if (!parentFile.exists()) {
      check(parentFile.mkdirs()) {
        "Cannot create parent directories for $this"
      }
    }
  }
}
