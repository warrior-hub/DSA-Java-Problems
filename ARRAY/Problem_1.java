/*
📌 Problem 1: Take array input from user and print it.

👉 Statement:
- User se array ka size lena hai
- Us size ke according elements input lena hai
- Array ke sabhi elements ko print karna hai

📝 Example:
Input:
Enter the size of array:
5
enter the number 1 : 10
enter the number 2 : 20
enter the number 3 : 30
enter the number 4 : 40
enter the number 5 : 50

Output:
10
20
30
40
50
*/

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object banaya
        int size = getSize(sc);              // user se size input liya
        int[] arr = getInput(size, sc);      // array input liya
        printArray(arr);                     // array print kiya
        sc.close();                          // Scanner close kar diya
    }

    // 📌 Method 1: User se array ka size lena
    public static int getSize(Scanner sc) {
        System.out.println("Enter the size of array: ");
        int s = sc.nextInt();
        return s;
    }

    // 📌 Method 2: User se array ke elements lena
    public static int[] getInput(int size, Scanner sc) {
        int[] arr1 = new int[size]; // naya array banaya

        for (var i = 0; i < arr1.length; i++) {
            System.out.println("enter the number " + (i + 1) + " : ");
            arr1[i] = sc.nextInt(); // har element input
        }
        return arr1; // filled array return kar diya
    }

    // 📌 Method 3: Array ke elements print karna
    public static void printArray(int[] arr) {
        for (var i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "   ");
        }
    }
}
