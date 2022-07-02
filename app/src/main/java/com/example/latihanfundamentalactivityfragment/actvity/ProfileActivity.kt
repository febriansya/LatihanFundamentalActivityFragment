package com.example.latihanfundamentalactivityfragment.actvity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.latihanfundamentalactivityfragment.R
import com.example.latihanfundamentalactivityfragment.data.Profile

class ProfileActivity : AppCompatActivity() {

    lateinit var nama: TextView
    lateinit var alamat: TextView
    lateinit var golongan: TextView
    lateinit var status: TextView
    lateinit var pendidikan: TextView

    companion object {
        const val EXTRA_PROFILE = "extra_profile"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        nama = findViewById(R.id.id_name)
        alamat = findViewById(R.id.id_alamatt)
        golongan = findViewById(R.id.id_golongan)
        status = findViewById(R.id.id_status)
        pendidikan = findViewById(R.id.id_pendidikan)


//        ngambil data objek dari data class lewat quisFragment
        val objectProfile = intent.getParcelableExtra<Profile>(EXTRA_PROFILE) as Profile

        nama.text = "nama saya adalah ${objectProfile.nama}"
        alamat.text = "alamat saya adalah ${objectProfile.alamat}"
        golongan.text = "golongan saya adalah ${objectProfile.golongan}"
        status.text = " status saya adalah ${objectProfile.status}"
        pendidikan.text = "pendidikan  saya adalah ${objectProfile.pendidikan}"

    }
}