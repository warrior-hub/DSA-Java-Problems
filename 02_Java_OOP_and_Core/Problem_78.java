import java.util.Scanner;
  /*
         Problem_78: Reverse a Number
         
         Question:
         Write a Java program to reverse the digits of a given integer.
         
         Example:
         Input: 1234
         Output: Reversed number is 4321
        */
public class Problem_78 {

    static Scanner sc = new Scanner(System.in);
    public static void problem78() {
      
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int reversed = 0;
        int temp = Math.abs(num); // Handle negative numbers

        while (temp > 0) {
            int digit = temp % 10;  // Extract last digit
            reversed = reversed * 10 + digit; // Build reversed number
            temp /= 10;             // Remove last digit
        }

        // Handle negative numbers
        if (num < 0) reversed = -reversed;

        System.out.println("Reversed number is " + reversed);
    }

    public static void main(String[] args) {
        problem78(); // Call Problem_78 method
        sc.close();
    }
}
