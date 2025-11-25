package com.example.enhancedui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.enhancedui.R.id.submitbutton


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val namefeild = findViewById<EditText>(R.id.namefeild)
        val submitbutton = findViewById<Button>(R.id.submitbutton)

        submitbutton.setOnClickListener {
            val name = namefeild.text.toString().trim()

            if (name.isNotEmpty()) {
                Toast.makeText(this, "Hello, $name! Welcome 😊🩷", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please enter your name!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}