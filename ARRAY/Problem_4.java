/*
 Problem 4: Reverse an Array

 Statement:
User se ek array input lena hai aur usko reverse karke print karna hai.
Ye kaam 2 alag-alag methods se karna hai:
1. Extra Array ka use karke
2. In-place swapping karke (without extra array)

 Example:
Input:
n = 5
arr = [10, 20, 30, 40, 50]

Output:
Reverse using Extra Array (Method 1):
50  40  30  20  10  

Reverse In-Place (Method 2):
50  40  30  20  10
*/

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object created
        
        int size = getSize(sc);             // Step 1: Take array size
        int[] arr = getInput(size, sc);     // Step 2: Take array input

        //  Method 1: Reverse using extra array
        System.out.println("\nReverse using Extra Array (Method 1):");
        int[] revArr = revArray(arr, size);
        printArray(revArr);

        //  Method 2: Reverse in-place
        System.out.println("\nReverse In-Place (Method 2):");
        revsMethod2(arr);
        printArray(arr);
    }

    //  Step 1: Take size of array from user
    public static int getSize(Scanner sc) {
        System.out.print("Enter the size of array: ");
        int s = sc.nextInt();
        return s;
    }

    //  Step 2: Take array elements from user
    public static int[] getInput(int size, Scanner sc) {
        int[] arr1 = new int[size]; // new array created

        for (var i = 0; i < arr1.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr1[i] = sc.nextInt(); // store input in array
        }
        return arr1; // return filled array
    }

    //  Method 1: Reverse using extra array
    public static int[] revArray(int[] arr, int size) {
        int[] arr1 = new int[size];
        int index = size - 1;  // last index

        for (var i = 0; i < arr.length; i++) {
            arr1[index] = arr[i]; // copy arr[i] from last
            index--;
        }
        return arr1;
    }

    //  Method 2: Reverse in-place (without extra array)
    public static void revsMethod2(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start < end) {
            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    //  Utility: Print array
    public static void printArray(int[] arr) {
        for (var i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
