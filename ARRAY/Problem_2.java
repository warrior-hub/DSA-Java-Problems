/*
📌 Problem 2: Find Minimum and Maximum element in an Array

👉 Statement:
User se ek array lena hai aur usme se minimum aur maximum number nikalna hai.

📝 Example:
Input:
Enter the size of array:
5
enter the number 1 : 10
enter the number 2 : 20
enter the number 3 : 5
enter the number 4 : 40
enter the number 5 : 25

Output:
min number: 5
max is: 40
*/

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object banaya
        int size = getSize(sc);              // user se size input liya
        int[] arr = getInput(size, sc);      // array input liya
        findMinMax(arr);                     // min & max find kiya
        sc.close();                          // Scanner close kiya
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

    // 📌 Method 3: Array me se Min aur Max number find karna
    public static void findMinMax(int[] arr) {
        int min = arr[0]; // assume first element is min
        int max = arr[0]; // assume first element is max

        for (var i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i]; // agar chhota number mila to min update
            }
            if (max < arr[i]) {
                max = arr[i]; // agar bada number mila to max update
            }
        }

        // result print
        System.out.println("min number: " + min);
        System.out.println("max is: " + max);
    }
}
