/*
 Problem 38: Reverse a Number

 Write a program that takes an integer input from the user 
 and prints its reverse.

 Example 1:
 Input:
 enter digit: 1234

 Output:
 4321

 Example 2:
 Input:
 enter digit: 9070

 Output:
 709
 (Leading zeros are removed in reverse)
*/

import java.util.Scanner;

public class Problem_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter digit: ");
        int num = sc.nextInt();
        int revs = findRevesre(num);
        
        System.out.println("Reversed number = " + revs);
        sc.close();
    }

    public static int findRevesre(int num){
        int revs = 0;

        while (num != 0) {
            int digit = num % 10;       // extract last digit
            revs = revs * 10 + digit;   // add digit to reverse
            num = num / 10;             // remove last digit
        }
        return revs;

    }
}
