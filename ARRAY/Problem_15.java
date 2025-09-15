/*
 Problem 15: Implement Binary Search using Recursion
 ---------------------------------------------------
 Given a sorted array of integers, implement a function to search for a 
 target element using the Binary Search algorithm (recursive approach).
 If the element is found, return its index; otherwise, return -1.

 Example:
 --------
 Input:  arr[] = {10, 20, 30, 40, 50}, target = 40
 Output: Element found at index 3

 Input:  arr[] = {10, 20, 30, 40, 50}, target = 25
 Output: Element not found
*/

public class Problem_15 {
    
    // Recursive Binary Search function
    public static int binarySearch(int arr[], int low, int high, int target) {
        
        // Base condition: jab tak low <= high hai, tab tak search karo
        if (low <= high) {
            
            // Middle index calculate karo
            int mid = (low + high) / 2;

            // Agar middle element hi target hai to wahi return karo
            if (arr[mid] == target) {
                return mid; // element mil gaya
            } 
            // Agar target middle se chhota hai to left side me search karo
            else if (arr[mid] > target) {
                return binarySearch(arr, low, mid - 1, target); 
            } 
            // Agar target middle se bada hai to right side me search karo
            else {
                return binarySearch(arr, mid + 1, high, target); 
            }
        }

        // Agar element nahi mila to -1 return karo
        return -1; 
    }

    public static void main(String[] args) {
        // Sorted array banaya
        int arr[] = {10, 20, 30, 40, 50};
        
        // Target element jo search karna hai
        int target = 40;

        // Function call kiya (array, 0th index, last index, target)
        int result = binarySearch(arr, 0, arr.length - 1, target);

        // Agar result -1 nahi hai to element mil gaya
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
}
