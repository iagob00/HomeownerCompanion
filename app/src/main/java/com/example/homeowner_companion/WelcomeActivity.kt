package com.example.homeowner_companion

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class WelcomeActivity : AppCompatActivity() {
    var mButton: Button? = null
    var mEdit: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        mButton = findViewById<Button>(R.id.getStartedButton)
        mEdit = findViewById<EditText>(R.id.textInput)
        val sharedPref = getSharedPreferences("PREF", Context.MODE_PRIVATE)
        val getUsername = sharedPref.getString("USERNAME", "")
        if( getUsername != " "){
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }

        mButton!!.setOnClickListener {
            val username = mEdit!!.text.toString()
            val sharedPref = getSharedPreferences("PREF", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putString("USERNAME", username)
            editor.apply()

            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)

        }
    }

}