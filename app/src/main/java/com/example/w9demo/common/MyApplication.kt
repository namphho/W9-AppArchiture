package com.example.w9demo.common

import android.app.Application
import com.google.firebase.FirebaseApp

/**
 * Created by nampham on 6/3/21.
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(applicationContext)
    }
}