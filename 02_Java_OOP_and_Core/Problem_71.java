import java.util.Scanner; // Import Scanner class for user input
 
/*
     Problem_71: Categorize Student Score
     
     Question:
     Write a Java program that takes a student's score as input
     and categorizes it as "High", "Moderate", or "Low" using the ternary operator.
     
     Criteria:
     - High: score > 80
     - Moderate: score between 50 and 80 (inclusive)
     - Low: score < 50
     
     Example:
     Input: 85
     Output: The score 85 is High
     
     Input: 70
     Output: The score 70 is Moderate
     
     Input: 40
     Output: The score 40 is Low
    */

public class Problem_71 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Ask user to enter the student's score
        System.out.print("Enter the student's score: ");
        int score = sc.nextInt();

        // Use ternary operator to categorize the score
        String category = (score > 80) ? "High" : (score >= 50) ? "Moderate" : "Low";

        // Print the category
        System.out.println("The score " + score + " is " + category);

        sc.close(); // Close the scanner
    }
}
