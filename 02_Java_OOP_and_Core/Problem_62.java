// Q: Create a class Employee with id and salary. 
//    Use 'this' keyword to initialize constructor parameters.

public class Problem_62 {
    public static void main(String[] args) {
        // Creating employee object using constructor
        Employee emp = new Employee(123, 120000);
        emp.displayInfo();
    }
}

class Employee {
    int id;
    int salary;

    // Constructor with parameters
    Employee(int id, int salary) {
        // 'this' keyword refers to the current object's instance variables
        this.id = id;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Employee id: " + this.id + 
                           "\nEmployee salary: " + this.salary);
    }
}
