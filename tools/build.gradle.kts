plugins {
  alias(libs.plugins.kotlin.jvm)
  application
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(libs.kotlin.stdlib)
}

application {
  mainClass = "com.emergetools.tools.GenKt"
}

// Shortcut to execute the task from the IDE
tasks.named("run")
