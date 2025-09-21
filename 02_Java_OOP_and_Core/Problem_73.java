import java.util.Scanner; // Import Scanner class for input
 /*
     Problem_73: Simple Calculator Using Switch Statement
     
     Question:
     Write a Java program that acts as a simple calculator.
     The program should take two numbers and an arithmetic operator (+, -, *, /)
     as input from the user and perform the corresponding operation
     using a switch statement.

     Example:
     Input: 10, 5, +
     Output: 10 + 5 = 15

     Input: 8, 4, /
     Output: 8 / 4 = 2
    */

public class Problem_73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Ask user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        // Ask user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Ask user to enter an operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        // Use switch statement to perform the operation
        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }

        sc.close(); // Close the scanner
    }
}
