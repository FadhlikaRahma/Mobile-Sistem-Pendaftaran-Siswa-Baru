package com.example.eppdb_smpn_2_kebonagung

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eppdb_smpn_2_kebonagung.model.CalonsiswaDataRequest
import com.example.eppdb_smpn_2_kebonagung.model.CalonsiswaResponse
import com.example.eppdb_smpn_2_kebonagung.service.CalonsiswaService
import com.example.eppdb_smpn_2_kebonagung.util.Retro
import com.example.eppdb_smpn_2_kebonagung.R
import com.example.eppdb_smpn_2_kebonagung.adapter.CalonsiswaAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class FormCalonsiswaFragment : Fragment() {
    private lateinit var rv_Menu1 : RecyclerView
    

    private lateinit var edtNisn: EditText
    private lateinit var edtId_user: EditText
    private lateinit var edtNama: EditText

    private lateinit var edt_status: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        edtNisn = view.findViewById(R.id.edt_nisn)
        edtId_user = view.findViewById(R.id.edt_id_user)
        edtNama = view.findViewById(R.id.edt_nama)
        edt_status = view.findViewById(R.id.edtstatus)



        if (arguments != null) {
            val nisn = arguments?.getInt("nisn")
            val id_user = arguments?.getString("id_user")
            val nama = arguments?.getString("nama")

            val STatus = arguments?.getString("status")




            edtNisn.setText(nisn.toString())
            edtId_user.setText(id_user)
            edtNama.setText(nama)

            edt_status.setText(STatus)


            rv_Menu1 = view.findViewById(R.id.rv_Menu1)
            rv_Menu1.setHasFixedSize(true)
            rv_Menu1.layoutManager = LinearLayoutManager(activity)
           
        }
        initAction()
    }

    fun initAction() {

    }






}