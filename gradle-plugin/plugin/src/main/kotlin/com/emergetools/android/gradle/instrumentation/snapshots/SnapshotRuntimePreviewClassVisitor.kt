package com.emergetools.android.gradle.instrumentation.snapshots

import com.android.build.api.instrumentation.AsmClassVisitorFactory
import com.android.build.api.instrumentation.ClassContext
import com.android.build.api.instrumentation.ClassData
import com.android.build.api.instrumentation.InstrumentationParameters.None
import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor
import org.slf4j.Logger
import org.slf4j.LoggerFactory

abstract class SnapshotRuntimePreviewClassVisitorFactory : AsmClassVisitorFactory<None> {

  companion object {

    private val logger by lazy {
      LoggerFactory.getLogger(SnapshotRuntimePreviewClassVisitorFactory::class.java)
    }
  }

  override fun createClassVisitor(
    classContext: ClassContext,
    nextClassVisitor: ClassVisitor,
  ): ClassVisitor {
    logger.info(
      "SnapshotRuntimePreviewClassVisitor processing class: ${classContext.currentClassData.className}"
    )

    return SnapshotRuntimePreviewClassVisitor(
      instrumentationContext.apiVersion.get(),
      nextClassVisitor,
      logger,
    )
  }

  override fun isInstrumentable(classData: ClassData): Boolean {
    return true
  }
}

class SnapshotRuntimePreviewClassVisitor(
  api: Int,
  classVisitor: ClassVisitor?,
  val logger: Logger,
) : ClassVisitor(api, classVisitor) {

  companion object {
    const val TAG = "SnapshotRuntimePreviewClassVisitor"
    const val PREVIEW_CONTAINER_DESC = "Landroidx/compose/ui/tooling/preview/Preview\$Container;"
    const val PREVIEW_DESC = "Landroidx/compose/ui/tooling/preview/Preview;"
    const val RUNTIME_PREVIEW_CONTAINER_DESC =
      "Lcom/emergetools/snapshots/compose/RuntimePreview\$Container;"
    const val RUNTIME_PREVIEW_DESC = "Lcom/emergetools/snapshots/compose/RuntimePreview;"
  }

  override fun visitAnnotation(
    desc: String,
    visible: Boolean,
  ): AnnotationVisitor {
    logger.info("$TAG: visitAnnotation for class: $desc $visible")

    return when (desc) {
      PREVIEW_CONTAINER_DESC -> {
        logger.info(
          "$TAG: Preview container class annotation found! Adding runtime previews..."
        )
        val runtimePreviewContainerVisitor =
          super.visitAnnotation(
            RUNTIME_PREVIEW_CONTAINER_DESC, true
          )
        val originalPreviewContainerVisitor = super.visitAnnotation(desc, visible)

        return object : AnnotationVisitor(api, originalPreviewContainerVisitor) {
          override fun visitArray(name: String?): AnnotationVisitor {
            logger.info(
              "$TAG: visit for class annotation array $name"
            )
            val runtimePreviewArrayVisitor = runtimePreviewContainerVisitor.visitArray(name)
            val originalPreviewArrayVisitor = super.visitArray(name)

            return object : AnnotationVisitor(api, originalPreviewArrayVisitor) {
              override fun visitAnnotation(
                name: String?,
                descriptor: String?,
              ): AnnotationVisitor {
                logger.info(
                  "$TAG: visit for nested annotation $name: $descriptor"
                )
                val runtimePreviewVisitor =
                  runtimePreviewArrayVisitor.visitAnnotation(
                    null,
                    RUNTIME_PREVIEW_DESC
                  )
                // TODO: Cases where not preview annotation? Likely not but should check
                val originalPreviewVisitor = super.visitAnnotation(name, descriptor)

                return object : AnnotationVisitor(api, originalPreviewVisitor) {
                  override fun visit(
                    name: String?,
                    value: Any?,
                  ) {
                    logger.info(
                      "$TAG: visit for annotation param $name: $value"
                    )
                    runtimePreviewVisitor.visit(name, value)
                    super.visit(name, value)
                  }

                  // Add handling for nested annotations and arrays here, similar to the previous example

                  override fun visitEnd() {
                    logger.info(
                      "$TAG: visit for annotation end"
                    )
                    runtimePreviewVisitor.visitEnd()
                    super.visitEnd()
                  }
                }
              }

              override fun visitEnd() {
                logger.info(
                  "$TAG: visit for annotation class array nested end"
                )
                runtimePreviewArrayVisitor.visitEnd()
                super.visitEnd()
              }
            }
          }

          override fun visitEnd() {
            logger.info(
              "$TAG: visit for annotation class container end"
            )
            runtimePreviewContainerVisitor.visitEnd()
            super.visitEnd()
          }
        }
      }
      PREVIEW_DESC -> {
        logger.info(
          "$TAG: Preview class annotation found! Adding runtime preview..."
        )
        val runtimePreviewVisitor =
          super.visitAnnotation(RUNTIME_PREVIEW_DESC, true)
        val originalPreviewVisitor = super.visitAnnotation(desc, visible)

        return object : AnnotationVisitor(api, originalPreviewVisitor) {
          override fun visit(
            name: String?,
            value: Any?,
          ) {
            logger.info(
              "$TAG: visit for annotation param $name: $value"
            )
            runtimePreviewVisitor.visit(name, value)
            super.visit(name, value)
          }

          // Add handling for nested annotations and arrays here, similar to the previous example

          override fun visitEnd() {
            logger.info("$TAG: visit for annotation end")
            runtimePreviewVisitor.visitEnd()
            super.visitEnd()
          }
        }
      }
      else -> super.visitAnnotation(desc, visible)
    }
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
      ): AnnotationVisitor {
        logger.info("$TAG: visitAnnotation for method $name$descriptor: $desc $visible")

        return when (desc) {
          PREVIEW_CONTAINER_DESC -> handlePreviewContainerMethodAnnotation(
            mv, logger, api, desc, visible
          )

          PREVIEW_DESC -> handlePreviewMethodAnnotation(mv, logger, api, desc, visible)
          else -> super.visitAnnotation(desc, visible)
        }
      }
    }
  }
}


private fun handlePreviewContainerMethodAnnotation(
  mv: MethodVisitor,
  logger: Logger,
  api: Int,
  desc: String,
  visible: Boolean,
): AnnotationVisitor {
  logger.info(
    "${SnapshotRuntimePreviewClassVisitor.TAG}: Preview container annotation found! Adding runtime previews..."
  )
  val runtimePreviewContainerVisitor =
    mv.visitAnnotation(SnapshotRuntimePreviewClassVisitor.RUNTIME_PREVIEW_CONTAINER_DESC, true)
  val originalPreviewContainerVisitor = mv.visitAnnotation(desc, visible)

  return object : AnnotationVisitor(api, originalPreviewContainerVisitor) {
    override fun visitArray(name: String?): AnnotationVisitor {
      logger.info("${SnapshotRuntimePreviewClassVisitor.TAG}: visit for annotation array $name")
      val runtimePreviewArrayVisitor = runtimePreviewContainerVisitor.visitArray(name)
      val originalPreviewArrayVisitor = super.visitArray(name)

      return object : AnnotationVisitor(api, originalPreviewArrayVisitor) {
        override fun visitAnnotation(
          name: String?,
          descriptor: String?,
        ): AnnotationVisitor {
          logger.info(
            "${SnapshotRuntimePreviewClassVisitor.TAG}: visit for nested annotation $name: $descriptor"
          )
          val runtimePreviewVisitor =
            runtimePreviewArrayVisitor.visitAnnotation(
              null,
              SnapshotRuntimePreviewClassVisitor.RUNTIME_PREVIEW_DESC
            )
          // TODO: Cases where not preview annotation? Likely not but should check
          val originalPreviewVisitor = super.visitAnnotation(name, descriptor)

          return object : AnnotationVisitor(api, originalPreviewVisitor) {
            override fun visit(
              name: String?,
              value: Any?,
            ) {
              logger.info(
                "${SnapshotRuntimePreviewClassVisitor.TAG}: visit for annotation param $name: $value"
              )
              runtimePreviewVisitor.visit(name, value)
              super.visit(name, value)
            }

            // Add handling for nested annotations and arrays here, similar to the previous example

            override fun visitEnd() {
              logger.info("${SnapshotRuntimePreviewClassVisitor.TAG}: visit for annotation end")
              runtimePreviewVisitor.visitEnd()
              super.visitEnd()
            }
          }
        }

        override fun visitEnd() {
          logger.info(
            "${SnapshotRuntimePreviewClassVisitor.TAG}: visit for annotation array nested end"
          )
          runtimePreviewArrayVisitor.visitEnd()
          super.visitEnd()
        }
      }
    }

    override fun visitEnd() {
      logger.info("${SnapshotRuntimePreviewClassVisitor.TAG}: visit for annotation container end")
      runtimePreviewContainerVisitor.visitEnd()
      super.visitEnd()
    }
  }
}

fun handlePreviewMethodAnnotation(
  mv: MethodVisitor,
  logger: Logger,
  api: Int,
  desc: String,
  visible: Boolean,
): AnnotationVisitor {
  logger.info(
    "${SnapshotRuntimePreviewClassVisitor.TAG}: Preview annotation found! Adding runtime preview..."
  )
  val runtimePreviewVisitor =
    mv.visitAnnotation(SnapshotRuntimePreviewClassVisitor.RUNTIME_PREVIEW_DESC, true)
  val originalPreviewVisitor = mv.visitAnnotation(desc, visible)

  return object : AnnotationVisitor(api, originalPreviewVisitor) {
    override fun visit(
      name: String?,
      value: Any?,
    ) {
      logger.info(
        "${SnapshotRuntimePreviewClassVisitor.TAG}: visit for annotation param $name: $value"
      )
      runtimePreviewVisitor.visit(name, value)
      super.visit(name, value)
    }

    // Add handling for nested annotations and arrays here, similar to the previous example

    override fun visitEnd() {
      logger.info("${SnapshotRuntimePreviewClassVisitor.TAG}: visit for annotation end")
      runtimePreviewVisitor.visitEnd()
      super.visitEnd()
    }
  }
}
