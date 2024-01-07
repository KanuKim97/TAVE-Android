plugins {
    id(Plugins.android_library)
    id(Plugins.kotlin_android)
    id(Plugins.kotlin_ksp)
    id(Plugins.dagger_hilt)
}

kotlin { jvmToolchain(ApplicationConfig.jdkVersion) }

android {
    namespace = "com.example.data"
    compileSdk = ApplicationConfig.compileSdk

    defaultConfig {
        minSdk = ApplicationConfig.minSdk
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(Libraries.androidx_core)

    implementation(project(Module.domain))

    implementation(Libraries.retrofit2)
    implementation(Libraries.retrofit2_converter_gson)

    implementation(Libraries.dagger_hilt)
    ksp(Libraries.dagger_hilt_compiler)

    testImplementation(Libraries.jUnit)
    androidTestImplementation(Libraries.android_jUnit)
}