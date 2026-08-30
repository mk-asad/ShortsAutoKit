package com.asad.shortsautokit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    private val picker = registerForActivityResult(ActivityResultContracts.GetContent()) {}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(colorScheme = darkColorScheme()) {
                Column(
                    Modifier.fillMaxSize().padding(20.dp),
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    Text("SHORTS AUTO KIT", fontSize = 24.sp)
                    Text("Select a video, generate metadata, then connect YouTube.")
                    Button(
                        onClick = { picker.launch("video/*") },
                        modifier = Modifier.fillMaxWidth()
                    ) { Text("Choose Video") }
                    OutlinedTextField(
                        value = "This Moment Was Too Funny 😂 #Shorts",
                        onValueChange = {},
                        label = { Text("YouTube Title") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "#shorts #viralshorts #funny #comedy",
                        onValueChange = {},
                        label = { Text("Hashtags") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Button(
                        onClick = {},
                        modifier = Modifier.fillMaxWidth()
                    ) { Text("Connect YouTube") }
                }
            }
        }
    }
}
