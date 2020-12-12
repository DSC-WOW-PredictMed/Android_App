package com.example.predictmed

import org.json.JSONObject
import retrofit2.http.GET

interface ApiInterface {

    @GET("/PredictHeart")
    fun getHeartResult(data:JSONObject) : Float

}