/*
Problem_22:
-----------
Write a Java program to take a year as input from the user
and check whether it is a leap year or not.

Leap year rules:
1. A year is a leap year if it is divisible by 4.
2. But if the year is divisible by 100, it is NOT a leap year,
   unless it is also divisible by 400.

Example:
Input: 
   year = 2020
Output:
   Leap year

Input:
   year = 1900
Output:
   Not a leap year
*/

import java.util.Scanner;

public class Problem_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input year
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Check leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        sc.close();
    }
}
