
// Write a Java program to copy an array by iterating the array.

package com.anudip.labtwo;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scanner = new Scanner(System.in);

        // ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // initialize the original array
        int[] originalArray = new int[n];

        // read array elements from user input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }
        
        // create a new array to hold the copy
        int[] copiedArray = new int[n];

        // copy elements from the original array to the new array
        for (int i = 0; i < n; i++) {
            copiedArray[i] = originalArray[i];
        }
        
        
        CopyArray.printArray("Original", originalArray);
        CopyArray.printArray("Copied", copiedArray);
	}
	
	// this function will print the array 
	public static void printArray(String word, int [] array) {
		
		System.out.println( word + " array is :-> ");
		
		for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
		
        System.out.println();
	
	}

}
