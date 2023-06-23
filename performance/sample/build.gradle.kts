plugins {
  id("com.emergetools.android")
}

emerge {
  appProjectPath.set(":app")
  apiToken.set(System.getenv("EMERGE_API_TOKEN"))

  performance {
    // Due to the configuration of the emerge-android repo, this is the absolute path from the root
    // For most cases, this will be relative within the project
    perfProjectPath.set(":performance:sample:perftesting")
  }
}
