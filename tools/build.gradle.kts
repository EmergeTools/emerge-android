plugins {
  alias(libs.plugins.kotlin.jvm)
  application
}

repositories {
  mavenCentral()
}

dependencies {
}

application {
  mainClass = "com.emergetools.tools.GenKt"
}

tasks.register<JavaExec>("runGen") {
  classpath = sourceSets["main"].runtimeClasspath
  mainClass = "com.emergetools.tools.GenKt"
}
