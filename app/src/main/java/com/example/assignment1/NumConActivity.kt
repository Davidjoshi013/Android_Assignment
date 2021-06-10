package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class NumConActivity : AppCompatActivity() {
    val num = 0
    private lateinit var etFirst: EditText
    private lateinit var btnNumCon: Button
    private lateinit var tvresult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num_con)

        etFirst = findViewById(R.id.etFirst)
        btnNumCon = findViewById(R.id.btnNumCon)
        tvresult = findViewById(R.id.tvresult)
        btnNumCon.setOnClickListener {
            val number = etFirst.text.toString().toInt()
            convert(number)
        }
    }


    fun convert(number: Int) {
        val list1 = listOf<String>(
            "Zero", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        )
        val list2 = listOf<String>(
            "", "", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"
        )
        val list3 = listOf<String>(
            "",
            "One Hundred",
            "Two Hundred",
            "Three Hundred",
            "Four Hundred",
            "Five Hundred",
            "Six Hundred",
            "Seven Hundred",
            "Eight Hundred",
            "Nine Hundred"
        )
        if (number < 20) {
            val result = (list1[number])
            tvresult.text = result.toString()
        } else if (number >= 20 && number < 100) {
            if (number % 10 == 0) {
                val result = list2[number / 10]
                tvresult.text = result.toString()
            } else {
                val result = (list2[number / 10] + " " + list1[number % 10])
                tvresult.text = result.toString()
            }
        } else if (number >= 100 && number < 1000) {
            if (number % 10 == 0) {
                val result = (list3[number / 100])
                tvresult.text = result.toString()
            } else if ((number % 100) / 10 == 0) {
                val result = (list3[number / 100] + " and " + list1[number % 10])
                tvresult.text = result.toString()
            } else {
                val result =
                    (list3[number / 100] + " and " + list2[(number % 100) / 10] + " " + list1[number % 10])
                tvresult.text = result.toString()
            }
        } else if (number >= 1000) {
            Toast.makeText(this, "Number is too large, try again!!", Toast.LENGTH_SHORT).show()
        }
    }
}