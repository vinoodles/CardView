package com.example.cardview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNaveSeg: Button = findViewById(R.id.ButtonNav)

        val intent = Intent(this, SegundaActivity::class.java)

        buttonNaveSeg.setOnClickListener{

            startActivity(intent)

        }

    }
}