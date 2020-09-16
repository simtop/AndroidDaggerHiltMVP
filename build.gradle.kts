// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath (Libs.com_android_tools_build_gradle)
        classpath (Libs.kotlin_gradle_plugin)
        classpath (Libs.hilt_android_gradle_plugin)
    }
}

plugins {
    buildSrcVersions
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}