package com.tinmegali.myweather.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Clouds(
        @SerializedName("all")
        @Expose
        var all: Double? = null
)