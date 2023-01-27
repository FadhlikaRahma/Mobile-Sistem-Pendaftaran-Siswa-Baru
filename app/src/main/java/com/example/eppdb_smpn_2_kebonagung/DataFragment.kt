package com.example.eppdb_smpn_2_kebonagung

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eppdb_smpn_2_kebonagung.adapter.CalonsiswaAdapter
import com.example.eppdb_smpn_2_kebonagung.model.CalonsiswaResponse
import com.example.eppdb_smpn_2_kebonagung.service.CalonsiswaService
import com.example.eppdb_smpn_2_kebonagung.util.Retro

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataFragment : Fragment(){
    private lateinit var rv_Menu : RecyclerView
    private lateinit var CalonsiswaAdapter: CalonsiswaAdapter

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view,savedInstanceState)

        CalonsiswaAdapter = CalonsiswaAdapter(arrayListOf(),object : CalonsiswaAdapter.onAdapterListener{
            override fun onClick(nisn: Int, id_user: String, nama: String, jenis_kelamin: String, asal_sekolah: String,
                                 Tanggal_Lahir: String, Alamat: String, Nohp: String, Nama_ayah: String, No_ayah: String,
                                 Nama_ibu: String, No_ibu: String, Nama_wali: String, No_wali: String,
                                 BAhasa: String, MTK: String, IPA: String, STatus: String) {
                val bundle = Bundle()
                bundle.putInt("nisn", nisn)
                bundle.putString("id_user", id_user)
                bundle.putString("nama", nama)
                bundle.putString("jenis_kelamin", jenis_kelamin)
                bundle.putString("asal_sekolah", asal_sekolah)
                bundle.putString("tanggal_lahir", Tanggal_Lahir)
                bundle.putString("alamat", Alamat)
                bundle.putString("no_hp", Nohp)
                bundle.putString("nama_ayah", Nama_ayah)
                bundle.putString("no_hp_ayah", No_ayah)
                bundle.putString("nama_ibu", Nama_ibu)
                bundle.putString("no_hp_ibu", No_ibu)
                bundle.putString("nama_wali", Nama_wali)
                bundle.putString("no_hp_wali", No_wali)
                bundle.putString("bahasa", BAhasa)
                bundle.putString("mtk", MTK)
                bundle.putString("ipa", IPA)
                bundle.putString("status", STatus)


                val formMenuFragment : Fragment = FormCalonsiswaFragment()
                formMenuFragment.arguments = bundle
                var fr = (activity as AppCompatActivity).supportFragmentManager.beginTransaction()
                fr.replace(R.id.fl_fragment, formMenuFragment)
                fr.commit()
            }
        })
        rv_Menu = view.findViewById(R.id.rv_Menu)
        rv_Menu.setHasFixedSize(true)
        rv_Menu.layoutManager = LinearLayoutManager(activity)
        rv_Menu.adapter = CalonsiswaAdapter
        getCalonsiswaApi()
    }

    fun getCalonsiswaApi(){
        val retro = Retro().getRetroClientInstance().create(CalonsiswaService::class.java)
        retro.getCalonsiswa().enqueue(object : Callback<CalonsiswaResponse> {
            override fun onResponse(
                call: Call<CalonsiswaResponse>,
                response: Response<CalonsiswaResponse>
            ) {
                if (response.isSuccessful) {
                    val calonsiswa = response.body()!!
                    CalonsiswaAdapter.setData(calonsiswa.data!!)
                    Log.e("Nama Siswa :", calonsiswa.data.toString())
                } else {
                    Log.e("Error Code : ", response.code().toString())
                    Log.e("Error Code : ", response.message().toString())
                }
            }

            override fun onFailure(call: Call<CalonsiswaResponse>, t: Throwable){
                Log.e("Failed",t.message.toString())
            }
        }
        )
    }
}