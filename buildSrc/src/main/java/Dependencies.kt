import Versions.recyler_view_version
import org.codehaus.groovy.tools.shell.util.Logger.io

object ApplicationId {
    val application_id = "ng.com.gdg.uyo.android"
}

object Releases {
    val version_code = 1
    val version = "1.0"
}

object Modules {
    val domain = ":domain"
    val data = ":data"
    val firebase = ":firebase"
    val local = ":local"
    val presentation = ":presentation"
}

object Versions {
    val support = "1.0.0"
    val constrainst_layout = "1.1.3"
    val kotlin = "1.2.61"
    val glide = "4.6.1"
    val room = "1.1.1"
    val rxroom = "1.0.0"
    val firebaseMessaging = "17.4.0"
    val gson = "2.8.2"
    val hockeyapp = "5.1.1"
    val lifecycle = "2.0.0-rc01"
    val appCenterSdkVersion = "1.11.4"
    val compile_sdk = 28
    val min_sdk = 19
    val target_sdk = 28
    val junit = "4.12"
    val assertj_core = "3.9.1"
    val mockito_kotlin = "1.5.0"
    val runner = "1.0.2"
    val espresso = "3.0.2"
    val roboelectric = "4.1"
    val androidSupportRunnerVersion = "1.0.0"
    val androidSupportRulesVersion = "1.0.0"
    val lifecycle_version = "2.0.0"
    val firebase_core_version = "16.0.8"
    val firebase_auth_version = "16.2.0"
    val firebase_firestore_version = "18.1.0"
    val firebase_storage_version = "16.1.0"
    val google_services_version = "4.0.2"
    val rxandroid = "2.0.2"
    val rxkotlin = "2.2.0"
    val databinding = "3.3.1"
    val nav_version = "2.0.0"
    val recyler_view_version = "1.0.0"
    val play_service = "16.0.1"
}

object Libraries {

    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"

    val rxandroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxandroid}"
    val rxkotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"

    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler${Versions.lifecycle}"
    val play_service_auth = "com.google.android.gms:play-services-auth:${Versions.play_service}"

    val databinding_compiler = "com.android.databinding:compiler: ${Versions.databinding}"
    val room_runtime = "android.arch.persistence.room:runtime:${Versions.room}"
    val room_complier = "android.arch.persistence.room:compiler:${Versions.room}"
    val rxroom = "android.arch.persistence.room:rxjava2:${Versions.rxroom}"
    val gson = "com.google.code.gson:gson:${Versions.gson}"

    val firebaseCore = "com.google.firebase:firebase-core:${Versions.firebase_core_version}"
    val firestore = "com.google.firebase:firebase-firestore:${Versions.firebase_firestore_version}"
    val firebaseStorage = "com.google.firebase:firebase-storage:${Versions.firebase_storage_version}"
    val firebaseAuth = "com.google.firebase:firebase-auth:${Versions.firebase_auth_version}"
    val firebaseCloudMessaging = "com.google.firebase:firebase-messaging:${Versions.firebaseMessaging}"


    val nav_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
    val nav_ui = "androidx.navigation:navigation-ui:${Versions.nav_version}"

    val appCenterCrashlytics = "com.microsoft.appcenter:appcenter-crashes:${Versions.appCenterSdkVersion}"
    val appCenterAnalytics = "com.microsoft.appcenter:appcenter-analytics:${Versions.appCenterSdkVersion}"

}

object SupportLibraries {
    val appcompat_v7 = "androidx.appcompat:appcompat:${Versions.support}"
    val design = "com.google.android.material:material:1.0.0-rc01"
    val cardview_v7 = "androidx.cardview:cardview:${Versions.support}"
    val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyler_view_version}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constrainst_layout}"
    val support = "androidx.legacy:legacy-support-v4:${Versions.support}"
    val support_vector = "com.android.support:support-vector-drawable:${Versions.support}"
}

object TestLibraries {
    val junit = "junit:junit:${Versions.junit}"
    val assertj_core = "org.assertj:assertj-core:${Versions.assertj_core}"
    val runner = "com.android.support.test:runner:${Versions.runner}"
    val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
    val mockito_kotlin = "com.nhaarman:mockito-kotlin:${Versions.mockito_kotlin}"
    val lifecycle_testing = "android.arch.core:core-testing:${Versions.lifecycle}"
    val room = "android.arch.persistence.room:testing:${Versions.room}"
    val kotlinJUnit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    val robolectric = "org.robolectric:robolectric:${Versions.roboelectric}"
    val archTesting = "android.arch.core:core-testing:${Versions.room}"
    val supportRunner = "com.android.support.test:runner:${Versions.androidSupportRunnerVersion}"
    val supportRules = "com.android.support.test:rules:${Versions.androidSupportRulesVersion}"

}


object Config {
    val testRunner = "androidx.test.runner.AndroidJUnitRunner"
}