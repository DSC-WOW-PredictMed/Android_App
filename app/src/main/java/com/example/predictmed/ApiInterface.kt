package com.example.predictmed

import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {

    @POST("/PredictHeart")
    fun getHeartResult(@Body body: HeartRequest): Call<Float>

}