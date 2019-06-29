package com.example.autopost2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import com.twitter.sdk.android.core.Callback
import com.twitter.sdk.android.core.Result
import com.twitter.sdk.android.core.TwitterException
import com.twitter.sdk.android.core.TwitterSession
import com.twitter.sdk.android.core.identity.TwitterLoginButton

class LoginActivity : AppCompatActivity() {

    private var loginButton: TwitterLoginButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton = findViewById(R.id.login_button) as TwitterLoginButton
        loginButton!!.callback = object : Callback<TwitterSession>() {
            override fun success(result: Result<TwitterSession>) {
                // Do something with result, which provides a TwitterSession for making API calls

                val toast = Toast.makeText(this@LoginActivity, "ログイン成功", Toast.LENGTH_LONG)
                toast.show()
            }

            override fun failure(exception: TwitterException) {
                // Do something on failure

                val toast = Toast.makeText(this@LoginActivity, "ログイン失敗", Toast.LENGTH_LONG)
                toast.show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Pass the activity result to the login button.
        loginButton!!.onActivityResult(requestCode, resultCode, data)
    }

}
