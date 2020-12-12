package com.example.predictmed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_heart_disease_test.*
import org.json.JSONObject

class HeartDiseaseTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heart_disease_test)

        title = "Heart Disease Test"
        buttonSubmit.setOnClickListener {
            val i = Intent(applicationContext,ResultActivity::class.java)
          //  val data = getData()
            startActivity(i)
        }



    }

//    private fun getData(): JSONObject {
//
//    }
}