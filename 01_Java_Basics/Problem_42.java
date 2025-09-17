/*
 Problem 42: Inverted Right-Angled Triangle Star Pattern

 Write a program that takes an integer input (n) from the user 
 and prints an inverted right-angled triangle star pattern.

 Example:
 Input:
 enter a number for pattern: 5

 Output:
 * * * * * 
 * * * * 
 * * * 
 * * 
 * 
*/

import java.util.Scanner;

public class Problem_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number for pattern: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
