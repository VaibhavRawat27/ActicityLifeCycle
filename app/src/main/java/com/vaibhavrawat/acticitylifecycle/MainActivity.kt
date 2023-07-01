package com.vaibhavrawat.acticitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var btnNext: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btnNext?.findViewById<Button>(R.id.btnNext)
        btnNext = findViewById(R.id.btnNext)

    btnNext?.setOnClickListener {
        var intent = Intent(this, NextPage::class.java)
        startActivity(intent)
        //finish() //use finish() for destroy, but if you use finish() here then you cant use restart method

    }
    }


    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "On start method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "On pause method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "On resume method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "On stop method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "On destroy method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "On restart method invoked", Toast.LENGTH_SHORT).show()
    }
}