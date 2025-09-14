/*
 Problem 6: Find Second Maximum Element in Array

 Statement:
User se ek array lena hai aur uska **second maximum element** find karna hai.
First maximum (sabse bada number) ko exclude karke dusra bada number print karna hai.

 Example 1:
Input:
n = 5
arr = [10, 20, 30, 40, 50]

Output:
Second maximum is: 40

 Example 2 (duplicate elements):
Input:
n = 5
arr = [5, 5, 5, 5, 5]

Output:
Second maximum does not exist.
*/

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object created

        int size = getSize(sc);         // Step 1: Take array size
        int[] arr = getInput(size, sc); // Step 2: Take array input

        int max = findMax(arr);         // Step 3: Find maximum
        findSecondMax(arr, max);        // Step 4: Find second maximum
    }

    //  Step 1: Take size of array from user
    public static int getSize(Scanner sc) {
        System.out.print("Enter the size of array: ");
        return sc.nextInt();
    }

    //  Step 2: Take array elements from user
    public static int[] getInput(int size, Scanner sc) {
        int[] arr1 = new int[size];
        for (var i = 0; i < arr1.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        return arr1;
    }

    //  Step 3: Find maximum
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (var i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //  Step 4: Find second maximum
    public static void findSecondMax(int[] arr, int max) {
        int smax = Integer.MIN_VALUE; // very small number
        boolean found = false;

        for (var i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] > smax) {
                smax = arr[i];
                found = true;
            }
        }

        if (found) {
            System.out.println("Second maximum is: " + smax);
        } else {
            System.out.println("Second maximum does not exist.");
        }
    }
}
