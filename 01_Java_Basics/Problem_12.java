/*
Problem Statement:
------------------
Write a Java program that takes two numbers as input from the user 
and performs the following operations:
    1. Addition (+)
    2. Subtraction (-)
    3. Multiplication (*)
    4. Division (/)
    5. Modulus (%)

Then, display the result of each operation with proper messages.
*/

import java.util.Scanner;

public class Problem_12 {
    public static void main(String[] args) {

        // Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Perform arithmetic operations
        int sum = num1 + num2;       // Addition
        int sub = num1 - num2;       // Subtraction
        int multi = num1 * num2;     // Multiplication
        int division = num1 / num2;  // Division (integer division)
        int modulo = num1 % num2;    // Modulus (remainder)

        // Display results
        System.out.println("Addition (num1 + num2) = " + sum);
        System.out.println("Subtraction (num1 - num2) = " + sub);
        System.out.println("Multiplication (num1 * num2) = " + multi);
        System.out.println("Division (num1 / num2) = " + division);
        System.out.println("Modulus (num1 % num2) = " + modulo);

        // Close the scanner
        sc.close();
    }
}
