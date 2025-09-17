/*
Problem_16:
-----------
Write a Java program to take principal (P), rate of interest (R), and time (T) as input from the user
and calculate & display the simple interest using the formula:
    SI = (P * R * T) / 100

Example:
Input: 
   Principal (P) = 5000
   Rate (R) = 5
   Time (T) = 2 years

Output:
   Simple interest is: 500.0
*/

import java.util.Scanner;

public class Problem_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principal, rate and time
        System.out.print("Enter principal, rate and time: ");
        double p = sc.nextDouble();   // Principal
        float r = sc.nextFloat();     // Rate of interest
        int t = sc.nextInt();         // Time in years

        // Calculate simple interest
        double si = (p * r * t) / 100;

        // Display result
        System.out.println("Simple interest is: " + si);

        sc.close();
    }
}
