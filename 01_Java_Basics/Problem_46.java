/*
 Problem 46:
 Write a Java program to:
 1. Take 10 integer inputs from the user (store them in an array).
 2. Calculate the sum of all numbers.
 3. Calculate the average of those numbers.
 4. Print both sum and average.
 
 Example:
 Input:
 1 2 3 4 5 6 7 8 9 10

 Output:
 sum : 55
 avg : 5
*/

import java.util.Scanner;

public class Problem_46 {
    public static void main(String[] args) {
        // Take input from user and store in array
        int[] arr = getInput();

        // Get sum of array elements
        int sum = getSum(arr);

        // Calculate average
        int avg = sum / arr.length;

        // Print results
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }

    // Method to calculate sum of array elements
    public static int getSum(int[] arr) {
        int sum = 0;
        for (var i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // Method to take input for array
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; // Fixed size = 10

        for (var i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
        
    }
}
