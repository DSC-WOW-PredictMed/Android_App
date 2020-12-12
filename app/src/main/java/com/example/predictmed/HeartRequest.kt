package com.example.predictmed

import com.google.gson.annotations.SerializedName

class HeartRequest {
    @SerializedName("age")
    var age: Int = 0

    @SerializedName("sex")
    var sex: Int = 0

    @SerializedName("cp")
    var cp: Int = 0

    @SerializedName("trestbps")
    var trestbps: Int = 0

    @SerializedName("chol")
    var chol: Float = 0.toFloat()

    @SerializedName("fbs")
    var fbs: Int = 0

    @SerializedName("restecg")
    var restecg: Int = 0

    @SerializedName("thalach")
    var thalach: Int = 0

    @SerializedName("exang")
    var exang: Int = 0

    @SerializedName("oldpeak")
    var oldpeak: Int = 0

    @SerializedName("slope")
    var slope: Int = 0

    @SerializedName("ca")
    var ca: Int = 0

    @SerializedName("thal")
    var thal: Int = 0
}