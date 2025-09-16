/*
💡 Problem 20: Insertion Sort

📝 Problem Statement:
Ek array diya gaya hai, use Insertion Sort algorithm ka use karke 
ascending order me sort karna hai.

🔹 Insertion Sort ka idea:
- Array ko do parts me divide karte hain: sorted aur unsorted
- Har step me ek element (key) uthaya jata hai aur usse uske sahi 
  position par insert karte hain sorted part me
- Ye process repeat karte hain jab tak pura array sorted na ho jaye

Example:
Input: [5, 3, 4, 1, 2]
Step 1: [3, 5, 4, 1, 2]
Step 2: [3, 4, 5, 1, 2]
Step 3: [1, 3, 4, 5, 2]
Step 4: [1, 2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]
*/

import java.util.Scanner;

public class Problem_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call insertion sort
        insertionSort(arr);

        // Print sorted array
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    // Insertion Sort function
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];   // element to be placed
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at its correct position
            arr[j + 1] = key;
        }
    }
}
