package com.emergetools.android.gradle.tasks.snapshots.transform

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.Opcodes

/**
 * Constants used across the preview annotation processing
 */
object PreviewAnnotationConstants {
  const val PREVIEW_ANNOTATION_DESC = "Landroidx/compose/ui/tooling/preview/Preview;"
  const val EMERGE_APP_STORE_SNAPSHOT = "Lcom/emergetools/snapshots/annotations/EmergeAppStoreSnapshot;"
  const val ANNOTATION_INTERFACE = "java/lang/annotation/Annotation"
}

/**
 * First pass visitor that identifies custom annotations (like @AppStoreScreenshotPreviews) that are
 * themselves annotated with @Preview or @EmergeAppStoreSnapshot.
 */
class FindCustomPreviewClassVisitor(
  api: Int,
  private val customPreviewAnnotations: MutableMap<String, CustomPreviewAnnotation>,
  private val annotationDependencies: MutableMap<String, MutableSet<String>> = mutableMapOf()
) : ClassVisitor(api) {

  // Boolean to track if the current class is an annotation
  private var isAnnotationClass = false
  private val currentAnnotation = CustomPreviewAnnotation()
  private lateinit var currentClassName: String
  private val currentDependencies = mutableSetOf<String>()

  // Flags to improve annotation detection
  private var hasAnnotationAccess = false

  override fun visit(
    version: Int,
    access: Int,
    name: String,
    signature: String?,
    superName: String?,
    interfaces: Array<out String>?
  ) {
    super.visit(version, access, name, signature, superName, interfaces)
    
    // Reset state for this class
    isAnnotationClass = false
    currentClassName = name
    currentDependencies.clear()
    hasAnnotationAccess = (access and Opcodes.ACC_ANNOTATION) != 0
    
    // Check if this is an annotation class
    // A class is an annotation if it has the annotation access flag
    // or implements the Annotation interface
    if (hasAnnotationAccess || (interfaces != null && interfaces.contains(PreviewAnnotationConstants.ANNOTATION_INTERFACE))) {
      isAnnotationClass = true
    }
  }

  override fun visitAnnotation(descriptor: String?, visible: Boolean): AnnotationVisitor? {
    // Only process annotations if this might be an annotation class itself
    if (!isAnnotationClass) {
      return super.visitAnnotation(descriptor, visible)
    }
    
    // Special handling for RetentionPolicy annotations (confirms this is an annotation)
    if (descriptor == "Ljava/lang/annotation/Retention;") {
      isAnnotationClass = true
    }
    
    // Record direct @Preview and @EmergeAppStoreSnapshot annotations
    when (descriptor) {
      PreviewAnnotationConstants.EMERGE_APP_STORE_SNAPSHOT -> {
        currentAnnotation.isAppStoreSnapshot = true
      }
      PreviewAnnotationConstants.PREVIEW_ANNOTATION_DESC -> {
        currentAnnotation.hasPreviewAnnotation = true
        
        // Capture the preview parameters
        return object : AnnotationVisitor(api) {
          override fun visit(name: String?, value: Any?) {
            capturePreviewParameter(name, value)
            super.visit(name, value)
          }
        }
      }
      else -> {
        // This might be a reference to another custom annotation
        // Record it as a dependency, but don't process it now
        if (descriptor != null && descriptor != "Ljava/lang/annotation/Target;" &&
            descriptor != "Ljava/lang/annotation/Retention;") {
          currentDependencies.add(descriptor)
        }
      }
    }

    return object : AnnotationVisitor(api, super.visitAnnotation(descriptor, visible)) {
      override fun visitArray(name: String?): AnnotationVisitor? {
        if (name == "value") {
          return object : AnnotationVisitor(api) {
            override fun visitAnnotation(name: String?, descriptor: String?): AnnotationVisitor? {
              if (descriptor == PreviewAnnotationConstants.PREVIEW_ANNOTATION_DESC) {
                currentAnnotation.hasPreviewArray = true

                // Create a preview configuration to capture parameters
                val previewConfig = PreviewConfig()
                currentAnnotation.previewConfigs.add(previewConfig)

                // Capture the preview parameters
                return object : AnnotationVisitor(api) {
                  override fun visit(name: String?, value: Any?) {
                    previewConfig.captureParameter(name, value)
                    super.visit(name, value)
                  }
                }
              }
              return super.visitAnnotation(name, descriptor)
            }
          }
        }
        return super.visitArray(name)
      }
    }
  }

  override fun visitEnd() {
    // If this is an annotation with previews, add it to our map and record dependencies
    if (isAnnotationClass) {
      val descriptor = "L$currentClassName;"
      
      // Only add if it has something useful (preview annotations or app store flag)
      if (currentAnnotation.hasPreviewAnnotation || 
          currentAnnotation.hasPreviewArray || 
          currentAnnotation.isAppStoreSnapshot ||
          currentAnnotation.previewConfigs.isNotEmpty()) {
          
        // Store the annotation
        customPreviewAnnotations[descriptor] = currentAnnotation.copy() // Create a copy to avoid shared references
        
        // Record dependencies
        if (currentDependencies.isNotEmpty()) {
          annotationDependencies[descriptor] = currentDependencies.toMutableSet()
        }
      }
    }
    super.visitEnd()
  }
  
  /**
   * Capture preview parameters from an annotation
   */
  private fun capturePreviewParameter(name: String?, value: Any?) {
    when (name) {
      "name" -> if (value is String) currentAnnotation.name = value
      "group" -> if (value is String) currentAnnotation.group = value
      "showBackground" -> if (value is Boolean) currentAnnotation.showBackground = value
      "backgroundColor" -> if (value is Int) currentAnnotation.backgroundColor = value.toLong()
      "widthDp" -> if (value is Int) currentAnnotation.widthDp = value
      "heightDp" -> if (value is Int) currentAnnotation.heightDp = value
      "showSystemUi" -> if (value is Boolean) currentAnnotation.showSystemUi = value
      "device" -> if (value is String) currentAnnotation.device = value
      "fontScale" -> if (value is Float) currentAnnotation.fontScale = value
      "locale" -> if (value is String) currentAnnotation.locale = value 
      "uiMode" -> if (value is Int) currentAnnotation.uiMode = value
      "apiLevel" -> if (value is Int) currentAnnotation.apiLevel = value
      "wallpaper" -> if (value is Int) currentAnnotation.wallpaper = value
    }
  }
  
  /**
   * After all annotation classes have been visited, process the dependencies to complete
   * the annotation configurations.
   */
  fun processDependencies() {
    // Perform multiple passes to handle dependencies at any depth
    var changed: Boolean
    var passes = 0
    val maxPasses = 10 // Limit to avoid infinite loops with circular dependencies
    
    do {
      changed = false
      passes++
      
      // Process all annotations
      for ((descriptor, annotation) in customPreviewAnnotations) {
        // Process dependencies for this annotation
        val dependencies = annotationDependencies[descriptor] ?: continue
        
        for (dependencyDesc in dependencies) {
          val dependencyAnnotation = customPreviewAnnotations[dependencyDesc] ?: continue
          
          // Merge the dependency's configuration
          val beforeMerge = annotation.copy()
          mergeAnnotation(annotation, dependencyAnnotation)
          
          // Check if anything changed
          if (annotation != beforeMerge) {
            changed = true
          }
        }
      }
    } while (changed && passes < maxPasses)
  }
  
  /**
   * Merge configuration from a referenced annotation into the target annotation
   */
  private fun mergeAnnotation(target: CustomPreviewAnnotation, source: CustomPreviewAnnotation) {
    // Copy flag properties
    if (source.hasPreviewAnnotation) {
      target.hasPreviewAnnotation = true
    }
    if (source.hasPreviewArray) {
      target.hasPreviewArray = true
    }
    if (source.isAppStoreSnapshot) {
      target.isAppStoreSnapshot = true
    }
    
    // Copy preview configs if the target doesn't already have them
    if (target.previewConfigs.isEmpty()) {
      target.previewConfigs.addAll(source.previewConfigs)
    }
    
    // Copy other properties (if target's are null and source's aren't)
    if (target.name == null && source.name != null) target.name = source.name
    if (target.group == null && source.group != null) target.group = source.group
    if (target.showBackground == null && source.showBackground != null) target.showBackground = source.showBackground
    if (target.backgroundColor == null && source.backgroundColor != null) target.backgroundColor = source.backgroundColor
    if (target.widthDp == null && source.widthDp != null) target.widthDp = source.widthDp
    if (target.heightDp == null && source.heightDp != null) target.heightDp = source.heightDp
    if (target.showSystemUi == null && source.showSystemUi != null) target.showSystemUi = source.showSystemUi
    if (target.device == null && source.device != null) target.device = source.device
    if (target.fontScale == null && source.fontScale != null) target.fontScale = source.fontScale
    if (target.locale == null && source.locale != null) target.locale = source.locale
    if (target.uiMode == null && source.uiMode != null) target.uiMode = source.uiMode
    if (target.apiLevel == null && source.apiLevel != null) target.apiLevel = source.apiLevel
    if (target.wallpaper == null && source.wallpaper != null) target.wallpaper = source.wallpaper
  }
}

/**
 * Data class to store information about a custom annotation like @AppStoreScreenshotPreviews
 */
data class CustomPreviewAnnotation(
  var hasPreviewAnnotation: Boolean = false,
  var hasPreviewArray: Boolean = false,
  var isAppStoreSnapshot: Boolean = false,
  var name: String? = null,
  var group: String? = null,
  var showBackground: Boolean? = null,
  var backgroundColor: Long? = null,
  var widthDp: Int? = null,
  var heightDp: Int? = null,
  var showSystemUi: Boolean? = null,
  var device: String? = null,
  var fontScale: Float? = null,
  var locale: String? = null,
  var uiMode: Int? = null,
  var apiLevel: Int? = null,
  var wallpaper: Int? = null,
  val previewConfigs: MutableList<PreviewConfig> = mutableListOf()
)

/**
 * Data class to store preview configuration parameters for each @Preview in an array
 */
data class PreviewConfig(
  var name: String? = null,
  var group: String? = null,
  var showBackground: Boolean? = null,
  var backgroundColor: Long? = null,
  var widthDp: Int? = null,
  var heightDp: Int? = null,
  var showSystemUi: Boolean? = null,
  var device: String? = null,
  var fontScale: Float? = null,
  var locale: String? = null,
  var uiMode: Int? = null,
  var apiLevel: Int? = null,
  var wallpaper: Int? = null
) {
  /**
   * Capture a preview parameter from an annotation
   */
  @Suppress("detekt.CyclomaticComplexMethod")
  fun captureParameter(name: String?, value: Any?) {
    when (name) {
      "name" -> if (value is String) this.name = value
      "group" -> if (value is String) this.group = value
      "showBackground" -> if (value is Boolean) this.showBackground = value
      "backgroundColor" -> if (value is Int) this.backgroundColor = value.toLong()
      "widthDp" -> if (value is Int) this.widthDp = value
      "heightDp" -> if (value is Int) this.heightDp = value
      "showSystemUi" -> if (value is Boolean) this.showSystemUi = value
      "device" -> if (value is String) this.device = value
      "fontScale" -> if (value is Float) this.fontScale = value
      "locale" -> if (value is String) this.locale = value
      "uiMode" -> if (value is Int) this.uiMode = value
      "apiLevel" -> if (value is Int) this.apiLevel = value
      "wallpaper" -> if (value is Int) this.wallpaper = value
    }
  }
}
