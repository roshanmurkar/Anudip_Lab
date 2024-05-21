package com.demo.labone;

import java.util.Scanner;

public class GreatestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        // Find the greatest number
        double greatestNumber = num1;

        if (num2 > greatestNumber) {
            greatestNumber = num2;
        }

        if (num3 > greatestNumber) {
            greatestNumber = num3;
        }

        
        System.out.println("The greatest number is: " + greatestNumber);

        scanner.close(); 
    }
}

