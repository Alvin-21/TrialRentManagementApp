package com.example.trialrentmanagementapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.trialrentmanagementapp.ui.theme.TrialRentManagementAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textFirstNameInput = findViewById<EditText>(R.id.editTextText)
        val textSecondNameInput = findViewById<EditText>(R.id.editTextText2)
        val textViewOutput = findViewById<TextView>(R.id.textView)
        val clickButton = findViewById<Button>(R.id.button)

        clickButton.setOnClickListener {
            val firstName = textFirstNameInput.text.toString()
            val secondName = textSecondNameInput.text.toString()
            textViewOutput.text = "Name: $firstName | Second Name: $secondName"
        }
    }
}