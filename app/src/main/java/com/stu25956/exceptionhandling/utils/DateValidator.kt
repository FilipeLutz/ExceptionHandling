package com.stu25956.exceptionhandling.utils

import android.annotation.SuppressLint
import java.time.LocalDate

// This class is used to validate the date input by the user.
object DateValidator {
    // This function checks if the number is positive.
    fun checkPositive(number: Int) {
        // If the number is less than or equal to 0, throw an exception.
        if (number <= 0) {
            // IllegalArgumentException is thrown when a method receives an argument that has an illegal value.
            throw IllegalArgumentException("The number must be positive!")
        }
    }

    @SuppressLint("NewApi")
    // This function checks if the date is in the future.
    fun checkDateInFuture(inputDate: LocalDate) {
        // Get the current date.
        val today = LocalDate.now()
        // If the input date is before the current date, throw an exception.
        if (inputDate.isAfter(today.plusMonths(6))) {
            // CustomDateException is thrown when the selected date is more than 6 months in the future.
            throw CustomDateException("The selected date is more than 6 months in the future.")
        }
    }
}