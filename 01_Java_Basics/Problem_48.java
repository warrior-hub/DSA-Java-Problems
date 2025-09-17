/*
 Problem 48:
 Write a Java program to:
 1. Take 10 integer inputs from the user (store them in an array).
 2. Find the maximum number from the array.
 3. Find the minimum number from the array.
 4. Print both maximum and minimum.

 Example:
 Input: 10 25 3 89 45 67 1 99 32 5
 Output:
 max number is: 99
 min number is: 1
*/

import java.util.Scanner;

public class Problem_48 {
    public static void main(String[] args) {
        // Take input
        int[] arr = getInput();

        // Find max and min
        int max = getMax(arr);
        int min = getMin(arr);

        // Print results
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }

    // Method to take input
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        sc.close(); // close scanner after use
        return arr;
    }

    // Method to get maximum value
    public static int getMax(int[] arr) {
        int max = arr[0]; // assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to get minimum value
    public static int getMin(int[] arr) {
        int min = arr[0]; // assume first element is min

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
