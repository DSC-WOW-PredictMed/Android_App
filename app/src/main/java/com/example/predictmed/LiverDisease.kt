package com.example.predictmed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_heart_disease.*

class LiverDisease : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liver_disease)


        title = "Liver Disease"
        buttonTakeTest.setOnClickListener {
            val i = Intent(applicationContext, LiverDiseaseTest::class.java)
            startActivity(i)

        }
    }
}