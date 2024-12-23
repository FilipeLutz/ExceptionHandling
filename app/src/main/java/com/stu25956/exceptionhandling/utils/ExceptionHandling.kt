package com.stu25956.exceptionhandling.utils

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.stu25956.exceptionhandling.ui.components.DateValidationCard
import com.stu25956.exceptionhandling.ui.components.MessageDialog
import com.stu25956.exceptionhandling.ui.components.PreconditionCard

@Composable
// Function to handle exceptions in the app
fun ExceptionHandling() {
    // State to hold the message to show in the dialog
    var dialogMessage by remember { mutableStateOf("") }
    // State to show or hide the dialog
    var showDialog by remember { mutableStateOf(false) }
    // Box to center the content in the screen
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        // Column to arrange the content vertically
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(25.dp)
        ) {
            // Precondition Check Card
            PreconditionCard(
                onMessage = { message ->
                    dialogMessage = message
                    showDialog = true
                }
            )

            // Date Validation Card
            DateValidationCard(
                onMessage = { message ->
                    dialogMessage = message
                    showDialog = true
                }
            )
        }

        // Show the dialog if needed
        if (showDialog) {
            MessageDialog(message = dialogMessage) {
                showDialog = false // Close the dialog when dismissed
            }
        }
    }
}