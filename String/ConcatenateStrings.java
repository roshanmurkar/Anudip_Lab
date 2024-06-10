
// Write a Java program to concatenate a given string to the end of another string.

package com.anudip.stringdemo;

public class ConcatenateStrings {
    public static void main(String[] args) {
        String originalString = "Hi, ";
        String stringToConcatenate = "Roshan!";

        // Concatenate the strings
        String concatenatedString = originalString.concat(stringToConcatenate);

        // Print the concatenated string
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
