/*
 Problem 34: Factorial of a Number

 Write a program that takes an integer input (n) from the user 
 and calculates its factorial.

 Factorial Formula:
 n! = n × (n-1) × (n-2) × ... × 1

 Example:
 Input:
 enter the number: 5

 Output:
 5
 4
 3
 2
 1
 120

 (Here, 5! = 5 × 4 × 3 × 2 × 1 = 120)
*/

import java.util.Scanner;

public class Problem_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int fact = factorial(num);

       

        System.out.println("Factorial = " + fact);

        sc.close();
    }

    public static int factorial(int num){
         int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
            // System.out.println(i); // shows the countdown
        }
        return fact;
    }
}
