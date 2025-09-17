/*
Problem_17:
-----------
Write a Java program to take principal (P), rate of interest (R), and time (T) as input from the user
and calculate & display the compound interest using the formula:
    CI = P * (1 + R/100)^T

Example:
Input: 
   Principal (P) = 5000
   Rate (R) = 5
   Time (T) = 2 years

Output:
   Compound interest is: 5512.5
*/

import java.util.Scanner;

public class Problem_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principal, rate and time
        System.out.print("Enter principal, rate and time: ");
        double p = sc.nextDouble();   // Principal
        float r = sc.nextFloat();     // Rate of interest
        int t = sc.nextInt();         // Time in years

        // Calculate compound interest
       double ci = p * Math.pow((1 + r / 100), t);

        // Display result
        System.out.println("Compound interest is: " + ci);

        sc.close();
    }
}
