package org.example;
import java.util.Scanner;  // Import Scanner class to read input from the user

public class UserRegistration {

    // Method to validate the first name
    public static boolean validateFirstName(String firstName) {
        // First name must start with a capital letter and have at least 3 letters
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    // Method to validate the second name (last name)
    public static boolean validateSecondName(String secondName) {
        // Same rule: must start with a capital and have at least 3 letters
        return secondName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    // Method to validate an email address
    public static boolean validateEmail(String email) {
        // Email should follow standard format: characters, optional special chars, @, domain, and extension
        return email.matches("^[a-zA-Z0-9]+([._+-]+[a-zA-Z0-9])?@[a-zA-Z0-9]+[a-zA-Z0-9]+\\.[a-z]{2,4}(\\.[a-z]{2,})?$");

        // Alternate patterns for more flexibility can be used if needed (commented for reference)
        // return email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");
        // return email.matches("^[a-zA-Z0-9]+([._%+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$");
    }


    //Method to validate mobile number
    public static boolean validateMobileNumber(String mobileNumber){
        return mobileNumber.matches("^[0-9]{2,}\\s[0-9]{10}");
    }


    //Method to validate password as per Rule-1
    public static boolean validateRuleOne(String passwordRuleOne) {
        return passwordRuleOne.matches("^[^\\s]{8,}");
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // Create scanner object to take user input

        // --- Uncomment these lines if you want to take name inputs too ---
        // System.out.println("Enter First Name");
        // String firstName = scanner.nextLine();
        // System.out.println("First name valid: " + validateFirstName(firstName));

        // System.out.println("Enter Second Name");
        // String secondName = scanner.nextLine();
        // System.out.println("Second name valid: " + validateSecondName(secondName));

        // Take email input from user
        // System.out.println("Enter email");
        // String email = scanner.nextLine();

        // Display email validation result
        // System.out.println("Email valid: " + validateEmail(email));

        // Take phone number form the user
        // System.out.println("Enter mobile number");
        // String mobileNUmber=scanner.nextLine();
        // System.out.println("Email validate "+validateMobileNumber(mobileNUmber));

        // Taking the password from the user
        System.out.println("Enter password");
        String passwordRuleOne=scanner.nextLine();
        System.out.println("Email validate "+validateRuleOne(passwordRuleOne));

    }
}
