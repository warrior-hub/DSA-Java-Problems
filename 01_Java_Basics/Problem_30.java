// -------------------------------------------------------------
// Program: Right Shift Operation
// Author: (Your Name)
// Description: 
// This program takes an integer input from the user 
// and shifts its bits to the right by a given number of positions. 
// The result is then displayed on the screen.
// -------------------------------------------------------------

import java.util.Scanner;

public class Problem_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inform the user about the program
        System.out.println("This program will perform Right Shift operation.");

        // Take integer input and shift value
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter number of positions to shift right: ");
        int shift = sc.nextInt();

        // Perform right shift
        int resl = num >> shift;

        // Display the result
        System.out.println("Right Shift result: " + resl);

        sc.close();
    }
}
