package com.vaibhavrawat.acticitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class NextPage : AppCompatActivity() {
    var btnRestart : Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_page)
        intent?.let {
            var namee = it.getStringExtra("name")
            System.out.println(namee)
        }
        /* btnRestart = findViewById(R.id.btnRestart)
        btnRestart?.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        } */
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "On restart method invoked", Toast.LENGTH_SHORT).show()
    }


}