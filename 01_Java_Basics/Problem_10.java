/*
Problem Statement:
------------------
Write a Java program to take two numbers as input from the user 
and display their sum.
*/

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        // Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Input first number
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        // Input second number
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Display result
        System.out.print("Sum of numbers is: " + sum);

        // Close scanner
        sc.close();
    }
}
