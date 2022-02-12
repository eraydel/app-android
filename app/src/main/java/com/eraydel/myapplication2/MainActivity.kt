package com.eraydel.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = 5
        Log.i("Information" , "El valor de a es $a")
        Log.i("Information" , "El valor de a*3 es ${a*3} ")
    }
}