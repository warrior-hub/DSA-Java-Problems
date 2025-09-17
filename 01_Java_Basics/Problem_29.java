// -------------------------------------------------------------
// Program: Left Shift Operation
// Author: (Your Name)
// Description: 
// This program takes an integer input from the user 
// and shifts its bits to the left by a given number of positions. 
// The result is then displayed on the screen.
// -------------------------------------------------------------

import java.util.Scanner;

public class Problem_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inform the user about the program
        System.out.println("This program will perform Left Shift operation.");

        // Take integer input and shift value
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter number of positions to shift left: ");
        int shift = sc.nextInt();

        // Perform left shift
        int resl = num << shift;

        // Display the result
        System.out.println("Left Shift result: " + resl);

        sc.close();
    }
}
