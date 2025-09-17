/*
Problem_18:
-----------
Write a Java program to take temperature in Fahrenheit as input from the user
and convert it to Celsius using the formula:
    C = (F - 32) * 5 / 9

Example:
Input: 
   Fahrenheit = 98
Output:
   Celsius = 36.666668
*/

import java.util.Scanner;

public class Problem_18 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        float f = sc.nextFloat();

        // Convert to Celsius
        float c = (f - 32) * 5 / 9;

        // Display result
        System.out.println("Fahrenheit in Celsius: " + c);

        sc.close();
    }
}
