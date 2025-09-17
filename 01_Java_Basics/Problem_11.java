/*
Problem Statement:
------------------
Write a Java program to swap the values of two variables entered by the user.
Example:
    Input: A = 10, B = 20
    Output: A = 20, B = 10
*/

import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Title / Welcome message
        System.out.println("=== Welcome to Swapping Station ===");

        // Taking input from the user
        System.out.print("Enter value of A: ");
        int a = sc.nextInt();

        System.out.print("Enter value of B: ");
        int b = sc.nextInt();

        // Swapping logic using a temporary variable
        int temp = a; // store value of a in temp
        a = b;        // assign value of b to a
        b = temp;     // assign value of temp (old a) to b

        // Display result
        System.out.println("\nSwapping Done ✅");
        System.out.println("Now, Value of A = " + a);
        System.out.println("Now, Value of B = " + b);

        // Close scanner
        sc.close();
    }
}
