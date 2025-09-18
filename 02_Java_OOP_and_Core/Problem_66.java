// Q: Create a class Student with constructor to initialize name and marks. 
//    Use instance initializer block to print "Student object is ready".

public class Problem_66 {
    public static void main(String[] args) {
        // Creating Student objects
        Student s1 = new Student("Alice", 85);
        Student s2 = new Student("Bob", 92);
    }
}

class Student {
    String name;
    int marks;

    // Instance initializer block
    {
        System.out.println("Student object is ready");
    }

    // Constructor to initialize name and marks
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}
