
// Write a Java program to calculate the average value of array elements.

package com.anudip.labtwo;
import java.util.Scanner;

class AvgOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // user will define array size.
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
		
        // access the sumArray method from ArrayInput class, It will return sum of array
        int sum = ArrayInputSum.sumArray(n);
        
		// calculate the average
		double average = (double) sum / n;

		// print the average
		System.out.println("The average value of the array elements is: " + average);

		// close the scanner
		scanner.close();
	}
}

