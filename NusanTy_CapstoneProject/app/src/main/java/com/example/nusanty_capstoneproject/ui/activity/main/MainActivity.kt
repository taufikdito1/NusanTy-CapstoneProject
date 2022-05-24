package com.example.nusanty_capstoneproject.ui.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nusanty_capstoneproject.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

    }
}