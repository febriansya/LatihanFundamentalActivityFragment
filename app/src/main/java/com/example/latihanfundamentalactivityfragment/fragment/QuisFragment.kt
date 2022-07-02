package com.example.latihanfundamentalactivityfragment.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.example.latihanfundamentalactivityfragment.R
import com.example.latihanfundamentalactivityfragment.actvity.ProfileActivity
import com.example.latihanfundamentalactivityfragment.actvity.ProfileActivity.Companion.EXTRA_PROFILE
import com.example.latihanfundamentalactivityfragment.data.Profile


class QuisFragment : Fragment() {

    lateinit var buttonToProfile: Button
    lateinit var buttonPilih: Button

    lateinit var Rg: RadioGroup
    lateinit var rbKotlin: RadioButton
    lateinit var rbJava: RadioButton
    lateinit var rbPhp: RadioButton

    lateinit var hasil: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quis, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        put data dengan properties yang ada di data class
        buttonToProfile = view.findViewById(R.id.to_profile)
        buttonToProfile.setOnClickListener {
            val identitasProfile = Profile(
                nama = "yan febriansyah",
                status = "Jomblo",
                pendidikan = "Mahasiswa",
                golongan = 12,
                alamat = "gubuk dirik kawo, nusa tenggara barat indonesia"
            )
            val intent = Intent(requireActivity(), ProfileActivity::class.java)
            intent.putExtra(EXTRA_PROFILE, identitasProfile)
            startActivity(intent)
        }
        buttonPilih = view.findViewById(R.id.id_button_pilih)
        Rg = view.findViewById(R.id.rg_quis)
        rbJava = view.findViewById(R.id.rb_java)
        rbKotlin = view.findViewById(R.id.rb_kotlin)
        rbPhp = view.findViewById(R.id.rb_php)
        hasil = view.findViewById(R.id.tv_hasil)


//        check kondisi radio grup
        buttonPilih.setOnClickListener {
            val check = Rg.checkedRadioButtonId
            if (check != -1) {
                var hasilOption = when (check) {
                    R.id.rb_php -> rbPhp.text.toString().trim()
                    R.id.rb_kotlin -> rbKotlin.text.toString().trim()
                    R.id.rb_java -> rbJava.text.toString().trim()
                    else -> {
                        "wrong statment"
                    }
                }
                hasil.text = hasilOption.toString()
            }
        }
    }
}