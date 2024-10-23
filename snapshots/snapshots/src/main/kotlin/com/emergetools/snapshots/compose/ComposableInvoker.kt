package com.emergetools.snapshots.compose

import android.util.Log
import androidx.compose.runtime.reflect.ComposableMethod
import androidx.compose.runtime.reflect.getDeclaredComposableMethod
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import java.lang.reflect.Modifier
import java.lang.reflect.ParameterizedType

/**
 * Handles reflection-based invocation of Composable methods,
 * including support for preview parameters.
 */
object ComposableInvoker {
  private const val TAG = "ComposableInvoker"

  /**
   * Finds and returns the appropriate ComposableMethod for the given parameters.
   */
  fun findComposableMethod(
    klass: Class<*>,
    methodName: String,
    previewProviderClass: Class<out PreviewParameterProvider<*>>? = null
  ): ComposableMethod {
    return previewProviderClass?.let { previewProvider ->
      Log.d(TAG, "Looking for parameterized composable method: $methodName in class: ${klass.name}")

      // Find the type argument for PreviewParameterProvider
      val providerType = findPreviewParameterType(previewProvider)
        ?: throw IllegalArgumentException("Unable to determine type argument for PreviewParameterProvider")

      // Try to find the method with either the primitive or wrapper type
      tryGetComposableMethod(klass, methodName, providerType)
        ?: throw NoSuchMethodException("Could not find composable method: $methodName")
    } ?: run {
      Log.d(TAG, "Looking for composable method: $methodName in class: ${klass.name}")
      klass.getDeclaredComposableMethod(methodName)
    }
  }

  /**
   * Prepares the composable method for invocation by ensuring accessibility.
   */
  fun prepareComposableMethod(
    composableMethod: ComposableMethod,
    originalFqn: String
  ): ComposableMethod {
    val backingMethod = composableMethod.asMethod()
    if (!backingMethod.isAccessible) {
      Log.i(TAG, "Marking composable method as accessible: $originalFqn")
      backingMethod.isAccessible = true
    }
    return composableMethod
  }

  /**
   * Gets parameters from a PreviewParameterProvider, respecting the limit if specified.
   */
  fun getPreviewParameters(
    parameterProviderClass: Class<out PreviewParameterProvider<*>>?,
    limit: Int? = null
  ): List<Any?> {
    return parameterProviderClass?.let {
      val params = getPreviewProviderParameters(it)
      limit?.let { maxLimit -> params.take(maxLimit) } ?: params
    } ?: listOf(null)
  }

  fun isStatic(composableMethod: ComposableMethod): Boolean {
    return Modifier.isStatic(composableMethod.asMethod().modifiers)
  }

  private fun findPreviewParameterType(previewProviderClass: Class<*>): Class<*>? {
    // Look through all interfaces implemented by the class
    for (genericInterface in previewProviderClass.genericInterfaces) {
      if (genericInterface is ParameterizedType &&
        genericInterface.rawType == PreviewParameterProvider::class.java
      ) {
        val typeArg = genericInterface.actualTypeArguments.firstOrNull()

        // Handle different types of type arguments
        return when (typeArg) {
          // Direct class reference
          is Class<*> -> typeArg
          // Nested generic type (e.g., List<User>)
          is ParameterizedType -> typeArg.rawType as? Class<*>
          // Other cases (wildcards, type variables, etc.)
          else -> null
        }
      }
    }

    // Check superclass if the interface isn't found in the current class
    val superclass = previewProviderClass.genericSuperclass
    if (superclass is ParameterizedType) {
      return findPreviewParameterType(superclass.rawType as Class<*>)
    }

    return null
  }

  private fun tryGetComposableMethod(
    klass: Class<*>,
    methodName: String,
    parameterType: Class<*>
  ): ComposableMethod? {
    // Map of primitive types to their wrapper classes
    val primitiveToWrapper: Map<Class<*>?, Class<*>?> = mapOf(
      Int::class.javaPrimitiveType to Integer::class.java,
      Long::class.javaPrimitiveType to Long::class.java,
      Double::class.javaPrimitiveType to Double::class.java,
      Float::class.javaPrimitiveType to Float::class.java,
      Boolean::class.javaPrimitiveType to Boolean::class.java,
      Byte::class.javaPrimitiveType to Byte::class.java,
      Short::class.javaPrimitiveType to Short::class.java,
      Char::class.javaPrimitiveType to Character::class.java
    )

    // Map of wrapper classes to their primitive types
    val wrapperToPrimitive = primitiveToWrapper.entries.associate { (k, v) -> v to k }

    return try {
      // First try with the original type
      klass.getDeclaredComposableMethod(methodName, parameterType)
    } catch (e: NoSuchMethodException) {
      // If that fails, try with the corresponding primitive/wrapper type
      val alternateType: Class<*>? = when {
        parameterType.isPrimitive -> primitiveToWrapper[parameterType]
        wrapperToPrimitive.containsKey(parameterType) -> wrapperToPrimitive[parameterType]
        else -> null
      }

      alternateType?.let {
        try {
          klass.getDeclaredComposableMethod(methodName, it)
        } catch (e: NoSuchMethodException) {
          null
        }
      }
    }
  }

  private fun getPreviewProviderParameters(
    parameterProviderClass: Class<out PreviewParameterProvider<*>>
  ): List<Any?> {
    val constructor = parameterProviderClass.constructors
      .singleOrNull { it.parameterTypes.isEmpty() }
      ?.apply { isAccessible = true }
      ?: throw IllegalArgumentException(
        "PreviewParameterProvider constructor can not have parameters"
      )
    val params = constructor.newInstance() as PreviewParameterProvider<*>
    return params.values.toList()
  }
}
