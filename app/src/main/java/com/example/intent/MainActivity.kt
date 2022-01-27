package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       button = findViewById(R.id.button)
      username = findViewById(R.id.username)


        button.setOnClickListener{
        startActivity(Intent(this,MainActivity2::class.java)

            .putExtra("username",username.text.toString()))

        }
    }



}


