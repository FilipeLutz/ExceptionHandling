package com.stu25956.exceptionhandling.utils

// fun to handle precondition check
fun handlePreconditionCheck(number: Int, onMessage: (String) -> Unit) {
    // check if the number is positive
    try {
        // call the checkPositive function from DateValidator
        DateValidator.checkPositive(number)
        // if the number is positive, display a success message
        onMessage(
            "Success, the number is positive!"
        )
        // if the number is not positive, catch the exception
    } catch (e: IllegalArgumentException) {
        // display the exception message
        onMessage(
            "Caught exception: ${e.message}"
        )
    }
}