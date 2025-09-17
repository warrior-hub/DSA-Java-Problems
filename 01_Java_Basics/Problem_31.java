// -------------------------------------------------------------
// Program: Even or Odd Check
// Author: (Your Name)
// Description: 
// This program takes an integer input from the user 
// and checks whether the number is Even or Odd. 
// The result is then displayed on the screen.
// -------------------------------------------------------------

import java.util.Scanner;

public class Problem_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inform the user about the program
        System.out.println("This program will check whether a number is Even or Odd.");

        // Take integer input
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // Check even or odd using modulus operator
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        sc.close();
    }
}
