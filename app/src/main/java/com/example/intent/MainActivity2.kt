package com.example.intent



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

  private  lateinit var textview: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        textview = findViewById(R.id.textView )

        val username = intent.getStringExtra( "username")


        textview.text = "message: \n$username"

        }
    }

