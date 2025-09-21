import java.util.Scanner; // Import Scanner class for input

public class Problem_72 {

    /*
     Problem_72: Print Month Based on Number
     
     Question:
     Write a Java program that takes a number (1-12) as input from the user
     and prints the corresponding month of the year.

     Example:
     Input: 3
     Output: March

     Input: 11
     Output: November
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Ask user to enter a number between 1 and 12
        System.out.print("Enter a number (1-12) to get the month: ");
        int monthNumber = sc.nextInt();

        // Using switch-case to determine the month
        String month;
        switch(monthNumber) {
            case 1:  month = "January"; break;
            case 2:  month = "February"; break;
            case 3:  month = "March"; break;
            case 4:  month = "April"; break;
            case 5:  month = "May"; break;
            case 6:  month = "June"; break;
            case 7:  month = "July"; break;
            case 8:  month = "August"; break;
            case 9:  month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;
            default: month = "Invalid number! Please enter 1-12."; // For invalid input
        }

        // Print the month
        System.out.println(month);

        sc.close(); // Close the scanner
    }
}
