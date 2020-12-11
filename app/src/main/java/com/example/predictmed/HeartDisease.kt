package com.example.predictmed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_heart_disease.*

class HeartDisease : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heart_disease)

        title = "Heart Disease"
        buttonTakeTest.setOnClickListener {
            val i = Intent(applicationContext,HeartDiseaseTest::class.java)
            startActivity(i)
        }
    }


}