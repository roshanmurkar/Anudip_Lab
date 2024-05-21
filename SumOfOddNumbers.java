package com.demo.labone;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int number = 1;

        while (count < n) {
            if (number % 2 != 0) {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("Sum of the first " + n + " odd natural numbers is: " + sum);

        scanner.close(); 
    }
}

