package com.example.eppdb_smpn_2_kebonagung.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

import com.example.eppdb_smpn_2_kebonagung.model.CalonsiswaDataResponse
import com.example.eppdb_smpn_2_kebonagung.R

internal class CalonsiswaAdapter(private val calonsiswaList: ArrayList<CalonsiswaDataResponse>, private val listener : onAdapterListener)
    : RecyclerView.Adapter<CalonsiswaAdapter.MyViewHolder>(){
    internal inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var nisn: TextView = view.findViewById(R.id.txt_nisn)

        var nama: TextView = view.findViewById(R.id.txt_namaaa)

        val cv_container_Menu= view.findViewById<CardView>(R.id.id_cv_container_Menu)

        fun bindHolder(calonsiswa : CalonsiswaDataResponse){
            nisn.text = calonsiswa.NisN.toString()
            nama.text = calonsiswa.NamA
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_kategori, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position:Int){
        holder.bindHolder(calonsiswaList[position])
        val calonsiswa = calonsiswaList[position]
        holder.cv_container_Menu.setOnClickListener{
            Log.e ("CalonSiswa", calonsiswaList[position].Id_User)
            listener.onClick(calonsiswa.NisN,calonsiswa.Id_User,calonsiswa.NamA, calonsiswa.Jenis_Kelamin, calonsiswa.Asal_Sekolah,
                calonsiswa.Tanggal_Lahir,calonsiswa.Alamat,calonsiswa.Nohp,calonsiswa.Nama_ayah,calonsiswa.No_ayah,calonsiswa.Nama_ibu,calonsiswa.No_ibu,
                calonsiswa.NAma_wali,calonsiswa.NO_wali,calonsiswa.BAhasa,calonsiswa.MTK,calonsiswa.IPA,calonsiswa.STatus)
        }
    }
    override fun getItemCount():Int {
        return calonsiswaList.size
    }
    fun setData(data : ArrayList<CalonsiswaDataResponse>){
        calonsiswaList.clear()
        calonsiswaList.addAll(data)
        notifyDataSetChanged()
    }
    interface onAdapterListener {
        fun onClick(nisn :Int, id_user : String, nama : String, jenis_kelamin : String, asal_sekolah : String, tanggal_lahir : String, alamat : String
                    , no_hp : String, nama_ayah : String, no_hp_ayah : String, nama_ibu : String, no_hp_ibu : String, nama_wali : String, no_hp_wali : String
                    , bahasa : String, mtk : String, ipa : String, status : String)
    }
}