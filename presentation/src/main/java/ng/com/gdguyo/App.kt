package ng.com.gdguyo

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCenter.start(
            this, BuildConfig.AppCenterKey,
            Analytics::class.java, Crashes::class.java
        )
    }
}