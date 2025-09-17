// -------------------------------------------------------------
// Program: Bitwise XOR Operation
// Author: (Your Name)
// Description: 
// This program takes two integer inputs from the user 
// and performs a Bitwise XOR operation between them. 
// The result is then displayed on the screen.
// -------------------------------------------------------------

import java.util.Scanner;

public class Problem_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inform the user about the program
        System.out.println("This program will perform Bitwise XOR operation.");

        // Take two integer inputs from the user
        System.out.println("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Perform bitwise XOR operation
        int resl = num1 ^ num2;

        // Display the result
        System.out.println("Bitwise XOR result: " + resl);

        sc.close();
    }
}
