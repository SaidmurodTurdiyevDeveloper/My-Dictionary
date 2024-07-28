plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
//    id("kotlin-kapt")
    id("com.google.devtools.ksp") version "1.9.0-1.0.13"
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "uz.smt.mydictionary"
    compileSdk = 34

    defaultConfig {
        applicationId = "uz.smt.mydictionary"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = true
            isShrinkResources=true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

//   Navigator
//   Voyager
    implementation(libs.voyager.navigator)
    // Screen Model
    implementation(libs.voyager.screenmodel)
    // BottomSheetNavigator
    implementation(libs.voyager.bottom.sheet.navigator)
    // TabNavigator
    implementation(libs.voyager.tab.navigator)
    // Transitions
    implementation(libs.voyager.transitions)
    // Android
    // Koin integration
//    implementation("cafe.adriel.voyager:voyager-koin:1.1.0-beta02")
    // Hilt integration
    implementation(libs.voyager.hilt)
    // LiveData integration
    implementation(libs.voyager.livedata)
    // Desktop + Android
    // Kodein integration
//    implementation("cafe.adriel.voyager:voyager-kodein:1.1.0-beta02")
    // RxJava integration
    implementation(libs.voyager.rxjava)

//    DI
//    Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)

//   Storage
//   DataStore
//   Preference
    implementation(libs.androidx.datastore.preferences)
    // optional - RxJava2 support
    implementation(libs.androidx.datastore.preferences.rxjava2)
    // optional - RxJava3 support
    implementation(libs.androidx.datastore.preferences.rxjava3)

    //Proto DataStore
    implementation(libs.androidx.datastore)
    // optional - RxJava2 support
    implementation(libs.androidx.datastore.rxjava2)
    // optional - RxJava3 support
    implementation(libs.androidx.datastore.rxjava3)

//  Room
    implementation(libs.androidx.room.runtime)
    annotationProcessor(libs.androidx.room.compiler)
    // To use Kotlin annotation processing tool (kapt)
//    ksp("androidx.room:room-compiler:$room_version")
    // To use Kotlin Symbol Processing (KSP)
    ksp(libs.androidx.room.compiler)
    // optional - Kotlin Extensions and Coroutines support for Room
    implementation(libs.androidx.room.ktx)
    // optional - RxJava2 support for Room
    implementation(libs.androidx.room.rxjava2)
    // optional - RxJava3 support for Room
    implementation(libs.androidx.room.rxjava3)
    // optional - Guava support for Room, including Optional and ListenableFuture
    implementation(libs.androidx.room.guava)
    // optional - Test helpers
    testImplementation(libs.androidx.room.testing)
    // optional - Paging 3 Integration
    implementation(libs.androidx.room.paging)
}
//kapt {
//    correctErrorTypes = true
//}