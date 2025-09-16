import java.util.Scanner;

/*
 * Problem 19:
 * Implement a program to take an array input from the user
 * and sort it in descending order using Selection Sort.
 *
 * Example:
 * Input:
 * Enter the size of the array: 5
 * Enter element 1: 8
 * Enter element 2: 3
 * Enter element 3: 15
 * Enter element 4: 1
 * Enter element 5: 10
 *
 * Output:
 * Array after sorting in descending order:
 * 15  10  8  3  1
 */

public class Problem_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take the size of the array from the user
        int size = getSize(sc); 

        // Step 2: Take array elements from the user
        int[] arr = getInput(size, sc); 

        // Step 3: Sort the array using Selection Sort in descending order
        selectionSort(arr);
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

    // Step 3: Selection Sort in descending order
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the found maximum element with the first element
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        // Print the sorted array
        System.out.println("Array after sorting in descending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
