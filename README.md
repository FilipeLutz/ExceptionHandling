# Exception Handling Application

- **Mobile Apps II Assignment 9**  

## Project Description  

This project is an Android application designed to demonstrate **Exception Handling** with two key features: **Precondition Check for Positive Numbers** and **Date Validation**. The app uses Jetpack Compose for the UI and handles various exceptions, including a custom exception for date validation.

The app allows users to enter a number and select a date to check whether they meet specific validation criteria. If the input fails the validation checks, the app handles the exception and displays an appropriate message to the user.

### Key Features:  

1. **Precondition Function**: Checks if the entered number is positive.
2. **Date Validation**: Validates if the selected date is within 6 months of the current date.
3. **Exception Handling**: Handles errors via try-catch blocks and displays relevant messages.
4. **Custom Exception**: Custom exception (`CustomDateException`) is thrown if the selected date is more than 6 months in the future.
5. **Modern UI**: The app utilizes Jetpack Compose for a modern user interface that features input fields, icons, and dialog boxes for error handling.

---

### Steps to Use and Check the App:

1. **Precondition Function**:
   - You are asked to enter a number in the "Enter a number" field.
   - When you press the "Check Precondition" button, the app will check if the number is positive.
   - If the number is positive, a success message will be displayed:  
     `"Success, the number is positive!"`.
   - If the number is not positive (less than or equal to 0), the app will throw an exception and show a message:  
     `"Caught exception: The number must be positive!"`.

2. **Date Validation**:
   - You can click on the calendar icon to pick a date.
   - The app will check if the selected date is more than 6 months in the future.
   - If the selected date is within the valid range (less than or equal to 6 months from today), a success message will be displayed:  
     `"Success, the date is not greater than 6 months."`.
   - If the selected date is more than 6 months in the future, a custom exception will be triggered, and the message displayed will be:  
     `"The selected date is more than 6 months in the future."`.

3. **Exception Handling**:
   - For both the number and date validations, the app handles exceptions using try-catch blocks.
   - If the entered number is not valid (non-numeric or invalid date format), the app will show an error message.
   - If the selected date is outside the allowed range, the app will show a custom exception message.

4. **Custom Exception**:
   - The app includes a custom exception (`CustomDateException`) that is thrown when a date greater than 6 months from today is selected. This is handled by catching the exception and displaying an appropriate message.

5. **User Interface**:
   - The app is designed with Jetpack Compose, offering a modern UI with cards for both number input and date selection.
   - The success/error messages are displayed in dialog boxes when exceptions occur.

---

## How to Clone and Use the Project Locally

To set up and run the project locally, follow these steps:

### 1. Clone the Repository:
Copy the project repository from GitHub.

### 2. Open the Project in Android Studio:  
After cloning, open **Android Studio**, and click on **Open an Existing Project**. Navigate to the location where you cloned the repository and select it.  

### 3. Set Up the Emulator:  
In Android Studio, configure the **Android Emulator** to test the application:  
- Go to **Tools > AVD Manager** and select or configure an emulator.  
- Alternatively, connect a physical Android device to test the app.  

### 4. Build and Run the Application:  
Click on the **green Play** button in Android Studio to build and launch the application on the emulator or connected device.  

---

## Challenges Encountered

### Handling Exceptions and Date Validation  
Handling exceptions with custom messages was straightforward for number input validation. However, implementing the **CustomDateException** required creating a custom exception class and ensuring it was triggered correctly when a date was selected that exceeded the 6-month limit. Additionally, making the user interface interactive with Jetpack Compose presented some challenges, particularly with managing state and triggering validation checks. 

---

## Conclusion

This project successfully demonstrates how to handle exceptions in Android using try-catch blocks. The app is designed to validate user input for both numeric and date values, ensuring that the number is positive and the selected date is within the valid range. The use of a custom exception for date validation enhances the app’s ability to handle specific business rules (in this case, the 6-month limit).

By utilizing Jetpack Compose for UI development, the app maintains a modern and user-friendly interface. The overall goal of demonstrating exception handling techniques has been achieved, while providing a smooth user experience with real-time validation feedback.

---

## References

1. [Exception Handling in Android](https://developer.android.com/reference/java/lang/Throwable)
2. [Jetpack Compose - Official Documentation](https://developer.android.com/jetpack/compose)
3. [Catch and handle exceptions](https://developer.android.com/health-and-fitness/guides/health-connect/develop/exceptions)
4. [CompositeDateValidator](https://developer.android.com/reference/com/google/android/material/datepicker/CompositeDateValidator)
5. [CalendarConstraints.DateValidator](https://developer.android.com/reference/com/google/android/material/datepicker/CalendarConstraints.DateValidator)
6. [CreateCredentialException](https://developer.android.com/reference/androidx/credentials/exceptions/CreateCredentialException)

---

**Lecturer**: Eugene O'Regan  
**Module**: Mobile App Development 2  

---

## Disclaimer  

This project is for educational purposes only.  
The information and code presented in this repository demonstrate exception handling concepts in Android development.  
They are not intended for commercial use. While efforts have been made to ensure the accuracy and reliability of the content, there may be errors or omissions.  
I am not responsible for any consequences arising from the use of this project or its implementation in real-world applications.  
Users are encouraged to verify and adapt the code as necessary for their specific use cases.

***Filipe Lutz***
