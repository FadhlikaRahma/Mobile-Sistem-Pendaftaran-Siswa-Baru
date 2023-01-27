package com.example.eppdb_smpn_2_kebonagung.service

import com.example.eppdb_smpn_2_kebonagung.model.CalonsiswaDataRequest
import com.example.eppdb_smpn_2_kebonagung.model.CalonsiswaResponse
import retrofit2.Call
import retrofit2.http.*

interface CalonsiswaService {
    @GET("siswa")
    fun getCalonsiswa() : Call<CalonsiswaResponse>
    @POST("calonsiswa")
    fun postCalonsiswa(@Body req: CalonsiswaDataRequest) : Call<CalonsiswaResponse>
    @PUT("calonsiswa/{nisn}")
    fun putCalonsiswa(@Path("nisn") id:Int, @Body req: CalonsiswaDataRequest) : Call<CalonsiswaResponse>
    @DELETE("calonsiswa/{nisn}")
    fun deleteMovie(@Path("nisn") id:Int) : Call<CalonsiswaResponse>
}