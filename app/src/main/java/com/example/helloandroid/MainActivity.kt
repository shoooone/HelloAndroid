package com.example.helloandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tapHere = findViewById<Button>(R.id.tapHere)
        tapHere.setOnClickListener {
            val textView = findViewById<TextView>(R.id.textView)
            textView.text = "ボタンがタップされました"
        }
    }

    fun hoge(){}
}
