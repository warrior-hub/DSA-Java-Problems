import java.util.Scanner;
 /*
         Question:
         Write a Java program to find sum of first N natural numbers using recursion.
         
         Example:
         Input: 5
         Output: Sum of first 5 natural numbers is 15
        */
public class Problem_85 {

    static Scanner sc = new Scanner(System.in);
    public static int sumNaturalRecursion(int n) {
        /*
         Recursive Logic:
         - Base case: sumNatural(0) = 0
         - Recursive case: sumNatural(n) = n + sumNatural(n-1)
        */
        if (n == 0) return 0;
        return n + sumNaturalRecursion(n - 1);
    }

    public static void problemSumNaturalRecursion() {
        System.out.print("Enter a positive integer N: ");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is " + sumNaturalRecursion(n));
    }

    public static void main(String[] args) {
        problemSumNaturalRecursion();
        sc.close();
    }
}
