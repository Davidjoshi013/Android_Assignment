package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.ButtonBarLayout

class MainActivity : AppCompatActivity() {
    private lateinit var btnBmi: Button
    private lateinit var btnNumCon: Button
    private lateinit var btnTax: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnBmi = findViewById(R.id.btnBmi)
        btnNumCon = findViewById(R.id.btnNumCon)
        btnTax = findViewById(R.id.btnTax)

        btnBmi.setOnClickListener {
            val intent = Intent(this, BmiActivity::class.java)
            startActivity(intent)

        }

        btnNumCon.setOnClickListener {
            val intent = Intent(this, NumConActivity::class.java)
            startActivity(intent)

        }

        btnTax.setOnClickListener {
            val intent = Intent(this, TaxCalActivity::class.java)
            startActivity(intent)

        }
    }






}
