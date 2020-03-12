package com.takatutustudio.lat01ads

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signin.*

class SigninActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        // berpindah activity
        btn_signup.setOnClickListener {
//            finish()
            startActivity(Intent(this, HomeActivity::class.java))
            // Memasukan animasi transisi
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        }

        // berpindah activity
        tv_singin.setOnClickListener {
//            finish()
            startActivity(Intent(this, SignupActivity::class.java))
            // Memasukan animasi transisi
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)

        }
    }

    // Fungsi Button Back yang ada di smartphone
    override fun onBackPressed() {
        finish()
    }
}
