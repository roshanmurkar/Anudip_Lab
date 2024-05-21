package com.demo.labone;

import java.util.Scanner;

public class DaysInMonthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        int daysInMonth = getDaysInMonth(month, year);

        System.out.println("Number of days in the specified month: " + daysInMonth);

        scanner.close(); // Close the scanner
    }

    // Method to calculate the number of days in a month
    private static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1; // Invalid month
        }

        switch (month) {
            case 2:
                // Check if it's a leap year
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }


    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

