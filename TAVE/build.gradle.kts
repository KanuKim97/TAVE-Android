plugins {
    id(Plugins.android_application) version Version.gradle apply false
    id(Plugins.android_library) version Version.gradle apply false
    id(Plugins.kotlin_android) version Version.kotlin apply false
    id(Plugins.kotlin_ksp) version Version.ksp apply false
    id(Plugins.dagger_hilt) version Version.hilt apply false
    id(Plugins.kotlin_jvm) version Version.kotlin apply false
}