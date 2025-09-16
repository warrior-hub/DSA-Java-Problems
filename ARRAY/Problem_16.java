/*
Problem: Find the first and last occurrences of a target element in a sorted array 
         and calculate the number of times it occurs.

Example:
Input:  arr = [1, 2, 2, 2, 3, 4, 5], target = 2
Output: first Occurrence is: 1
        last Occurrence is: 3
        number of occurrences of an element: 3
*/

import java.util.Scanner;

public class Problem_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to take user input

        // Step 1: Take size of the array from the user
        int size = getSize(sc);

        // Step 2: Take array elements from the user
        int[] arr = getInput(size, sc);

        // Step 3: Take the target element whose occurrences we want to find
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Step 4: Find the first and last occurrences of the target
        int first = firstOccurrence(arr, target);
        int lst = lastOccurrence(arr, target);

        // Step 5: Print first and last occurrences
        System.out.println("First Occurrence is: " + first);
        System.out.println("Last Occurrence is: " + lst);

        // Step 6: Calculate number of occurrences
        int occ = lst + 1 - first;
        System.out.println("Number of occurrences of the element: " + occ);
    }

    // Step 1: Method to take size of array
    public static int getSize(Scanner sc) {
        System.out.print("Enter the size of array: ");
        return sc.nextInt();
    }

    // Step 2: Method to take array elements from user
    public static int[] getInput(int size, Scanner sc) {
        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        return arr1;
    }

    // Step 3: Method to find first occurrence of target using binary search
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;      // store index if target found
                high = mid - 1; // continue searching in left half
            } else if (arr[mid] > target) {
                high = mid - 1; // target is in left half
            } else {
                low = mid + 1;  // target is in right half
            }
        }
        return ans;
    }

    // Step 4: Method to find last occurrence of target using binary search
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;      // store index if target found
                low = mid + 1;  // continue searching in right half
            } else if (arr[mid] > target) {
                high = mid - 1; // target is in left half
            } else {
                low = mid + 1;  // target is in right half
            }
        }
        return ans;
    }
}
