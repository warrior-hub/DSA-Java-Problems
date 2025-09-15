/*
 Problem Statement:
 ------------------
 Given a sorted array (in non-decreasing order) and a target element,
 find the First Occurrence and Last Occurrence index of the target 
 using Binary Search (Iterative Method).

 If the element is not present, return -1.

 Example:
 --------
 Input:
    Target = 3
    Array = [1, 2, 3, 3, 3, 4, 5]

 Output:
    First Occurrence: 2
    Last Occurrence: 4

 Explanation:
    - The element 3 first appears at index 2 (0-based indexing).
    - The element 3 last appears at index 4.
*/

import java.util.Scanner;

public class Problem_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int size = getSize(sc); // Step 1: Array size lena
        int[] arr = getInput(size, sc); // Step 2: Array elements lena

        int first = FirstOccurrence(arr, target);
        int last = LastOccurrence(arr, target);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);

        sc.close();
    }

    // Step 1: Array size lena
    public static int getSize(Scanner sc) {
        System.out.print("Enter the size of array: ");
        return sc.nextInt();
    }

    // Step 2: Array input lena
    public static int[] getInput(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // First Occurrence Binary Search
    public static int FirstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid; // possible answer
                high = mid - 1; // check left side for first occurrence
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // Last Occurrence Binary Search
    public static int LastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid; // possible answer
                low = mid + 1; // check right side for last occurrence
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
