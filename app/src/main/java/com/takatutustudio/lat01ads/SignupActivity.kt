package com.takatutustudio.lat01ads

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // berpindah activity
        btn_signup.setOnClickListener {
            finish()
            startActivity(Intent(this, HomeActivity::class.java))
        }

        // berpindah activity
        tv_singin.setOnClickListener {
            finish()
            startActivity(Intent(this, SigninActivity::class.java))
        }
    }
}
