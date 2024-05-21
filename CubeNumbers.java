package com.demo.labone;

import java.util.Scanner;

public class CubeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Cube of " + i + ": " + cube);
        }

        scanner.close(); 
    }
}
