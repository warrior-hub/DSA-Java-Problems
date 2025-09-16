/*
Problem:
Write a program to find the integer square root of a given positive integer.
The integer square root of a number is the largest integer whose square is less than 
or equal to the given number. The program uses binary search to efficiently find the result.

Examples:
1. Input: 10
   Output: 3
   Explanation: 3*3 = 9 which is <= 10, and 4*4 = 16 which is > 10.

2. Input: 25
   Output: 5
   Explanation: 5*5 = 25 which is exactly 25.

3. Input: 0
   Output: 0
   Explanation: Square root of 0 is 0.

4. Input: 1
   Output: 1
   Explanation: Square root of 1 is 1.
*/

import java.util.Scanner;

public class Problem_17 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        
        // Read an integer input from the user
        int num = sc.nextInt();
        
        // Call the method to find the integer square root
        findSquareRoot(num);
    }

    // Method to find the integer square root of a given number
    public static void findSquareRoot(int num){
        // Handle edge cases for 0 and 1
        if (num == 0 || num == 1) {
            System.out.println(num);
            return;
        }

        // Initialize the search range
        int low = 2, high = num, ans = 0;

        // Binary search to find the integer square root
        while (low <= high) {
            int mid = (low + high) / 2;
            int sqt = mid * mid;
            
            if (sqt == num) {
                // Exact square root found
                ans = mid;
                break;
            } else if (sqt > num) {
                // If square is greater than num, search in the lower half
                high = mid - 1;
            } else {
                // If square is less than num, search in the upper half
                ans = mid; // store the last mid as potential answer
                low = mid + 1;
            }
        }
        
        // Print the integer square root (largest integer whose square is <= num)
        System.out.println(ans);
    }
}
