// -------------------------------------------------------------
// Program: Bitwise OR Operation
// Author: (Your Name)
// Description: 
// This program takes two integer inputs from the user 
// and performs a Bitwise OR operation between them. 
// The result is then displayed on the screen.
// -------------------------------------------------------------

import java.util.Scanner;

public class Problem_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inform the user about the program
        System.out.println("This program will perform Bitwise OR operation.");

        // Take two integer inputs from the user
        System.out.println("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Perform bitwise OR operation
        int resl = num1 | num2;

        // Display the result
        System.out.println("Bitwise OR result: " + resl);

        sc.close();
    }
}
