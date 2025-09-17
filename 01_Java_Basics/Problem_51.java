/*
 Problem 51:
 Write a Java program to:
 1. Take 10 integers as input (store in an array).
 2. Print the original array.
 3. Reverse the array into a new array.
 4. Print the reversed array.
*/

import java.util.Scanner;

public class Problem_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        int[] arr = getInput(sc);

        // Print original array
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Reverse array
        int[] newArr = revArray(arr);

        // Print reversed array
        System.out.print("Reversed array: ");
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

    // Method to reverse array into a new array
    public static int[] revArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr1[index] = arr[i];
            index--;
        }
        return arr1;
    }
}
