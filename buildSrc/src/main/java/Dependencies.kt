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
}

object Versions {
    val support = "28.0.0-alpha3"
    val constrainst_layout = "1.1.2"
    val kotlin = "1.2.61"
    val glide = "4.6.1"
    val room = "1.1.1"
    val rxroom = "1.0.0"
    val firebaseMessaging = "17.4.0"
    val gson = "2.8.2"
    val hockeyapp = "5.1.1"
    val lifecycle = "1.1.1"
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
}

object Libraries {

    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"

    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    val lifecycle_extensions = "android.arch.lifecycle:extensions:${Versions.lifecycle}"
    val lifecycle_compiler = "android.arch.lifecycle:compiler:${Versions.lifecycle}"

    val room_runtime = "android.arch.persistence.room:runtime:${Versions.room}"
    val room_complier = "android.arch.persistence.room:compiler:${Versions.room}"
    val rxroom = "android.arch.persistence.room:rxjava2:${Versions.rxroom}"
    val gson = "com.google.code.gson:gson:${Versions.gson}"

    val firebaseCloudMessaging = "com.google.firebase:firebase-messaging:${Versions.firebaseMessaging}"
    val appCenterCrashlytics = "com.microsoft.appcenter:appcenter-crashes:${Versions.appCenterSdkVersion}"
    val appCenterAnalytics = "com.microsoft.appcenter:appcenter-analytics:${Versions.appCenterSdkVersion}"

}

object SupportLibraries {
    val appcompat_v7 = "com.android.support:appcompat-v7:${Versions.support}"
    val design = "com.android.support:design:${Versions.support}"
    val cardview_v7 = "com.android.support:cardview-v7:${Versions.support}"
    val recyclerview_v7 = "com.android.support:recyclerview-v7:${Versions.support}"
    val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constrainst_layout}"
    val support = "com.android.support:support-v4:${Versions.support}"
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
    val testRunner = "android.support.test.runner.AndroidJUnitRunner"
}