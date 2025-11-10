package com.example.trialrentmanagementapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.second_activity)

        val outputTextView = findViewById<TextView>(R.id.textView2)
        val receiveName = intent.getStringExtra("TENANT_NAME")
        outputTextView.text = receiveName
        Toast.makeText(this, receiveName, Toast.LENGTH_SHORT).show()
    }
}