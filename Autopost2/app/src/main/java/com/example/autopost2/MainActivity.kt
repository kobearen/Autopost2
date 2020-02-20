package com.example.autopost2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*
import android.view.MenuItem
import androidx.navigation.Navigation


class MainActivity : AppCompatActivity() {

    var memoryFlg: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 2020/01/09メインアクティﾋﾞからfirstフラグメントに行けるようにする！

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "post"

        postButton.setOnClickListener {
            // 何も無い時
            if(memoryFlg == 0){
                memoryView.text = EditText.text
                EditText.text = null
                memoryFlg += 1
            }

            // 1だけ埋まっている時
            else if(memoryFlg == 1){
                memoryView2.text = memoryView.text
                memoryView.text = EditText.text
                EditText.text = null
                memoryFlg += 1
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

        fragButton.setOnClickListener {
            setContentView(R.layout.fragment_first)
            // setContentView お菓子以下も
        }

    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> finish()
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
        menu?.add(0)
        menu?.add(0)
    }
    
}


