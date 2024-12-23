package com.stu25956.exceptionhandling.ui.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
// Show a message dialog with a message and an OK button
fun MessageDialog(message: String, onDismiss: () -> Unit) {
    // AlertDialog is a Material3 component that displays a dialog with a title, a message, and buttons
    AlertDialog(

        // onDismissRequest is called when the user dismisses the dialog
        onDismissRequest = {
            onDismiss()
        },
        // Set the title of the dialog
        title = {
            Text(
                text = "Message",
                fontSize = 22.sp
            )
        },
        // Set the message of the dialog
        text = {
            Text(
                text = message,
                fontSize = 18.sp
            )
        },
        // Set the confirm button of the dialog
        confirmButton = {

            Button(
                onClick = { onDismiss() }
            ) {
                Text(
                    "OK",
                    fontSize = 16.sp)
            }
        }
    )
}
