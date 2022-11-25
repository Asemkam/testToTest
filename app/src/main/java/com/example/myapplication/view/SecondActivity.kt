package com.example.myapplication.view

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    fun callToSupport (view: View) {
        val callNumber = Uri.parse("tel: +79136934172")
        val intentCallToSupport = Intent (Intent.ACTION_CALL, callNumber)

        startActivity(intentCallToSupport)
    }
}