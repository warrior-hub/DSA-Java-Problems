import java.util.Scanner;
  /*
         Problem_79: Check Palindrome Number
         
         Question:
         Write a Java program to check whether a given integer is a palindrome.
         (A palindrome number reads the same backward as forward.)
         
         Example:
         Input: 121
         Output: 121 is a palindrome
         
         Input: 123
         Output: 123 is not a palindrome
        */

public class Problem_79 {

    static Scanner sc = new Scanner(System.in);
    public static void problem79() {
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int reversed = 0;
        int temp = Math.abs(num); // Handle negative numbers

        // Reverse the number
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        // Restore negative sign if necessary
        if (num < 0) reversed = -reversed;

        // Check palindrome
        if (num == reversed) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        problem79(); // Call Problem_79 method
        sc.close();
    }
}
