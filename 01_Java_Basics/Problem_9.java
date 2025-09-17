/*
Problem Statement:
------------------
Write a Java program that takes the user's name as input 
and prints a welcome message along with "KG Coding".
*/

import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take user name as input
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        // Display welcome message
        System.out.println("Welcome " + name + " KG Coding");

        // Close scanner
        sc.close();
    }
}
