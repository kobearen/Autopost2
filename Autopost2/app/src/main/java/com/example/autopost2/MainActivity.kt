package com.example.autopost2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_confirmation.*
import kotlinx.android.synthetic.main.fragment_second.view.*
import android.content.Intent
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import com.twitter.sdk.android.core.TwitterCore
import kotlinx.android.synthetic.main.fragment_first.*

class MainActivity : AppCompatActivity() {

    var memoryFlg: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "post"

        postButton.setOnClickListener {
            // 何も無い時
            if(memoryFlg == 0){
                memoryView.text = EditText.text
                EditText.text = null
                memoryFlg = memoryFlg + 1
            }
            // 1だけ埋まっている時
            else if(memoryFlg == 1){
                memoryView2.text = memoryView.text
                memoryView.text = EditText.text
                EditText.text = null
                memoryFlg = memoryFlg + 1
            }
            // 全部埋まっている時
            else if(memoryFlg == 2){
                // memoryView2 が消えますが良いですか？ダイアログ
                memoryView2.text = memoryView.text
                memoryView.text = EditText.text
                EditText.text = null
                memoryFlg = 2
            }
            else if(memoryFlg >= 3){
                //例外エラー
            }
        }

        clearButton.setOnClickListener {
            EditText.text = null
            memoryView.text = "memory1"
            memoryView2.text = "memory2"
            memoryFlg = 0
        }


        // 2020/01/09メインアクティﾋﾞからfirstフラグメントに行けるようにする！
//        val button = findViewById<Button>(R.id.fragButton)
//        button.setOnClickListener {
//            val transaction = supportFragmentManager.beginTransaction()
//            transaction.add(R.id.fragment_first, FirstFragment.createInstance())
//            transaction.addToBackStack(null)
//            transaction.commit()
//        }

    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> finish()
            else -> return super.onOptionsItemSelected(item)
        }
        return true
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

//    }
//}