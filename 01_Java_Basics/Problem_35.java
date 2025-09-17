/*
 Problem 35: Sum of Digits

 Write a program that takes an integer input (n) from the user 
 and calculates the sum of its digits.

 Example:
 Input:
 enter the number: 1234

 Output:
 10
 (Because 1 + 2 + 3 + 4 = 10)
*/

import java.util.Scanner;

public class Problem_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        int sum = sumOfDigit(num);

        System.out.println("Sum of digits = " + sum);
        sc.close();
    }

    public static int sumOfDigit(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10; // last digit
            sum = sum + digit; // add to sum
            num = num / 10; // remove last digit
        }

        return sum;
    }
}
