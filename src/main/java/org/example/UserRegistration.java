package org.example;

import java.util.Scanner;  // Used to take input from the user

public class UserRegistration {
    // Method to check if the first name is valid
    public static boolean validateFirstName(String firstName) {
        // The name must start with a capital letter and have at least 3 letters
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their first name
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();  // Read the input

        // Check if the name is valid
        boolean isValid = validateFirstName(firstName);

        // Show validation result
        System.out.println("First name having First character Upper and having minimum 3 characters: " + isValid);

        // If valid, display the name
        if (isValid) {
            System.out.println("Your First Name is: " + firstName);
        } else {
            System.out.println("Invalid First Name entered.");
        }
    }
}
