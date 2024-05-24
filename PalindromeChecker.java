// WAP to check whether the number is palindrome or not.

import java.util.Scanner;

class PalindromeChecker {
    public static void main(String[] args) {
        // creating a Scanner object 
        Scanner scanner = new Scanner(System.in);
        
        // user will enter a number
        System.out.print("Enter a number: ");
        // reading the number entered by the user
        int number = scanner.nextInt();
        
        // checking if the entered number is a palindrome using isPalindrome function
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        
        // closing the Scanner to release resources
        scanner.close();
    }
    
    // method to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        // storing the original number
        int originalNumber = number;
        // variable to store the reversed number
        int reversedNumber = 0;
        
        // reversing the digits of the number
        while (number != 0) {
            // extracting the last digit of the number
            int digit = number % 10;
            // appending the extracted digit to the reversed number
            reversedNumber = reversedNumber * 10 + digit;
            // removing the last digit from the original number
            number /= 10;
        }
        
        // checking if the original number is equal to the reversed number
        // if they are equal, the number is a palindrome; otherwise, it's not
        return originalNumber == reversedNumber;
    }
}

