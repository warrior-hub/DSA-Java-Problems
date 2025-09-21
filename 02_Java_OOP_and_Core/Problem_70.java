import java.util.Scanner; // Import Scanner class for input

public class Problem_70 {

    /*
     Problem_70: Calculate the Absolute Value of a Given Integer
     
     Question:
     Write a Java program that takes an integer input from the user
     and prints its absolute value.

     Example:
     Input: -15
     Output: The absolute value of -15 is 15

     Input: 8
     Output: The absolute value of 8 is 8
    */

    // Method to calculate the absolute value
    public static int absoluteValue(int num) {
        if (num < 0) {
            return -num; // If number is negative, return its positive equivalent
        } else {
            return num;  // If number is zero or positive, return as it is
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Call the absoluteValue method
        int absValue = absoluteValue(number);

        // Print the absolute value
        System.out.println("The absolute value of " + number + " is " + absValue);

        sc.close(); // Close the scanner
    }
}
