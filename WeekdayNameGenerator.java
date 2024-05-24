package com.demo.labone;

import java.util.Scanner;

public class WeekdayNameGenerator {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // User will enter a number representing a day of the week
        System.out.println("Enter a number (1-7): ");
        int number = scanner.nextInt();

        // Check if the input number is within the valid range
        if (number < 1 || number > 7) {
            // If the input is invalid, print an error message
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            // If the input is valid, get the corresponding weekday name using getWeekdayNames function
            String weekdayName = getWeekdayName(number);
            // Print the corresponding weekday name
            System.out.println("The corresponding weekday name is: " + weekdayName);
        }

        // Close the scanner to release resources
        scanner.close();
    }

    // Method to get the weekday name based on the input number
    private static String getWeekdayName(int number) {
        // Array of weekday names starting from Sunday (index 0)
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        // Return the weekday name corresponding to the input number
        // Subtract 1 from the input number to match array index
        return weekdays[number - 1];
    }
}
