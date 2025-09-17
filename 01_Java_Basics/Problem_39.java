/*
 Problem 39: Armstrong Number Check

 Write a program that takes an integer input (n) from the user 
 and checks whether it is an Armstrong number or not.

 An Armstrong number is a number that is equal to the sum of its digits 
 raised to the power of the number of digits.

 Example 1:
 Input:
 enter the number: 153

 Output:
 armstrong number
 (Because 1³ + 5³ + 3³ = 153)

 Example 2:
 Input:
 enter the number: 123

 Output:
 not an armstrong number
*/

import java.util.Scanner;

public class Problem_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        int originalNum = num;  // save original number
        int temp = num;
        int count = 0;

        // count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        double sum = 0;

        // calculate sum of powered digits
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + Math.pow(digit, count);
            temp = temp / 10;
        }

        // check Armstrong
        if (sum == originalNum) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not an armstrong number");
        }

        sc.close();
    }
}
