import java.util.Scanner;

/*
 Problem 18: Bubble Sort in Descending Order
 -------------------------------------------
 Given an array of integers, sort it in descending order using 
 the Bubble Sort algorithm and print the result.
*/

public class Problem_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take the size of the array from the user
        int size = getSize(sc);

        // Step 2: Take array elements from the user
        int[] arr = getInput(size, sc);

        // Step 3: Sort the array using Bubble Sort (Descending Order)
        bubbleSort(arr);

        // Step 4: Print the sorted array
        printArray(arr);

        sc.close();
    }

    // Step 1: Take size of array from user
    public static int getSize(Scanner sc) {
        System.out.print("Enter the size of the array: ");
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

    // Step 3: Bubble Sort in Descending Order
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Bubble Sort: adjacent elements compare karke swap karna
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Agar left element chhota hai to swap karo
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Step 4: Print the sorted array
    public static void printArray(int[] arr) {
        System.out.println("Array after sorting in descending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
