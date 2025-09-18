// Q: Create a class Employee with id and salary.
//    Use static block to display "Class loaded".
//    Use instance block to display "Object created".
//    Use constructor to assign values and display employee info.

public class Problem_67 {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee e1 = new Employee(101, 50000);
        Employee e2 = new Employee(102, 60000);
    }
}

class Employee {
    int id;
    int salary;

    // Static block: executed when class is loaded
    static {
        System.out.println("Class loaded");
    }

    // Instance block: executed whenever a new object is created, before constructor
    {
        System.out.println("Object created");
    }

    // Constructor: assigns values and displays employee info
    Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
        System.out.println("Employee ID: " + id + ", Salary: " + salary);
    }
}
