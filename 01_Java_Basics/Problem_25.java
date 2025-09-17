// -------------------------------------------------------------
// Program: Bitwise AND Operation
// Author: (Your Name)
// Description: 
// This program takes two integer inputs from the user 
// and performs a Bitwise AND operation between them. 
// The result is then displayed on the screen.
// -------------------------------------------------------------

import java.util.Scanner;

public class Problem_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will perform Bitwise AND operation.");

       
        System.out.print("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int resl = num1 & num2;

       
        System.out.println("Bitwise AND result: " + resl);

        sc.close();
    }
}
