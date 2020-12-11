package com.example.predictmed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_heart_disease.*

class Kidneys : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alzheimers)

        title = "Kidney Disease"
        buttonTakeTest.setOnClickListener {
            val i = Intent(applicationContext, KidneyDiseaseTest::class.java)
            startActivity(i)

        }
    }
}
