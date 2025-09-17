/*
Problem_14:
-----------
Write a Java program to take the height and width of a rectangle as input from the user
and calculate & display its perimeter.

Example:
Input: 
   height = 5.0
   width = 3.0

Output:
   Perimeter of rectangle: 16.0
*/

import java.util.Scanner;

public class Problem_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height and width of rectangle: ");
        double height = sc.nextDouble();
        double width = sc.nextDouble();

        double perimeter = 2 * (height + width);
        System.out.println("Perimeter of rectangle: " + perimeter);

        sc.close();
    }
}
