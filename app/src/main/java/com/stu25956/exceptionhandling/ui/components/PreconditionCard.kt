package com.stu25956.exceptionhandling.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.sp
import com.stu25956.exceptionhandling.utils.handlePreconditionCheck

@Composable
fun PreconditionCard(onMessage: (String) -> Unit) {
    // State for the input number
    var inputNumber by remember { mutableStateOf(TextFieldValue("")) }
    // Card to check the precondition
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        // Box to center the content
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ) {
            // Column to arrange the content vertically
            Column(
                modifier = Modifier
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                // Text to display the title
                Text(
                    "Precondition Function",
                    fontSize = 20.sp
                )
                // OutlinedTextField to enter the number
                OutlinedTextField(
                    value = inputNumber,
                    onValueChange = { inputNumber = it },
                    label = {
                        Text(
                            "Enter a number",
                            fontSize = 16.sp
                        )
                    },
                    // Keyboard type set to number
                    keyboardOptions =
                    KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number
                    ),
                    textStyle = TextStyle(
                        fontSize = 24.sp
                    )
                )
                // Button to check the precondition
                Button(
                    onClick = {
                    // Convert the input to an integer
                    val number = inputNumber.text.toIntOrNull()
                    // Check if the input is a valid number
                    if (number == null) {
                        onMessage(
                            "Please enter a valid number."
                        )
                    } else {
                        handlePreconditionCheck(number, onMessage)
                    }
                })
                {
                    // Text for the button
                    Text(
                        "Check Precondition",
                        fontSize = 16.sp)
                }
            }
        }
    }
}