package com.example.predictmed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.core.os.postDelayed
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.textView
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val animation = AnimationUtils.loadAnimation(this,R.anim.fade_in)
        val animationDelayed = AnimationUtils.loadAnimation(this,R.anim.fade_in_delayed)
        val animationLongDelayed = AnimationUtils.loadAnimation(this,R.anim.fade_in_long_delayed)

        textView.startAnimation(animation)

        textView.postOnAnimation {
            textView.visibility = View.VISIBLE
            textView3.startAnimation(animationDelayed)
        }

        textView3.postOnAnimation {
            textView3.visibility = View.VISIBLE
            textView4.startAnimation(animationLongDelayed)

        }

        textView4.postOnAnimation {
            textView4.visibility = View.VISIBLE
            Handler().postDelayed({
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            },500)
        }


    }
}