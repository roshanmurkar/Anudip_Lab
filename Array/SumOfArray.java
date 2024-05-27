
// Write a Java program to sum values of an array.

package com.anudip.labtwo;
import java.util.Scanner;


class SumOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user will define array size.
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // access the sumArray method from ArrayInput class, It will return sum of array
        int sum = ArrayInputSum.sumArray(n);
        
        // print the sum
        System.out.println("The sum of the array values is: " + sum);

        // close the scanner
        scanner.close();
    }
}
