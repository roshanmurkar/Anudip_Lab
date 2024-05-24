// Write a java programs to perform basic calculators operations(Input from user using switch case)

import java.util.Scanner;

class BasicCalculator {
    // main method where the program execution starts
    public static void main(String[] args) {
        // creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // user will enter the first number
        System.out.println("Basic Calculator");
        System.out.print("Enter the first number: ");
        // reading the first number entered by the user
        double num1 = scanner.nextDouble();
        
        // user will enter the second number
        System.out.print("Enter the second number: ");
        // reading the second number entered by the user
        double num2 = scanner.nextDouble();
        
        // displaying the menu of operations to the user
        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1/2/3/4): ");
        // reading the choice of operation entered by the user
        int choice = scanner.nextInt();
        
        // variable to store the result of the calculation
        double result = 0;
        // boolean flag to track if the operation is valid or not
        boolean validOperation = true;
        
        // performing the operation based on the user's choice using switch case
        switch (choice) {
            case 1:
                result = num1 + num2; // addition
                break;
            case 2:
                result = num1 - num2; // subtraction
                break;
            case 3:
                result = num1 * num2; // multiplication
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2; // division
                } else {
                    // handling division by zero error
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                // handling invalid choice error
                System.out.println("Error: Invalid choice. Please select a valid operation.");
                validOperation = false;
        }
        
        // displaying the result if the operation is valid
        if (validOperation) {
            System.out.println("The result is: " + result);
        }
        
        // closing the Scanner
        scanner.close();
    }
}
