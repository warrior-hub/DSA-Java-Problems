import java.util.Scanner;
/*
         Problem_75: Check Prime Number
         
         Question:
         Write a Java program to check if a given number is prime.
         
         Example:
         Input: 7
         Output: 7 is a prime number

         Input: 12
         Output: 12 is not a prime number
        */

public class Problem_75 {

    static Scanner sc = new Scanner(System.in);
    public static void problem75() {

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; // Numbers <= 1 are not prime
        } else {
            // Check divisibility from 2 to √num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Not prime, exit loop
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        problem75(); // Call Problem_75 method
        sc.close();
    }
}
