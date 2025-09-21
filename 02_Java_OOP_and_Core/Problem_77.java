import java.util.Scanner;
  /*
         Problem_77: Sum of Digits of a Number
         
         Question:
         Write a Java program to calculate the sum of digits of a given integer.
         
         Example:
         Input: 1234
         Output: Sum of digits of 1234 is 10
        */
public class Problem_77 {

    static Scanner sc = new Scanner(System.in);
    public static void problem77() {
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = Math.abs(num); // Handle negative numbers

        while (temp > 0) {
            sum += temp % 10; // Add last digit
            temp /= 10;       // Remove last digit
        }

        System.out.println("Sum of digits of " + num + " is " + sum);
    }

    public static void main(String[] args) {
        problem77(); // Call Problem_77 method
        sc.close();
    }
}
