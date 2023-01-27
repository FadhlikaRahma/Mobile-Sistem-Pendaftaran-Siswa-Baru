package com.example.eppdb_smpn_2_kebonagung.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CalonsiswaResponse (
    @Expose
    @SerializedName("code")
    val code: Int,
    @Expose
    @SerializedName("errors")
    val errors: Any,
    @Expose
    @SerializedName("message")
    val message: String,
    @Expose
    @SerializedName("data")
    val data: ArrayList<CalonsiswaDataResponse>?
    )