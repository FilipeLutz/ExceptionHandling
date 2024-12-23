package com.stu25956.exceptionhandling

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.stu25956.exceptionhandling.utils.ExceptionHandling

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExceptionHandling()
        }
    }
}

/*
Module Title: Mobile App Development 2
Student Name: Filipe Lutz Mariano 25956
Lecture Name: Eugene Eugene Oregan
Mobile Apps II Assignment 9

Steps to Use and Check the App:

1. **Precondition Function**:
   - You are asked to enter a number in the "Enter a number" field.
   - When you press the "Check Precondition" button, the app will check if the number is positive.
   - If the number is positive, a success message will be displayed: "Success, the number is positive!"
   - If the number is not positive (less than or equal to 0), the app will throw an exception and show a message: "Caught exception: The number must be positive!"

2. **Date Validation**:
   - You can click on the calendar icon to pick a date.
   - The app will check if the selected date is more than 6 months in the future.
   - If the selected date is within the valid range (less than or equal to 6 months from today), a success message will be displayed: "Success, the date is not greater than 6 months."
   - If the selected date is more than 6 months in the future, a custom exception will be triggered, and the message displayed will be: "The selected date is more than 6 months in the future."

3. **Exception Handling**:
   - For both the number and date validations, the app handles exceptions using try-catch blocks.
   - If the entered number is not valid (non-numeric or invalid date format), the app will show an error message.
   - If the selected date is outside the allowed range, the app will show a custom exception message.

4. **Custom Exception**:
   - The app includes a custom exception (`CustomDateException`) that is thrown when a date greater than 6 months from today is selected. This is handled by catching the exception and displaying an appropriate message.

5. **User Interface**:
   - The app is designed with Jetpack Compose, offering a modern UI with cards for both number input and date selection.
   - The success/error messages are displayed in dialog boxes when exceptions occur.

*/