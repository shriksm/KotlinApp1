package com.logitech.jaybird.kotlinapp1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        val btnToast = findViewById(R.id.toast) as Button

        btnToast.setOnClickListener { toastClicked(it) }
    }

    fun toastClicked(v: View) {
        Log.d("Kotlin1", "Toast clicked - this: $this; View: $v" )
        Toast.makeText(this, "I'm clicked", Toast.LENGTH_SHORT).show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}
