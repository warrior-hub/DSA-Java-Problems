/*
Problem_23:
-----------
Write a Java program to take marks as input from the user
and display the grade according to the following rules:

Marks >= 90 : Grade A
Marks 75-89 : Grade B
Marks 60-74 : Grade C
Marks 30-59 : Grade D
Marks < 30  : Grade F

Example:
Input: 
   marks = 85
Output:
   Grade B

Input:
   marks = 72
Output:
   Grade C

Input:
   marks = 25
Output:
   Grade F
*/

import java.util.Scanner;

public class Problem_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Determine grade
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 30) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

        sc.close();
    }
}
