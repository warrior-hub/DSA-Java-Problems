/*
 Problem 33: Sum of Odd Numbers

 Write a program that takes an integer input (n) from the user and 
 calculates the sum of all odd numbers from 1 to n.

 Example:
 Input:
 enter the number: 10

 Output:
 25
 (Because odd numbers are 1 + 3 + 5 + 7 + 9 = 25)
*/

import java.util.Scanner;

public class Problem_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        int sum  = oddSum(num);
        System.out.println("Sum of odd numbers = " + sum);

        
        sc.close();
    }

    public static int oddSum(int num){
        int sum = 0;
        
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        
        return sum;
    }
}
