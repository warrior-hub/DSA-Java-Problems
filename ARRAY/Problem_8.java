// Problem 8: Move all zeros of an array to the end (in-place method)

import java.util.Scanner;

public class Problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = getSize(sc);         // Step 1: Take array size
        int[] arr = getInput(size, sc); // Step 2: Take array input

        replaceZero2(arr);              // Step 3: Move zeros to end

        // Print final array
        System.out.println("Array after moving zeros to end:");
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
        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        return arr1;
    }

    // Step 3: In-place method to move zeros to the end
    public static void replaceZero2(int[] arr) {
        int index = 0; // pointer for next non-zero element

        // Place all non-zero elements at the beginning
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zero
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }
}
