plugins {
    id(Plugins.android_library)
    id(Plugins.kotlin_android)
    id(Plugins.kotlin_ksp)
    id(Plugins.dagger_hilt)
}

kotlin { jvmToolchain(ApplicationConfig.jdkVersion) }

android {
    namespace = "com.example.domain"
    compileSdk = ApplicationConfig.compileSdk

    defaultConfig {
        minSdk = ApplicationConfig.minSdk
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(Libraries.androidx_core)

    implementation(Libraries.dagger_hilt)
    ksp(Libraries.dagger_hilt_compiler)

    implementation(Libraries.retrofit2)
    implementation(Libraries.retrofit2_converter_gson)

    testImplementation(Libraries.jUnit)
    androidTestImplementation(Libraries.android_jUnit)
}