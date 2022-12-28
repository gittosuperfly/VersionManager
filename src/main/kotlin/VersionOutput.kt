
object AndroidX {
	const val core_ktx = "androidx.core:core-ktx:1.9.0"
	const val appcompat = "androidx.appcompat:appcompat:1.5.1"
	const val recyclerview = "androidx.recyclerview:recyclerview:1.2.1"
	const val activity = "androidx.activity:activity:1.6.1"
	const val activity_ktx = "androidx.activity:activity-ktx:1.6.1"
	const val fragment = "androidx.fragment:fragment:1.5.5"
	const val fragment_ktx = "androidx.fragment:fragment-ktx:1.5.5"
    //Fix version 31 bug: https://stackoverflow.com/questions/69783824/targeting-s-version-31-and-above-requires-that-one-of-flag-immutable-or-flag
	const val work_runtime_ktx = "androidx.work:work-runtime-ktx:2.7.1"
	const val navigation_ui = "androidx.navigation:navigation-ui:2.5.3"
	const val navigation_fragment_ktx = "androidx.navigation:navigation-fragment-ktx:2.5.3"
	const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.1.4"
    //ViewModel and LiveData
	const val lifecycle_viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1"
	const val lifecycle_livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:2.5.1"
	const val lifecycle_runtime_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1"
	const val lifecycle_viewmodel_savedstate = "androidx.lifecycle:lifecycle-viewmodel-savedstate:2.5.1"
    // Annotation processor
    // noinspection LifecycleAnnotationProcessorWithJava8
	const val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:2.5.1"
    // alternately - if using Java8, use the following instead of lifecycle-compiler
	const val lifecycle_common_java8 = "androidx.lifecycle:lifecycle-common-java8:2.5.1"
	const val tracing = "androidx.tracing:tracing:1.1.0"
}

object Google {
	const val material = "com.google.android.material:material:1.7.0"
	const val gson = "com.google.code.gson:gson:2.9.1"
	const val zxing = "com.google.zxing:core:3.4.1"
}

object Hilt {
	const val hilt_android = "com.google.dagger:hilt-android:2.43.2"
	const val hilt_android_compiler_kapt = "com.google.dagger:hilt-android-compiler:2.43.2"
	const val hilt_work = "androidx.hilt:hilt-work:1.0.0"
	const val hilt_compiler_kapt = "androidx.hilt:hilt-compiler:1.0.0"
	const val kotlinx_metadata_jvm_kapt = "org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.5.0"
}

object SquareUp {
	const val okio = "com.squareup.okio:okio:3.2.0"
	const val okhttp = "com.squareup.okhttp3:okhttp:5.0.0-alpha.2"
	const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
	const val converter_gson = "com.squareup.retrofit2:converter-gson:2.9.0"
}

object Tencent {
	const val mmkv_static = "com.tencent:mmkv-static:1.2.13"
}

object Test {
	const val junit = "junit:junit:4.13.2"
	const val junitAndroid = "androidx.test.ext:junit:1.1.4"
	const val espresso_core = "androidx.test.espresso:espresso-core:3.5.0"
}

object Kotlin {
	const val kotlinx_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4"
	const val kotlinx_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4"
}

object Library {
	const val AndroidAutoSize = "com.github.JessYanCoding:AndroidAutoSize:v1.2.1"
}

object Glide {
	const val glide = "com.github.bumptech.glide:glide:4.14.2"
	const val compiler_kapt = "com.github.bumptech.glide:compiler:4.14.2"
}
