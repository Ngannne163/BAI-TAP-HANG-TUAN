package com.example.baitaptuan1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val nutback= findViewById<ImageButton>(R.id.nutback)
        val nutchinhsua= findViewById<ImageButton>(R.id.nutchinhsua)

        nutback.setOnClickListener {
            finish() // Đóng Activity
        }
            nutchinhsua.setOnClickListener {
            // Hiển thị thông báo hoặc chuyển sang màn hình chỉnh sửa
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}