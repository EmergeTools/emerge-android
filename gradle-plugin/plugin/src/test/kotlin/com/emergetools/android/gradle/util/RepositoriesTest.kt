package com.emergetools.android.gradle.util

import okhttp3.HttpUrl.Companion.toHttpUrl
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.Locale

class RepositoriesTest {

  companion object {
    private val hostNames = listOf("gitlab", "github")
    private val rawUrls = listOf(
      "https://%s.com/acme-inc/my-project",
      "https://%s.com:443/acme-inc/my-project",
      "https://user:secret@%s.com/acme-inc/my-project",
      "ssh://git@%s.com/acme-inc/my-project.git",
      "ssh://git@%s.com:22/acme-inc/my-project.git",
      "git://%s.com/acme-inc/my-project.git",
      "git@%s.com/acme-inc/my-project.git"
    )

    private val rawEnterpriseUrls = listOf(
      "https://%s.acme.com/acme-inc/my-project",
      "git@%s.acme.com/acme-inc/my-project.git"
    )

    @JvmStatic
    fun urls() = hostNames.flatMap { host -> rawUrls.map { url -> Arguments.of(host, url) } }

    @JvmStatic
    fun enterpriseUrls() =
      hostNames.flatMap { host -> rawEnterpriseUrls.map { url -> Arguments.of(host, url) } }
  }

  @ParameterizedTest
  @MethodSource("urls")
  fun testToWebRepoUri(host: String, url: String) {
    val expectedUrl =
      String.format(Locale.US, "https://%s.com/acme-inc/my-project", host).toHttpUrl()
    val parsedUrl = url.format(host).toWebRepoUri()
    assertEquals(expectedUrl, parsedUrl)
  }

  @ParameterizedTest
  @MethodSource("enterpriseUrls")
  fun testWebRepoUri_enterpriseUri(host: String, url: String) {
    val expectedUrl =
      String.format(Locale.US, "https://%s.acme.com/acme-inc/my-project", host).toHttpUrl()
    val parsedUrl = url.format(host).toWebRepoUri()
    assertEquals(expectedUrl, parsedUrl)
  }
}
