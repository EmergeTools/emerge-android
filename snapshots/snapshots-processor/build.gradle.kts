plugins {
  `java-library`
  alias(libs.plugins.kotlin.jvm)
}

dependencies {
  implementation(libs.kotlinpoet)
  implementation(libs.kotlinpoet.ksp)
  implementation(libs.ksp)

  implementation(libs.junit)
}