// Problem: Check if an array is sorted in non-decreasing order (ascending order)

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object created

        int size = getSize(sc);         // Step 1: Take array size
        int[] arr = getInput(size, sc); // Step 2: Take array input

        checkSorted(arr); // Step 3: Check if array is sorted
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

    // Step 3: Check if array is sorted
    public static void checkSorted(int[] arr) {
        boolean isSorted = true;

        // Compare each element with its previous element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break; // no need to check further
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
