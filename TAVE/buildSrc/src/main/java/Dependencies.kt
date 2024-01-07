object Version {
    const val gradle = "8.2.0"
    const val kotlin = "1.9.10"
    const val ksp = "1.9.10-1.0.13"

    const val core = "1.12.0"
    const val hilt = "2.49"
    const val lifecycle = "2.6.2"

    const val compose = "1.5.3"
    const val compose_material3 = "1.1.2"
    const val compose_navigation = "2.7.6"
    const val compose_constraintlayout = "1.0.1"
    const val compose_hilt_navigation = "1.1.0"

    const val retrofit = "2.9.0"

    const val zxing_core = "3.5.1"
    const val zxing_android = "4.3.0"

    const val lanscapist_glide = "2.2.10"

    const val jUnit = "4.13.2"
    const val android_jUnit = "1.1.5"
    const val espresso_core = "3.5.1"
}

object Plugins {
    const val android_application = "com.android.application"
    const val android_library = "com.android.library"
    const val kotlin_android = "org.jetbrains.kotlin.android"
    const val dagger_hilt = "com.google.dagger.hilt.android"
    const val kotlin_jvm = "org.jetbrains.kotlin.jvm"
    const val kotlin_ksp = "com.google.devtools.ksp"
}

object Libraries {
    const val androidx_core = "androidx.core:core-ktx:${Version.core}"

    const val androidx_lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"

    const val zxing_core = "com.google.zxing:core:${Version.zxing_core}"
    const val zxing_android = "com.journeyapps:zxing-android-embedded:${Version.zxing_android}"
    const val landscapist_glide = "com.github.skydoves:landscapist-glide:${Version.lanscapist_glide}"

    const val dagger_hilt = "com.google.dagger:hilt-android:${Version.hilt}"
    const val dagger_hilt_compiler = "com.google.dagger:hilt-android-compiler:${Version.hilt}"

    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val retrofit2_converter_gson = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"

    const val compose_ui = "androidx.compose.ui:ui:${Version.compose}"
    const val compose_ui_tooling = "androidx.compose.ui:ui-tooling:${Version.compose}"
    const val compose_ui_preview = "androidx.compose.ui:ui-tooling-preview:${Version.compose}"
    const val compose_livedata = "androidx.compose.runtime:runtime-livedata:${Version.compose}"
    const val compose_viewmodel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.lifecycle}"
    const val compose_material3 = "androidx.compose.material3:material3:${Version.compose_material3}"
    const val compose_navigation = "androidx.navigation:navigation-compose:${Version.compose_navigation}"
    const val compose_hilt_navigation = "androidx.hilt:hilt-navigation-compose:${Version.compose_hilt_navigation}"
    const val compose_constraintlayout = "androidx.constraintlayout:constraintlayout-compose:${Version.compose_constraintlayout}"
    const val compose_ui_junit4 = "androidx.compose.ui:ui-test-junit4:${Version.compose}"
    const val compose_ui_test_manifest = "androidx.compose.ui:ui-test-manifest:${Version.compose}"

    const val jUnit = "junit:junit:${Version.jUnit}"
    const val android_jUnit = "androidx.test.ext:junit:${Version.android_jUnit}"
    const val espresso_Core = "androidx.test.espresso:espresso-core:${Version.espresso_core}"
}

object Module {
    const val app = ":app"
    const val data = ":data"
    const val domain = ":domain"
}