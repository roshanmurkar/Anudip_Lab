
// Write a Java program to create a String object with a character array.


package com.anudip.stringdemo;

public class CreateStringFromCharArray {
    public static void main(String[] args) {
        // Character array
        char[] charArray = {'R', 'o', 's', 'h', 'a', 'n', ' ', 'm', 'u', 'r', 'k', 'a', 'r'};

        // Create a string from the character array
        String str = new String(charArray);

        // Print the string
        System.out.println("String created from character array: " + str);
    }
}
