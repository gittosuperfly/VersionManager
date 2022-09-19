
object AndroidX {
	const val core_ktx = "androidx.core:core-ktx:1.8.0"
	const val appcompat = "androidx.appcompat:appcompat:1.5.0"
	const val recyclerview = "androidx.recyclerview:recyclerview:1.2.1"
	const val activity = "androidx.activity:activity:1.5.1"
	const val activity_ktx = "androidx.activity:activity-ktx:1.5.1"
	const val fragment = "androidx.fragment:fragment:1.5.2"
	const val fragment_ktx = "androidx.fragment:fragment-ktx:1.5.2"
    //Fix version 31 bug: https://stackoverflow.com/questions/69783824/targeting-s-version-31-and-above-requires-that-one-of-flag-immutable-or-flag
	const val work_runtime_ktx = "androidx.work:work-runtime-ktx:2.7.1"
	const val navigation_ui = "androidx.navigation:navigation-ui:2.5.1"
	const val navigation_fragment_ktx = "androidx.navigation:navigation-fragment-ktx:2.5.1"
	const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.1.4"
}

object Google {
	const val material = "com.google.android.material:material:1.6.1"
	const val gson = "com.google.code.gson:gson:2.9.0"
}

object Hilt {
	const val hilt_android = "com.google.dagger:hilt-android:2.43.2"
	const val hilt_android_compiler_kapt = "com.google.dagger:hilt-android-compiler:2.43.2"
	const val hilt_work = "androidx.hilt:hilt-work:1.0.0"
	const val hilt_compiler_kapt = "androidx.hilt:hilt-compiler:1.0.0"
	const val kotlinx_metadata_jvm_kapt = "org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.5.0"
}

object Net {
	const val okhttp = "com.squareup.okhttp3:okhttp:5.0.0-alpha.2"
	const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
	const val converter_gson = "com.squareup.retrofit2:converter-gson:2.9.0"
}

object Tencent {
	const val mmkv_static = "com.tencent:mmkv-static:1.2.13"
}

object Test {
	const val junit = "junit:junit:4.13.2"
	const val junitAndroid = "androidx.test.ext:junit:1.1.3"
	const val espresso_core = "androidx.test.espresso:espresso-core:3.4.0"
}
