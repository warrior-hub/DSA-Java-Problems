/*
Problem_20:
-----------
Write a Java program to take an integer as input from the user
and check whether the number is even or odd.

Example:
Input: 
   num = 8
Output:
   Even number

Input:
   num = 7
Output:
   Odd number
*/

import java.util.Scanner;

public class Problem_20 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check even or odd
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        sc.close();
    }
}
