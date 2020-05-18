package com.example.simpleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnAboutMe.setOnClickListener {
            val message: String = enter_your_name.text.toString()
            val intent = Intent(this , SecondActivity::class.java)
            intent.putExtra("value1" , message)
            startActivity(intent)
        }



    }

}

