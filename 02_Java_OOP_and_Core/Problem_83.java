import java.util.Scanner;
/*
         Question:
         Write a Java program to calculate factorial of a number using recursion.
         
         Example:
         Input: 5
         Output: Factorial of 5 is 120
        */

public class Problem_83 {

    static Scanner sc = new Scanner(System.in);
    public static long factorialRecursion(int n) {
        /*
         Recursive Logic:
         - Base case: factorial(0) = 1
         - Recursive case: factorial(n) = n * factorial(n-1)
        */
        if (n == 0) return 1;
        return n * factorialRecursion(n - 1);
    }

    public static void problemFactorialRecursion() {
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + factorialRecursion(num));
    }

    public static void main(String[] args) {
        problemFactorialRecursion();
        sc.close();
    }
}
