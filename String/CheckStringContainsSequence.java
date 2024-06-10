
// Write a Java program to test if a given string contains the specified sequence of char values.

package com.anudip.stringdemo;

public class CheckStringContainsSequence {
    public static void main(String[] args) {
        String mainString = "Hi my name is roshan murkar";
        String sequence = "roshan";

        // Check if the mainString contains the specified sequence
        if (mainString.contains(sequence)) {
            System.out.println("The string contains the specified sequence.");
        } else {
            System.out.println("The string does not contain the specified sequence.");
        }
    }
}
