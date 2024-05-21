package com.anudip.labtwo;
import java.util.Scanner;

/* Write a Java program that prompts the user to enter a positive integer -
 * and calculates its factorial using a while loop. 
 * The program should display the factorial as the output. 
 */


public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        while (number < 0) {
            System.out.print("Please enter a positive integer: ");
            number = scanner.nextInt();
        }

        int factorial = 1;
        int i = number;
        while (i > 0) {
            factorial *= i;
            i--;
        }

        System.out.println("The factorial of " + number + " is " + factorial);
        
        scanner.close();
    }
}

