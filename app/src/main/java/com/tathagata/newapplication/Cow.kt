package com.tathagata.newapplication

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Cow : AppCompatActivity() {

    lateinit var forwardArrow: TextView
    lateinit var backwardArrow: TextView
    lateinit var audio: TextView
    private var mediaPlayer: MediaPlayer ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cow)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "COW"

        forwardArrow = findViewById(R.id.forwardArrow)
        backwardArrow = findViewById(R.id.backwardArrow)
        audio = findViewById(R.id.audio)
        mediaPlayer = MediaPlayer.create(this, R.raw.mooing_cow)

        forwardArrow.setOnClickListener {
            Toast.makeText(this@Cow,"Horse", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this@Cow, Horse::class.java)
            startActivity(intent)
        }

        backwardArrow.setOnClickListener {
            Toast.makeText(this@Cow,"Horse", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this@Cow, Horse::class.java)
            startActivity(intent)
        }

        audio.setOnClickListener{
            mediaPlayer?.start()
        }
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer?.pause() // Pause the media player if it is playing
        finish() // destroys the current activity
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release() // Release the media player resources
        mediaPlayer = null
    }
}