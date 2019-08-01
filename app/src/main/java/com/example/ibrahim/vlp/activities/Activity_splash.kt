package com.example.ibrahim.vlp.activities

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.ibrahim.vlp.R

class Activity_splash : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({ goToLogin() }, 2000)
    }

    fun goToLogin(){
        startActivity(Intent(this@Activity_splash, Activity_registration::class.java))
    }

}
