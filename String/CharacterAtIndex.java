
// Write a Java program to get the character at the given index within the string.


package com.anudip.stringdemo;

public class CharacterAtIndex {
    public static void main(String[] args) {
        String str = "Hi My Name Is Roshan Murkar";
        int index = 7; // Index to retrieve character from

        // Check if the index is within the bounds of the string
        if (index >= 0 && index < str.length()) {
            char character = str.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}
