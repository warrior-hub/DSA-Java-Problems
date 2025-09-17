/*
Problem_15:
-----------
Write a Java program to take the base and height of a triangle as input from the user
and calculate & display its area.

Example:
Input: 
   base = 5
   height = 4

Output:
   Area of triangle is: 10.0
*/

import java.util.Scanner;

public class Problem_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and height
        System.out.println("Enter base and height of triangle: ");
        int b = sc.nextInt();
        int h = sc.nextInt();

        // Calculate area
        float area = 0.5f * b * h;

        // Display result
        System.out.println("Area of triangle is: " + area);

        sc.close();
    }
}
