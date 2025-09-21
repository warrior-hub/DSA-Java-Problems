import java.util.Scanner;
 /*
         Problem_76: Fibonacci Series
         
         Question:
         Write a Java program to print the first N terms of the Fibonacci series.
         
         Example:
         Input: 7
         Output: 0 1 1 2 3 5 8
        */
public class Problem_76 {

    static Scanner sc = new Scanner(System.in);

    public static void problem76() {
       
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second; // Calculate next term
            first = second;
            second = next;
        }
        System.out.println();
    }

      public static void main(String[] args) {
        problem76(); // Call Problem_76 method
        sc.close();
    }
}
