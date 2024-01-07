plugins {
    id(Plugins.android_application)
    id(Plugins.kotlin_android)
    id(Plugins.kotlin_ksp)
    id(Plugins.dagger_hilt)
}

kotlin { jvmToolchain(ApplicationConfig.jdkVersion) }

android {
    namespace = "com.example.tave"
    compileSdk = ApplicationConfig.compileSdk

    defaultConfig {
        applicationId = "com.example.tave"
        minSdk = ApplicationConfig.minSdk
        targetSdk = ApplicationConfig.targetSdk
        versionCode = ApplicationConfig.versionCode
        versionName = ApplicationConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    buildFeatures {
        compose = true
        buildConfig = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    composeOptions { kotlinCompilerExtensionVersion = Version.compose }
}

dependencies {
    implementation(Libraries.androidx_core)

    // Project Dependency
    implementation(project(Module.data))
    implementation(project(Module.domain))

    // Android Material & Material3 (Stable Version 1.1.1)
    implementation ("com.google.android.material:material:1.11.0")

    implementation(Libraries.androidx_lifecycle)

    implementation(Libraries.dagger_hilt)
    ksp(Libraries.dagger_hilt_compiler)

    implementation(Libraries.landscapist_glide)

    implementation(Libraries.zxing_core)
    implementation(Libraries.zxing_android) { isTransitive = false }

    implementation(Libraries.retrofit2)
    implementation(Libraries.retrofit2_converter_gson)

    implementation(Libraries.compose_ui)
    implementation(Libraries.compose_ui_tooling)
    implementation(Libraries.compose_ui_preview)
    implementation(Libraries.compose_livedata)
    implementation(Libraries.compose_viewmodel)
    implementation(Libraries.compose_material3)
    implementation(Libraries.compose_navigation)
    implementation(Libraries.compose_hilt_navigation)
    implementation(Libraries.compose_constraintlayout)

    
    testImplementation(Libraries.jUnit)
    androidTestImplementation(Libraries.android_jUnit)
    androidTestImplementation(Libraries.espresso_Core)
    androidTestImplementation(Libraries.compose_ui_junit4)
    debugImplementation(Libraries.compose_ui_test_manifest)
}