package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor

/**
 * This visitor processes a class and finds methods annotated with @Preview or similar annotations
 * and adds them to the passed in list.
 */
class SnapshotAggregatorClassVisitor(
  api: Int,
  private val fileName: String,
  private val className: String,
  private val methodNames: MutableList<ComposePreviewSnapshotConfig>,
  private val customPreviewAnnotations: Map<String, CustomPreviewAnnotation> = emptyMap()
) : ClassVisitor(api) {

  override fun visitMethod(
    access: Int,
    name: String,
    desc: String,
    signature: String?,
    exceptions: Array<out String>?
  ): MethodVisitor {
    return AnnotatedMethodVisitor(api, name, className, fileName, methodNames, customPreviewAnnotations)
  }
}
