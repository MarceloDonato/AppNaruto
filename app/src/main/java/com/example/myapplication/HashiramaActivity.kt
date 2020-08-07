package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HashiramaActivity : AppCompatActivity() {

    companion object {
        fun getStartIntent(context: Context) = Intent(context, HashiramaActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hashirama)
    }
}