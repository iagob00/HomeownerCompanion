package com.example.homeowner_companion

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.app.Application

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var newData = User.name
        updateTextView(newData)

    }
    private fun updateTextView(newText: String){
        var mText: TextView? = null
        mText = findViewById<View>(R.id.homeownerSubText) as TextView
        mText.text = "Hello, "+newText
    }
}