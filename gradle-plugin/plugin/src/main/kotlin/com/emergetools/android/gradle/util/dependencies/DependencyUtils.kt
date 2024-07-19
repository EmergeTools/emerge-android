package com.emergetools.android.gradle.util.dependencies

import com.emergetools.android.gradle.util.putOrAppend
import org.gradle.api.artifacts.ArtifactCollection
import org.gradle.api.logging.Logger
import java.io.File
import java.util.jar.JarEntry
import java.util.jar.JarFile

const val PROJECT_PREFIX = "project "

// Taken from com.android.build.gradle.internal.publishing.AndroidArtifacts
const val ARTIFACT_CLASSES = "android-classes"
const val ARTIFACT_RESOURCES = "android-res"
const val ARTIFACT_ASSETS = "android-assets"
const val ARTIFACT_JNI = "android-jni"
// Intentionally skipping aidl, renderscript and other minors as we haven't seen occurrences yet

fun buildDependencies(
  artifacts: List<ArtifactCollection>,
  defaultModuleName: String,
  defaultModulePath: String,
  logger: Logger,
): Dependencies {
  val dependencyEntryMap = mutableMapOf<String, List<String>>()

  artifacts.forEach { artifactCollection ->
    artifactCollection.artifacts.forEach { resolvedArtifact ->
      val id = resolvedArtifact.id.componentIdentifier
      val dependencyEntries = resolvedArtifact.file
        .walkTopDown()
        .filter(File::isFile)
        .flatMap { artifactFile ->
          // Normalize the name to remove the leading path, so it's relative to the module root.
          val name = artifactFile.absolutePath.removePrefix(resolvedArtifact.file.absolutePath)
          when (artifactFile.extension) {
            // If the artifact is a jar, we want to include all the entries in the jar
            "jar" -> JarFile(artifactFile).use { jarFile ->
              jarFile.entries()
                .asSequence()
                .filterNot(JarEntry::isDirectory)
                .map(JarEntry::getName)
                .toList()
            }

            else -> listOf(name)
          }
        }.toList()

      if (dependencyEntries.isNotEmpty()) {
        dependencyEntryMap.putOrAppend(id.displayName, dependencyEntries)
      }
    }
  }

  val libraries = mutableListOf<Library>()
  val modules = mutableListOf(
    Module(
      name = defaultModuleName,
      path = defaultModulePath,
      entries = emptyList(),
      isRoot = true,
    )
  )
  dependencyEntryMap.entries.forEach {
    val keySplits = it.key.split(":")
    if (it.key.startsWith(PROJECT_PREFIX)) {
      modules += Module(
        name = keySplits.last(),
        path = it.key.substringAfter(PROJECT_PREFIX),
        entries = it.value,
      )
    } else {
      // Check to ensure the dependency is in the format group:name:version
      if (keySplits.size != 3) {
        logger.warn(
          "Skipping invalid dependency: ${it.key}, expected format: group:name:version, please let the Emerge team know of this!"
        )
        return@forEach
      }

      libraries += Library(
        groupId = keySplits[0],
        artifactId = keySplits[1],
        version = keySplits[2],
        entries = it.value
      )
    }
  }

  return Dependencies(
    libraries = libraries,
    modules = modules,
  )
}
