/*
 Problem 50:
 Write a Java program to:
 1. Take 10 integer inputs from the user (store them in an array).
 2. Ask the user for a number to delete.
 3. Print the new array after deleting all occurrences of that number.

 Example:
 Input: 5 7 9 3 7 1 4 7 2 6
 Delete number: 7

 Output:
 Array after deletion: 5 9 3 1 4 2 6
*/

import java.util.Scanner;

public class Problem_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // single scanner

        // Take input
        int[] arr = getInput(sc);

        // Print original array
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Number to delete
        System.out.print("Enter number you want to delete: ");
        int num = sc.nextInt();

        // Delete number and print new array
        int[] newArr = delNum(num, arr);
        System.out.print("Array after deletion: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        sc.close();
    }

    // Method to take input
    public static int[] getInput(Scanner sc) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Method to delete a number from array
    public static int[] delNum(int num, int[] arr) {
        int count = 0;

        // Count how many times num appears
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        // New array size = original size - count
        int[] newArr = new int[arr.length - count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
    }
}
