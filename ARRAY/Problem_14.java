/*
 Problem 14: Implement Binary Search using Iteration
 ---------------------------------------------------
 Given a sorted array of integers, implement a function to search for a 
 target element using the Binary Search algorithm (iterative approach).
 If the element is found, return its index; otherwise, return -1.

 Example:
 --------
 Input:  arr[] = {10, 20, 30, 40, 50}, target = 40
 Output: Element found at index 3

 Input:  arr[] = {10, 20, 30, 40, 50}, target = 25
 Output: Element not found
*/

public class Problem_14 {
    public static int binarySearch(int arr[], int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid; // element mil gaya
            } else if (arr[mid] < target) {
                low = mid + 1; // right side me search
            } else {
                high = mid - 1; // left side me search
            }
        }
        return -1; // element nahi mila
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 40;

        int result = binarySearch(arr, target);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
}
