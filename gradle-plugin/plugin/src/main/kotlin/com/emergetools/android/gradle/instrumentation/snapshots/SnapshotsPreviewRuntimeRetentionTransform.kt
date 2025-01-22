package com.emergetools.android.gradle.instrumentation.snapshots

import com.android.build.api.instrumentation.AsmClassVisitorFactory
import com.android.build.api.instrumentation.ClassContext
import com.android.build.api.instrumentation.ClassData
import com.android.build.api.instrumentation.InstrumentationParameters
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor
import org.slf4j.Logger
import org.slf4j.LoggerFactory

abstract class SnapshotsPreviewRuntimeRetentionTransformFactory :
  AsmClassVisitorFactory<SnapshotsPreviewRuntimeRetentionTransformFactory.Params> {
  interface Params : InstrumentationParameters {
    @get:Input
    @get:Optional
    val invalidate: Property<Long>
  }

  companion object {
    private val logger by lazy {
      LoggerFactory.getLogger(SnapshotsPreviewRuntimeRetentionTransformFactory::class.java)
    }
  }

  override fun createClassVisitor(
    classContext: ClassContext,
    nextClassVisitor: ClassVisitor,
  ): ClassVisitor {
    return SnapshotsPreviewRuntimeRetentionTransform(
      instrumentationContext.apiVersion.get(),
      nextClassVisitor,
      logger,
    )
  }

  override fun isInstrumentable(classData: ClassData): Boolean {
    // Need to instrument all classes to ensure that the annotations are visible at runtime
    return true
  }
}

class SnapshotsPreviewRuntimeRetentionTransform(
  api: Int,
  classVisitor: ClassVisitor?,
  private val logger: Logger,
) : ClassVisitor(api, classVisitor) {
  companion object {
    const val TAG = "SnapshotRuntimePreviewClassVisitor"

    const val PREVIEW_ANNOTATION_DESC = "Landroidx/compose/ui/tooling/preview/Preview;"
    const val PREVIEW_CONTAINER_ANNOTATION_DESC =
      "Landroidx/compose/ui/tooling/preview/Preview\$Container;"

    // Supported default multipreview annotations
    const val PREVIEW_LIGHT_DARK_ANNOTATION_DESC =
      "Landroidx/compose/ui/tooling/preview/PreviewLightDark;"
    const val PREVIEW_FONT_SCALE_ANNOTATION_DESC =
      "Landroidx/compose/ui/tooling/preview/PreviewFontScale;"

    val ANNOTATIONS_TO_TRANSFORM =
      arrayOf(
        PREVIEW_ANNOTATION_DESC,
        PREVIEW_CONTAINER_ANNOTATION_DESC,
        PREVIEW_LIGHT_DARK_ANNOTATION_DESC,
        PREVIEW_FONT_SCALE_ANNOTATION_DESC,
      )
  }

  override fun visitMethod(
    access: Int,
    name: String,
    descriptor: String,
    signature: String?,
    exceptions: Array<String>?,
  ): MethodVisitor {
    val mv = super.visitMethod(access, name, descriptor, signature, exceptions)

    return object : MethodVisitor(api, mv) {
      override fun visitAnnotation(
        desc: String,
        visible: Boolean,
      ): AnnotationVisitor? {
        if (ANNOTATIONS_TO_TRANSFORM.contains(desc)) {
          logger.info(
            "$TAG: Modifying method annotation visible at runtime to true for annotation $desc $visible",
          )

          // Force the annotation to be visible at runtime
          return super.visitAnnotation(desc, true)
        }

        return super.visitAnnotation(desc, visible)
      }
    }
  }

  override fun visitAnnotation(
    desc: String,
    visible: Boolean,
  ): AnnotationVisitor? {
    if (ANNOTATIONS_TO_TRANSFORM.contains(desc)) {
      logger.info(
        "$TAG: Modifying class annotation visible at runtime to true for annotation $desc $visible",
      )

      // Force the annotation to be visible at runtime
      return super.visitAnnotation(desc, true)
    }

    return super.visitAnnotation(desc, visible)
  }
}
