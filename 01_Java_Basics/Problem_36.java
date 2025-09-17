/*
 Problem 36: Find GCD (Greatest Common Divisor) of Two Numbers

 Write a program that takes two integers as input and 
 finds their GCD (also called HCF - Highest Common Factor).

 Example:
 Input:
 enter any two number:
 36
 60

 Output:
 GCD = 12
 (Because 36 = 2 × 2 × 3 × 3 and 60 = 2 × 2 × 3 × 5,
 so common factors are 2 × 2 × 3 = 12)
*/

import java.util.Scanner;

public class Problem_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = GCD(num1, num2);

        System.out.println("GCD = " + gcd);
        sc.close();
    }

    public static int findSmallest(int num1, int num2) {
        int sm;
        if (num1 > num2) {
            sm = num2;
        } else {
            sm = num1;
        }
        return sm;
    }

    public static int GCD(int num1, int num2) {
        int gcd = 1;
        int sm = findSmallest(num1, num2);

        for (int i = sm; i >= 2; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
