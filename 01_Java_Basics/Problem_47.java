/*
 Problem 47:
 Write a Java program to:
 1. Take 10 integer inputs from the user (store them in an array).
 2. Ask the user for a number to search.
 3. Count and print how many times that number occurs in the array.

 Example:
 Input: 1 2 3 2 4 2 5 6 2 7
 Search number: 2

 Output:
 total number of occurrences: 4
*/

import java.util.Scanner;

public class Problem_47 {
    public static void main(String[] args) {
        // Take array input
        int[] arr = getInput();

        // Find occurrences of a number
        int count = getOccurrences(arr);

        // Print result
        System.out.println("Total number of occurrences: " + count);
    }

    // Method to take array input
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": "); // prompt first
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    // Method to count occurrences of a number
    public static int getOccurrences(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find occurrences: ");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        sc.close();
        return count;
    }
}
