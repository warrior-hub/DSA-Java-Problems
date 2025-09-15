import java.util.Scanner;

/*
Problem: Left Rotate Array by 1 Position
----------------------------------------
Given an array of integers, rotate the array to the left by 1 position.
This means the first element moves to the last position and all other elements shift one position to the left.

Example:
Input Array: 10 20 30 40 50
Output Array: 20 30 40 50 10
*/

public class Problem_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = getSize(sc);             // Step 1: Array size lena
        int[] arr = getInput(size, sc);     // Step 2: Array elements lena
        rotateLeft(arr);                     // Step 3: Rotate array by 1
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

    // Step 3: Left rotate array by 1
    public static void rotateLeft(int[] arr) {
        int n = arr.length;
        int first = arr[0]; // Pehla element save kar lo

        // Baaki elements ko ek step left shift karo
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = first; // Pehla element last me daal do

        // Result print karo
        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
