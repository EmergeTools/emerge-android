package com.emergetools.reaper

import okhttp3.OkHttpClient

object WorkerResources {
  private var okHttpClient: OkHttpClient? = null

  @Synchronized
  fun setOkHttpClient(client: OkHttpClient) {
    okHttpClient = client
  }

  @Synchronized
  fun getOkHttpClient(): OkHttpClient {
    var client = okHttpClient
    if (client == null) {
      client = OkHttpClient()
      okHttpClient = client
    }
    return client
  }
}
