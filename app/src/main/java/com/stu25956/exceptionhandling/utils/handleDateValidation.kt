package com.stu25956.exceptionhandling.utils

import android.annotation.SuppressLint
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

// Custom exception class
@SuppressLint("NewApi")
fun handleDateValidation(dateString: String, onMessage: (String) -> Unit) {
    // Check if the date is in the future
    try {
        // Parse the date string to LocalDate
        val inputDate = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE)
        // Check if the date is not greater than 6 months
        DateValidator.checkDateInFuture(inputDate)
        // If the date is valid, show a success message
        onMessage("Success, the date is not greater than 6 months!")
        // If the date is invalid, catch the custom exception
    } catch (e: CustomDateException) {
        // Show the custom exception message
        onMessage("Caught custom exception: ${e.message}")
        // If the date is invalid, catch the DateTimeParseException
    } catch (_: DateTimeParseException) {
        // Show an error message
        onMessage("Invalid date format: $dateString")
    }
}