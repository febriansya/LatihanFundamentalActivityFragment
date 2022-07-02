package com.example.latihanfundamentalactivityfragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.latihanfundamentalactivityfragment.R
import java.lang.reflect.Array.newInstance
import javax.xml.datatype.DatatypeFactory.newInstance


class HistoryFragment : Fragment() {

    lateinit var buttonToQuis: Button
    lateinit var buttonToDO: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_history, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonToDO = view.findViewById(R.id.to_do)
        buttonToQuis = view.findViewById(R.id.to_quis)

        buttonToDO.setOnClickListener {

            val mOptiondialogToDoFragment = DialogToDoFragment()
            val mFragment = childFragmentManager
//            mOptiondialogToDoFragment.show(mFragment, DialogToDoFragment::class.java.simpleName)
            DialogToDoFragment().show(childFragmentManager, DialogToDoFragment.TAG)
        }

        buttonToQuis.setOnClickListener {
            val quisFragment = QuisFragment()
            val mQuisFragment = parentFragmentManager

            mQuisFragment.beginTransaction().apply {
                replace(
                    R.id.container_framelayout,
                    quisFragment,
                    QuisFragment::class.java.simpleName
                )
                addToBackStack(null)
                commit()
            }
        }

    }
}