package com.stu25956.exceptionhandling.ui.components

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stu25956.exceptionhandling.utils.handleDateValidation
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Composable
// Function to create a card with a date picker
fun DateValidationCard(onMessage: (String) -> Unit) {
    var selectedDate by remember { mutableStateOf("") } // Holds the selected date
    val context = LocalContext.current // Get the context for DatePickerDialog

    // Card with a date picker
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        // Box to center the content in the card
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentAlignment = Alignment.Center
        ) {
            // Column to arrange the content vertically
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Description of the card
                Text(
                    "Click on Calendar to Select a Date",
                    fontSize = 20.sp
                )

                // Space between the text and the button
                Spacer(modifier = Modifier.height(15.dp))

                // IconButton for the date picker
                IconButton(
                    onClick = {
                        showDatePicker(context) { date ->
                            selectedDate = date // Update the date in the UI
                            handleDateValidation(date, onMessage) // Validate the selected date
                        }
                    },
                    modifier = Modifier
                        .size(64.dp)
                ) {
                    // Calendar icon
                    Icon(
                        Icons.Default.DateRange,
                        contentDescription = "Calendar Icon",
                        modifier = Modifier
                            .size(64.dp)
                    )
                }
            }
        }
    }
}

// Function to display DatePickerDialog
@SuppressLint("NewApi")
fun showDatePicker(context: Context, onDateSelected: (String) -> Unit) {
    // Get today's date
    val today = LocalDate.now()
    val calendar = java.util.Calendar.getInstance() // Get a calendar instance
    calendar.set(today.year, today.monthValue - 1, today.dayOfMonth) // Set the calendar to today's date

    // Create a DatePickerDialog with today's date as default
    val datePickerDialog = DatePickerDialog(
        context,
        { _, year, month, dayOfMonth ->
            val selectedDate = LocalDate.of(year, month + 1, dayOfMonth) // Create selected date
            onDateSelected(selectedDate.format(DateTimeFormatter.ISO_LOCAL_DATE)) // Return the formatted date
        },
        today.year,
        today.monthValue - 1, // Subtract 1 since DatePickerDialog months are 0-based
        today.dayOfMonth
    )

    // Set the minimum date to today
    datePickerDialog.datePicker.minDate = calendar.timeInMillis

    // Show the dialog
    datePickerDialog.show()
}