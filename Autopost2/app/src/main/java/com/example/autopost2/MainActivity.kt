package com.example.autopost2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_confirmation.*
import kotlinx.android.synthetic.main.fragment_second.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button?.setOnClickListener {
            // エディットテキストのテキストを取得
            if(edit_text.text != null){
                // 取得したテキストを TextView に張り付ける
                text_view.text = edit_text.text.toString()
            }
        }
    }
}
