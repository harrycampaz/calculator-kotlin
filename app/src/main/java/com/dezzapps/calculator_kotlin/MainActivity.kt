package com.dezzapps.calculator_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onEventNumber(view: View) {

        val entryData = editText.text

        val buSelect = view as Button
        var buClickValue: String = editText.text.toString()

        when(buSelect.id){
            button1.id -> {
                buClickValue += "1"
            }
            button2.id -> {
                buClickValue += "2"
            }
            button3.id -> {
                buClickValue += "3"
            }
            button4.id -> {
                buClickValue += "4"
            }
            button5.id -> {
                buClickValue += "5"
            }
            button6.id -> {
                buClickValue += "6"
            }
            button7.id -> {
                buClickValue += "7"
            }
            button8.id -> {
                buClickValue += "8"
            }
            button9.id -> {
                buClickValue += "9"
            }
            button0.id -> {
                buClickValue += "0"
            }

            buttonpunto.id -> {
                buClickValue += "."
            }

            buttonac.id -> {
                buClickValue = "-"+ buClickValue
            }
        }

        editText.setText(buClickValue)


    }
}
