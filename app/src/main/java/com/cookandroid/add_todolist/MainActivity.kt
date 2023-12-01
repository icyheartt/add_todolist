package com.cookandroid.add_todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnBack1 = findViewById<ImageButton>(R.id.btnBack1)
        btnBack1.setOnClickListener {
            var intent = Intent(applicationContext, storyadd::class.java)
            startActivity(intent)
        }
    }
}