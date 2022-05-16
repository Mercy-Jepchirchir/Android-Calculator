package com.example.my_calculator_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculatorActivity : AppCompatActivity() {
    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var tvOutputt: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        tvOutputt = findViewById(R.id.tvOutputt)

        btnAdd.setOnClickListener {
            val number1 = etNumber1.text.toString()
            val number2 = etNumber2.text.toString()
            if (number1.isBlank()){
                etNumber1.setError("number1 is required")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etNumber2.setError("number2 is required")
                return@setOnClickListener
            }
            addition(number1.toString().toDouble(),number2.toString().toDouble())
        }
        btnSubtract.setOnClickListener {
            val number1 = etNumber1.text.toString()
            val number2 = etNumber2.text.toString()
            if(number1.isBlank()){
                etNumber1.setError("number1 is required")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etNumber2.setError("number2 is required")
                return@setOnClickListener
            }
            subtraction(number1.toString().toDouble(),number2.toString().toDouble())
        }
        btnMultiply.setOnClickListener {
            val number1 = etNumber1.text.toString()
            val number2 = etNumber2.text.toString()
            if(number1.isBlank()){
                etNumber1.setError("number1 is required")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etNumber2.setError("number2 is required")
                return@setOnClickListener
            }
            multiplication(number1.toString().toDouble(),number2.toString().toDouble())
        }
        btnModulus.setOnClickListener {
            val number1 = etNumber1.text.toString()
            val number2 = etNumber2.text.toString()
            if(number1.isBlank()){
                etNumber1.setError("number1 is required")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etNumber2.setError("number2 is required")
                return@setOnClickListener
            }
            remainder(number1.toString().toDouble(),number2.toString().toDouble())
        }
    }
    fun addition(number1:Double,number2:Double){
        var add = number1 + number2
        tvOutputt.text = add.toString()
    }
    fun subtraction(number1: Double,number2: Double){
        var subtract = number1 - number2
        tvOutputt.text = subtract.toString()
    }
    fun multiplication(number1: Double,number2: Double){
        var multiply = number1 * number2
        tvOutputt.text = multiply.toString()

    }
    fun remainder(number1: Double,number2: Double){
        var modulus = number1 % number2
        tvOutputt.text = modulus.toString()
    }

}