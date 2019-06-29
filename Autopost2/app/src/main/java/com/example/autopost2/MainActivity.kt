package com.example.autopost2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_confirmation.*
import kotlinx.android.synthetic.main.fragment_second.view.*
import android.content.Intent
import android.widget.Toast
import com.twitter.sdk.android.core.TwitterCore
import kotlinx.android.synthetic.main.fragment_first.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postbutton.setOnClickListener {
            // エディットテキストのテキストを取得
            if(edit_text.text != null){
                // 取得したテキストを TextView に張り付ける
                text_view.text = edit_text.text.toString()
            }
        }

        // Twitter ログイン画面
//        if (TwitterCore.getInstance().getSessionManager().getActiveSession() == null) {
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//        } else {
//            val toast = Toast.makeText(this@MainActivity, "ログイン中", Toast.LENGTH_LONG)
//            toast.show()
//        }

    }
}