package com.fedegiorno.clase27abr2021.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.fedegiorno.clase27abr2021.MainActivity
import com.fedegiorno.clase27abr2021.R
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 3000 // 3 sec

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
