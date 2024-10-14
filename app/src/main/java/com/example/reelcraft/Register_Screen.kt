package com.example.reelcraft

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegisterScreen() {
    val scrollState = rememberScrollState()

    var name by remember { mutableStateOf("") }
    var college by remember { mutableStateOf("") }
    var course by remember { mutableStateOf("") }
    var year by remember { mutableStateOf("") }
    var rollNo by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phoneNo by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        Text("Register for the ReelCraft", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color(0xFF6A1B9A))
        Spacer(modifier = Modifier.height(16.dp))

        CustomTextField(label = "Name" , value=name, onValueChange={name=it})
        CustomTextField(label = "College", value = college, onValueChange = {college=it})
        CustomTextField(label = "Course", value = course, onValueChange = {course=it})
        CustomTextField(label = "Year", value = year, onValueChange = {year=it})
        CustomTextField(label = "Roll Number", value = rollNo, onValueChange = {rollNo=it})
        CustomTextField(
            label = "Email",
            keyboardType = KeyboardType.Email,
            value = email,
            onValueChange = {email=it})
        CustomTextField(
            label = "Phone Number",
            keyboardType = KeyboardType.Phone,
            value = phoneNo,
            onValueChange = {phoneNo=it})

        Spacer(modifier = Modifier.height(16.dp))

        // Reel Upload Section
        Text("Upload Your Reel", fontSize = 18.sp, color = Color.Black, fontWeight = FontWeight.Medium)
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {  }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text("Choose File")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {  },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6A1B9A))
        ) {
            Text(
                "Register",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
fun CustomTextField(
    label: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    value: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange ,
        label = { Text(label) },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    )
}