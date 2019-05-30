package com.example.autopost2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        // 0517 新しくボタンから遷移する
        // navigation_graph.xmlにもactionを追加する必要がある
        view.back_button?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_second_to_first)
        }

        // ＃登録ダイアログを表示させる
        view.tag_button?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_second_to_tag)
        }

        // 仮ボタン
        view.button?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_second_to_third)
        }
        return view
    }

}
