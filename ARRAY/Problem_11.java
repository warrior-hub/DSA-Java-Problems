/*
Problem:
Write a program in Java to count the frequency of each element in an array.
( Array me har element kitni baar aata hai, wo print karna hai.
Jo element pehle count ho chuka hai usko dobara count nahi karna. )
*/

import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object banaya

        int size = getSize(sc); // Step 1: User se array ka size lena
        int[] arr = getInput(size, sc); // Step 2: User se array ke elements lena
        findFrequency(arr); // Step 3: Har element ki frequency nikalna
    }

    // Step 1: Size lena
    public static int getSize(Scanner sc) {
        System.out.print("Enter the size of array: ");
        return sc.nextInt();
    }

    // Step 2: Input lena
    public static int[] getInput(int size, Scanner sc) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Step 3: Frequency find karna
    public static void findFrequency(int[] arr) {
        boolean[] visited = new boolean[arr.length]; // visited array (ye batayega ki element pehle count hua ya nahi)
        
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) { // agar element already count ho chuka hai
                continue; // skip kar do
            }

            int count = 1; // apne aap ko ek baar count kar lo
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++; 
                    visited[j] = true; // mark as counted
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
