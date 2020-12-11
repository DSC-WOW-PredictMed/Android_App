package com.example.predictmed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heartDisease.setOnClickListener {
            val i =  Intent(applicationContext,HeartDisease::class.java)
            startActivity(i);
        }

        liverDisease.setOnClickListener {
            val i =  Intent(applicationContext,LiverDisease::class.java)
            startActivity(i);
        }

        about_us.setOnClickListener {
            val i =  Intent(applicationContext,AboutUs::class.java)
            startActivity(i);
        }

        kidney.setOnClickListener {
            val i =  Intent(applicationContext,Kidneys::class.java)
            startActivity(i);
        }



    }

}