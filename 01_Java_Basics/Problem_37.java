/*
 Problem 37: Check Prime Number

 Write a program that takes an integer input (n) from the user 
 and checks whether it is a prime number or not.

 A prime number is a number that is divisible only by 1 and itself.

 Example 1:
 Input:
 enter the number: 7

 Output:
 prime number
 (Because 7 is divisible only by 1 and 7)

 Example 2:
 Input:
 enter the number: 10

 Output:
 not a prime number
 (Because 10 is divisible by 1, 2, 5, 10)
*/

import java.util.Scanner;

public class Problem_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num1 = sc.nextInt();
        findPrime(num1);

        sc.close();
    }

    public static int findCount(int num1) {
        int count = 0;

        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void findPrime(int num1){
        int count = findCount(num1);
          if (count == 0 && num1 > 1) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }

    }
}
