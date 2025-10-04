package com.example.simplecounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView3)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            counter++
            textView.text = counter.toString()
            Toast.makeText(it.context, "clicked add 1", Toast.LENGTH_SHORT).show()
        }

    }
}