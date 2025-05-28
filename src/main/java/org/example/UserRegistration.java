package org.example;

import java.util.Scanner;  // Used to take input from the user

public class UserRegistration {

    // Method to validate first name
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");  // Must start with uppercase and have at least 3 letters
    }

    // Method to validate second name (last name)
    public static boolean validateSecondName(String secondName) {
        return secondName.matches("^[A-Z][a-zA-Z]{2,}$");  // Same validation rule
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        // Take first name input user
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();

        // Take second name input from user
        System.out.println("Enter Second Name");
        String secondName = scanner.nextLine();

        // Validate first name and show result
        boolean isFirstNameValid = validateFirstName(firstName);
        System.out.println("First name having First character Upper and having minimum 3 characters: " + isFirstNameValid);

        // Validate second name and show result
        boolean isSecondNameValid = validateSecondName(secondName);
        System.out.println("Second name having First character Upper and having minimum 3 characters: " + isSecondNameValid);

        // If both names are valid, display them
        if (isFirstNameValid && isSecondNameValid) {
            System.out.println("Full Name: " + firstName + " " + secondName);
        } else {
            System.out.println("Invalid name(s) entered. Please follow the format.");
        }
    }
}

