package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HinataActivity : AppCompatActivity() {

    companion object {
        fun getStartIntent(context: Context) = Intent(context, HinataActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hinata)
    }
}