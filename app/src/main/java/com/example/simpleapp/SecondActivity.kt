package com.example.simpleapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity () {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle:Bundle? = intent.extras
        val msg =bundle!!.getString("value1")
        txvUserMsg.text = msg

        BtnSayHello.setOnClickListener {
            Toast.makeText(this, "Hello $msg", Toast.LENGTH_SHORT).show()
        }
    }
}