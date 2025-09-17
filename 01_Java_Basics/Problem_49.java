/*
 Problem 49:
 Write a Java program to:
 1. Take 10 integer inputs from the user (store them in an array).
 2. Ask the user for a number to search.
 3. Print the index/indices where the number is found in the array.
 4. If not found, print "Number not found".

 Example:
 Input: 5 7 9 3 7 1 4 7 2 6
 Search number: 7

 Output:
 Number found at index: 1
 Number found at index: 4
 Number found at index: 7
*/

import java.util.Scanner;

public class Problem_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // single scanner

        int[] arr = getInput(sc); // pass scanner
        checkNum(arr, sc);        // pass same scanner

        sc.close(); // close at the end
    }

    // Method to take input
    public static int[] getInput(Scanner sc) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Method to search number in array
    public static void checkNum(int[] arr, Scanner sc) {
        System.out.print("Enter the number to search in array: ");
        int num = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("Number found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Number not found in array.");
        }
    }
}
