import java.util.Scanner;
 /*
         Problem_74: Factorial of a Number
         
         Question:
         Write a Java program to calculate the factorial of a given non-negative integer.
         
         Example:
         Input: 5
         Output: Factorial of 5 is 120
        */
public class Problem_74 {

    static Scanner sc = new Scanner(System.in);
    public static void problem74() {
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
        long factorial = 1; // Using long to handle large factorials

        // Calculate factorial using a for loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println("Factorial of " + num + " is " + factorial);
    }
    public static void main(String[] args) {
        problem74(); // Call Problem_74 method
        sc.close();
    }
}
