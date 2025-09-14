/*
 Problem 5: Check if a number is present in an array

 Statement:
User se ek array input lena hai aur phir ek number dena hai.
Check karna hai ki wo number array me present hai ya nahi.

 Example:
Input:
n = 5
arr = [10, 20, 30, 40, 50]
num = 30

Output:
Entered number 30 is present in the array.
*/

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object created
        
        int size = getSize(sc);              // Step 1: Take array size
        int[] arr = getInput(size, sc);      // Step 2: Take array input

        System.out.print("Enter the number you want to check: ");
        int num1 = sc.nextInt();             // Number to check

        checkNum(arr, num1);                 // Check number in array
    }
    
    //  Step 1: Take size of array from user
    public static int getSize(Scanner sc) {
        System.out.print("Enter the size of array: ");
        int s = sc.nextInt();
        return s;
    }

    //  Step 2: Take array elements from user
    public static int[] getInput(int size, Scanner sc) {
        int[] arr1 = new int[size]; // new array created

        for (var i = 0; i < arr1.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr1[i] = sc.nextInt(); // store input in array
        }
        return arr1; // return filled array
    }

    //  Method: Check if number is present
    public static void checkNum(int[] arr, int num) {
        int count = 0;

        for (var i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Entered number " + num + " is present in the array.");
        } else {
            System.out.println("Entered number " + num + " is NOT present in the array.");
        }
    }
}
