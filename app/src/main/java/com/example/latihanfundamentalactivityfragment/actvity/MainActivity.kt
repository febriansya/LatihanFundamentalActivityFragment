package com.example.latihanfundamentalactivityfragment.actvity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihanfundamentalactivityfragment.R
import com.example.latihanfundamentalactivityfragment.fragment.HistoryFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        seting for fragment
        val mFragmentManager = supportFragmentManager
        val mQuisFragment = HistoryFragment()


        val fragment = mFragmentManager.findFragmentByTag(HistoryFragment::class.java.simpleName)

//        show quisFragment
        mFragmentManager
            .beginTransaction()
            .add(R.id.container_framelayout, mQuisFragment, HistoryFragment::class.java.simpleName)
            .commit()
    }
}