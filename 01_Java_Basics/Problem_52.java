import java.util.Scanner;

public class Problem_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        int[] arr = getInput(sc);

        // Print original array
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        checkPalindrome(arr);
        sc.close();
    }

    public static void checkPalindrome(int[] arr) {
        boolean isPalindrome = true;

        // Only check half array
        for (int i = 0; i < arr.length / 2; i++) {
            int n = arr.length;
            if (arr[i] != arr[n - 1 - i]) {
                isPalindrome = false;
                break; // no need to check further
            }
        }

        if (isPalindrome) {
            System.out.println("Ye Palindrome array hai");
        } else {
            System.out.println("Ye Palindrome array nahi hai");
        }
    }

    // Method to take input
    public static int[] getInput(Scanner sc) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
