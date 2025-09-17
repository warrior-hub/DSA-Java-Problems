/*
 Problem 32: Multiplication Table Generator

 Write a program that takes an integer input from the user and 
 prints its multiplication table from 1 to 10.

 Example:
 Input:
 Enter a number: 5

 Output:
 5 x 1 = 5
 5 x 2 = 10
 5 x 3 = 15
 5 x 4 = 20
 5 x 5 = 25
 5 x 6 = 30
 5 x 7 = 35
 5 x 8 = 40
 5 x 9 = 45
 5 x 10 = 50
*/

import java.util.Scanner;

public class Problem_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printTable(num);
        sc.close();
    }
     public static void printTable(int num){
        for (int i = 1; i <=10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
     }
}
