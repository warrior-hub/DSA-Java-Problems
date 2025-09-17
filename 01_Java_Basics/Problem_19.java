/*
Problem_19:
-----------
Write a Java program to take an integer as input from the user
and check whether the number is positive, negative, or zero.

Example:
Input: 
   num = 5
Output:
   Positive number

Input:
   num = -3
Output:
   Negative number

Input:
   num = 0
Output:
   Number is zero
*/

import java.util.Scanner;

public class Problem_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Check number
        if (num == 0) {
            System.out.println("Number is zero");
        } else if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        sc.close();
    }
}
