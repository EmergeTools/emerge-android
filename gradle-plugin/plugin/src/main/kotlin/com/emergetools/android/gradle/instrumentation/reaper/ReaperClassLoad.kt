package com.emergetools.android.gradle.instrumentation.reaper

import com.android.build.api.instrumentation.AsmClassVisitorFactory
import com.android.build.api.instrumentation.ClassContext
import com.android.build.api.instrumentation.ClassData
import com.android.build.api.instrumentation.InstrumentationParameters
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.security.MessageDigest

abstract class ReaperClassLoadClassVisitorFactory :
  AsmClassVisitorFactory<InstrumentationParameters.None> {

  companion object {

    private val logger by lazy {
      LoggerFactory.getLogger(ReaperClassLoadClassVisitorFactory::class.java)
    }
  }

  override fun createClassVisitor(
    classContext: ClassContext,
    nextClassVisitor: ClassVisitor,
  ): ClassVisitor {
    logger.info(
      "ReaperClassVisitorFactory processing class: ${classContext.currentClassData.className}"
    )

    return ReaperClassLoadClassVisitor(
      instrumentationContext.apiVersion.get(),
      nextClassVisitor,
      classContext,
      logger,
    )
  }

  override fun isInstrumentable(classData: ClassData): Boolean {

    // This includes classes like kotlin.jvm.internal.Lambda which are used in
    // the <clinit> setup path of Reaper itself.
    val isKotlinStdlib = classData.className.startsWith("kotlin.")
    if (isKotlinStdlib) {
      return false;
    }

    // Don't instrument our own code but do instrument the sample.
    val isReaper = classData.className.startsWith("com.emergetools.reaper.")
    val isSample = classData.className.startsWith("com.emergetools.reaper.sample.")
    if (isReaper && !isSample) {
      return false;
    }

    return true;
  }
}

class ReaperClassLoadClassVisitor(
  api: Int,
  cv: ClassVisitor,
  val classContext: ClassContext,
  val logger: Logger,
  // private val writer: PrintWriter,
) : ClassVisitor(api, cv) {

  private var sourceFileName: String? = null

  override fun visitSource(
    source: String?,
    debug: String?,
  ) {
    super.visitSource(source, debug)
    sourceFileName = source
  }

  override fun visitMethod(
    access: Int,
    name: String?,
    descriptor: String?,
    signature: String?,
    exceptions: Array<out String>?,
  ): MethodVisitor? {
    val className = classContext.currentClassData.className
    val mv = super.visitMethod(access, name, descriptor, signature, exceptions)
    return mv?.let {
      val sig = "$className.$name$descriptor"
      logger.info("Processing method: $sig")
      ReaperClassLoadMethodVisitor(api, mv, className, name)
    }
  }
}

class ReaperClassLoadMethodVisitor(
  api: Int,
  methodVisitor: MethodVisitor,
  private val className: String,
  // private val writer: PrintWriter,
  private val name: String?,
) : MethodVisitor(api, methodVisitor) {

  override fun visitCode() {
    super.visitCode()
    if (name == "<clinit>" || name == "<init>") {
      val signature = "L" + className.replace(".", "/") + ";"
      val hashedSignature = topLong(toSha256(signature))

      // Push method argument onto the stack
      mv.visitLdcInsn(hashedSignature)

      // Invoke instance (virtual) method logMethodEntry on Reaper INSTANCE
      mv.visitMethodInsn(
        Opcodes.INVOKESTATIC,
        "com/emergetools/reaper/ReaperInternal",
        "logMethodEntry",
        "(J)V",
        false
      )
    }
  }
}

fun toSha256(s: String): ByteArray {
  return MessageDigest
    .getInstance("SHA-256")
    .digest(s.toByteArray())
}

fun topLong(buf: ByteArray): Long {
  var l: Long = 0L
  for (i in 0..7) {
    l = l or ((buf[i].toLong() and 0xFFL) shl i*8)
  }
  return l
}

