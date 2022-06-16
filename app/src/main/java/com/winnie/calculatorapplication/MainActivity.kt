package com.winnie.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstNumber: TextInputLayout
    lateinit var etFirstNumber: TextInputEditText
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var etSecondNumber: TextInputEditText
    lateinit var tvResult: TextView
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivide: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()


        btnAdd.setOnClickListener {
            var res1 = etFirstNumber.text.toString().toInt()
            var res2 = etSecondNumber.text.toString().toInt()

            addition(res1,res2)

        }


        btnSubtract.setOnClickListener {
            var res1 = etFirstNumber.text.toString().toInt()
            var res2 = etSecondNumber.text.toString().toInt()


            subtraction(res1,res2)

        }


        btnDivide.setOnClickListener {
            var res1 = etFirstNumber.text.toString().toInt()
            var res2 = etSecondNumber.text.toString().toInt()

            division(res1,res2)


        }


        btnModulus.setOnClickListener {
            var res1 = etFirstNumber.text.toString().toInt()
            var res2 = etSecondNumber.text.toString().toInt()

            module(res1,res2)


        }

    }

    fun castViews(){
        tilFirstNumber = findViewById(R.id.tilFirstNumber)
        etFirstNumber = findViewById(R.id.etFirstNumber)
        tilSecondNumber = findViewById(R.id.tilSecondNumber)
        etSecondNumber = findViewById(R.id.etSecondNumber)
        tvResult = findViewById(R.id.tvResult)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnDivide = findViewById(R.id.btnDivide)
        btnModulus = findViewById(R.id.btnModulus)

    }

    fun addition(res1:Int,res2:Int){
        var results = res1 + res2
        tvResult.text = results.toString()
    }

    fun subtraction(res1:Int,res2:Int){
        var results = res1 - res2
        tvResult.text = results.toString()
    }

    fun division(res1:Int,res2:Int){
        var results = res1 / res2
        tvResult.text = results.toString()
    }

    fun module(res1:Int,res2:Int){
        var results = res1 % res2
        tvResult.text = results.toString()
    }





}