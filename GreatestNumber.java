package com.anudip.labtwo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (type 'done' to finish):");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        scanner.close();
        
        // Check if the list is empty
        if (numbers.isEmpty()) {
            System.out.println("No numbers were entered.");
            return;
        }
        
        // Sort the list
        Collections.sort(numbers);
        
        // The greatest number will be the last element in the sorted list
        int greatestNumber = numbers.get(numbers.size() - 1);

        System.out.println("The greatest number is: " + greatestNumber);
    }
}

