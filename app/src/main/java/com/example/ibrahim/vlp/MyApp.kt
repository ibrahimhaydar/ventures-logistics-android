package com.example.ibrahim.vlp

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex


import java.util.ArrayList

/**
 * Created by ibrahim on 11/25/2017.
 */

class MyApp : Application() {


    override fun onCreate() {
        super.onCreate()

    }


    override fun attachBaseContext(context: Context) {
        super.attachBaseContext(context)
        MultiDex.install(this)
    }


}
