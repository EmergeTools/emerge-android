plugins {
  id("com.emergetools.android")
}

emerge {
  appProjectPath.set(":app")
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))
}
