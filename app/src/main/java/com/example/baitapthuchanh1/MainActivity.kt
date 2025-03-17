package com.example.baitapthuchanh1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val hoten = findViewById<EditText>(R.id.hoten)
        val tuoi = findViewById<EditText>(R.id.tuoi)
        val khungkiemtra = findViewById<Button>(R.id.khungkiemtra)
        val ketqua = findViewById<TextView>(R.id.ketqua)

        khungkiemtra.setOnClickListener{
            val hovaten = hoten.text.toString()
            val sotuoi = tuoi.text.toString()

//bấm nút kiểm tra khi không nhập đủ thông tin
            if (hovaten.isEmpty() || sotuoi.isEmpty())
            {
                ketqua.text = "Vui lòng nhập đầy đủ thông tin"
                return@setOnClickListener
            }

            val Tuoi = sotuoi.toInt()

            val xacdinhtuoi = when {
                Tuoi > 65 -> "Người già"
                Tuoi in 6 .. 65 -> "Người lớn"
                Tuoi in 2 .. 6 -> "Trẻ em"
                Tuoi >=  0 -> "Em bé"
                else -> "Tuổi không hợp lệ!"
            }
            ketqua.text = "$xacdinhtuoi"
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}