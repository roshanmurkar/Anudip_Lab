package com.anudip.labtwo;
import java.util.Scanner;

public class SumOfArrayInput {
    // Function to calculate the sum of array elements
    public static int sumArray(int num) {
    	Scanner scanner = new Scanner(System.in);
    	// initialize the array
        int[] numbersArray = new int[num];

        // read array elements from user input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < num; i++) {
            numbersArray[i] = scanner.nextInt();
        }
    	
    	int sum = 0;
        
        for (int number : numbersArray) {
            sum += number;
        }
        
        /* Dry Run ->
         * suppose number array consist of {10,20,30}
         * First Iteration: number is numbers[0] (10). sum is updated to sum + number (0 + 10 = 10).
		 * Second Iteration: number is numbers[1] (20). sum is updated to sum + number (10 + 20 = 30).
		 * Third Iteration: number is numbers[2] (30). sum is updated to sum + number (30 + 30 = 60).
         */
        
        return sum;
    }
}

