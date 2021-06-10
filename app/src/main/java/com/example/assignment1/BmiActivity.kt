package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class BmiActivity : AppCompatActivity() {


    private lateinit var etFirst: EditText
    private lateinit var etSecond: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvresult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)


        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvresult = findViewById(R.id.tvresult)


        btnCalculate.setOnClickListener {
            val etFirst = etFirst.text.toString().toInt()
            val First = etFirst/100
            val etSecond = etSecond.text.toString().toInt()
            BMI(First, etSecond)
        }
    }
    fun BMI (First: Int, etSecond: Int) {
        val result = etSecond / (First * First)
        tvresult.text = result.toString()
        if (result < 18.5) {
            Toast.makeText(this, "Underweight", Toast.LENGTH_SHORT).show()
        } else if (result > 18.5 && result < 24.9) {
            Toast.makeText(this, "Normal", Toast.LENGTH_SHORT).show()
        } else if (result > 25 && result < 29.9) {
            Toast.makeText(this, "oVERwebfjd", Toast.LENGTH_SHORT).show()
        } else if (result >= 30) {
            Toast.makeText(this, "hfdj", Toast.LENGTH_SHORT).show()
        }
    }
}