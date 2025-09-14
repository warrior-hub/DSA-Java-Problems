// Problem 9: Remove Duplicates from Array
// Given an array of integers, remove all duplicate elements 
// and print the array with only unique elements. 
// The order of elements should be maintained.

import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object created

        int size = getSize(sc); // Step 1: Take array size
        int[] arr = getInput(size, sc); // Step 2: Take array input
        removeDupli(arr); // Step 3: Remove duplicates and print
    }

    // Step 1: Take size of array from user
    public static int getSize(Scanner sc) {
        System.out.print("Enter the size of array: ");
        return sc.nextInt();
    }

    // Step 2: Take array elements from user
    public static int[] getInput(int size, Scanner sc) {
        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        return arr1;
    }

    // Step 3: Remove duplicates
    public static void removeDupli(int[] arr) {
        int[] temp = new int[arr.length]; // temp array same size
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = checkNum(temp, arr[i], index); // check only filled part
            if (count == 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    // Check if number is present in first 'index' elements
    public static int checkNum(int[] arr, int num, int index) {
        int count = 0;
        for (int i = 0; i < index; i++) { // only filled part
            if (num == arr[i]) {
                count++;
            }
        }
        return count;
    }
}
