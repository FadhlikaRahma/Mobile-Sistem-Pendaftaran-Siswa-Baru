package com.example.eppdb_smpn_2_kebonagung.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CalonsiswaDataRequest (
    @Expose
    @SerializedName("id_user")
    val id_user: String,
    @Expose
    @SerializedName("nama")
    val nama: String,
    @Expose
    @SerializedName("jenis_kelamin")
    val jenis_kelamin: String,
    @Expose
    @SerializedName("asal_sekolah")
    val asal_sekolah: String,
    @Expose
    @SerializedName("tanggal_lahir")
    val Tanggal_Lahir: String,
    @Expose
    @SerializedName("alamat")
    val Alamat: String,
    @Expose
    @SerializedName("no_hp")
    val NOhp: String,
    @Expose
    @SerializedName("nama_ayah")
    val NAma_ayah: String,
    @Expose
    @SerializedName("no_hp_ayah")
    val NO_ayah: String,
    @Expose
    @SerializedName("nama_ibu")
    val NAma_ibu: String,
    @Expose
    @SerializedName("no_hp_ibu")
    val NO_ibu: String,
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