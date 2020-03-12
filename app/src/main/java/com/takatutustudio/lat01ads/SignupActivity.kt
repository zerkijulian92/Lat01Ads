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
            back()
//            finish()
//            startActivity(Intent(this, HomeActivity::class.java))
        }

        // berpindah activity
        tv_singin.setOnClickListener {
            back()
//            finish()
//            startActivity(Intent(this, SigninActivity::class.java))
        }
    }

    // Fungsi Button Back yang ada di smartphone
    override fun onBackPressed() {
        back()
    }

    // Membuat sebuah function untuk back
    // Catt: karena kita membuat function back()
    // maka fungsi Intent kita nonaktifkan
    private fun back() {
        finish()
        overridePendingTransition(R.anim.no_animation, R.anim.slide_out)
    }
}
