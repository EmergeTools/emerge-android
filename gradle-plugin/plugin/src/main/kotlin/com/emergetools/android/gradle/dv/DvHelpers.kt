package com.emergetools.android.gradle.dv

import com.gradle.develocity.agent.gradle.adapters.BuildResultAdapter
import com.gradle.develocity.agent.gradle.adapters.BuildScanAdapter
import com.gradle.develocity.agent.gradle.adapters.BuildScanCaptureAdapter
import com.gradle.develocity.agent.gradle.adapters.BuildScanObfuscationAdapter
import com.gradle.develocity.agent.gradle.adapters.DevelocityAdapter
import com.gradle.develocity.agent.gradle.adapters.PublishedBuildScanAdapter
import com.gradle.develocity.agent.gradle.adapters.develocity.DevelocityConfigurationAdapter
import com.gradle.develocity.agent.gradle.adapters.enterprise.GradleEnterpriseExtensionAdapter
import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.caching.configuration.AbstractBuildCache

private fun Project.createDevelocityAdapter(): DevelocityAdapter {
  rootProject.extensions.findByName("develocity")?.let {
    return DevelocityConfigurationAdapter(it)
  }

  rootProject.extensions.findByName("gradleEnterprise")?.let {
    return GradleEnterpriseExtensionAdapter(it)
  }
  return NoOpDevelocityAdapter()
}

fun Project.getBuildScan(): BuildScanAdapter {
  return createDevelocityAdapter().buildScan
}

// This no-op class is used if the DV plugin is not applied
@Suppress("detekt.TooManyFunctions")
private class NoOpDevelocityAdapter : DevelocityAdapter {
  override fun getBuildScan(): BuildScanAdapter {
    return NoOpBuildScanAdapter()
  }

  override fun buildScan(p0: Action<in BuildScanAdapter>?) {
    TODO("Not yet implemented")
  }

  override fun setServer(p0: String?) {
    TODO("Not yet implemented")
  }

  override fun getServer(): String? {
    TODO("Not yet implemented")
  }

  override fun setProjectId(p0: String?) {
    TODO("Not yet implemented")
  }

  override fun getProjectId(): String? {
    TODO("Not yet implemented")
  }

  override fun setAllowUntrustedServer(p0: Boolean) {
    TODO("Not yet implemented")
  }

  override fun getAllowUntrustedServer(): Boolean {
    TODO("Not yet implemented")
  }

  override fun setAccessKey(p0: String?) {
    TODO("Not yet implemented")
  }

  override fun getAccessKey(): String? {
    TODO("Not yet implemented")
  }

  override fun getBuildCache(): Class<out AbstractBuildCache>? {
    TODO("Not yet implemented")
  }
}

// This no-op class is used if the DV plugin is not applied
@Suppress("detekt.TooManyFunctions")
private class NoOpBuildScanAdapter : BuildScanAdapter {
  override fun background(p0: Action<in BuildScanAdapter>?) = Unit

  override fun tag(p0: String?) = Unit

  override fun value(p0: String?, p1: String?) = Unit

  override fun link(p0: String?, p1: String?) = Unit

  override fun buildFinished(p0: Action<in BuildResultAdapter>?) {
    TODO("Not yet implemented")
  }

  override fun buildScanPublished(p0: Action<in PublishedBuildScanAdapter>?) {
    TODO("Not yet implemented")
  }

  override fun setTermsOfUseUrl(p0: String?) {
    TODO("Not yet implemented")
  }

  override fun getTermsOfUseUrl(): String? {
    TODO("Not yet implemented")
  }

  override fun setTermsOfUseAgree(p0: String?) {
    TODO("Not yet implemented")
  }

  override fun getTermsOfUseAgree(): String? {
    TODO("Not yet implemented")
  }

  override fun setUploadInBackground(p0: Boolean) {
    TODO("Not yet implemented")
  }

  override fun isUploadInBackground(): Boolean {
    TODO("Not yet implemented")
  }

  override fun publishAlways() {
    TODO("Not yet implemented")
  }

  override fun publishAlwaysIf(p0: Boolean) {
    TODO("Not yet implemented")
  }

  override fun publishOnFailure() {
    TODO("Not yet implemented")
  }

  override fun publishOnFailureIf(p0: Boolean) {
    TODO("Not yet implemented")
  }

  override fun getObfuscation(): BuildScanObfuscationAdapter? {
    TODO("Not yet implemented")
  }

  override fun obfuscation(p0: Action<in BuildScanObfuscationAdapter>?) {
    TODO("Not yet implemented")
  }

  override fun getCapture(): BuildScanCaptureAdapter? {
    TODO("Not yet implemented")
  }

  override fun capture(p0: Action<in BuildScanCaptureAdapter>?) {
    TODO("Not yet implemented")
  }
}
