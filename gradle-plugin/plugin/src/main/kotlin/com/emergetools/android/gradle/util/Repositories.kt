package com.emergetools.android.gradle.util

import okhttp3.HttpUrl
import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * This class is inspired by the CCUD Gradle Plugin.
 * [Utils.java]
 * (https://github.com/gradle/common-custom-user-data-gradle-plugin/blob/main/src/main/java/com/gradle/Utils.java#L228)
 */
private
val gitRepoUriPattern: Pattern =
  Pattern.compile(
    "^(?:(?:https://|git://)(?:.+:.+@)?|(?:ssh)?.*?@)(.*?(?:github|gitlab).*?)(?:/|:[0-9]*?/|:)(.*?)(?:\\.git)?$"
  )

/**
 * Construct a repo [HttpUrl] from a git URL in the format of
 * `git://github.com/acme-inc/my-project.git`. If the URL cannot be parsed, null is
 * returned.
 *
 * The scheme can be any of `git://`, `https://`, or `ssh`.
 */
fun String.toWebRepoUri(): HttpUrl? {
  val matcher: Matcher = gitRepoUriPattern.matcher(this)
  if (matcher.matches()) {
    val scheme = "https"
    val host: String = matcher.group(1)
    val path = if (matcher.group(2).startsWith("/")) matcher.group(2) else "/" + matcher.group(2)
    return HttpUrl.Builder().scheme(scheme).host(host).encodedPath(path).build()
  } else {
    return null
  }
}
