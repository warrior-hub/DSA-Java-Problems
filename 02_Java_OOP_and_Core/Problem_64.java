// Q: Create a class MathOperations with static methods add(), multiply() 
//    and instance methods subtract(), divide(). Demonstrate usage with multiple objects.

public class Problem_64 {
    public static void main(String[] args) {
        // Using static methods without creating objects
        int sum = MathOperations.add(10, 20);
        int product = MathOperations.multiply(5, 6);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Creating objects to use instance methods
        MathOperations op1 = new MathOperations();
        MathOperations op2 = new MathOperations();

        int difference1 = op1.subtract(50, 15);
        double quotient1 = op1.divide(100, 5);

        int difference2 = op2.subtract(30, 10);
        double quotient2 = op2.divide(45, 9);

        System.out.println("\nUsing op1 object:");
        System.out.println("Difference: " + difference1);
        System.out.println("Quotient: " + quotient1);

        System.out.println("\nUsing op2 object:");
        System.out.println("Difference: " + difference2);
        System.out.println("Quotient: " + quotient2);
    }
}

class MathOperations {
    // Static methods (can be called without creating objects)
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    // Instance methods (require objects)
    int subtract(int a, int b) {
        return a - b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed!");
            return 0;
        }
        return (double) a / b;
    }
}
