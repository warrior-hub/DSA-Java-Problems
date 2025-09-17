/*
 Problem 44: Find LCM of Two Numbers

 Write a program that takes two integers as input 
 and finds their Least Common Multiple (LCM).

 The LCM of two numbers is the smallest positive integer 
 that is divisible by both numbers.

 Example:
 Input:
 enter any two numbers: 
 12
 18

 Output:
 36
 (Because 36 is the smallest number divisible by both 12 and 18)
*/

import java.util.Scanner;

public class Problem_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm = LCM(num1, num2);

        System.out.println("LCM = " + lcm);
        sc.close();
    }

    public static int findGreatest(int num1, int num2) {
        int gn;
        if (num1 > num2) {
            gn = num1;
        } else {
            gn = num2;
        }
        return gn;
    }

    public static int LCM(int num1, int num2) {
        int lcm = 1;
        int gn = findGreatest(num1, num2);
        for (int i = gn; i <= (num1 * num2); i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }
        return lcm;
    }
}
