/*
Problem_21:
-----------
Write a Java program to take three integers as input from the user
and find the greatest among them.

Example:
Input: 
   num1 = 10
   num2 = 25
   num3 = 15
Output:
   Greatest number is: 25

Input:
   num1 = 30
   num2 = 20
   num3 = 30
Output:
   Greatest number is: 30
*/

import java.util.Scanner;

public class Problem_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter any three numbers: ");
        int num1 =  sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Find greatest number
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Greatest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Greatest number is: " + num2);
        } else {
            System.out.println("Greatest number is: " + num3);
        }

        sc.close();
    }
}
