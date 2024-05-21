package com.demo.labone;

import java.util.Scanner;

public class WeekdayNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number (1-7): ");
        int number = scanner.nextInt();

        if (number < 1 || number > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            String weekdayName = getWeekdayName(number);
            System.out.println("The corresponding weekday name is: " + weekdayName);
        }

        scanner.close(); 
    }

    private static String getWeekdayName(int number) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return weekdays[number - 1];
    }
}
