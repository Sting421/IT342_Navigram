plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")  // Add this for Glide
    alias(libs.plugins.kotlin.compose)  // Compose Compiler
}

android {
    namespace = "com.example.navigram"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.navigram"
        minSdk = 27
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            applicationIdSuffix = "NaviGram"
            versionNameSuffix = "1.0"
        }
        getByName("debug") {
            applicationIdSuffix = "Navigram"
            versionNameSuffix = "1"
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
        compose = true 
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.version.get()
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.annotation)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    // API call
    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)
    implementation(libs.coroutines)

    // Token storage
    implementation(libs.security.crypto)
    implementation(libs.androidx.annotation)

    // Location services
    implementation(libs.play.services.location)
    implementation(libs.play.services.maps)
    implementation(libs.play.services.auth)

    // New dependencies for Gallery
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.viewpager2)
    implementation(libs.glide)
    kapt(libs.glide.compiler)
    implementation(libs.androidx.fragment.ktx)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // CameraX dependencies
    implementation(libs.camera.core)
    implementation(libs.camera.camera2)
    implementation(libs.camera.lifecycle)
    implementation(libs.camera.view)
    //env
    implementation(libs.dotenv)
//    implementation(libs.memtrack)
    
    // Cloudinary
    implementation(libs.cloudinary.android)

    // Networking
    implementation(libs.okhttp)

    implementation (libs.androidx.compose.ui)
    implementation (libs.androidx.compose.material)
    implementation (libs.androidx.compose.ui.tooling.preview)
    debugImplementation (libs.androidx.compose.ui.tooling)
    implementation (libs.androidx.lifecycle.runtime.compose)
    implementation (libs.androidx.activity.compose)

    // OpenStreetMap
    implementation(libs.osmdroid.android)
    implementation(libs.androidx.preference.ktx)
}
