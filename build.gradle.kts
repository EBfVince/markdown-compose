plugins {
    kotlin("multiplatform") version libs.versions.kotlin apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.jetbrains.compose) apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
