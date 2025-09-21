import java.util.Scanner;

public class Problem_84 {

    static Scanner sc = new Scanner(System.in);

    // =============================
    // Fibonacci Using Recursion
    // =============================
    public static int fibonacciRecursion(int n) {
        /*
         Recursive Logic:
         - Base cases: fibonacci(0)=0, fibonacci(1)=1
         - Recursive case: fibonacci(n)=fibonacci(n-1)+fibonacci(n-2)
        */
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static void problemFibonacciRecursion() {
        /*
         Question:
         Write a Java program to print first N terms of Fibonacci series using recursion.
         
         Example:
         Input: 7
         Output: 0 1 1 2 3 5 8
        */
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        problemFibonacciRecursion();
        sc.close();
    }
}
