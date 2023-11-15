package com.example.homeowner_companion

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class WelcomeActivity : AppCompatActivity() {
    var mButton: Button? = null
    var mEdit: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        mButton = findViewById<View>(R.id.getStartedButton) as Button
        mEdit = findViewById<View>(R.id.textInput) as EditText
        mButton!!.setOnClickListener { User.setName(mEdit!!.text.toString())}
    }

}