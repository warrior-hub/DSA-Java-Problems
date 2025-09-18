/*
Question:
Ek program likho jisme student ka name aur marks store karke average calculate kiya jaye
using OOP approach with Student class.
*/

import java.util.Scanner;

class Student {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Static method to calculate average for an array of students
    public static double calculateAverage(Student[] students) {
        int sum = 0;
        for (Student s : students) {
            sum += s.marks;
        }
        return (double) sum / students.length;
    }
}

public class Problem_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== OOP Version ===");
        System.out.print("Kitne students ke data enter karna hai? ");
        int n = sc.nextInt();
        sc.nextLine(); // buffer clear

        Student[] students = new Student[n];

        // Data input
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " ka naam: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); // buffer clear
            
            // Create Student object and store in array
            students[i] = new Student(name, marks);
        }

        double average = Student.calculateAverage(students);
        System.out.println("Students ka average marks: " + average);
        sc.close();

    }
}
