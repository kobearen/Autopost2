package com.example.autopost2

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import android.support.v7.app.AppCompatActivity
import android.util.Log
import java.io.BufferedReader
import java.io.File
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment() {


        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            val view = inflater.inflate(R.layout.fragment_first, container, false)
            view.button?.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_first_to_second)


            }
            return view
        }

    private val fileName = "testfile.txt"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_first)

        //0720ここでエラー　どこかなおさんと


        // Save file
//         button_save.setOnClickListener(View.OnClickListener {
//
//            // get string contents of EditText
//            val contents = editText.text.toString()
//
//            if (!contents.isEmpty()) {
//                saveFile(fileName, contents)
//                textView.text =  getString(R.string.saved)
//            } else {
//                textView.text = getString(R.string.no_text)
//            }
//        })
//
//        // Read file
//        button_read.setOnClickListener(View.OnClickListener {
//            val str = readFiles(fileName)
//            if (str != null) {
//                textView.text = str
//            } else {
//                textView.text = getString(R.string.read_error)
//            }
//        })
    }

    private fun setContentView(fragment_first: Int) {

    }


    private fun saveFile(file: String, str: String) {

        activity!!.applicationContext.openFileOutput(file, Context.MODE_PRIVATE).use {
            it.write(str.toByteArray())
        }

//        applicationContext.openFileOutput(file, Context.MODE_PRIVATE).use {
//            it.write(str.toByteArray())
//        }
        //File(applicationContext.filesDir, file).writer().use {
        //    it.write(str)
        //}
    }

    private fun readFiles(file: String): String? {

        // to check whether file exists or not
        val readFile = File(activity!!.applicationContext.filesDir, file)

        if(!readFile.exists()){
            Log.d("debug","No file exists")
            return null
        }
        else{
            return readFile.bufferedReader().use(BufferedReader::readText)
        }
    }
    }

