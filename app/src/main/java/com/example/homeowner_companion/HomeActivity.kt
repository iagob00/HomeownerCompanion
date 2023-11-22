package com.example.homeowner_companion

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val sharedPref = getSharedPreferences("PREF", Context.MODE_PRIVATE)
        val username = sharedPref.getString("USERNAME", "").toString()
        updateTextView(username)

    }
    private fun updateTextView(username: String){
        var mText: TextView? = null
        mText = findViewById<View>(R.id.homeownerSubText) as TextView
        mText.text = "Hello, $username"
    }
}