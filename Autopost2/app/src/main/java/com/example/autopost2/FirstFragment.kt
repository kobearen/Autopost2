package com.example.autopost2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

//        view.toSecondButton.setOnClickListener {
//        findNavController.navigate(R.id.action_first_to_second)


            // onCreatedViewのなかでview.findViewByIdを利用
            view.findViewById<Button>(R.id.yoyakubutton).setOnClickListener {
                Log.d("TAG", "はいれーーーー！！！！！")
                findNavController().navigate(R.id.action_first_to_second)
            }

            //print("ボタン押したら入るはず")
            Log.d("TAG", "ボタン押したら入るはず")

        return view
    }
}


//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//            super.onViewCreated(view, savedInstanceState)
//            findViewById<Button>(R.id.toSecondButton).setOnClickListener {
//                Log.d("TAG", "ボタン押したら入るはず")
//
//            }
//        }








