package com.example.my_calculator_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnCalculator: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculator = findViewById(R.id.btnCalculator)


        btnCalculator.setOnClickListener {
            val intent = Intent( this, calculatorActivity::class.java)
            startActivity(intent)

        }

    }



}