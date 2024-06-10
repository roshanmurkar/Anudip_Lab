
// Write a Java program to compare a given string to the specified character sequence.

package com.anudip.stringdemo;

public class CompareStringToCharSequence {
    public static void main(String[] args) {
        String mainString = "hi my name is roshan murkar";
        String sequence = "roshan";

        // Compare the mainString to the specified sequence
        if (mainString.equals(sequence)) {
            System.out.println("The string is equal to the specified sequence.");
        } else {
            System.out.println("The string is not equal to the specified sequence.");
        }
    }
}
