/*
 Problem 3: Find Sum and Average of Array Elements

 Statement:
User se ek array lena hai aur usme se:
1. Sabhi elements ka sum nikalna hai
2. Sabhi elements ka average nikalna hai

 Example:
Input:
Enter the size of array:
5
enter the number 1 : 10
enter the number 2 : 20
enter the number 3 : 30
enter the number 4 : 40
enter the number 5 : 50

Output:
Sum of array elements: 150
Average of array elements: 30
*/

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object created
        int size = getSize(sc);              // user inputs size
        int[] arr = getInput(size, sc);      // user inputs array
        findSumAvg(arr);                     // sum & average calculated
        sc.close();                          // Scanner closed
    }

    //  Method 1: Take size of array from user
    public static int getSize(Scanner sc) {
        System.out.println("Enter the size of array: ");
        int s = sc.nextInt();
        return s;
    }

    //  Method 2: Take array elements from user
    public static int[] getInput(int size, Scanner sc) {
        int[] arr1 = new int[size]; // new array created

        for (var i = 0; i < arr1.length; i++) {
            System.out.println("Enter number " + (i + 1) + " : ");
            arr1[i] = sc.nextInt(); // store input in array
        }
        return arr1; // return filled array
    }

    //  Method 3: Find sum and average of array elements
    public static void findSumAvg(int[] arr) {
        int sum = 0;
        for (var i = 0; i < arr.length; i++) {
            sum += arr[i]; // add each element
        }

        double avg = (double) sum / arr.length; // average in double
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + avg);
    }
}
