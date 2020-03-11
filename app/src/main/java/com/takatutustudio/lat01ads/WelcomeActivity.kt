package com.takatutustudio.lat01ads

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Berpindah Activity
        btn_getstarted.setOnClickListener {
            finish()
            startActivity(Intent(this, SigninActivity::class.java))
        }
    }
}
