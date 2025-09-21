import java.util.Scanner;
  /*
         Problem_80: Sum of Natural Numbers
         
         Question:
         Write a Java program to calculate the sum of the first N natural numbers.
         
         Example:
         Input: 5
         Output: Sum of first 5 natural numbers is 15
        */

public class Problem_80 {

    static Scanner sc = new Scanner(System.in);
    public static void problem80() {
        System.out.print("Enter a positive integer N: ");
        int n = sc.nextInt();
        int sum = 0;

        // Calculate sum using for loop
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }
    public static void main(String[] args) {
        problem80(); // Call Problem_80 method
        sc.close();
    }
}
