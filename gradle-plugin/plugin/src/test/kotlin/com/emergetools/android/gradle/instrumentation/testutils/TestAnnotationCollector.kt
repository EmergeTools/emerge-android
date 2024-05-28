package com.emergetools.android.gradle.instrumentation.testutils

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

fun isClassAnnotationRuntimeVisible(
  classBytes: ByteArray,
  annotationDescriptor: String,
): Boolean {
  val classReader = ClassReader(classBytes)
  val annotationCollector = TestAnnotationCollector()
  classReader.accept(annotationCollector, ClassReader.SKIP_FRAMES)
  return annotationCollector.classAnnotations[annotationDescriptor] ?: false
}

fun isMethodAnnotationRuntimeVisible(
  classBytes: ByteArray,
  annotationDescriptor: String,
  methodName: String,
): Boolean {
  val classReader = ClassReader(classBytes)
  val annotationCollector = TestAnnotationCollector()
  classReader.accept(annotationCollector, ClassReader.SKIP_FRAMES)
  return annotationCollector.methodAnnotations[methodName]?.get(annotationDescriptor) ?: false
}

private class TestAnnotationCollector : ClassVisitor(Opcodes.ASM9) {
  val classAnnotations = mutableMapOf<String, Boolean>()
  val methodAnnotations = mutableMapOf<String, MutableMap<String, Boolean>>()

  override fun visitAnnotation(
    descriptor: String?,
    visible: Boolean,
  ): AnnotationVisitor? {
    classAnnotations[descriptor!!] = visible
    return super.visitAnnotation(descriptor, visible)
  }

  override fun visitMethod(
    access: Int,
    name: String,
    descriptor: String?,
    signature: String?,
    exceptions: Array<out String>?,
  ): MethodVisitor {
    methodAnnotations[name] = mutableMapOf()

    return object : MethodVisitor(Opcodes.ASM9) {
      override fun visitAnnotation(
        descriptor: String,
        visible: Boolean,
      ): AnnotationVisitor? {
        methodAnnotations[name]?.put(descriptor, visible)
        return super.visitAnnotation(descriptor, visible)
      }
    }
  }
}
