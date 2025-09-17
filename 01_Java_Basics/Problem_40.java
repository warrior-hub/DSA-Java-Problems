/*
 Problem 40: Palindrome Number Check

 Write a program that takes an integer input (n) from the user 
 and checks whether it is a palindrome number or not.

 A palindrome number is a number that remains the same when reversed.

 Example 1:
 Input:
 enter a number: 121

 Output:
 number is a palindrome
 (Because reverse of 121 = 121)

 Example 2:
 Input:
 enter a number: 123

 Output:
 number is not palindrome
 (Because reverse of 123 = 321, which is not equal to 123)
*/

import java.util.Scanner;

public class Problem_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int revs = 0;

        while (temp != 0) {
            int digit = temp % 10;        // extract last digit
            revs = revs * 10 + digit;     // build reverse number
            temp = temp / 10;             // remove last digit
        }

        if (revs == num) {
            System.out.println("number is a palindrome");
        } else {
            System.out.println("number is not palindrome");
        }

        sc.close();
    }
}
