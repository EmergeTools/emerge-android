package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor

class SnapshotAggregatorClassVisitor(
  api: Int,
  val fileName: String,
  val className: String,
  val completeMethodNames: MutableList<ComposePreviewSnapshotConfig>
) : ClassVisitor(api) {

  override fun visitMethod(
    access: Int,
    name: String,
    descriptor: String,
    signature: String?,
    exceptions: Array<String>?,
  ): MethodVisitor {
    return AnnotatedMethodVisitor(api, name, className, fileName, completeMethodNames)
  }

  override fun visitAnnotation(
    desc: String,
    visible: Boolean,
  ): AnnotationVisitor? {
    // TODO we need to scan for custom annotations and keep track of them here
    return super.visitAnnotation(desc, visible)
  }
}
