# Convention Plugins

Reference: https://github.com/android/nowinandroid/tree/main/build-logic

The `build-logic` folder defines project-specific convention plugins, used to keep a single
source of truth for common module configurations.

By setting up convention plugins in `build-logic`, we can avoid duplicated build script setup,
messy `subproject` configurations, without the pitfalls of the `buildSrc` directory.

`build-logic` is an included build, as configured in the root
[`settings.gradle.kts`](../settings.gradle.kts).