import java.util.Scanner;
  /*
         Question:
         Write a Java program to print all prime numbers between two given integers.
         
         Example:
         Input: 10, 20
         Output: Prime numbers between 10 and 20 are: 11 13 17 19
        */

public class Problem_81 {

    static Scanner sc = new Scanner(System.in);
    public static void printPrimesInRange() {
      
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            if (num <= 1) continue; // Skip numbers <= 1

            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

   
    public static void main(String[] args) {
        printPrimesInRange(); // Call the descriptive method
        sc.close();
    }
}
