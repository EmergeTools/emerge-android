package com.emergetools.android.gradle.tasks.snapshots.transform

import org.gradle.internal.cc.base.logger
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

/**
 * This visitor processes a class and finds methods annotated with @Preview or similar annotations
 * and adds them to the passed in list.
 */
class SnapshotAggregatorClassVisitor(
  api: Int,
  private val fileName: String,
  private val className: String,
  private val methodNames: MutableList<ComposePreviewSnapshotConfig>,
  private val includePrivatePreviews: Boolean,
  private val customPreviewAnnotations: Map<String, CustomPreviewAnnotation> = emptyMap()
) : ClassVisitor(api) {

  override fun visitMethod(
    access: Int,
    name: String,
    desc: String,
    signature: String?,
    exceptions: Array<out String>?
  ): MethodVisitor? {
    if (!includePrivatePreviews && (access and Opcodes.ACC_PRIVATE) != 0) {
      logger.debug("SnapshotAggregatorClassVisitor: Ignoring private method $name in class $className")
      return super.visitMethod(access, name, desc, signature, exceptions)
    }

    return AnnotatedMethodVisitor(api, name, className, fileName, methodNames, customPreviewAnnotations)
  }
}
