plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("7.4.2").apply(false)
    kotlin("multiplatform").version("1.8.20").apply(false)
}

group = "com.example"
version = "0.0.1"

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}