// -------------------------------------------------------------
// Program: Bitwise Complement Operation
// Author: (Your Name)
// Description: 
// This program takes an integer input from the user 
// and performs a Bitwise Complement operation on it. 
// The result is then displayed on the screen.
// -------------------------------------------------------------

import java.util.Scanner;

public class Problem_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inform the user about the program
        System.out.println("This program will perform Bitwise Complement operation.");

        // Take one integer input
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // Perform bitwise complement
        int resl = ~num;

        // Display the result
        System.out.println("Bitwise Complement result: " + resl);

        sc.close();
    }
}
