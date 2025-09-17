/*
Problem_24:
-----------
Write a Java program to take age as input from the user
and display the category according to the following rules:

Age < 13        : Child
Age 13-19       : Teen
Age 20-59       : Adult
Age >= 60       : Senior

Example:
Input: 
   age = 10
Output:
   Child

Input:
   age = 16
Output:
   Teen

Input:
   age = 35
Output:
   Adult

Input:
   age = 65
Output:
   Senior
*/

import java.util.Scanner;

public class Problem_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input age
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Determine category
        if (age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age < 20) {
            System.out.println("Teen");
        } else if (age >= 20 && age < 60) {
            System.out.println("Adult");
        } else if (age >= 60) {
            System.out.println("Senior");
        }

        sc.close();
    }
}
