package com.`val`.additioncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addTwoNumbers()


    }

    private fun addTwoNumbers() {

        val firstNumber = findViewById<EditText>(R.id.first_number)
        val secondNumber = findViewById<EditText>(R.id.second_number)
        val result = findViewById<TextView>(R.id.result_box)
        val button = findViewById<Button>(R.id.button_calculate)

        button.setOnClickListener {

            result.text = (firstNumber.text.toString().toDouble() +  + secondNumber.text.toString().toDouble()).toString()
            Toast.makeText(this, result.text, Toast.LENGTH_LONG).show()

        }


    }
}