import java.util.Scanner; // Import Scanner class for input
    /*
     Problem_69: Check if a Number is Even or Odd
     
     Question:
     Write a Java program that takes an integer input from the user
     and prints whether the number is EVEN or ODD.

     Example:
     Input: 7
     Output: 7 is ODD

     Input: 12
     Output: 12 is EVEN
    */

public class Problem_69 {

    // Method to check if a number is even or odd
    public static String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "EVEN"; // Number is divisible by 2
        } else {
            return "ODD"; // Number is not divisible by 2
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call the method to check even or odd
        String result = checkEvenOdd(number);

        // Print the result
        System.out.println(number + " is " + result);

        sc.close(); // Close the scanner
    }
}
