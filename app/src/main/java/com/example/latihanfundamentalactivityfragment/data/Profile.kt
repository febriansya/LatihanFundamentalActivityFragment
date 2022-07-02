package com.example.latihanfundamentalactivityfragment.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Profile(
    val nama: String?,
    val alamat: String?,
    val status: String?,
    val golongan: Int?,
    val pendidikan:String,
) : Parcelable
