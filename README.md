This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.

- `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:

  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

- `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform,
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

## PreCompose

Reference: https://tlaster.github.io/PreCompose/

> Compose Multiplatform Navigation && ViewModel, inspired by Jetpack Lifecycle, ViewModel, LiveData and Navigation,
PreCompose provides similar (or even the same) components for you but in Kotlin, and it’s Kotlin Multiplatform project.

## Adding a new Kotlin Multiplatform Shared Module

Create a new module by clicking:

1. Right click on the project -> New -> Module
2. Select `Kotlin Multiplatform Shared Module`
3. Enter the module name
4. In the `settings.gradle.kts` file, the new module is included by the following line:
   `include(":<module-name>")`
5. Add the new module as a dependency to the `build.gradle.kts` file of the `composeApp` module:
   `implementation(project(":<module-name>"))`