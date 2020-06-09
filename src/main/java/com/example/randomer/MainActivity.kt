package com.example.randomer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll = findViewById<Button>(R.id.button)
        val results = findViewById<TextView>(R.id.Results)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        roll.setOnClickListener {
            val rand = java.util.Random().nextInt(seekBar.progress)
            results.text = rand.toString()
        }
    }
}