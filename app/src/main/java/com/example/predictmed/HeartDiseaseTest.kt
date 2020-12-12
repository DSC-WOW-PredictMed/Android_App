package com.example.predictmed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_heart_disease_test.*
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class HeartDiseaseTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heart_disease_test)

        title = "Heart Disease Test"
        buttonSubmit.setOnClickListener {
            val i = Intent(applicationContext, ResultActivity::class.java)
//            val data = getData()
//            val request = ApiClient.buildClient(ApiInterface::class.java)
//            val call = request.getHeartResult(data)
//
//            call.enqueue(object : retrofit2.Callback<Float> {
//                override fun onResponse(call: Call<Float>?, response: Response<Float>?) {
//                    if (response != null) {
//                        i.putExtra("result", response.body())
//                        Toast.makeText(applicationContext, "" + response.body(), Toast.LENGTH_SHORT)
//                            .show()
//                        startActivity(i)
//                    } else {
//                        Toast.makeText(
//                            applicationContext,
//                            "make sure all the details are filled properly",
//                            Toast.LENGTH_SHORT
//                        ).show()
//                    }
//                }
//
//                override fun onFailure(call: Call<Float>?, t: Throwable?) {
//                    Toast.makeText(
//                        applicationContext,
//                        "please fill all the details properly",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//            })
            Toast.makeText(applicationContext, "server not hosted!!", Toast.LENGTH_SHORT).show()
        }


    }

    private fun getData(): HeartRequest {

        val heartRequest: HeartRequest = HeartRequest()
        heartRequest.age = textViewAns1.text.toString().toInt()
        heartRequest.sex = textViewAns2.text.toString().toInt()
        heartRequest.cp = textViewAns3.text.toString().toInt()
        heartRequest.trestbps = textViewAns4.text.toString().toInt()
        heartRequest.chol = textViewAns5.text.toString().toFloat()
        heartRequest.fbs = textViewAns6.text.toString().toInt()
        heartRequest.restecg = textViewAns7.text.toString().toInt()
        heartRequest.thalach = textViewAns8.text.toString().toInt()
        heartRequest.exang = textViewAns9.text.toString().toInt()
        heartRequest.oldpeak = textViewAns10.text.toString().toInt()
        heartRequest.slope = textViewAns11.text.toString().toInt()
        heartRequest.ca = textViewAns12.text.toString().toInt()
        heartRequest.thal = textViewAns13.text.toString().toInt()

        return heartRequest

    }
}