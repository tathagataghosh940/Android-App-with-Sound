package com.tathagata.newapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    lateinit var cow: Button
    lateinit var horse: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar:Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "ANIMALS"

        cow = findViewById(R.id.btnCow)
        horse = findViewById(R.id.btnHorse)

        cow.setOnClickListener {
            Toast.makeText(this@MainActivity,"Cow", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this@MainActivity, Cow::class.java)
            startActivity(intent)
        }

        horse.setOnClickListener {
            Toast.makeText(this@MainActivity,"Horse", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this@MainActivity, Horse::class.java)
            startActivity(intent)
        }

    }
}