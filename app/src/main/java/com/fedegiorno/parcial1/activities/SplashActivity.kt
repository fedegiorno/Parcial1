package com.fedegiorno.parcial1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import com.fedegiorno.parcial1.MainActivity
import com.fedegiorno.parcial1.R

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 2000 // 2 sec

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler().postDelayed(

                {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
                , SPLASH_TIME_OUT)
    }
}
