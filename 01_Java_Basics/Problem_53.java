/*
 Problem 53:
 Write a Java program to merge two sorted arrays into a single sorted array.

 Steps:
 1. Take two arrays as input from the user (both should already be sorted).
 2. Merge them into a new array such that the new array is also sorted.
 3. Print the merged array.

 Example:
 Input:
 arr1 = {1, 3, 5, 7, 9}
 arr2 = {2, 4, 6, 8, 10}

 Output:
 Merged array is:
 1  2  3  4  5  6  7  8  9  10
*/

import java.util.Scanner;

public class Problem_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        int[] arr = getInput(sc);
        int[] arr2 = getInput(sc);

        // Merge arrays
        int[] mArray = merge(arr, arr2);

        // Print merged array
        System.out.println("Merged array is: ");
        for (int i = 0; i < mArray.length; i++) {
            System.out.print(mArray[i] + "  ");
        }

        sc.close();
    }

    // Method to take input
    public static int[] getInput(Scanner sc) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Method to merge two sorted arrays
    public static int[] merge(int[] arr, int[] arr2) {
        int n = arr.length + arr2.length;
        int[] mArray = new int[n];
        int index = 0, i = 0, j = 0;

        // Merge while both arrays have elements
        while (i < arr.length && j < arr2.length) {
            if (arr[i] <= arr2[j]) {
                mArray[index++] = arr[i++];
            } else {
                mArray[index++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr
        while (i < arr.length) {
            mArray[index++] = arr[i++];
        }

        // Copy remaining elements of arr2
        while (j < arr2.length) {
            mArray[index++] = arr2[j++];
        }

        return mArray;
    }
}
