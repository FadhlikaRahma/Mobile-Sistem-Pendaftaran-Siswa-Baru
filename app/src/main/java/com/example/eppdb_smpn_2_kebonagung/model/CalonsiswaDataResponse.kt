package com.example.eppdb_smpn_2_kebonagung.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CalonsiswaDataResponse (
    @Expose
    @SerializedName("nisn")
    val NisN: Int,
    @Expose
    @SerializedName("id_user")
    val Id_User: String,
    @Expose
    @SerializedName("nama")
    val NamA: String,
    @Expose
    @SerializedName("jenis_kelamin")
    val Jenis_Kelamin: String,
    @Expose
    @SerializedName("asal_sekolah")
    val Asal_Sekolah: String,
    @Expose
    @SerializedName("tanggal_lahir")
    val Tanggal_Lahir: String,
    @Expose
    @SerializedName("alamat")
    val Alamat: String,
    @Expose
    @SerializedName("no_hp")
    val Nohp: String,
    @Expose
    @SerializedName("nama_ayah")
    val Nama_ayah: String,
    @Expose
    @SerializedName("no_hp_ayah")
    val No_ayah: String,
    @Expose
    @SerializedName("nama_ibu")
    val Nama_ibu: String,
    @Expose
    @SerializedName("no_hp_ibu")
    val No_ibu: String,
    @Expose
    @SerializedName("nama_wali")
    val NAma_wali: String,
    @Expose
    @SerializedName("no_hp_wali")
    val NO_wali: String,
    @Expose
    @SerializedName("bahasa")
    val BAhasa: String,
    @Expose
    @SerializedName("mtk")
    val MTK: String,
    @Expose
    @SerializedName("ipa")
    val IPA: String,
    @Expose
    @SerializedName("status")
    val STatus: String,


)