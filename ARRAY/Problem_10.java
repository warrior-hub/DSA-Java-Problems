// Problem 10: Sort an Array in Ascending Order
// Given an array of integers, sort the array in ascending order 
// and print the sorted array. The order of elements should be from smallest to largest.

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object created

        int size = getSize(sc); // Step 1: Take array size
        int[] arr = getInput(size, sc); // Step 2: Take array input

        sortArray(arr); // Step 3: Sort the array

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Step 1: Take size of array from user
    public static int getSize(Scanner sc) {
        System.out.print("Enter the size of array: ");
        return sc.nextInt();
    }

    // Step 2: Take array elements from user
    public static int[] getInput(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Step 3: Sort array using nested loop
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
