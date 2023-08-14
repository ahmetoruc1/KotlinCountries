plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("androidx.navigation.safeargs.kotlin")
    id ("kotlin-kapt")
}

android {
    namespace = "com.example.kotlincountries"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.kotlincountries"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding=true
        dataBinding=true
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }



}

dependencies {

   /* val nav_version = "2.7.0"
    val roomVersion = "2.5.2"
    val lifecycle_version = "2.6.1"
    val supportVersion = "28.0.0"
    val retrofitVersion = "2.9.0"
    val glideVersion = "4.15.0"
    val rxJavaVersion = "2.1.1"
    val preferencesVersion = "1.2.1"

    implementation("androidx.core:core-ktx:1.10.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //implementation ("androidx.databinding:databinding-runtime:$dataBindingVersion")

    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    implementation ("android.arch.lifecycle:extensions:$lifecycle_version")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")

    implementation ("com.google.android.material:material:1.9.0")

    implementation ("androidx.room:room-runtime:$roomVersion")
    kapt ("androidx.room:room-compiler:$roomVersion")
    implementation ("androidx.room:room-ktx:$roomVersion")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")


    implementation ("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation ("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    implementation ("com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion")

    implementation ("io.reactivex.rxjava2:rxjava:$rxJavaVersion")
    implementation ("io.reactivex.rxjava2:rxandroid:$rxJavaVersion")

    implementation ("com.github.bumptech.glide:glide:$glideVersion")


    //implementation ("com.android.support:support-core-utils:28.0.0")
    //implementation ("com.android.support:palette-v7:$supportVersion")
    //noinspection GradleCompatible
    implementation ("com.android.support:design:$supportVersion")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("androidx.legacy:legacy-support-core-utils:1.0.0")

    implementation ("androidx.preference:preference:$preferencesVersion")

    */

    var lifecycle_version = "2.6.1"
    var supportVersion = "28.0.0"
    var retrofitVersion = "2.9.0"
    var glideVersion = "4.15.0"
    var room_version = "2.5.1"
    var navVersion = "2.6.0"
    var preferencesVersion = "1.2.0"



    implementation ("androidx.core:core-ktx:1.10.1")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.9.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    //room
    implementation ("androidx.room:room-runtime:$room_version")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    kapt ("androidx.room:room-compiler:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")

    //coroutines for threads
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")

    // navigation
    implementation ("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation ("androidx.navigation:navigation-ui-ktx:$navVersion")

    //retrofit
    implementation ("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation ("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    implementation ("com.squareup.retrofit2:adapter-rxjava2:2.9.0")

    //rxJava
    implementation("androidx.room:room-rxjava2:$room_version")


    //glide
    implementation ("com.github.bumptech.glide:glide:$glideVersion")

    //noinspection GradleCompatible
    implementation ("com.android.support:palette-v7:$supportVersion")
    //noinspection GradleCompatible
    implementation ("com.android.support:design:$supportVersion")

    //preference
    implementation ("androidx.preference:preference:$preferencesVersion")
}
