 /*
     Problem_68: Find the Minimum of Two Numbers
     
     Question:
     Write a Java program that takes two numbers as input from the user
     and prints the smaller (minimum) of the two numbers.
     Use a method to determine the minimum.

     Example:
     Input: 8, 5
     Output: The minimum of 8 and 5 is 5
    */

import java.util.Scanner; 

public class Problem_68 {

    // Method to find the minimum of two numbers
    public static int findMinimum(int a, int b) {
        if (a < b) {
            return a; // a is smaller
        } else {
            return b; // b is smaller or equal
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

      
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

   
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

     
        int min = findMinimum(num1, num2);

        // Print the result
        System.out.println("The minimum of " + num1 + " and " + num2 + " is: " + min);

        sc.close(); // Close the scanner
    }
}
