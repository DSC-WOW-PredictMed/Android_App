package com.example.predictmed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_liver_disease_test.*

class LiverDiseaseTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liver_disease_test)

        title = "Liver Disease Test"

        buttonSubmit.setOnClickListener {
            Toast.makeText(applicationContext,"work under progress",Toast.LENGTH_SHORT).show()
        }
    }
}