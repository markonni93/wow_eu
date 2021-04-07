package com.example.wow

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class WowApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant()
    }
}
