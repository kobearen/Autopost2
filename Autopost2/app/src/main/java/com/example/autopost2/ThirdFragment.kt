package com.example.autopost2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_third.view.*

class ThirdFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        view.back_top_button?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_third_to_first)
        }

        view.list_button?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_third_to_second)
        }
            return view
    }
}