/*
Problem_13:
-----------
Write a Java program to take two floating point numbers as input from the user
and print their product.

Example:
Input: 
   num1 = 4.5
   num2 = 2.0

Output: 
   Product of two floating point numbers: 9.0
*/

import java.util.Scanner;

public class Problem_13 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter any two floating point numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float product = num1 * num2;
        System.out.println("Product of two floating point numbers: " + product);
        sc.close();
    }
}
